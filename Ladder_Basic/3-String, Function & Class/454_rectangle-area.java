/*
Implement a Rectangle class which include the following attributes and methods:

Two public attributes width and height.
A constructor which expects two parameters width and height of type int.
A method getArea which would calculate the size of the rectangle and return.
Example
Example1:
Java:
    Rectangle rec = new Rectangle(3, 4);
    rec.getArea(); // should get 12，3*4=12
*/

    public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    int width;
    int height;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return this.width * this.height;
    }
}
