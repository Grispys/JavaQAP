public class MyLine {
    private MyPoint begin = new MyPoint(1,1);
    private MyPoint end = new MyPoint(2,2);

    //sets up the line coordinates
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin.setX(x1);
        this.begin.setY(y1);
        this.end.setX(x2);
        this.end.setY(y2);
    }

    // all of the individual getter and setter functions
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin(){
        System.out.println(this.begin);
        return this.begin;
    }

    public MyPoint getEnd(){
        System.out.println(this.end);
        return this.end;
    }


    public void setBegin(MyPoint begin){
        this.begin = begin;
    }

    public void setEnd(MyPoint end){
        this.end = end;
    }


    public int getBeginX(){
        return this.begin.getX();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }
   
    public int getBeginY(){
        return this.begin.getY();
    }

    public void setBeginY(int y){
        this.begin.setY(y);
    }


    public int getEndX(){
        return this.end.getX();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return this.end.getY();
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    //returns XY values in an array
    public int[] getBeginXY(){
        int[] location = new int[2];
        location[0] = this.begin.getX();
        location[1] = this.begin.getY();
        return location;
    }

    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y);
    }
     //returns XY values in an array
    public int[] getEndXY(){
        int[] location = new int[2];
        location[0] = this.end.getX();
        location[1] = this.end.getY();
        return location;
    }

    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }

    // uses mypoint distance function for length
    public double getLength(){
        double length = this.begin.distance(end);
        System.out.println("Line length is: " + length) ; 
        return length;
    }

    // uses atan2 to determine 
    public double getGradient(){
        int diffX = this.begin.getX() - this.end.getX();
        int diffY = this.begin.getY() - this.end.getY();

        return Math.atan2(diffY, diffX);
    }

    @Override
    public String toString(){
        return "MyLine[begin=(" + this.begin.getX() + "," + this.begin.getY() + "), end=(" + this.end.getX() + "," + this.end.getY() + ")]";
    }




}
