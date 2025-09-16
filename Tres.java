import java.util.Scanner;
public class Tres {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    double n1, n2, n3, n4, media;
    System.out.println("Digite sua primeira nota: ");
    n1 = sc.nextDouble();

    System.out.println("Digite sua segunda nota: ");
    n2 = sc.nextDouble();

    System.out.println("Digite sua terceira nota: ");
    n3 = sc.nextDouble();

    System.out.println("Digite sua quarta nota: ");
    n4 = sc.nextDouble();

         System.out.println("Sua nota final foi: "+ (n1 + n2 + n3 + n4) / 4);

    sc.close();
    }

} 