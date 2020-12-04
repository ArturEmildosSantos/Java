import java.util.Scanner;

public class uri1010{
    public static void main(String args[]){
        Scanner teclado; //declaro componente chamo teclado
        teclado = new Scanner(System.in); // teclado

        int P1,PN1,P2,PN2 ;
        double PV1,PV2,T;
        
        
        
       
        P1= teclado.nextInt();
        PN1= teclado.nextInt();
        PV1= teclado.nextDouble();
        
        P2= teclado.nextInt();
        PN2= teclado.nextInt();
        PV2= teclado.nextDouble();
           
    
       
        T=(PN1*PV1+PN2*PV2);
        
        System.out.printf("VALOR A PAGAR: R$%.2f%n",T);
        


    }

}