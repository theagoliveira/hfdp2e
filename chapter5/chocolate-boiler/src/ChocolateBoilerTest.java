public class ChocolateBoilerTest {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        ChocolateBoiler chocolateBoiler2 = new ChocolateBoiler();
        ChocolateBoilerSingleton chocolateBoilerSingleton = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocolateBoilerSingleton2 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingletonEnum chocolateBoilerSingletonEnum = ChocolateBoilerSingletonEnum.UNIQUE_INSTANCE;
        ChocolateBoilerSingletonEnum chocolateBoilerSingletonEnum2 = ChocolateBoilerSingletonEnum.UNIQUE_INSTANCE;

        System.out.println(
            "chocolateBoiler.equals(chocolateBoiler2) = " + chocolateBoiler.equals(chocolateBoiler2)
        );
        System.out.println(
            "chocolateBoilerSingleton.equals(chocolateBoilerSingleton2) = "
                    + chocolateBoilerSingleton.equals(chocolateBoilerSingleton2)
        );
        System.out.println(
            "chocolateBoilerSingletonEnum.equals(chocolateBoilerSingletonEnum2) = "
                    + chocolateBoilerSingletonEnum.equals(chocolateBoilerSingletonEnum2)
        );

        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        chocolateBoilerSingleton.fill();
        chocolateBoilerSingleton.boil();
        chocolateBoilerSingleton.drain();

        chocolateBoilerSingletonEnum.fill();
        chocolateBoilerSingletonEnum.boil();
        chocolateBoilerSingletonEnum.drain();
    }

}
