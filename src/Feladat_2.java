import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feladat_2 {
    public static void main(String[] args) {
        List<String> lines = FileInputHandler_2.getLinesOfTextFileWithScanner("src/szamok.txt");
        int sum = 0;
        for (var actual : lines){
            for (var actualNumber : actual.split(" ")){
                sum += Integer.parseInt(actualNumber);
            }
        }
    }
}

// Írj egy osztályt mely tartalmaz egy fájlból olvasó satitikus metódust ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod szamok.txt re és irasd ki az eredményt
// az eredményed számokat tartalmaz szóközökkel elválasztva írasd ki a számok összegét

class FileInputHandler_2 {

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