public class Drinks extends Product{
    private int volume;

    public Drinks(String name, int price, int quantity, String unitoOfMeasurement, int volume) {
        super(name, price, quantity, unitoOfMeasurement);

        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int value) {
        this.volume = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("volume: %d ml", this.volume));
        return sb.toString();
    }
}
