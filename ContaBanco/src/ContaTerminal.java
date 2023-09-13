import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        // o useLocale é para receber o valor como pedido na atividade =237.48
        
        System.out.println("Digite o número da sua conta:");
        int conta = input.nextInt();
        input.nextLine();
        System.out.println("Digite a sua agência:");
        String agencia = input.nextLine();
        System.out.println("Digite o seu nome:");
        String nomeCliente = input.nextLine();
        System.out.println("Digite seu saldo:");
        double saldo = input.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  conta + " e seu saldo de " + saldo + " já está disponível para saque.");
        
    }
}
