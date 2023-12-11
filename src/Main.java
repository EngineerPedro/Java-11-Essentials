// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var sb = new StringBuilder("Welcome");
        sb.append(" to California!")
                .append("M")
                .append(", Qty: ")
                .append(4);
        var s2 = sb.toString();
        System.out.println(s2);
    }
}