import java.util.Scanner;
public class tri3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int temp = sc1.nextInt();
        int i;
        int j;

        for (i = 0; i < temp; i++) {
            for (j = 0; j < temp; j++) {
                if (i>j) {
                    System.out.print('.');
                }
                else {
                    System.out.print('*');
                }
            }
            System.out.println("");

        }
    }
}