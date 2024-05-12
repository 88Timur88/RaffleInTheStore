public class Prize {
    private int id;
    private String name;
    private int quantity;
    private double frequency;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Prize(int id, String name, int quantity, double frequency){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

}
