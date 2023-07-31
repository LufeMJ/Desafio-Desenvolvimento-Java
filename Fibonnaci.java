import java.util.Scanner;
import java.util.ArrayList;

public class Fibonnaci {

  //Função que vai criar uma sequencia de fibonnaci de forma linear
  //e retornar um número em uma posição indicada
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

  //Função que retorna um número em uma posição da sequência de fibonnaci
  //de forma recursiva
  public static Integer fibonnaciRecursivo(int num) {
    if (num < 2) {
      return num;
    }
    else {
      return fibonnaciRecursivo(num-1) + fibonnaciRecursivo(num-2);
    }
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
        System.out.println("Erro! Digite apenas um número!");
        continue;
      }

      //Verifica se o número inteiro é maior que 1
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

    //Loop para validar a forma que será executado o desafio
    while (true) {
      input = scanner.nextLine();

      //Switch case para verificar qual foi a operação selecionada
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