/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmanagement;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Hp
 */
public class Hospitalmanagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File myObj = new File("pres.csv");
        if (myObj.createNewFile()) {
            System.out.println("pres File created: " + myObj.getName());
        } else {
            System.out.println("pres file already exist");
        }
        File myObj1 = new File("app.csv");
        if (myObj1.createNewFile()) {
            System.out.println("pres File created: " + myObj1.getName());
        } else {
            System.out.println("app file already exist");
        }
        
        File myObj2 = new File("slots.csv");
        if (myObj1.createNewFile()) {
            System.out.println("pres File created: " + myObj2.getName());
        } else {
            System.out.println("slots file already exist");
        }
        new home().setVisible(true);
//        new add_pat().setVisible(true);
    }

}
