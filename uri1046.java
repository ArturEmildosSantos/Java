import java.util.Scanner;

public class uri1046 {

   public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
       
    int S,E,T;

    S = teclado.nextInt();
    E = teclado.nextInt();
    T = 0;
    if (S > E) {
            T= (24 - S) + E;
            
    }
        else if (S<E){
            T= E-S;

            }
            else if (S == E){
             T=24;
            }

     System.out.println("O JOGO DUROU " + T + " HORA(S)");
  }

}