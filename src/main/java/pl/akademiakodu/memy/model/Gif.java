package pl.akademiakodu.memy.model;

import java.util.ArrayList;
import java.util.List;

public class Gif {

    private Integer id;
    private String name;
    private boolean favorite;

    public Gif(Integer id, String name, boolean favorite) {
        this.id = id;
        this.name = name;
        this.favorite = favorite;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String gifPath() {
        return "gif/" + getName() + ".gif";
    }

    public Gif() {
    }

    public Gif(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath(){
        return "gifs/"+getName()+".gif";
    }

    @Override
    public String toString() {
        return "Gif{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
