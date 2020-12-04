import java.util.Scanner;

public class uri1005{
    public static void main(String args[]){
        Scanner teclado; //declaro componente chamo teclado
        teclado = new Scanner(System.in); // teclado

        float A,B,X ;

        

       
        A= teclado.nextFloat();
           
        B= teclado.nextFloat();
       
        X=(float)((A*3.5)+(B*7.5))/11;
        
        System.out.printf("Media = %.5f%n",X);
        //c= teclado.nextDouble();
        //System.out.println("Voce digitou"+c);


    }

}