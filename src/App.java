import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        int [][] matriz = new int[3] [3];
        Scanner s = new Scanner(System.in);
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(" Digite um numero: ");
                matriz[i] [j] = s.nextInt();
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(matriz[i] [j]);
            }
        }
    }
}
