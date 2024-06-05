public class _6prac1 {
    public static void main(String[] args) {
        String str = "Pushpa   rajput   ";
        System.out.println(str.replace(" ", "_"));

        // Q2

        String letter = "Dear <|name|>, Thanks alot";
        System.out.println(letter.replace("<|name|>", "Pushpa Rajput"));

        // Q5
        String frnd = "Hello  my dear friends   ";
        System.out.println(frnd.indexOf("  "));
        System.out.println(frnd.indexOf("   "));
    }

}
