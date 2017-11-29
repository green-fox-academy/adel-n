import java.util.Arrays;

public class DiagonalMatrix {

    public static void main(String[] args) {

        int [][] multi = new int [4][4];

        for (int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){

                if(i==j) {
                    multi[i][j] = 1;

                } else {
                    multi[i][j] = 0;
                }
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }

    }
}
