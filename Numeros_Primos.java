import java.util.Scanner;
import java.util.ArrayList;

public class Numeros_Primos {

  //Função que vai criar uma lista de números primos de forma linear
  private static ArrayList<Integer> primoLinear(int num) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 2; i <= num; i++) {
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

  //Função que faz a verificação recursiva se um numero é primo
  private static boolean verificaPrimo(int num, int aux) {
    if ((num == 2) || (aux > num/2)) {
      return true;
    }
    if ((num <= 2) || (num % aux == 0)) {
      return false;
    }
    return verificaPrimo(num, aux+1);
    }

  //Função que vai utilizar de recursividade para criar a lista de números primos
  private static ArrayList<Integer> primoRecursivo(int num) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 2; i <= num; i++) {
      if (verificaPrimo(i, 2)) {
        result.add(i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);       //Scanner para verificar o input do usuário
    String input;                                   //Variável que vai receber o input do usuário
    int num;                                        //Variável que vai receber o input convertido em um inteiro
  
    System.out.println();
    System.out.println("Digite o número desejado:");
    
    //Loop para fazer a validação do input
    while (true) {
      input = scanner.nextLine();
      
      //Try Catch para verificar se o input pode ser transformado em um inteiro
      try {
        num = Integer.parseInt(input);
      } catch (Exception e) {
        System.out.println("Erro! Digite apenas um número inteiro!");
        continue;
      }
  
      //Verifica se o número inteiro é maior que 1
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

    //Loop para validar a forma que será executado o desafio
    while (true) {
      input = scanner.nextLine();

      //Switch case para verificar qual foi a operação selecionada
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