public abstract class DuckCall {

    QuackBehavior quackBehavior;

    protected DuckCall() {}

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
