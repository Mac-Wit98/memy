package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.CategoryDaoImp;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifDaoImp;
import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

@Controller
public class MemController {


    private GifDao gifDao = new GifDaoImp();
    private CategoryDao categoryDao = new CategoryDaoImp();


    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap) {

        modelMap.put("favorites", gifDao.findAllFavorites());
        return "favorites";


    }

    @GetMapping("/categories")
    public String categories(ModelMap modelMap) {
        modelMap.put("categories", CategoryDaoImp.findAll());
        return "/categories";
    }

    @GetMapping("/search")
    public String search(ModelMap modelMap, String q) {
        modelMap.put("gifs", gifDao.find(q));
        if (gifDao.find(q).size() == 0) {
            modelMap.put("message", "Nic nie znaleziono");
        }
        return "home";
    }

    @GetMapping("/category/{name}")
    public String show(@PathVariable String name, ModelMap modelMap){
        Category category = categoryDao.findByName(name);
        modelMap.put("category",category);
        modelMap.put("gifs", gifDao.findGif(categoryDao.findByName(name).getName()));
        return "category";
    }

    @GetMapping("gif/{id}")
    public String showGif(@PathVariable Integer id, ModelMap modelMap) {
        modelMap.put("gif", gifDao.findById(id));
        return "gif-details";
    }



}
