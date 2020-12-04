import java.util.Scanner;

public class uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor,Tp,Ti,Tn,Tpo;
        Tp =0;
        Ti =0;
        Tn =0;
        Tpo =0;
        valor =0;
        for (int cont=1; cont<=5; cont++){
            valor = teclado.nextInt();
            if (valor % 2 == 0   ){
                 Tp++;
            }
                else{
                    Ti++;
                }
            if (valor > 0){
                Tpo++;
            }
                else if (valor <0){
                    Tn++;
                }
        }
        System.out.println(Tp +" valor(es) par(es)");
        System.out.println(Ti +" valor(es) impar(es)");
        System.out.println(Tpo +" valor(es) positivo(s)");
        System.out.println(Tn +" valor(es) negativo(s)");
    }


}