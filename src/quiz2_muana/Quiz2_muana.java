/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2_muana;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
class store{
    Node head;
    
    public store () {
        
        head = null;
    }
    
    public void Start (int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            
        }else {
            Node node = head;
            while (node.next != null){
            node = node.next;
            }
            node.next = newNode;
        }
        
    }
    public void End (int data) {
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            
        }else {
            Node node = head;
            head = newNode;
        }
        
    }
    public void display () {
        Node current = head;
        while (current != null){
            System.out.println(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }
    public boolean search (int data){
        
        Node current = head;
        while (current != null){
            if (current.data == data){
                
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
}



public class Quiz2_muana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        store sheet = new store();
       Scanner scn = new Scanner(System.in);
       while(true){
        System.out.println("click 1 for choice 1");
        System.out.println("click 2 for choice 2");
        System.out.println("click 3 for choice 3");
        System.out.println("click 4 for choice 4");
        
        if(scn.hasNextInt()){
            
       int input = scn.nextInt();
       
        switch (input) {
            case 1:
                System.out.println("pick a number you want to add on");
                int toadd = scn.nextInt();
                sheet.Start(toadd);
                break;
            case 2:
                System.out.println("pick a number yout want to insert at end");
                int toend = scn.nextInt();
                sheet.End(toend);
                break;
            case 3:
                System.out.println("display all numbers you add");
               sheet.display();
                break;
            case 4:
                System.out.println("search the the number you add");
                int position = scn.nextInt();
                        sheet.search(position);
                        System.out.println("the number is on the list");
               
                

        }
        }else{
            System.out.println("Wrong input");
            scn.nextLine();
        }
       
       }
        }
    }