import java.util.Scanner;

public class uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        int cod = 0;
        
        do {
            cod = teclado.nextInt();

            switch (cod) {
	            case 2002 : 
                    System.out.println("Acesso Permitido"); 
            break;
                default : 
                    System.out.println("Senha Invalida");
            }
        }

        while (cod != 2002);
     

    }

}

