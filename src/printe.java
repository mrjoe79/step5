import java.util.Scanner;
public class printe {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int f;
        int b = ((a-5) / 2)+1;

        for (f = 0; f < a; f++) {
            System.out.print('*');
        }
        System.out.println(" ");

        for (f = 0; f <= b-1; f++) {
            System.out.println('*');
        }
        System.out.print(" ");

        for (f = 0; f < a; f++) {
            System.out.print('*');
        }
        System.out.println(" ");

        for (f = 0; f <= b-1; f++) {
            System.out.println('*');
        }
        System.out.print(" ");

        for (f = 0; f < a; f++) {
            System.out.print('*');
        }
        System.out.println(" ");
    }
}