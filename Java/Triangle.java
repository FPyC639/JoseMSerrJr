package geoms;
import geoms.GeometricObject;
public class Triangle extends GeometricObject{
    private float side1;
    private float side2;
    private float side3;

    public Triangle(String color, Boolean filled, float side1, float side2, float side3){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public float getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    public float getArea(){
        float p;
        p = this.getPerimeter()/2;
        return (float) (Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3)));
    }
    public String toString(){
        return "Triangle[ color:"+this.getColor()+" filled:"+ this.isFilled() +",side1: "+ this.side1+ ", side2: "+ this.side2 + ", side3: "+
                this.side3+ ", getPerimeter():" + this.getPerimeter() + ", getArea():"+ this.getArea()+ "]";
    }
    public static void main(String[] args){
        Triangle t1 = new Triangle("blue", true, (float) 3.0, (float) 4.0, (float) 5.0);
        System.out.println(t1.toString());
    }
}
