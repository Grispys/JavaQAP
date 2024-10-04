public class TestMyLine {
    
    public static void main(String[] args) {
        // testing every single function/method
        MyLine line1 = new MyLine(1, 3, 2, 6);
        System.out.println();
        System.out.println();
        System.out.println();
        line1.getBegin();
        line1.getEnd();
        System.out.println(line1);
        line1.setBegin(new MyPoint(5,5));
        line1.getBegin();
        line1.setEnd(new MyPoint(7,7));
        line1.getEnd();
        System.out.println(line1);
        line1.getBeginX();
        line1.setBeginX(11);
        line1.getBeginX();
        line1.getBeginY();
        line1.setBeginY(40);
        line1.getBeginY();
        line1.getEndX();
        line1.setEndX(22);
        line1.getEndX();
        line1.getEndY();
        line1.setEndY(71);
        line1.getEndY();
        System.out.println(line1);
        line1.getBeginXY();
        line1.setBeginXY(80, 80);
        line1.getBeginXY();
        line1.getEndXY();
        line1.setEndXY(300, 123);
        line1.getEndXY();
        System.out.println();
        System.out.println("This ends the getter and setter functions. Next up: Length, Gradient, String: ");
        System.out.println();
        line1.getLength();
        System.out.println(line1.getGradient());
        System.out.println(line1);

    }
}
