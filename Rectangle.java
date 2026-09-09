public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        length = 5;
        width = 10;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        length = this.length;
    }

    public void setWidth(int width) {
        width = this.width;
    }

    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = length * 2 + width * 2;
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.pow(length, 2) + Math.pow(width, 2);
        diagonal = Math.pow(diagonal, 0.5);
        return diagonal;
    }

    public String toString() {
        String data = "Width: " + width + "\nLength: " + length;
        return data;
    }

    public boolean equals(Rectangle other) {
        return length == other.length && width == other.width;
    }
}
