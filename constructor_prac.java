class Rectangle {
    public int length=5;
    public int breadth=5;
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {

        return length;
    }
    public void setBreadth(int breadth) {
        this.length = length;

    }
    public int getBreadth(){
        return breadth;
    }
    public int area(){
        return length * breadth;

    }
    //Create constructor
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth= breadth;

    }

        }
public class constructor_prac {
    public static void main(String[] args) {
        Rectangle ar= new Rectangle(4,7);
        //method calling
//        System.out.println(ar.getBreadth());
//        System.out.println(ar.getLength());
//        System.out.println("Area of Rectangle is :"+ar.area());

        // constructor calling
        System.out.println(ar.getLength());
        System.out.println(ar.getBreadth());
        System.out.println(ar.area());

    }
}
