public class Reverse {

    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        StringBuilder normal = new StringBuilder();

        // append a string into StringBuilder normal
        normal.append(reversed);

        // reverse StringBuilder normal
        normal = normal.reverse();

        // print reversed String
        for (int i = 0; i<reversed.length(); i++) {
            System.out.print(normal.charAt(i));
        }
    }
}
