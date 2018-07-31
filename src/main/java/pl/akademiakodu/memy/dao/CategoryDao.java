package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
}
