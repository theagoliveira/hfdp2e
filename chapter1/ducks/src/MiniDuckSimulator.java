public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        DuckCall mallardCall = new MallardDuckCall();
        Duck model = new ModelDuck();

        mallard.performQuack();
        mallard.performFly();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        mallardCall.performQuack();
        mallardCall.setQuackBehavior(new Squeak());
        mallardCall.performQuack();
    }

}
