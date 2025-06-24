import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String text = "Hello! This is random text!";
        System.out.println(text.length());
        System.out.println(Arrays.toString(text.split(" ")));
        int count = text.split( " ").length;
        System.out.println(count);
        System.out.println(text.substring(5));
        String mirrorString = new StringBuilder(text).reverse().toString();
        System.out.println(mirrorString);
        String template = "Hello %s! This is your friend %s! Call me back";
        System.out.println(String.format(template, "Thomas", "Anna"));

    }
}
