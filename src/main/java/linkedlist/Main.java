/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();
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
