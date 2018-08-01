package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.List;

public interface CategoryDao {
    public static  List<Category> findAll() {
        return null;
    }
    Category findById(Integer id);

}
