import java.util.Scanner;

public class uri1043{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double A,B,C,perimetro,area;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();    
        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            perimetro = (A + B + C);
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } 
            else {
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
            }
    }
}