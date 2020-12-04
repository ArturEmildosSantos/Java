import java.util.Scanner;

public class teste{
    public static void main(String args[]){
        Scanner teclado; //declaro componente chamo teclado
        teclado = new Scanner(System.in); // teclado

        int A,B,C,D,X ;

        

       
        A= teclado.nextInt();
        B= teclado.nextInt();
        C= teclado.nextInt();
        D= teclado.nextInt();
           
    
       
        X=(A * B - C * D);
        
        System.out.printf("DIFERENCA = "+ X);
        


    }

}