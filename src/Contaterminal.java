import java.util.Locale;
import java.util.Scanner;

public class Contaterminal {
    public static void main(String[] args) throws Exception {
    
        Double Saldo = 237.48;

         //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Poderia nos informar seu nome completo?");
        String nomeCompleto = scanner.next();

        System.out.println("Digite o número da sua agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCompleto  + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
        " conta " + numeroConta + " e o seu saldo de R$" + Saldo + " já está disponível para saque");
    }
}
