public class ProductExpDate extends Product {
    private String expirationDate;

    public ProductExpDate(String name, int price, int quantity, String unitoOfMeasurement, String expirationDate) {
        super(name, price, quantity, unitoOfMeasurement);

        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("expirationDate: %s, ", this.expirationDate));
        return sb.toString();
    }
}


