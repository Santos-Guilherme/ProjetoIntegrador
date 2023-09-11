package ado1;

public class Imovel {
    private String end;
    private String cidade;

    public Imovel(){
    }
    public Imovel(String end){
    }

    public String getCidade() {
        return cidade;
    }

    public void setEndereco(String endereco) {
        this.end = endereco;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void imprimirDadosImovel() {
        System.out.println("Endereço: " + end);
        System.out.println("Cidade: " + cidade);
    }
    @Override
    public String toString() {
        return "Imovel{" + "Endereço ='" + end + '\'' + ", Cidade ='" + cidade + '\'' + '}';
    }
}


