public class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        color = "green";
        filled = true;
    }

    Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return "A Shape with color of " + color + " and filled/not filled " + filled;
    }
}
