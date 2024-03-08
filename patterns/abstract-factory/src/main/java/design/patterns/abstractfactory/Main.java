package design.patterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        Client client = new Client();
        ProductA productA = client.createProductA(factory);
        ProductB productB = client.createProductB(factory);

        System.out.println("productA = " + productA);
        System.out.println("productB = " + productB);

        factory = new ConcreteFactory2();
        productA = client.createProductA(factory);
        productB = client.createProductB(factory);

        System.out.println("productA = " + productA);
        System.out.println("productB = " + productB);
    }
}

