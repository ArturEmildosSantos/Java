import java.util.Scanner;


public class uri1142 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int num = 1;
       
       
        for (int cont = 1; cont <= n; cont++) {
            System.out.println(num + " " + (num+1)+" "+ (num+2)+ " PUM");
            num+=4;
          
        }
    }
}