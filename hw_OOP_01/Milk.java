public class Milk extends ProductExpDate{
    private int percentageOfFat;
    
    public Milk(String name, int price, int quantity, String unitoOfMeasurement, String expirationDate, int percentageOfFat) {
        super(name, price, quantity, unitoOfMeasurement, expirationDate);
        
        this.percentageOfFat = percentageOfFat;
    }
  

    public int getPercentageOfFat() {
        return this.percentageOfFat;
    }

    public void setPercentageOfFat(int value) {
        this.percentageOfFat = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("percentageOfFat: %d.", this.percentageOfFat));
        return sb.toString();
    }
}
