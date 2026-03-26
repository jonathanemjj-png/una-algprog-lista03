import java.util.Scanner;
public class Caronas {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Double distancia, litros, consumo;

    System.out.println("Digite a distância total percorrida: ");
    distancia = sc.nextDouble();

    System.out.println("Digite o total de combustível gasto");
    litros = sc.nextDouble();

    consumo = distancia/litros;

    System.out.println("O consumo médio do seu carro é: " + consumo + "L por km");

    sc.close();


}
    
}
