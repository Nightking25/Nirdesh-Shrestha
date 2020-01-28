/* Calculate the area of a circle
Nirdesh Shrestha
*/

public class AreaOfCircle {
  public static void main( String [] args){
    final double PI = 3.14159;
    double radius;
    double area;
    radius = 3.5;
    area = PI * radius * radius;
    System.out.println("This area is " + area );

    int currentYear = 2020;
    int yearOfBirth = 1998;

    int age = currentYear - yearOfBirth;
    System.out.println("Your are " + age + " years old.");
  }
}
