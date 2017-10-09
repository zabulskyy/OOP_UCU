
public class TestShip {

    public static void main(String[] args) {
//        SpecialShip specialShip = new SpecialShip();

        Ship ship = new Ship("Titanicum");
        SpecialShip.SpecialEngine specEng = new SpecialShip().new SpecialEngine(ship);

        specEng.launch();

    }
}