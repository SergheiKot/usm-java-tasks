package md.usm.javatasks.beans;

public class Rectangle {

    private double length, width;

    public Rectangle() {
        this.length = 0.1;
        this.width = 0.1;
    }

    public Rectangle(double length, double width) throws Exception {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) throws Exception {
        if (length >= 0.0 && length <= 20.0) {
            this.length = length;
        } else {
            throw new Exception("Length must be between 0.0 and 20.0!");
        }
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) throws Exception {
        if (width >= 0.0 && width <= 20.0) {
            this.width = width;
        } else {
            throw new Exception("Width must be between 0.0 and 20.0!");
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Width: %.2f\nLength: %.2f\nArea: %.2f\nPerimeter: %.2f\n",
                getLength(), getWidth(), getArea(), getPerimeter());
    }
}
