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