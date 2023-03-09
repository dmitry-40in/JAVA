public class ToiletPaper extends HygieneItems{
    private int numberOfLayers;

    public ToiletPaper(String name, int price, int quantity, String unitoOfMeasurement, int piecesPerPack, int numberOfLayers) {
        super(name, price, quantity, unitoOfMeasurement, piecesPerPack);
        
        this.numberOfLayers = numberOfLayers;

    }


    public int getNumberOfLayers() {
        return this.numberOfLayers;
    }

    public void setNumberOfLayers(int value) {
        this.numberOfLayers = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("numberOfLayers: %d layers.", this.numberOfLayers));
        return sb.toString();
    }

}
