/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package vektor;

import java.util.Vector;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
        // thread safety , synchronized, vector used ArrayList<>
        Vector<String> l = new Vector<>(1000);
        l.add("Eldar");
        l.add("Azay");
        l.add("Nergiz");
        l.add("Tural");
        l.add("Rauf");
        l.add("Umman");
        l.add("Javid");
        l.add("Rashid");
        
        
        // we add all elements to l and we use for loop and get all elements l with l.size() and l.get() to print
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
