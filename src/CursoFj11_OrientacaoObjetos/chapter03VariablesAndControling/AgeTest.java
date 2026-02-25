package CursoFj11_OrientacaoObjetos.chapter03VariablesAndControling;

public class AgeTest {
    public static void main(String[] args) {
        // declara a idade
        int idade;
        idade = 16;

        // Imprime a idade
        System.out.println("A idade: " + idade);

        // gera uma idade no ano seguinte
        int idadeNoAnoQueVem;
        idadeNoAnoQueVem = idade + 1;

        // imprime a idade
        System.out.println("Idade No Ano Que Vem: " + idadeNoAnoQueVem);
    }
}
