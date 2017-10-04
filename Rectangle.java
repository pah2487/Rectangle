import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter the Height of Your Rectangle:");
        double length = sc.nextDouble();
        System.out.println("Please Enter the Length of Your Rectangle:");
        double height = sc.nextDouble();
        double perimeter = (height + height + length + length);
        double area = (height * length);
        System.out.println("The Perimeter of Your Rectangle is: " + perimeter);
        System.out.println("and the Area of Your Rectangle is: " + area);
    }
}
