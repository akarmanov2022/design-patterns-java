package design.patterns.builder.products;

/**
 * @author Arseniy Karmanov
 */
public class ConcreteProduct1 extends AbstractProduct {
  private Integer intField1;
  private Integer intField2;
  private String stringField1;

  public static ConcreteBuilder1 builder() {
    return new ConcreteBuilder1();
  }

  public static class ConcreteBuilder1 extends AbstractProduct.Builder<ConcreteBuilder1> {
    private Integer intField1;
    private Integer intField2;
    private String stringField1;

    public ConcreteBuilder1 integerField1(Integer intField1) {
      this.intField1 = intField1;
      return self();
    }

    public ConcreteBuilder1 integerField2(Integer intField2) {
      this.intField2 = intField2;
      return self();
    }

    public ConcreteBuilder1 stringField1(String stringField1) {
      this.stringField1 = stringField1;
      return self();
    }

    @Override
    protected ConcreteBuilder1 self() {
      return this;
    }

    @Override
    public ConcreteProduct1 build() {
      return new ConcreteProduct1(this);
    }
  }

  protected ConcreteProduct1(ConcreteBuilder1 builder) {
    super(builder);
    this.intField1 = builder.intField1;
    this.intField2 = builder.intField2;
    this.stringField1 = builder.stringField1;
  }

  public Integer getIntField1() {
    return intField1;
  }

  public void setIntField1(Integer intField1) {
    this.intField1 = intField1;
  }

  public Integer getIntField2() {
    return intField2;
  }

  public void setIntField2(Integer intField2) {
    this.intField2 = intField2;
  }

  public String getStringField1() {
    return stringField1;
  }

  public void setStringField1(String stringField1) {
    this.stringField1 = stringField1;
  }


}
