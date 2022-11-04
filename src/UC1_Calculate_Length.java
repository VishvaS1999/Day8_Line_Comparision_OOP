import java.util.Scanner;

public class UC1_Calculate_Length
{
    public static int x1, x2, y1, y2;
    public static void length()
    {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of the given Line is : " + len + " units" );
    }
    public static void main(String[] args)
    {
        length();

    }
}