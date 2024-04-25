package design.patterns.builder.products;

/**
 * @author Arseniy Karmanov
 */
public class ConcreteProduct2 extends AbstractProduct {
  private String strField1;
  private String strField2;
  private String strField3;

  public static ConcreteProduct2Builder builder() {
    return new ConcreteProduct2Builder();
  }

  public static class ConcreteProduct2Builder extends AbstractProduct.Builder<ConcreteProduct2Builder> {
    private String strField1;
    private String strField2;
    private String strField3;

    public ConcreteProduct2Builder strField1(String field1) {
      this.strField1 = field1;
      return this;
    }

    public ConcreteProduct2Builder strField2(String field2) {
      this.strField2 = field2;
      return this;
    }

    public ConcreteProduct2Builder strField3(String field3) {
      this.strField3 = field3;
      return this;
    }

    @Override
    protected ConcreteProduct2Builder self() {
      return this;
    }

    @Override
    public ConcreteProduct2 build() {
      return new ConcreteProduct2(this);
    }
  }

  protected ConcreteProduct2(ConcreteProduct2Builder builder) {
    super(builder);
    this.strField1 = builder.strField1;
    this.strField2 = builder.strField2;
    this.strField3 = builder.strField3;
  }

  public String getStrField1() {
    return strField1;
  }

  public String getStrField2() {
    return strField2;
  }

  public String getStrField3() {
    return strField3;
  }

  public void setStrField1(String strField1) {
    this.strField1 = strField1;
  }

  public void setStrField2(String strField2) {
    this.strField2 = strField2;
  }

  public void setStrField3(String strField3) {
    this.strField3 = strField3;
  }

  @Override
  public String toString() {
    return "ConcreteProduct2{" +
        "strField1='" + strField1 + '\'' +
        ", strField2='" + strField2 + '\'' +
        ", strField3='" + strField3 + '\'' +
        "} " + super.toString();
  }
}
