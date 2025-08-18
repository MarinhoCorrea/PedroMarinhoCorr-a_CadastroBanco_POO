package cadastroBanco;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
public class Janela extends JFrame {
    public Janela() {
        // Configurações da janela
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 275);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();
        setResizable(false);
        getContentPane().setLayout(null);

        // Criando componentes
        JLabel jlAgencia = new JLabel();
        JTextField jtfAgencia = new JTextField();

        JLabel jlConta = new JLabel();
        JTextField jtfConta = new JTextField();

        JSeparator jSeparator01 = new JSeparator();

        JLabel jlNome = new JLabel();
        JTextField jtfNome = new JTextField();

        JLabel jlEndereco = new JLabel();
        JTextField jtfEndereco = new JTextField();

        JLabel jlTelefone = new JLabel();
        JTextField jtfTelefone = new JTextField();

        JLabel jlCPF = new JLabel();
        JTextField jtfCPF = new JTextField();

        JRadioButton jrbCorrente = new JRadioButton();
        JRadioButton jrbPoupanca = new JRadioButton();
        ButtonGroup bgContas = new ButtonGroup();

        JSeparator jSeparator02 = new JSeparator();

        JButton jbConsultar = new JButton();
        JButton jbAtualizar = new JButton();
        JButton jbFechar = new JButton();

        // configuração componente jlAgencia e jtfAgencia
        jlAgencia.setText("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        jtfAgencia.setBounds(125, 10, 50, 20);
        // Adicionando o componente jlAgencia e jtfAgencia ao container
        getContentPane().add(jlAgencia);
        getContentPane().add(jtfAgencia);

        // configuração componente jlConta e jtfConta
        jlConta.setText("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        jtfConta.setBounds(315, 10, 60, 20);
        // Adicionando o componente jlConta ao container
        getContentPane().add(jlConta);
        getContentPane().add(jtfConta);

        // configuração componente jSeparator01
        jSeparator01.setBounds(10, 40, 365, 10);
        // Adicionando o componente jSeparator01 ao container
        getContentPane().add(jSeparator01);

        // configuração componente jlNome e jtfNome
        jlNome.setText("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        jtfNome.setBounds(75, 50, 300, 20);
        // Adicionando o componente jlNome e jtfNome ao container
        getContentPane().add(jlNome);
        getContentPane().add(jtfNome);

        // configuração componente jlEndereco e jtfEndereco
        jlEndereco.setText("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        jtfEndereco.setBounds(75, 75, 300, 20);
        // Adicionando o componente jlEndereco e jtfEndereco ao container
        getContentPane().add(jlEndereco);
        getContentPane().add(jtfEndereco);

        // configuração componente jlTelefone e jtfTelefone
        jlTelefone.setText("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        jtfTelefone.setBounds(75, 100, 300, 20);
        // Adicionando o componente jlTelefone e jtfTelefone ao container
        getContentPane().add(jlTelefone);
        getContentPane().add(jtfTelefone);

        // configuração componente jlCPF e jtfCPF
        jlCPF.setText("CPF:");
        jlCPF.setBounds(10, 125, 60, 18);
        jlCPF.setHorizontalAlignment(SwingConstants.RIGHT);
        jtfCPF.setBounds(75, 125, 300, 20);
        // Adicionando o componente jlCPF e jtfCPF ao container
        getContentPane().add(jlCPF);
        getContentPane().add(jtfCPF);

        // configuração componente jrbCorrente
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic(KeyEvent.VK_C);
        jrbCorrente.setText("Conta Corrente");
        jrbCorrente.setSelected(true);
        //Adicionando o componente jrbCorrente ao container
        getContentPane().add(jrbCorrente);

        // configuração componente jrbPoupanca
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P);
        jrbPoupanca.setText("Conta Poupança");
        // Adicionando o componente jrbPoupanca ao container
        getContentPane().add(jrbPoupanca);

        // configuração componente bgContas
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // configuração componente jSeparator02
        jSeparator02.setBounds(10, 180, 365, 10);
        // Adicionando o componente jSeparator02 ao container
        getContentPane().add(jSeparator02);

        // configuração componente jbConsultar
        jbConsultar.setText("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S);
        // Adicionando o componente jbConsultar ao container
        getContentPane().add(jbConsultar);

        // configuração componente jbAtualizar
        jbAtualizar.setText("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A);
        jbAtualizar.setEnabled(false);
        // Adicionando o componente jbAtualizar ao container
        getContentPane().add(jbAtualizar);

        // configuração componente jbFechar
        jbFechar.setText("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F);
        jbFechar.addActionListener(e -> System.exit(0));
        // Adicionando o componente jbFechar ao container
        getContentPane().add(jbFechar);

        // Exibindo a janela
        setVisible(true);
    }
    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if(janela.width>screen.width)
            setSize(screen.width, janela.height);
        if(janela.height>screen.height)
            setSize(janela.width, screen.height);
        setLocation((screen.width - janela.width) / 2,
            (screen.height - janela.height) / 2);
    }
    public static void main(String args[]) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
    
}

