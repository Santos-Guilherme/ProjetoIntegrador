package ado1;

public class Casa extends Imovel{
    private int tamQuintal;
    private double contaAgua;

    public Casa() {
    }

    public int getTamQuintal() {
        return tamQuintal;
    }

    public void setTamQuintal(int tamQuintal) {
        this.tamQuintal = tamQuintal;
    }

    public void setTamQuintal(String tamQuintal) {
        this.tamQuintal = Integer.parseInt(tamQuintal);
    }

    public double getContaAgua() {
        return contaAgua;
    }

    public void setContaAgua(double contaAgua) {
        this.contaAgua = contaAgua;
    }

    @Override
    public void imprimirDadosImovel() {
        super.imprimirDadosImovel();
        System.out.println("Tamanho do Quintal: " + tamQuintal + " metros quadrados");
        System.out.println("Conta de Água: R$" + contaAgua);
    }

    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }
}
