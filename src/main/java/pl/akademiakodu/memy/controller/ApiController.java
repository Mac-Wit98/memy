package pl.akademiakodu.memy.controller;

import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.CategoryDaoImp;
import pl.akademiakodu.memy.dao.GifDaoImp;
import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

    @GetMapping("/categories")
    public Iterable<Category> all() {
        return CategoryDaoImp.findAll();
    }

    @GetMapping("/category/{id}")
    public Category show(@PathVariable Integer id) {
        return CategoryDaoImp.findAll().stream().filter(p -> p.getId() == id).findFirst().get();
    }

}
