package business.features.categories.managers;

import business.features.categories.rules.CategoryBusinessRules;
import business.services.categories.CategoryService;
import core.logging.LogService;
import dataaccess.services.categories.ICategoryRepository;
import domain.entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {

    private final ICategoryRepository _categoryRepository;
    private final LogService _logService;
    private final CategoryBusinessRules _categoryBusinessRules;

    // We want List<Category> because there is no database. Not clean code!
    private final List<Category> _categories;

    public CategoryManager(ICategoryRepository categoryRepository, LogService logService, CategoryBusinessRules categoryBusinessRules, List<Category> categories) {
        _categoryRepository = categoryRepository;
        _logService = logService;
        _categoryBusinessRules = categoryBusinessRules;
        _categories = categories;
    }

    @Override
    public void create(Category category) throws Exception {
        _categoryBusinessRules.CategoryNameCannotBeRepeated(category.getName(), _categories);
        _categoryRepository.create(category);
        _logService.log("Category create.");
    }

    @Override
    public void update(Category category) {
        _categoryRepository.update(category);
        _logService.log("Category update.");
    }

    @Override
    public void delete(Category category) {
        _categoryRepository.delete(category);
        _logService.log("Category delete.");
    }
}
