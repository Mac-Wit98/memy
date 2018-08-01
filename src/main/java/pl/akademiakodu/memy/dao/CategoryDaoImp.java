package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImp  implements CategoryDao{

    private static List<Category> categories = new ArrayList<>();

    public static  List<Category> findAll(){
        return categories;
    }

    static {
        categories.add(new Category(1, "Android"));
        categories.add((new Category(2, "funny")));
        categories.add(new Category(3, "Programming"));
    }

    @Override
    public Category findById(Integer id) {
      return
    }

}
