/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
        Collection<String> call = Collections.synchronizedList(new ArrayList<String>());

        ArrayList<String> arr1arl = new ArrayList<>();
        Collection<String> arr1cal = new ArrayList<>();

        LinkedList<String> lin1linl = new LinkedList<>();
        Collection<String> lin1lcal = new LinkedList<>();

        // this for for-each 
        //Collection API-ne daxil olmayan class Iterable implement edibse for-each istifade ede biler
        ArrayList<String> list = new ArrayList<>();
        list.add("Salam");
        list.add("Sag ol");

       for(String s: list){// for-each
           System.out.println(s);
       }
        // this is ecvivalent the for above
        //ne qeder ki, s var iterator-un next-ni s-e menimset
//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()) {
//            String s = iter.next();
//            System.out.println(s);
//        }
    }
}
