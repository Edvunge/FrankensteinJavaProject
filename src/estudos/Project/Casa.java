package estudos.Project;

public class Casa extends Imovel {
    private double areaConstruida;

    public Casa() {
        super();
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public void calcularIptu() {
        super.setValorIptu(super.getValorVenda() *1 / 100);
    }
}
