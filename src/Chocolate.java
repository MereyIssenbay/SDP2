public class Chocolate extends Decorator{
    public Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.40;
    }
}
