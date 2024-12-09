package com.ccsw.tutorial_category.category;

import com.ccsw.tutorial_category.category.model.Category;
import com.ccsw.tutorial_category.category.model.CategoryDto;
import com.ccsw.tutorial_category.exceptions.CategoryNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Category get(Long id) {

        //return categoryRepository.findById(id).orElse(null);
        return categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException("Category not exists"));

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Category> findAll() {
        return (List<Category>) this.categoryRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, CategoryDto dto) {
        Category category;

        category = (id == null) ? new Category() : this.get(id);

        category.setName(dto.getName());
        this.categoryRepository.save(category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) {
        /*if (this.get(id) == null) {
            throw new CategoryNotFoundException("Category Not exists");
        }*/
        this.get(id);
        this.categoryRepository.deleteById(id);
    }
}
