import java.util.Scanner;

public class uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor,media,positivo;
        int qtdePositivos=0;

        positivo = 0;
        for (int cont=1; cont<=6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                // System.out.println("Valor positivo");
                qtdePositivos++;
                positivo += valor;
            }
        }
        media = positivo/4;
        System.out.println(qtdePositivos +" valores positivos");
        
        System.out.printf("%.1f%n"media);
    }
}