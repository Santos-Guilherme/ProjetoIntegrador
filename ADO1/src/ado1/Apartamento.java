package ado1;

public class Apartamento extends Imovel{
    private double condominio;

    public Apartamento() {
    }

    public double getCondominio() {
        return condominio;
    }

    public void setCondominio(double condominio) {
        this.condominio = condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = Double.parseDouble(condominio);
    }

    @Override
    public void imprimirDadosImovel() {
        super.imprimirDadosImovel();
        System.out.println("Valor do Condomínio: R$" + condominio);
    }

    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }
}

