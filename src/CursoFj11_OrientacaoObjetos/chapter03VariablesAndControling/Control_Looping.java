package CursoFj11_OrientacaoObjetos.chapter03VariablesAndControling;

public class Control_Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }
    }
}
