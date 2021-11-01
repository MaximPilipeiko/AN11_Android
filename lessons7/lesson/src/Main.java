import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        final String s = new String("adasd");
        char[] arrC = {'a', 'b', 'c'};
        final String s1 = new String(arrC);
        byte[] arrB = {123, 2, 3};
        final String s2 = new String(arrB);
        String s3 = "Mama mila";

//        String s4 = new String("mama");
//        String s5 = new String("mama");
//        System.out.println(s4.equals(s5));
//        String s6 = "mama";
//        String s7 = "mama";
//        System.out.println(s4 == s7);

        final Person vova = new Person(1, "Vova");
//        System.out.println(vova.getName());
//        vova.updateName("Artem");
//        System.out.println(vova.getName());

//        String s8 = new String("mama");
//        String s9 = new String("papa");
//        final String s10 = s8 + s9 + " " + 1 + " " + vova;
//        final String s11 = s8.concat(s9)
//                .concat(" ")
//                .concat(String.valueOf(1))
//                .concat(" ")
//                .concat(String.valueOf(vova));
//        System.out.println(s8);
//        System.out.println(s9);
//        System.out.println(s10);
//        System.out.println(s11);

        final String s5 = String.join(" ", "Mama", "Mila", "Ramu");
        System.out.println(s5);
//        System.out.println(s5.length());

//        System.out.println(s5.charAt(s5.length()));
//        final char[] chars = new char[10];
//        s5.getChars(0 ,4, chars, 3);
//        System.out.println(chars);

//        final String s6 = s5.substring(5, 9);
//        System.out.println(s6);
//        final int milaIndex = s5.indexOf(' ');
//        final int milaLastIndex = s5.lastIndexOf(' ');
//        System.out.println(milaIndex);
//        System.out.println(milaLastIndex);
//        System.out.println(s5.substring(milaIndex + 1, milaLastIndex));

//        final String s6 = s5.replace(' ', '_');
//        final String s7 = s5.replace("a ", "r-");
//        System.out.println(s6);
//        System.out.println(s7);
//        final boolean isStart = s5.startsWith("Mama", 0);
//        final boolean isStart = "file.txt".endsWith(".exe");
//        final String s6 = "  \t  \t ";
//        final String s5Trim = s6.trim();
//        final boolean isEmpty = s6.isBlank();
//        System.out.println(s5Trim);
//        System.out.println(isEmpty);
        final String s6 = s5.toLowerCase();
        final String s7 = s5.toUpperCase();

        System.out.println(s6);
        System.out.println(s7);
        final boolean equals = s6.equals(s7);
        final boolean equalsIgnoreCase = s6.equalsIgnoreCase(s7);
        System.out.println(equals);
        System.out.println(equalsIgnoreCase);

//        final int compareTo = s6.compareTo(s7);
//        System.out.println(compareTo);
//        System.out.println((int) s6.charAt(0));
//        System.out.println((int) s7.charAt(0));
//        String[] names = { "Vova", "Artem", "Olya" };
//        for (final String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("-----------");
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(final String str1, final String str2) {
//                return str1.compareTo(str2);
//            }
//        });
//
//        for (final String name : names) {
//            System.out.println(name);
//        }


//        final String[] s6 = s5.split("  ");
//        for (final String s7 : s6) {
//            System.out.println(s7);
//        }
//        System.out.println(s6.length);


        final String s4 = "Vova" + " " + "Artem" + " " + "Olya";

        final StringBuilder str = new StringBuilder();
        System.out.println(str.length());
        System.out.println(str.capacity());
        str.append("dsfsdf");
        str.append(1);
        str.append(new Person(2, "John"));
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

    }
}
