import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite o número da conta: ");
        int Numero = sc.nextInt();
        sc.nextLine(); // se n tiver isso n presta ( consumindo o ENTER que fica do nextInt())

        System.out.println("Digite a agência conta: ");
        String Agencia = sc.nextLine();


        System.out.println("Digite o nome do cliente da conta: ");
        String NomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        float Saldo = sc.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");

        sc.close();

    }

}
