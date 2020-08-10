import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {

    private int count;
    private double total;
    
    public void readfile(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.printf("File not found: %s", filename);
        }

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                String s = scan.nextLine();

                try {
                    double f = Float.parseFloat(s);
                    total += f;
                    count += 1;
                } catch (Exception ignored) {}

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }

    public int getCount() {
        return count;
    }

    public double getTotal() {
        return total;
    }
}
