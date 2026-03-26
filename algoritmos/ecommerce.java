import java.util.Scanner;
public class ecommerce {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Double produto, valorFinal, desconto, descontoAplicado;
        
        System.out.println("Digite o valor original do produto: ");
        produto = sc.nextDouble();
        
        System.out.println("Digite o percentual de desconto: ");
        desconto = sc.nextDouble();

        descontoAplicado = (produto * desconto) / 100;
        valorFinal = produto - descontoAplicado;

        System.out.println("Seu desconto é de R$" + descontoAplicado + " Totalizando o valor do produto em " + valorFinal);

        sc.close();

    
    }
    
}
