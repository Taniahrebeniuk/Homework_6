
public class Letter_removal {
    public static void main(String[] args) {
        String str = "Abracadabra";
        System.out.println(charRemoveAt(str, 0));
    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}


