public class TestMyRectangle {
    public static void main(String[] args) {
        // testing of all rectangle functions/methods
        MyRectangle box1 = new MyRectangle(0,5,7,0);
        System.out.println();
        System.out.println();
        System.out.println();
        box1.getTopLeft();
        box1.getBottomRight();

        box1.getPerimeter();
        box1.getArea();
    }
}
