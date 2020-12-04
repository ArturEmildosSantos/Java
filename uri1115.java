Página inicialLEIAURI PROBLEMA 1115 - Quadrante SOLUÇÃO EM JAVA
URI PROBLEMA 1115 - Quadrante SOLUÇÃO EM JAVA
Garcia10/04/2018 01:24:00 AM
URI Online Judge | 1115
Quadrante
Adaptado por Neilor Tonin, URI  Brasil
Timelimit: 1
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.



import java.util.Scanner;

public class uri1115 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }

            x = teclado.nextDouble();
            y = teclado.nextDouble();
        }
    }
}