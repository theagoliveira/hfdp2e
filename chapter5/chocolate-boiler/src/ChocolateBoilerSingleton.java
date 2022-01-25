public class ChocolateBoilerSingleton {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSingleton uniqueInstance;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSingleton();
        }

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("fill the boiler with a milk/chocolate mixture");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("drain the boiled milk and chocolate");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("bring the contents to a boil");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
