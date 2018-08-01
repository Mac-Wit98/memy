package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.List;

public interface CategoryDao {
    public  List<Category> findAll();
    Category findById(Integer id);

}
