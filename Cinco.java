import java.util.Scanner;
public class Cinco{

   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double viagem1, viagem2, viagem3;
   int pessoas;
   // pedir ao usuario para informar o valor das passagens e quantas pessoas irao

   System.out.println("Digite o valor da primeira passagem: ");
   viagem1 = sc.nextDouble();

   System.out.println("Digite o valor da segunda passagem: ");
   viagem2 = sc.nextDouble();

   System.out.println("Digite o valor da terceira passagem: ");
   viagem3 = sc.nextDouble();

   System.out.println("Informe quantas pessoas irão viajar: ");
   pessoas = sc.nextInt();

   System.out.println("O valor total da viagem será: " + ( viagem1 + viagem2 + viagem3) *pessoas);

sc.close();


}

}  

