import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        int accountNumber = 0;
        String agencyNumber = "";
        double accountBalance = 0;

        System.out.println("Por favor, digite o seu Nome: ");
        name = input.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencyNumber = input.nextLine();

        System.out.println("Por favor, digite o numero da Conta: ");
        accountNumber = input.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta: ");
        accountBalance = input.nextDouble();

        System.out.println("Olá " + name +", obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo " + accountBalance + " já está disponível para saque");
    }
}
