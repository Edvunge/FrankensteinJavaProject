package Estudos.Project;

public class Imovel {
    private String proprietario;
    private String quadra;
    private int lote;
    private double area;
    private double valorIptu;
    private String situacao;
    private double valorVenda;
    private double valorComissaoPaga;

    public Imovel() {
        super();
        situacao = new String("A venda");
        valorComissaoPaga = 0;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorIptu() {
        return valorIptu;
    }

    public void setValorIptu(double valorIptu) {
        this.valorIptu = valorIptu;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorComissaoPaga() {
        return valorComissaoPaga;
    }

    public void setValorComissaoPaga(double valor) {
        if (valor > 10)
            valor = 10; // Limitando a comissao a 10% do valor do imovel
        this.valorComissaoPaga = valorVenda * valor / 100;
    }
}
