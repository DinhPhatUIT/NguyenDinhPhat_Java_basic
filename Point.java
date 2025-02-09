import java.util.Scanner;

public class Point {
        private int x,y;
        public Point(){}
        public Point(int x, int y){
                this.x = x;
                this.y = y;
        }
        public int getX(){
                return x;
        }
        public int getY(){
                return x;
        }
        public float distance(Point p){
                return (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY());
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the coordinates of the first point");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p = new Point(x,y);
        System.out.println("Enter the coordinates of the second point");
        x = sc.nextInt();
        y = sc.nextInt();
        Point q = new Point(x,y);
        System.out.println("Distance of both points: " + p.distance(q));
    }
}