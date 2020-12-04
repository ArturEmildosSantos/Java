import java.util.Scanner;

public class uri1019 {
	
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int E,H,M,S;

        //entrada
        E=leitor.nextInt();

        // Processamento
        
        H=E/3600;
        S=E%3600;
        M=S/60;
        S=S%60;

        //Saida
        System.out.println(H +":" + M +":" + S);
        
        
    }
	
}