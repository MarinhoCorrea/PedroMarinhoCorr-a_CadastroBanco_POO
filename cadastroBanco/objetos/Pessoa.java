import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;

    // Lista estática para armazenar pessoas
    private static List<Pessoa> pessoas = new ArrayList<>();

    public Pessoa(String nome, String endereco, String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos CRUD
    public void gravar() {
        pessoas.add(this);
        System.out.println("Pessoa gravada!");
    }

    public void editar(String nome, String endereco, String cpf, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setCpf(cpf);
        setTelefone(telefone);
        System.out.println("Pessoa editada!");
    }

    public void excluir() {
        pessoas.remove(this);
        System.out.println("Pessoa excluída!");
    }

    public void cancelar() {
        System.out.println("Operação cancelada para Pessoa.");
    }

    public static List<Pessoa> listarPessoas() {
        return pessoas;
    }
}