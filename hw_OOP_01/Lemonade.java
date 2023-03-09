public class Lemonade extends Drinks {
    
    public Lemonade(String name, int price, int quantity, String unitoOfMeasurement, int volume) {
        super(name, price, quantity, unitoOfMeasurement, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("."));
        return sb.toString();
    }
}
