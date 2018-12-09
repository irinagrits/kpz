public class Main {
    public static void main(String[] args) {
        String str = "фыва. пролджэ. фыва. пролджэ. йцукен: sdgdfgdg. sdfbdfb: гшщзхъ: ячсмить бю.";
        System.out.println("Before: " + str);
        String tmp;
        System.out.println("After: " + (tmp = str.substring(0, str.lastIndexOf(':'))).substring(tmp.lastIndexOf('.') + 1));
    }
}