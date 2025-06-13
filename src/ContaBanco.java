import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
      System.out.println("Por favor, digite o número da Agência !");
      var agencia = sc.next();
        sc.nextLine();
      System.out.println("Digite o numero da conta: ");
      var numero = sc.nextInt();
        sc.nextLine();
      System.out.println("Informe seu nome: ");
      var nomeCliente = sc.nextLine();
      System.out.println("Informe seu saldo: ");
      var saldo = sc.nextFloat();

      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e o seu saldo R$ %.2f já esta disponivel para saque.\n", nomeCliente, agencia, numero, saldo); 
    }
}
