import java.util.Scanner;


public class uri1073 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
       
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^" + "2" + " = " + (i * i));
            }
        }
    }
}