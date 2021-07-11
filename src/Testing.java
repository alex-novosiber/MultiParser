import java.io.IOException;

public class Testing {


    static String[][] arrayMatrix = new String[5][5];
    static String ff = "0";

    public static void main(String[] args) throws IOException {

        printMatrix();

        System.out.println(" fillMatrix +++++++++++++++");
        fillMatrix();

        System.out.println(" printMatrix +++++++++++++++");

        printMatrix();


    }

    static void printMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (null == arrayMatrix[i][j]) arrayMatrix[i][j] = "NuLl";
                System.out.print("[" + arrayMatrix[i][j] + "]");
            }
            System.out.println();
        }
    }


    static void fillMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayMatrix[i][j] = "8";
                System.out.print("[" + arrayMatrix[i][j] + "]");
            }
            System.out.println();
        }
    }


}