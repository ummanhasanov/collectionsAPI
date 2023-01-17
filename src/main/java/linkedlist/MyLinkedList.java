/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Umman Hasan
 */
public class MyLinkedList
{

    private Node lastElement;

    class Node
    {

        private Node nextElement;
        private Object obj;

        public Node(Object obj, Node node) {
            this.obj = obj;
            this.nextElement = node;
        }

        public void setNextElement(Node node) {
            this.nextElement = node;
        }
    }

    public void add(Object obj) {
        this.lastElement = new Node(obj, new Node(null, null)); 
    }
}
