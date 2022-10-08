package business.services.categories;

import domain.entities.Category;
import domain.entities.Instructor;

public interface CategoryService {

    void create(Category category) throws Exception;
    void update(Category category);
    void delete(Category category);
}
