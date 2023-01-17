/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package comparable_;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
        
        User user = new User();
        user.age = 2;
        
        User user2 = new User();
        user2.age = 1;
        
        System.out.println(user.compareTo(user2));
    }
}
