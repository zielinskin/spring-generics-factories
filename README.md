# spring-generics-factories
Use generically typed spring services to decorate interface specific builders that construct result objects

## Run Sample App

Run the following command to start up a web container that demonstrates the functionality of the library:

```
gradlew bootRun
```

You can also run from the context of that app module; this is the only bootRunnable module, so it will correctly 
select the correct module when run from the root as well.

The application's swagger page will be available at http://localhost:8081/api 
Use the docket dropdown at the top of the page to change between apis.

The h2 console will be available at http://localhost:8081/h2-console 
Login using the username and password in the application.yml file.

## Extending

There are two primary ways of extending this pattern for use with a new data set: new data source or new result object.

### New Data Source

In order to add a new data source, the following must be added:

- An interface to hold the values that the result object will have
- An interface with setters that will be decorated with the new values to be used to construct the result objects
  - This interface must extend Identifiable<I> where I is the type of field that identifies the object 
- A new spring bean that extends enericsDecorator<T> where T is the interface created in the step above.

### New Result Object

In order to add a new result object, the following must be added:

- A new value class that implements the value interfaces you wish to have on the object.
- A builder class that implements the decoratable interfaces that correspond to the above objects as well as GenericBuilder<T, I>
  - T will be the name of the class from the step above, I will be the class that used for its id.
  - Please note, you cannot mix and match identifier types or identifiers that are not compatible across all related decorators
    - This can be overcome by using composition in your result object and having a decorator call another data service with the correct identifier
- A builder factory class that constructs the builder that implements GenericsBuilderFactory<B, I>
  - B will be the builder class created for this data set, I will be its corresponding identifier class
- A new DataService Spring Bean class that extends GenericsService<T, I, B>
  - T will be the result object for this data set, I will be the identifier class and B will be the builder class for this data set
  - Note that if you are using IntelliJ or most other java IDEs, the class can be completed just by using the default auto generated constructor
  - Also note that when consuming this class in another bean, you can use GenericsServiceClient<T,I>, so there is no need 
  to expose or require the builder type to be present in consumers
- Additional Optional classes:
  - A controller to access the newly created objects
  - A configuration class to autowire the newly created beans
  - If adding a new data source not and not consuming an existing one, repositories or api clients may be necessary for data acquisition.

### Examples

- The bar module is an example of a data source without its own result object; it is only used to decorate the fubar objects.
- The foo module is both a data source and has its own result object.
- The app module contains the foobar package which is only a result object made of foo and bar data.
