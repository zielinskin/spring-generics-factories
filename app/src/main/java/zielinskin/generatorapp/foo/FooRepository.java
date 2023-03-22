package zielinskin.generatorapp.foo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface FooRepository extends CrudRepository<FooEntity, Integer> {
    List<FooEntity> findAll();
}
