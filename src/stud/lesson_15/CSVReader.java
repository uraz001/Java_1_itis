/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public class CSVReader {

    private FileType type;
    private File file;
    
    public CSVReader(FileType type) {
        switch (type) {
            case USERS:
                file = new File("src/stud/lesson_15/Users.csv");
                break;
        }
    }
    
    public String getPasswordByLogin(String login) throws FileNotFoundException{
        Scanner scan = new Scanner(file);
        scan.nextLine();
        while (scan.hasNextLine()) {
            String[] line = scan.nextLine().split(";");
            if (line[1].equals(login)) return line[2];
        }
        return null;
    }
}

enum FileType {
    USERS
}
