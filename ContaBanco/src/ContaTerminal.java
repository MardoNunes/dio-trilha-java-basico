import java.util.Random;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        String nome;
        int numeroConta;
        int numeroAgencia;
        double saldo;

        System.out.println("VAMOS CRIAR A SUA CONTA!");
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("Entre com seu saldo inicial: ");
        saldo = input.nextDouble();

        numeroAgencia = gerador.nextInt(9999);
        numeroConta = gerador.nextInt();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        input.close();
    }
}
