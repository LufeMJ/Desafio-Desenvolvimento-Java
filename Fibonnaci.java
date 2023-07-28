import java.util.Scanner;
import java.util.ArrayList;

public class Fibonnaci {

  private static ArrayList<Integer> fibonnaciLinear(int num) {
    ArrayList<Integer> result = new ArrayList<>();
    return result;
  }

  public static ArrayList<Integer> fibonnaciRecursivo(int num) {
    ArrayList<Integer> result = new ArrayList<>();
    return result;
  }


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;
    int num;
  
    System.out.println();
    System.out.println("Digite o número desejado:");
    
    while (true) {
      input = scanner.nextLine();
      
      try {
        num = Integer.parseInt(input);
      } catch (Exception e) {
        System.out.println("Erro! Digite apenas um número!");
        continue;
      }
  
      if (num < 2) {
        System.out.println("Erro! O número deve ser maior que 1!");
        continue;
      }

      break;
    }

    System.out.println();
    System.out.println("Digite o número da operação que deseja realizar:");
    System.out.println("1- Linear");
    System.out.println("2- Recursiva");

    while (true) {
      input = scanner.nextLine();

      switch (input) {
          case "1":
            System.out.println("Resultado Linear: " + fibonnaciLinear(num));
            break;
          case "2":
            System.out.println("Resultado Recursivo: " + fibonnaciRecursivo(num));
            break;
          default:
            System.out.println("Erro! Operação inválida.");
            continue;
      }
      break;
    }
    scanner.close();
  }
}