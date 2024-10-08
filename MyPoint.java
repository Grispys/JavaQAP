public class MyPoint {
    private int x;
    private int y;

    // sets up mypoint location
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    // bunch of getter and setter functioons for each x and y 
    public int getX(){
        // System.out.println(this.x);
        return x;
    }

    public int getY(){
        // System.out.println(this.y);
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return(this.x + "," + this.y);
    }


    //distance is determined by subtracting desired x from current x, same with y, then taking the square root of x2 + y2
    public double distance(int x, int y){
        int distanceX = this.x - x;
        int distanceY = this.y - y;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
        
    }

    public double distance(MyPoint another){
        int distanceX = this.x - another.x;
        int distanceY = this.y - another.y;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }

    public double distance(){
        int distanceX = 0 + this.x;
        int distanceY = 0 + this.y;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }
}
