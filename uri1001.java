import java.util.Scanner;

public class uri1001{
    public static void main(String args[]){
        Scanner teclado; //declaro componente chamo teclado
        teclado = new Scanner(System.in); // teclado

        int A,B,X ;

        

        //System.out.println("Favor digitar um valor inteiro");
        A= teclado.nextInt();
        //System.out.println("Voce digitou "+ a);

        //System.out.println("Agora digite valor float");
        B= teclado.nextInt();
        //System.out.println("Voce digitou"+b);

        X=A+B;
        
        System.out.println("X = " + X);
        //c= teclado.nextDouble();
        //System.out.println("Voce digitou"+c);


    }

}