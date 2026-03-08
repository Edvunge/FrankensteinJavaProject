package Estudos.Project;

public class Terreno extends Imovel {
    public Terreno() {
        super();
    }

    public void calcularIptu() {
        super.setValorIptu(super.getValorVenda() * 2 /100);
    }
}
