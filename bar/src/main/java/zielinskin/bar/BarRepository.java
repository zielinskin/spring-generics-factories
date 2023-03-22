package zielinskin.bar;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface BarRepository extends CrudRepository<BarEntity, Integer> {
    List<BarEntity> findAll();
}
