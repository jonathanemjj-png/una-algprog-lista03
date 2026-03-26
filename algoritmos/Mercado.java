import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {

        String produto;
        Double valor;
        int quantidade;
        Double valorTotal;

   Scanner sc = new Scanner(System.in);

   System.out.println("Digite o nome do produto: ");
   produto = sc.nextLine();

   System.out.println("Digite o preço unitário: ");
   valor = sc.nextDouble();

   System.out.println("Digite a quantidade comprada: ");
   quantidade = sc.nextInt();

   valorTotal = valor * quantidade;

   System.out.println("O produto " + produto + " custou um total de R$: " + valorTotal);

   sc.close();

    }
   }

   
   
    
    

    



    

