public class Diapers extends BabaysProduct {
    private int size;
    private int minWeight;
    private int maxWeight;
    private int type;

    public Diapers(String name, int price, int quantity, String unitoOfMeasurement, int minimumAge, boolean hypoallergenic, int size, int minWeight, int maxWeight, int type) {
        super(name, price, quantity, unitoOfMeasurement, minimumAge, hypoallergenic);

        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    
    public int getSize() {
        return this.size;        
    }

    public void setSize(int value) {
        this.size = value;
    }

    public int getMinWeight() {
        return this.minWeight;
    }

    public void setMinWeight(int value) {
        this.minWeight = value;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(int value) {
        this.maxWeight = value;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int value) {
        this.type = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format(", size: %d, ", this.size));
        sb.append(String.format("minWeight: %d, gr. ", this.minWeight));
        sb.append(String.format("maxWeight: %d, gr. ", this.maxWeight));
        sb.append(String.format("type: %d.", this.type));
        return sb.toString();
    }
}
