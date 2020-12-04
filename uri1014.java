import java.util.Scanner;

public class uri1014 {
	
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        double Y = leitor.nextDouble();
        double KML = (X/Y);
        
        System.out.println(String.format("%.3f km/l",KML));
          
    }
	
}
