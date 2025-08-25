import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {
    private String dataAniversario;
     private static List<ContaPoupanca> contasPoupanca = new ArrayList<>();

    public ContaPoupanca(String agencia, String numeroConta, String saldo, String dataAniversario) {
        super(agencia, numeroConta, saldo);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    // Metodos CRUD
    public void gravar() {
        contasPoupanca.add(this);
        System.out.println("Conta gravada !");
    }
    public void editar(String agencia, String numeroConta, String saldo, String dataAniversario) {
        setAgencia(agencia);
        setNumeroConta(numeroConta);
        setSaldo(saldo);
        setDataAniversario(dataAniversario);
        System.out.println("Conta editada!");
    }
    public void excluir() {
        contasCorrentes.remove(this);
        System.out.println("Conta excluída!");
    }

    
}
