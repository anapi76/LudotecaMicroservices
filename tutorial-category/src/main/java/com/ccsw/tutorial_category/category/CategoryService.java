package com.ccsw.tutorial_category.category;

import com.ccsw.tutorial_category.category.model.Category;
import com.ccsw.tutorial_category.category.model.CategoryDto;

import java.util.List;

/**
 * @author ccsw
 *
 */
public interface CategoryService {
    /**
     * Método para recuperar todas las categorías
     *
     * @return {@link List} de {@link Category}
     */
    List<Category> findAll();

    /**
     * Recupera un {@link Category} a través de su ID
     *
     * @param id PK de la entidad
     * @return {@link Category}
     */
    Category get(Long id);

    /**
     * Método para crear o actualizar una categoría
     *
     * @param id PK de la entidad
     * @param dto datos de la entidad
     */
    void save(Long id, CategoryDto dto);

    /**
     * Método para borrar una categoría
     *
     * @param id PK de la entidad
     */
    void delete(Long id);
}
