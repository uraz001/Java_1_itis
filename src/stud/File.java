/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public class File {
    
    
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("src/stud/file.txt");
        Scanner scan = new Scanner(fr);
        String newline = "";
        
        while (scan.hasNextLine()) {
            newline = scan.nextLine();
        }
        fr.close();
        
        FileWriter fw = new FileWriter("new_file.txt");
        fw.write(newline);
        fw.close();
        
        PrintStream ps = new PrintStream("out.txt");
        System.setOut(ps);
        
        System.out.println("string");

        ps.close();
        
    }
}
