package estudos.Project;

import javax.swing.*;

public class Imobiliaria {
    public static void main(String[] args) {
        Imovel imoveis[] = new Imovel[30];
        int opcao, tipo, contImovel = 0;

        do {
            opcao = menu();

            if (opcao == 1) {
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de imovel: \n1- Casa; 2- Terreno"));

                if (tipo == 1) {
                    Casa auxCasa = geraNovaCasa();
                    contImovel = cadastraNovoImovel(imoveis, contImovel, auxCasa);
                }
                else {
                    if (tipo == 2) {
                        Terreno auxTerreno = geraNovoTerreno();
                        contImovel = cadastraNovoImovel(imoveis, contImovel, auxTerreno);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Escolha Errada. Observe os tipos de imoveis válidos!");
                    }
                }
            }

                if (opcao == 2) {
                    alterarSituacaoImovel(imoveis, contImovel);
                }

                if (opcao == 3) {
                    double valorTotalImoveis = gerarValorTotalDosImoveis(imoveis, contImovel);
                    JOptionPane.showMessageDialog(null, "O somatorio do valor de venda dos imoveis e " + valorTotalImoveis);
                }

                if (opcao == 4) {
                    double valorTotalComissoes = gerarValorTotalComissaoImoveis(imoveis, contImovel);
                    JOptionPane.showMessageDialog(null, "O somatorio do valor das comissoes dos imoveis vendidos é " + valorTotalComissoes);
                }

                if (opcao == 5) {
                    JOptionPane.showMessageDialog(null, "Finalizando execucao da aplicacao.");
                }

                if (opcao < 1 || opcao > 5) {
                    JOptionPane.showMessageDialog(null, "Opção Inválida.");
                }
        } while (opcao != 5);
    }

    public static int menu() {
        String msg = new String();
        msg += "1- Cadastrar Imovel \n";
        msg += "2- Alterar situacao de um imóvel \n";
        msg += "3- Somátorio do valor dos imóveis \n";
        msg += "4- Somátorio do valor das comissões \n";
        msg += "5- Finalizar Execucao \n";
        msg += "Digite a opção desejada: ";
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public static Terreno geraNovoTerreno() {
        Terreno novoTerreno = new Terreno();
        novoTerreno.setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário: "));
        novoTerreno.setQuadra(JOptionPane.showInputDialog("Digite a quadra: "));
        novoTerreno.setLote(Integer.parseInt(JOptionPane.showInputDialog("Digite o lote: ")));
        novoTerreno.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite a area: ")));
        novoTerreno.setValorVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda: ")));

        return novoTerreno;
    }

    public static Casa geraNovaCasa() {
        Casa novaCasa = new Casa();
        novaCasa.setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário: "));
        novaCasa.setQuadra(JOptionPane.showInputDialog("Digite a quadra: "));
        novaCasa.setLote(Integer.parseInt(JOptionPane.showInputDialog("Digite o lote: ")));
        novaCasa.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite a área: ")));
        novaCasa.setValorVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda: ")));
        novaCasa.setAreaConstruida(Double.parseDouble(JOptionPane.showInputDialog("Digite a área construida: ")));

        return novaCasa;
    }

    public static int cadastraNovoImovel(Imovel imoveis[], int contImovel, Imovel auxiliar) {
        if (contImovel < imoveis.length) {
            imoveis[contImovel] = auxiliar;
            contImovel++;
        } else {
            JOptionPane.showMessageDialog(null, "Vetor de imoveis já esta totalmente preenchido.");
        }

        return contImovel;
    }


    public static double gerarValorTotalDosImoveis(Imovel imoveis[], int contImovel) {
        double total = 0;
        for (int i = 0; i < contImovel; i++)
            total += imoveis[i].getValorVenda();
        return total;
    }

    public static double gerarValorTotalComissaoImoveis(Imovel imoveis[], int contImovel) {
        double total = 0;
        for (int i = 0; i < contImovel; i++)
            total += imoveis[i].getValorComissaoPaga();
        return total;
    }

    public static void alterarSituacaoImovel(Imovel imoveis[], int contImovel) {
        int indice;
        String novaSituacao = "";
        indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do imovel desejado: "));

        if (indice >= 0 && indice < imoveis.length) {
            novaSituacao = JOptionPane.showInputDialog("A situação atual do imovel é: " + imoveis[indice].getSituacao()+". \n Digite a nova situação (a venda, vendido ou em negociação)");
            while (novaSituacao.equalsIgnoreCase(imoveis[indice].getSituacao())) {
                novaSituacao = JOptionPane.showInputDialog("ERRO! A situação do imóvel é: "+ imoveis[indice].getSituacao()+ ". \n Digite a nova situação (a venda, vendido ou em negociação)");
            }

            if (novaSituacao.equalsIgnoreCase("Vendido")) {
                imoveis[indice].setValorComissaoPaga(Double.parseDouble(JOptionPane.showInputDialog("Digite o % da comissão: ")));
            }

            if (novaSituacao.equalsIgnoreCase("a venda") || novaSituacao.equalsIgnoreCase("em negociação")) {
                imoveis[indice].setValorComissaoPaga(0);
            }

            imoveis[indice].setSituacao(novaSituacao);
        } else
            JOptionPane.showMessageDialog(null, "Indice Invalido!");
    }
}
