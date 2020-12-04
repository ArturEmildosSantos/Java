import java.util.Scanner;

public class uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float X;
        int qtdpar=0;
        int cont =0;
        X = teclado.nextFloat();
            if (1 <= X && X <= 1000){
                for (cont=1; cont <= X ; cont++){
                    if (cont % 2 != 0){
                        System.out.println(cont);
                    }     
                }

             }
        
        
        
    }
}