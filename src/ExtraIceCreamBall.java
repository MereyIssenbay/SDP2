public class ExtraIceCreamBall extends Decorator{
    public ExtraIceCreamBall(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.50;
    }
}
