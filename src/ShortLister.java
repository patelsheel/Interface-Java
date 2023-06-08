import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class ShortLister {
    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            Scanner s = new Scanner(file);
            ArrayList<Object> filterWords = new ArrayList<>();
            while (s.hasNext()) {
                filterWords.add(s.next());
            }
            s.close();
            filterWords = Main.collectAll(filterWords, new ShortWordFilter());
            System.out.println("Filtered words:");
            for (Object str : filterWords) {
                System.out.println(str);
            }
        }
    }
}