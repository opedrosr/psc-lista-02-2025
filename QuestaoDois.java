import java.util.Scanner;
public class QuestaoDois {
   public static void main(String[] args) {
   int a, b;

   Scanner sc = new Scanner(System.in);
   System.out.println("Digite o primeiro numero: ");
   a = sc.nextInt();

   System.out.println(" Digite o segundo numero: ");
   b = sc.nextInt();

   int soma = a + b;
   int subtracao = a - b;
   int multiplicacao = a * b;

   System.out.println("soma: " + soma);
   System.out.println("subtração: " + subtracao );
   System.out.println("multiplicação: " + multiplicacao);

   sc.close();

   }

    
}
