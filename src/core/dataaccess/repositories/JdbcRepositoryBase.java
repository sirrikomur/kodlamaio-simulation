package core.dataaccess.repositories;

import core.domain.Entity;

public class JdbcRepositoryBase<TEntity extends Entity> implements Repository<TEntity> {

    @Override
    public void create(TEntity entity) {
        System.out.println(entity.getClass().getSimpleName() + ": Added to database via JDBC.");
    }

    @Override
    public void update(TEntity entity) {
        System.out.println(entity.getClass().getSimpleName() + ": Updated database via JDBC.");
    }

    @Override
    public void delete(TEntity entity) {
        System.out.println(entity.getClass().getSimpleName() + ": Deleted from database via JDBC.");
    }
}
