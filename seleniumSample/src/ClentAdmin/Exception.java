package ClentAdmin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {

        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        }
    }
