public class Rectangle {

    public double getLength() {
        return length;
    }

    public double setLength(int length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double setWidth(int width){
        this.width = width;
    }

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


}
