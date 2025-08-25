package cadastroBanco.Objetos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private String clienteId;
    private String senha;

    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String endereco, String cpf, String telefone, String clienteId, String senha) {
        super(nome, endereco, cpf, telefone);
        this.clienteId = clienteId;
        this.senha = senha;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void gravar() {
        super.gravar();
        clientes.add(this);
        System.out.println("Cliente gravado! ID: " + clienteId);
    }

    @Override
    public void editar(String nome, String endereco, String cpf, String telefone, String clienteId, String senha) {
        super.editar(nome, endereco, cpf, telefone);
        setClienteId(clienteId);
        setSenha(senha);
        System.out.println("Cliente editado! ID: " + clienteId);
    }

    @Override
    public void excluir() {
        super.excluir();
        clientes.remove(this);
        System.out.println("Cliente excluído! ID: " + clienteId);
    }

    public static List<Cliente> listarClientes() {
        return clientes;
    }
}