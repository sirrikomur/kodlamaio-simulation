package core.dataaccess.repositories;

import core.domain.Entity;

import java.util.List;

public interface Repository<T extends Entity> {
    void create(T entity);

    void update(T entity);

    void delete(T entity);

    //List<T> getAll();
}
