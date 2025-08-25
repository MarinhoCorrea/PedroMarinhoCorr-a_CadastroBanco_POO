import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {
    private String limiteChequeEspecial;

    private static List<ContaCorrente> contasCorrentes = new ArrayList<>();

    public ContaCorrente(String agencia, String numeroConta, String saldo, String limiteChequeEspecial) {
        super(agencia, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public String getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(String limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Metodos CRUD
     public void gravar() {
        contasCorrentes.add(this);
        System.out.println("Conta gravada !");
    }
    public void editar(String agencia, String numeroConta, String saldo, String limiteChequeEspecial) {
        setLimiteChequeEspecial(limiteChequeEspecial);
        setAgencia(agencia);
        setNumeroConta(numeroConta);
        setSaldo(saldo);
        System.out.println("Conta editada!");
    }
    public void excluir() {
        contasCorrentes.remove(this);
        System.out.println("Conta excluída!");
    }

}
