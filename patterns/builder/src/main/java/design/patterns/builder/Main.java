package design.patterns.builder;

import design.patterns.builder.products.AbstractProduct;
import design.patterns.builder.products.ConcreteProduct1;
import design.patterns.builder.products.ConcreteProduct2;

public class Main {
  public static void main(String[] args) {
    ConcreteProduct1 product1 = ConcreteProduct1.builder()
        .field1("1")
        .field2("2")
        .field3("3")
        .integerField1(0)
        .integerField2(1)
        .stringField1("123")
        .build();

    ConcreteProduct2 product2 = ConcreteProduct2.builder()
        .field1("1")
        .field2("2")
        .field3("3")
        .strField1("str1")
        .strField2("str2")
        .strField3("str3")
        .build();

    System.out.println(product1);
    System.out.println(product2);
  }
}