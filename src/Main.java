public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        IceCream iceCreamWithOreo = new Oreo(basicIceCream);
        IceCream iceCreamWithOreoAndChocolate = new Chocolate(iceCreamWithOreo);
        double cost = iceCreamWithOreoAndChocolate.cost();

        System.out.println("Ice Cream with Oreo and Chocolate Cost: $" + cost);
    }
}
