import java.util.Scanner;

public class Main {

    public static final String CORRECT_CHARS = "АӘБВГДЕЁЖЗИЙКҚЛМНҢОӨПРСТУҮФХЦЧШЩЪЫІЬЭЮЯаәбвгдеёжзийкқлмнңоөпрстуүфхцчшщъыіьэюя- ";

    public static void main(String[] args) {
        System.out.println("Аты жөніңізді теріңіз: ");
        String fio = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;

        for (int i = 0; i < fio.length(); i++) {
            if (!CORRECT_CHARS.contains(String.valueOf(fio.charAt(i)))) {
                System.out.println("Қате тердіңіз");
                isValid = false;
                break;
            }
            if (fio.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        if (isValid && spaceCount == 2) {
            System.out.println("Тегі: " + fio.substring(0, fio.indexOf(" ")).trim());
            System.out.println("Аты: " + fio.substring(fio.indexOf(" "), fio.lastIndexOf(" ")).trim());
            System.out.println("Әкесінің аты: " + fio.substring(fio.lastIndexOf(" ")).trim());;
        } else {
            System.out.println("Қате тердіңіз");
        }
    }
}