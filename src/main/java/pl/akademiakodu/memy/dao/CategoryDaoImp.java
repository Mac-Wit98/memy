package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImp  implements CategoryDao{

    private static List<Category> categories = new ArrayList<>();

    static {

        categories.add(new Category(1, "Android"));
        categories.add((new Category(2, "Funny")));
        categories.add(new Category(3, "Programming"));

    }

    public static List<Category> findAll() {
        return categories;
    }

    @Override
    public Category findById(Integer id) {
        return categories.stream().
                filter(category -> category.getId() == id).
                findFirst().get();
    }

    @Override
    public Category findByName(String name) {
        return categories.stream().
                filter(category -> category.getName().equals(name)).
                findFirst().get();
    }


}