/*import java.util.Scanner;


public class ContaTerminal {


    public static void main(String[] args) throws Exception {

        //TODO:"Conhecer e importar a classe Scanner";
        
        //Exibir as mensagens par o nosso usuário;
    
        //Obter pelo Scanner os valores digitados no terminal;

        // exibir a mensagem da conta criada;

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;


        System.out.println("Digite o número da conta:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
    
        System.out.println("Digite o número da agência:");
        agencia = sc.next();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = sc.next();
        
        System.out.println("Digite o saldo:");
       saldo = sc.nextDouble();

       System.out.println("conta número:" + numero + "\n" + "agencia número:" + agencia + "\n" + "Nome Cliente:"+ nomeCliente + "\n" + "saldo:" + saldo);

       sc.close();
}
       

}
*/


public class ContaTerminal {

    public static void main(String[] args) {
        // Exibe mensagens para o usuário
        System.out.println("Bem-vindo! Por favor, insira os dados da sua conta:");

        // Cria um objeto da classe Conta
        Conta conta = new Conta();

        // Lê os dados da conta do usuário
        conta.lerDados();

        // Exibe os detalhes da conta criada
        System.out.println("Conta criada com sucesso! Detalhes da conta:");
        conta.exibirDetalhes();
    }
}


    



    