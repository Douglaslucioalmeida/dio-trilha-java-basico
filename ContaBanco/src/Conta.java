import java.util.Scanner;

public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor para inicializar uma conta com valores padrão
    public Conta() {
        this.numero = 0;
        this.agencia = "";
        this.nomeCliente = "";
        this.saldo = 0.0;
    }

    // Métodos para definir os valores dos atributos
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para exibir os detalhes da conta
    public void exibirDetalhes() {
        System.out.println("Conta número: " + numero);
        System.out.println("Agência número: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }

    // Método para ler os dados da conta do usuário
    public void lerDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        this.numero = sc.nextInt();

        System.out.println("Digite o número da agência:");
        this.agencia = sc.next();

        System.out.println("Digite o nome do cliente:");
        this.nomeCliente = sc.next();

        System.out.println("Digite o saldo:");
        this.saldo = sc.nextDouble();

        sc.close();
    }
}
