public class BurgerApp {
    public static void main(String[] args) {
        BurgersUSA Seattle = new BurgersUSA();
        BurgersMexico Cancun = new BurgersMexico();
        Seattle.menu();
        Cancun.menu();
    }
}
