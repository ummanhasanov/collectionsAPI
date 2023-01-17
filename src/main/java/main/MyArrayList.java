/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Umman Hasan
 */
public class MyArrayList
{   
    // we create new arr array with 10 elements capacity
    private String[] arr = new String[10];
    //this is added elements in arr
    int addedElementLength = 0;

    // method for add elements to arr
    public void add(String element) {
        //if arr length == added element length the arr array is capacity full
        if (arr.length == addedElementLength) { // dolub
            // we create new arr2 array and give it new length
            String[] arr2 = new String[arr.length / 2 + arr.length];
            for (int i = 0; i < arr.length; i++) {
                // old arr is 111 referance elements we extract to new arr2 is 112 referance
                arr2[i] = arr[i];
            }
            // 111 => 112
            arr = arr2;
        }
        //added element length increment and = element
        arr[addedElementLength++] = element;
    }

    //we get elements of arr 
    public String get(int i) {
        return arr[i];
    }
    
    // we get size of added elements
    public int size(){
        return addedElementLength;
    }
}
