package lk.edupanel.repository;

import lk.edupanel.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudRepository extends SuperRepository{
    SuperEntity save(SuperEntity entity);
    void update(SuperEntity entity);

    void deleteById(Serializable pk);

    boolean existsById(Serializable pk);

    Optional<SuperEntity> findById(Serializable pk);

    List<SuperEntity> findAll();

    long count();
}
