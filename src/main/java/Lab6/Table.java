package Lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {
    ArrayList<ComputerGame> objects;
    ArrayList<String> filters = new ArrayList<String>();

    Table() {
        this.objects = new ArrayList<ComputerGame>();
    }

    void addGame(ComputerGame game) {
        this.objects.add(game);
    }

    ComputerGame search(String name) {
        for (ComputerGame game :
                this.objects) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    void addFilters(String... filter) {
        filters.addAll(Arrays.asList(filter));
    }

    ArrayList<ComputerGame> applyFilters() {
        ArrayList<ComputerGame> withFilters = new ArrayList<ComputerGame>();
        for (ComputerGame game : objects) {
            for (String filter : this.filters) {
                if (
                        filter.equals(game.getName()) ||
                        game.getGenres().contains(filter) ||
                        game.getPlatforms().contains(filter)
                        ) {
                    withFilters.add(game);
                }
            }
        }
        return withFilters;
    }

}
