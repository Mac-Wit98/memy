package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImp implements GifDao {

    private static List<Gif> gifs = new ArrayList<>();

    @Override
    public List<Gif> findAll() {

        gifs.add(new Gif(1, "android-explosion"));
        gifs.add(new Gif(2, "ben-and-mike"));
        gifs.add(new Gif(3, "book-dominos", true));
        gifs.add(new Gif(4, "compiler-bot"));
        gifs.add(new Gif(5, "cowboy-coder", true));
        gifs.add(new Gif(6, "infinite-andrew", true));

        return gifs;
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


}
