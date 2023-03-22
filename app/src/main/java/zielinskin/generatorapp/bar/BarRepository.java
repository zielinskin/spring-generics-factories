package zielinskin.generatorapp.bar;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BarRepository extends CrudRepository<BarEntity, Integer> {
    List<BarEntity> findAll();
}
