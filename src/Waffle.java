public class Waffle extends Decorator{
    public Waffle(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.10; // Cost of Waffle
    }
}
