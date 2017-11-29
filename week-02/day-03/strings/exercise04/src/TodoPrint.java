public class TodoPrint {
    public static void main(String[] args) {

        String todoText = " - Buy milk\n";

        StringBuilder str = new StringBuilder(todoText);
        str.insert(0, "My todo:\n");
        str.insert(21,  " - Download games\n");
        str.insert(39, "    - Diablo");

        System.out.println(str.toString());

    }
}
