package Lab6;

public enum GameGenre {
    ACTION("action"), MOBA("moba"), SIMULATION("simulation");

    private String name;

    GameGenre(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}