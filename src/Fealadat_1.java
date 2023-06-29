import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fealadat_1 {
    public static void main(String[] args) {
        System.out.println(FileInputHandler_1.getLinesOfTextFileWithScanner("peldaStrings.txt"));
    }
}

// Írj egy osztályt mely tartalmaz egy fájlból olvasó statitikus metódust ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod peldaString.txt re és irasd ki az eredményt

class FileInputHandler_1 {

    public static List<String> getLinesOfTextFileWithScanner(String filePath) {
        List<String> stringList = new ArrayList<>();

        File file = new File(filePath);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                stringList.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("nem jós path");
        }
        return stringList;
    }
}