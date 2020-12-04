import java.util.Scanner;

public class uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        int A,G,D,cod;

        A =0;
        G =0;
        D = 0;
        cod = 0;
        
        do {
            
            cod = teclado.nextInt();

            switch (cod) {
	            case 1 : 

                    A++; 
                break;
                case 2 :
                    G++;
                break;
                case 3 :
                    D++;
                break;
                case 4 :
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: "+A);
                    System.out.println("Gasolina: "+G);
                    System.out.println("Disel: "+D);
                break;

            }


           
        }


         while (cod != 4);

            


    }
}