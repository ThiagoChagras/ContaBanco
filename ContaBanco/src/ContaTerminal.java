import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);
        
        //entrada de dados
        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do titular!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();
    
        //saída de dados
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
