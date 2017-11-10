package Lab6;

public enum ComputerPlatform {
    WINDOWS("windows"), MAC("mac"), LINUX("linux");

    private String name;

    ComputerPlatform(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return super.toString();
    }

}
