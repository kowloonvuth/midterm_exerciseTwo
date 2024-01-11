public class Main {
    public static void main(String[] args) {

    }

    public class Rectangle {
        protected double length;
        protected double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea(){
            return length * width;
        }

        public double getPerimeter(){
            return 2 * (length + width);
        }
    }

    class Square extends Rectangle {
        public Square (double sideLength) {
            super(sideLength, sideLength);
        }
    }
}