package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifDaoImp;
import pl.akademiakodu.memy.model.Gif;

@Controller
public class MemController {


    private GifDao gifDao = new GifDaoImp();

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
        return  "/categories";
    }

    @GetMapping("/search")
    public String search(ModelMap modelMap, String q) {
        modelMap.put("gifs", gifDao.find(q));
        return "home";
    }

}
