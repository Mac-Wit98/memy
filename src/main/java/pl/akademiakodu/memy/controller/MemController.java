package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.CategoryDaoImp;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifDaoImp;
import pl.akademiakodu.memy.model.Gif;

@Controller
public class MemController {


    private GifDao gifDao = new GifDaoImp();
    private  CategoryDao categoryDao;


    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap){

        modelMap.put("favorites", gifDao.findAllFavorites());
        return "favorites";


    }
    @GetMapping("/categories")
    public String categories(ModelMap modelMap){
        modelMap.put("categories", CategoryDaoImp.findAll() );
        return  "/categories";
    }

    @GetMapping("/search")
    public String search(ModelMap modelMap, String q) {
        modelMap.put("gifs", gifDao.find(q));
        if (gifDao.find(q).size() == 0) {
            modelMap.put("message", "Nic nie znaleziono");
        }
        return "home";
    }
    @GetMapping("category/{id}")
    public String show(@PathVariable Integer id, ModelMap modelMap){
        modelMap.put("category", categoryDao.findById(id));
        return "category";
    }

}
