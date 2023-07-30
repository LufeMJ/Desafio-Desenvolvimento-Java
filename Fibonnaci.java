import java.util.Scanner;
import java.util.ArrayList;

public class Fibonnaci {

  private static Integer fibonnaciLinear(int num) {
    ArrayList<Integer> fibonnaci = new ArrayList<>();
    fibonnaci.add(0);
    fibonnaci.add(1);

    for (int i = 2; i < num+1; i++) {
      int fibonnaciProx = fibonnaci.get(i-1) + fibonnaci.get(i-2);
      fibonnaci.add(fibonnaciProx);
    }

    int result = fibonnaci.get(num);

    return result;
  }

  public static Integer fibonnaciRecursivo(int num) {
    if (num < 2) {
      return num;
    }
    else {
      return fibonnaciRecursivo(num-1) + fibonnaciRecursivo(num-2);
    }
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
  
      if (num < 0) {
        System.out.println("Erro! O número deve ser maior ou igual a 0!");
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