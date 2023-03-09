public class Nipple extends BabaysProduct {
    
    public Nipple(String name, int price, int quantity, String unitoOfMeasurement, int minimumAge, boolean hypoallergenic) {
        super(name, price, quantity, unitoOfMeasurement, minimumAge, hypoallergenic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("."));
        return sb.toString();
    }
}
