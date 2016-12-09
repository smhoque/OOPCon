package inheritance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by riponctg on 12/7/2016.
 */
public class Accounting extends HumanResource {
    public void accountCleark() {
        System.out.println("Accounting cleark name: Xchuan");
    }

    public void reader() {
        BufferedReader br = null;
        FileReader fr = null;

        String path = "C:/Users/riponctg/account.txt";

        try {
            fr = new FileReader(path);

        } catch (FileNotFoundException ex) {
            System.out.print("Please fix the path");

        }
        br = new BufferedReader(fr);
        String text = "";
        try {
            while ((text = br.readLine()) != null) {
                System.out.println("Employee Benifit: " + text);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null) {
                    br = null;
                }
                if (fr != null) {
                    fr = null;
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
