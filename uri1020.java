import java.util.Scanner;

public class uri1020 {
	
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int E,A,M,D,S;

        //entrada
        E=leitor.nextInt();

        // Processamento
        A=E/365;
        S=E%365;
        M=S/30;
        D=S%30;

        //Saida
        System.out.println(A + " ano(s)");
        System.out.println(M + " mes(s)");
        System.out.println(D + " dia(s)");
        
    }
	
}