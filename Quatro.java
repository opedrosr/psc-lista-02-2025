import java.util.Scanner;
public class Quatro{
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double preco, litro;

      System.out.println("Informe qual o preço do litro da gasolina, e quantos litros você abasteceu: ");
      preco = sc.nextDouble();
      litro = sc.nextDouble();
      
        System.out.println("Você deverá pagar: " + (preco*litro));
        
    sc.close();

    }


}