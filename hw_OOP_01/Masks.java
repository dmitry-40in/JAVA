public class Masks extends HygieneItems{
    public Masks(String name, int price, int quantity, String unitoOfMeasurement, int piecesPerPack) {
        super(name, price, quantity, unitoOfMeasurement, piecesPerPack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("."));
        return sb.toString();
    }
}
