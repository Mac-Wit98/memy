package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImp implements GifDao {

    private static List<Gif> gifs = new ArrayList<>();

    static {
        gifs.add(new Gif(1, "android-explosion"));
        gifs.add(new Gif(2, "ben-and-mike"));
        gifs.add(new Gif(3, "book-dominos"));
        gifs.add(new Gif(4, "compiler-bot"));
        gifs.add(new Gif(5, "cowboy-coder"));
        gifs.add(new Gif(6, "infinite-andrew"));
    }

    @Override
    public List<Gif> findAll() {
        return gifs;
    }



}
