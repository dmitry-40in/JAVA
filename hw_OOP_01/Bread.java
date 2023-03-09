public class Bread extends ProductExpDate {
    private String typeOfFlour;

    public Bread(String name, int price, int quantity, String unitoOfMeasurement, String expirationDate, String typeOfFlour) {
        super(name, price, quantity, unitoOfMeasurement, expirationDate);

        this.typeOfFlour = typeOfFlour;
    }


    public String getTypeOfFlour() {
        return this.typeOfFlour;
    }

    public void setTypeOfFlour(String value) {
        this.typeOfFlour = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("typeOfFlour: %s.", this.typeOfFlour));
        return sb.toString();
    }
}
