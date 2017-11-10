package Lab6;

import java.util.ArrayList;

public class ComputerGame {
    private String name;
    private String description;
    private ArrayList<Genre[]> genres;
    private float price;
    private int ageRestrictions;
    private ArrayList<String> platforms;
    private int id;

    public ComputerGame(
            String name,
            String description,
            ArrayList<Genre[]> genres,
            float price,
            int ageRestrictions,
            ArrayList<String> platforms,
            int id) {

        this.name = name;
        this.description = description;
        this.genres = genres;
        this.price = price;
        this.ageRestrictions = ageRestrictions;
        this.platforms = platforms;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ComputerGame setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ComputerGame setDescription(String description) {
        this.description = description;
        return this;
    }

    public ArrayList<Genre[]> getGenres() {
        return genres;
    }

    public ComputerGame setGenres(ArrayList<Genre[]> genres) {
        this.genres = genres;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public ComputerGame setPrice(float price) {
        this.price = price;
        return this;
    }

    public int getAgeRestrictions() {
        return ageRestrictions;
    }

    public ComputerGame setAgeRestrictions(int ageRestrictions) {
        this.ageRestrictions = ageRestrictions;
        return this;
    }

    public ArrayList<String> getPlatforms() {
        return platforms;
    }

    public ComputerGame setPlatforms(ArrayList<String> platforms) {
        this.platforms = platforms;
        return this;
    }

    public int getId() {
        return id;
    }

    public ComputerGame setId(int id) {
        this.id = id;
        return this;
    }
}
