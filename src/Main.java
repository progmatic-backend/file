import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("inport.txt");
        List<String> lines = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                lines.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("nem található a fályl");
        }
    }


}
