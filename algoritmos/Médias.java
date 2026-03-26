import java.util.Scanner;

public class Médias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double notaA, notaB, media;

        System.out.println("Digite a nota da Prova A: ");
        notaA = sc.nextDouble();

        System.out.println("Digite a nota da Prova B: ");
        notaB = sc.nextDouble();

        media = ((notaA * 4) + (notaB * 6)) / 10;

        System.out.println("A média ponderada é: " + media);

        sc.close();
    

    }
    
}
