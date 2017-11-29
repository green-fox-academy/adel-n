public class CompareLength {

    public static void main(String[] args) {

        int [] p1 = new int [3];
        p1 [0] = 1;
        p1 [1] = 2;
        p1 [2] = 3;

        int [] p2 = new int [2];
        p2 [0] = 4;
        p2 [1] = 5;


        int len2 = p2.length;

        for (int i = 0; i <= len2; i++) {
        if (p1.length < p2.length) {

                System.out.println(p2[i] + " ");
            }
        }
    }

}
