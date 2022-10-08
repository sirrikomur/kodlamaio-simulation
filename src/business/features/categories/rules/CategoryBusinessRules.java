package business.features.categories.rules;

import dataaccess.services.categories.ICategoryRepository;
import domain.entities.Category;

import java.util.List;

public class CategoryBusinessRules {
    private final ICategoryRepository _categoryRepository;

    public CategoryBusinessRules(ICategoryRepository categoryRepository) {
        _categoryRepository = categoryRepository;
    }

    // The List<Category> parameter is requested because there is no database.
    public void CategoryNameCannotBeRepeated(String categoryName, List<Category> categories) throws Exception {
        for (Category category : categories) {
            if (category.getName() == categoryName) {
                throw new Exception("Category name cannot be repeated!");
            }
        }
    }
}
