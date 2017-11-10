package Lab6;

import java.util.ArrayList;

public class ComputerGameParams {
    private ArrayList<GameGenre> genres;
    private ArrayList<ComputerPlatform> platforms;
    private float price;
    private int ageRestriction;
    private String description;

    public ComputerGameParams(float price) {
        this.price = price;
    }


    public ArrayList<GameGenre> getGenres() {
        return genres;
    }

    public ArrayList<ComputerPlatform> getPlatforms() {
        return platforms;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public String getDescription() {
        return description;
    }
}
