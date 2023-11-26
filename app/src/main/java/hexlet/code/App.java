package hexlet.code;

public class App {

    public static void main(String[] args) {
        openMenu();
    }
    public static void openMenu() {
        System.out.println("""
                Please enter the game number and press Enter\s
                1 - Greet\s
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Engine.chooseGame();
    }
}
