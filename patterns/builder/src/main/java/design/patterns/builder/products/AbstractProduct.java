package design.patterns.builder.products;

/**
 * @author Arseniy Karmanov
 */
public abstract class AbstractProduct {
    private String field1;
    private String field2;
    private String field3;

    protected static abstract class Builder<T extends Builder<T>> {
        private String field1;
        private String field2;
        private String field3;

        public T field1(String field1) {
            this.field1 = field1;
            return self();
        }

        public T field2(String field2) {
            this.field2 = field2;
            return self();
        }

        public T field3(String field3) {
            this.field3 = field3;
            return self();
        }

        protected abstract T self();

        public abstract AbstractProduct build();
    }

    protected AbstractProduct(Builder<?> builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "AbstractProduct{" +
            "field1='" + field1 + '\'' +
            ", field2='" + field2 + '\'' +
            ", field3='" + field3 + '\'' +
            '}';
    }
}
