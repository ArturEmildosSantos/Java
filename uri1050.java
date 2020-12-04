import java.util.Scanner;
public class uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod;
        

        cod = teclado.nextInt();
        

        if (cod == 61){    // digitei codigo 1?
           System.out.println("Brasilia");
        }
        else if (cod == 71){   // já que o código não é 1, pode ser tanto 2, 3, 4 ou 5
            System.out.println("Salvador");
        }
        else if (cod == 11){ // este else corresponde ao IF da linha 15 - não é nem 1 nem 2, pode ser 3, 4 ou 5
            System.out.println("Sao Paulo");
        }
        else if (cod == 21){ // este ELSE corresponde ao if da linha 19, ou seja, não é nem 1, 2, ou 3 só pode ser 4 ou 5
            System.out.println("Rio de Janeiro");
        }
        else if (cod == 32){ // este ELSE corresponde ao if da linha 19, ou seja, não é nem 1, 2, ou 3 só pode ser 4 ou 5
            System.out.println("Juiz de fora");
        }
        else if (cod == 19){ // este ELSE corresponde ao if da linha 19, ou seja, não é nem 1, 2, ou 3 só pode ser 4 ou 5
            System.out.println("Campinas");
        }
        else if (cod == 27){ // este ELSE corresponde ao if da linha 19, ou seja, não é nem 1, 2, ou 3 só pode ser 4 ou 5
            System.out.println("Vitoria");
        }
        else if (cod == 31){ // este ELSE corresponde ao if da linha 19, ou seja, não é nem 1, 2, ou 3 só pode ser 4 ou 5
            System.out.println("Belo Horizonte");
        }
        else {  // não é nem 1, nem 2, nem 3, nem 4 - só pode ser 5
            System.out.println("DDD nao cadastrado");
        } 
        
        
    }
}