import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado; //declaro componente chamo teclado
        teclado = new Scanner(System.in); // teclado

        int a;
        float b;
        double c;

        System.out.println("Favor digitar um valor inteiro");
        a= teclado.nextInt();
        System.out.println("Voce digitou "+ a);

        System.out.println("Agora digite valor float");
        b= teclado.nextFloat();
        System.out.println("Voce digitou"+b);

        System.out.println("Agora digite valor Double");
        c= teclado.nextDouble();
        System.out.println("Voce digitou"+c);


        System.out.printf("%.1f%n",c);
        System.out.printf("%.2f%n",c);
        System.out.printf("%.3f%n",c);

    }

}