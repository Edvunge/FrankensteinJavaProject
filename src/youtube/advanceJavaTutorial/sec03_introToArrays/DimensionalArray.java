package youtube.advanceJavaTutorial.sec03_introToArrays;

public class DimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}, {4,5,6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
