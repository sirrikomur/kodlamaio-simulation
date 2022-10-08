package dataaccess.features.jdbc.categories;

import core.dataaccess.repositories.JdbcRepositoryBase;
import dataaccess.services.categories.ICategoryRepository;
import domain.entities.Category;

public class JdbcCategoryRepository extends JdbcRepositoryBase<Category> implements ICategoryRepository {
}
