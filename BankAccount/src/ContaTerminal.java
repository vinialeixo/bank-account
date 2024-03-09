import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = myObj.nextInt();
        
        System.out.println("Por favor, digite a Agência com - :");
        String numero = myObj.next();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nome = myObj.next();

        System.out.println("Por favor, digite o saldo do Cliente:");
        Double saldo = myObj.nextDouble();

               
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");      
    }
}
