import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Conhecer e importar a classe Scanner

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scan.nextInt(); 

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scan.next();

        System.out.println("Por favor, digite o seu nome!");
        String nome = scan.next(); 

        System.out.println("Por favor, digite o seu nome!");
        String sobrenome = scan.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scan.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem criada

        System.out.println("Olá, " + nome + " " + sobrenome +
        " obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " +  numeroConta + " e seu saldo" 
        + saldo + " já está disponível para saque.");
    }
}
