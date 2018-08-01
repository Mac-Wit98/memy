package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImp   {


    public static List<Category> findAll(){
    List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Android"));
        categories.add((new Category(2, "funny")));
        categories.add(new Category(3, "Programming"));
        return categories;
    }


}
