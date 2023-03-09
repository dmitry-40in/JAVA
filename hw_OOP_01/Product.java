public class Product {
    private String name;
    private int price;
    private int quantity;
    private String unitoOfMeasurement;

    public Product(String name, int price, int quantity, String unitoOfMeasurement) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unitoOfMeasurement = unitoOfMeasurement;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int value) {
        this.price = value;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }

    public String getUnitoOfMeasurement() {
        return this.unitoOfMeasurement;
    }

    public void setUnitoOfMeasurement(String value) {
        this.unitoOfMeasurement = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("name: %s, ", this.name));
        sb.append(String.format("price: %d, ", this.price));
        sb.append(String.format("quantity: %d ", this.quantity));
        sb.append(String.format("%s., ", this.unitoOfMeasurement));
        return sb.toString();
    }

}
