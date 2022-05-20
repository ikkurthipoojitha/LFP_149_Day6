import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        double x1,x2,y1,y2,lineLength;
        System.out.println("Welcome to Line comparison computation");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values");

        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();

        lineLength = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("line length :"+lineLength);
    }
}
