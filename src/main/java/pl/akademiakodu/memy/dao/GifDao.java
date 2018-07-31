package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.List;

public interface GifDao {

    List<Gif> findAll();

    List<Gif> find(String q);

    List<Gif> findAllFavorites();

}
