public class Oreo extends Decorator{
    public Oreo(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.30;
    }
}
