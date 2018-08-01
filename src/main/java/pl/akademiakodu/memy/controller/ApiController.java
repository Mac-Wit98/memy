package pl.akademiakodu.memy.controller;

import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifDaoImp;
import pl.akademiakodu.memy.model.Gif;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
    private static GifDao gifDao = new GifDaoImp();
    @GetMapping("/gif")
    public Iterable<Gif> all(){return gifDao.findAll();
    }
    @GetMapping("/gif/{id}")
    public Gif show(@PathVariable Integer id){
        return gifDao.findAll().stream().filter(p->p.getId()==id).findFirst().get();
    }

}
