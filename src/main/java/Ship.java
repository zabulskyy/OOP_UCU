class Ship {

    private String name;

    Ship(String name) {
        this.name = name;
    }

    void init() {
        Engine eng = new Engine();
        eng.launch();
        System.out.println(this.name + " launched successful");
    }


    class Engine {
        void launch() {
            System.out.println("Launching engine");
        }
    }

}
