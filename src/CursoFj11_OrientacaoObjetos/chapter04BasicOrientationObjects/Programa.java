package CursoFj11_OrientacaoObjetos.chapter04BasicOrientationObjects;

public class Programa {
    public static void main(String[] args) {
        // Criando a Conta
        Conta minhaConta;
        minhaConta = new Conta();

        // Alterando os valores de minhaConta
        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000.00;

        // saca 200 reais
        minhaConta.saca(200);

        // deposita 500 reais
        minhaConta.deposita(500);
        System.out.println("Saldo Atual: " + minhaConta.saldo);
    }
}
