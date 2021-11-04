
public class Ejercicio7 {
    public static void main(String args[]) {
        String S1 = new String("minúsculas convertidas en mayúsculas");

        System.out.println(toUpperCase(S1));
    }

    static String toUpperCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ('a' <= c && c <= 'z') {
                chars[i] = (char) (c - 'a' + 'A');
            }
        }

        return new String(chars);
    }
}