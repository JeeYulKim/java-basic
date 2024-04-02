package oop1;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;

    boolean square;

    public void calculateArea(){
       area = this.width * this.height;
    }

    public void calculatePerimeter(){
        perimeter = 2 * (this.width + this.height);
    }

    public void isSquare(){
        square = this.width == this.height;
    }

    public void printArea(){
        System.out.println("넓이: " + this.area);
    }

    public void printPerimeter(){
        System.out.println("둘레 길이: " + this.perimeter);
    }

    public void printIsSquare(){
        System.out.println("정사각형 여부: " + this.square);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
