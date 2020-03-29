/*
Implement a class Student, including the following attributes and methods:

Two public attributes name(string) and score(int).
A constructor expect a name as a parameter.
A method getLevel to get the level(char) of the student.
score - level table:

A: score >= 90
B: score >= 80 and < 90
C: score >= 60 and < 80
D: score < 60
*/

public class Student {
    /**
     * Declare two public attributes name(string) and score(int).
     */
    public String name;
    public int score;
    
    /**
     * Declare a constructor expect a name as a parameter.
     */
    Student(String name){
        this.name = name;
    }
    /**
     * Declare a public method `getLevel` to get the level(char) of this student.
     */
    public char getLevel(){
         if (this.score>=90){
             return 'A';
         }
         else if (this.score<90 && this.score>=80){
             return 'B';
         }
         else if (this.score<80 && this.score>=60){
             return 'C';
         }
         else {
             return 'D';
         }
         
    }
}