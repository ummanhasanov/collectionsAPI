/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

/**
 *
 * @author Umman Hasan
 */
public class User implements Comparable<User>
{

    public int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int result = 0;
        //icinde oldugumuz object ile (User o)-ya gonderilenn obyekt muqayise edilir
        if (o.age == this.age) {
            result = 0;
        } else if (o.age > this.age) {
            result = 1;
        } else if (o.age < this.age) {
            result = -1;
        }
        return result;
    }

}
