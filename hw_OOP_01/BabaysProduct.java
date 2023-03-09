public class BabaysProduct extends Product {
    private int minimumAge;
    private boolean hypoallergenic;

    public BabaysProduct(String name, int price, int quantity, String unitoOfMeasurement, int minimumAge, boolean hypoallergenic) {
        super(name, price, quantity, unitoOfMeasurement);

        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinimumAge() {
        return this.minimumAge;
    }

    public void setMinimumAge(int value) {
        this.minimumAge = value;
    }

    public boolean getHypoallergenic() {
        return this.hypoallergenic;
    }

    public void setHypoallergenic(boolean value) {
        this.hypoallergenic = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("minimumAge: %d, ", this.minimumAge));
        sb.append(String.format("hypoallergenic: %b", this.hypoallergenic));
        return sb.toString();
    }
}
