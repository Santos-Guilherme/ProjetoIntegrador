package ado1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class CadastroImoveis {
    private List<Casa> casas;
    private List<Apartamento> apartamentos;

    public CadastroImoveis() {
        casas = new ArrayList<>();
        apartamentos = new ArrayList<>();
    }


    public void cadastrarCasa() {
        Casa casa = new Casa();
        casa.setEndereco(JOptionPane.showInputDialog("Digite o endereço da casa:"));
        casa.setCidade(JOptionPane.showInputDialog("Digite a cidade da casa:"));
        int tamanhoQuintal = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do quintal (metros quadrados):"));
        casa.setTamQuintal(tamanhoQuintal);
        double contaAgua = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta de água:"));
        casa.setContaAgua(contaAgua);
        casas.add(casa);
    }

    public void cadastrarApartamento() {
        Apartamento apartamento = new Apartamento();
        apartamento.setEndereco(JOptionPane.showInputDialog("Digite o endereço do apartamento:"));
        apartamento.setCidade(JOptionPane.showInputDialog("Digite a cidade do apartamento:"));
        double condominio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do condomínio:"));
        apartamento.setCondominio(condominio);
        apartamentos.add(apartamento);
    }

    public void mostrarImoveis() {
        System.out.println("Casas:");
        System.out.println("---------------------------\n");

        for (Casa casa : casas) {
            casa.imprimirDadosImovel();
            System.out.println("---------------------------\n");

        }
        System.out.println("Apartamentos:");
        System.out.println("---------------------------\n");
        for (Apartamento apartamento : apartamentos) {
            apartamento.imprimirDadosImovel();
            System.out.println("---------------------------\n");

        }
    }

    public static void main(String[] args) {
        CadastroImoveis cadastro = new CadastroImoveis();

        while (true) {
            String[] opcoes = {"Cadastrar Casa", "Cadastrar Apartamento", "Listar Imóveis", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Cadastro de Imóveis",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            switch (escolha) {
                case 0:
                    cadastro.cadastrarCasa();
                    break;
                case 1:
                    cadastro.cadastrarApartamento();
                    break;
                case 2:
                    cadastro.mostrarImoveis();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
