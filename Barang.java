public abstract class Barang {
    String color;
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    
    public abstract void draw();
    public abstract float total();
}