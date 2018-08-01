package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImp implements GifDao  {

    private static List<Gif> gifs = new ArrayList<>();

    static {

        gifs.add(new Gif(1, "Adam", "android-explosion", false, CategoryDaoImp.findAll().get(0)));
        gifs.add(new Gif(2, "Witosik", "ben-and-mike", false,CategoryDaoImp.findAll().get(1)));
        gifs.add(new Gif(3, "Kacd", "book-dominos", true, CategoryDaoImp.findAll().get(2)));
        gifs.add(new Gif(4, "Michalina", "compiler-bot", false, CategoryDaoImp.findAll().get(2)));
        gifs.add(new Gif(5, "Doto", "cowboy-coder",true, CategoryDaoImp.findAll().get(2)));
        gifs.add(new Gif(6, "Hania_Senior", "infinite-andrew", true, CategoryDaoImp.findAll().get(1)));

    }

    @Override
    public List<Gif> findAll() {

        return gifs;
    }

    @Override
    public List<Gif> findGif(String name) {
        List<Gif> catGif = new ArrayList<>();
        for (Gif gif: gifs) {
            if (gif.getCategory().getName().equals(name)) {
                catGif.add(gif);
            }
        }
        return catGif;
    }

    @Override
    public List<Gif> find(String q) {
        List<Gif> search = new ArrayList<>();
        for (Gif gif : gifs) {
            if (gif.getName().contains(q)) {
                search.add(gif);
            }
        }
        return search;
    }

    @Override
    public List<Gif> findAllFavorites() {
        List<Gif> fav = new ArrayList<>();
        for (Gif favGif : gifs) {
            if (favGif.isFavorite() == true) {
                fav.add(favGif);
            }
        }
        return fav;
    }

    @Override
    public Gif findById(int id) {
        return gifs.stream().
                filter(gif -> gif.getId()==id).
                findFirst().get();
    }


}
