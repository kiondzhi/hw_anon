//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Printable print1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Привет");
            }
        };
        Printable print2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Пока");
            }
        };
        System.out.println(concatTwoStrings("Hello", "World", (str1, str2) -> str1.concat(str2)));
        print1.print();
        print2.print();
    }

    public static String concatTwoStrings(String str1, String str2, Concatable<String, String> concatable) {
    return concatable.concat(str1, str2);
    }

}

@FunctionalInterface
interface Concatable<T, V> {
    String concat (T t, V v);
}