public class _6string {
    public static void main(String[] args) {
        String name = "pushpa";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String nontrim = "     pushpa      ";
        System.out.println(nontrim);
        String trim = nontrim.trim();
        System.out.println(trim);
        System.out.println(name.substring(2));
        System.out.println(nontrim.substring(1, 10));
        System.out.println(name.replace('p', 'a'));
        System.out.println(name.replace("pus", "atr"));
    }
}
