public enum ChocolateBoilerSingletonEnum {

    UNIQUE_INSTANCE;

    private boolean empty;
    private boolean boiled;

    ChocolateBoilerSingletonEnum() {
        empty = true;
        boiled = false;
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
            empty = true;
            System.out.println("drain the boiled milk and chocolate");
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
