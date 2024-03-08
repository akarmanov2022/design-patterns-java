package design.patterns.abstractfactory;

public class Client {
  public Client() {}

  public ProductA createProductA(AbstractFactory factory) {
    return factory.createProductA();
  }

  public ProductB createProductB(AbstractFactory factory) {
    return factory.createProductB();
  }
}
