public class Eggs extends ProductExpDate {
    private int piecesPerPack;

    public Eggs(String name, int price, int quantity, String unitoOfMeasurement, String expirationDate, int piecesPerPack) {
        super(name, price, quantity, unitoOfMeasurement, expirationDate);

        this.piecesPerPack = piecesPerPack;
    }


    public int getPiecesPerPack() {
        return this.piecesPerPack;
    }

    public void setPiecesPerPack(int value) {
        this.piecesPerPack = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("piecesPerPack: %d pp.", this.piecesPerPack));
        return sb.toString();
    }
}

