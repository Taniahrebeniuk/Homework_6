
public class Word_lenght {
    public static void main(String[] args) {
        String example = "I am the product of all the ancestors getting together and deciding these stories need to be told";

        int length = example.split(" ").length;

        System.out.println("The string is " + length + " words long.");
    }
}

