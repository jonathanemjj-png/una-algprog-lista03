import java.util.Scanner;

public class Meteorologia {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    
    Double celsius, fahrenreit;

    System.out.println("Digite a temperatura em Celsius");
    celsius = sc.nextDouble();

    fahrenreit = (celsius * 1.8) + 32;

    System.out.println("Temperatura em Fahrenheit " + fahrenreit);

    sc.close();
}
    
}
