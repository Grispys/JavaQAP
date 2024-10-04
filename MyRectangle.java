public class MyRectangle {
    private MyPoint topLeft = new MyPoint(0, 0);
    private MyPoint bottomRight = new MyPoint(0, 0);


    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft.setX(x1);
        this.topLeft.setY(y1);
        this.bottomRight.setX(x2);
        this.bottomRight.setY(y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft(){
        System.out.println(this.topLeft);
        return this.topLeft;
    }

    public MyPoint getBottomRight(){
        System.out.println(this.bottomRight);
        return this.bottomRight;
    }

    public double getPerimeter(){
        MyPoint bottomLeft = new MyPoint(this.topLeft.getX(), this.bottomRight.getY()); 
        MyPoint topRight = new MyPoint(this.bottomRight.getX(), this.topLeft.getY());

        double length1 = this.topLeft.distance(topRight);
        double length2 = this.topLeft.distance(bottomLeft);
        
        double perimeter = 2 * (length1 + length2);
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }

    public double getArea(){
        MyPoint bottomLeft = new MyPoint(this.topLeft.getX(), this.bottomRight.getY()); 
        MyPoint topRight = new MyPoint(this.bottomRight.getX(), this.topLeft.getY());

        double length1 = this.topLeft.distance(topRight);
        double length2 = this.topLeft.distance(bottomLeft);

        double area = (length1 * length2);
        System.out.println("Area is: " + area);
        return area;
    }
}
