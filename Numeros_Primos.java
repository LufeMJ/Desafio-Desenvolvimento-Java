import java.util.Scanner;
import java.util.ArrayList;

public class Numeros_Primos {

  private static ArrayList<Integer> primoLinear(int num) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 2; i < num; i++) {
      int num_aux = 1;
      int primo_aux = 0;

      while (num_aux <= i) {
        if ((i % num_aux) == 0) {
          primo_aux++;
        }
        num_aux++;
      }
      if (primo_aux == 2) {
        result.add(i);
      }
      
    }
    return result;
  }

  private static boolean verificaPrimo(int num, int aux) {
    if ((num == 2) || (aux > num/2)) {
      return true;
    }
    if ((num <= 2) || (num % aux == 0)) {
      return false;
    }
    return verificaPrimo(num, aux+1);
    }

  private static ArrayList<Integer> primoRecursivo(int num) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 2; i < num; i++) {
      if (verificaPrimo(i, 2)) {
        result.add(i);
      }
    }
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
            System.out.println("Resultado Linear: " + primoLinear(num));
            break;
          case "2":
            System.out.println("Resultado Recursivo: " + primoRecursivo(num));
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