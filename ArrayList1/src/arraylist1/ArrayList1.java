/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;

public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<String> nameList = new ArrayList<String>(); // holds the nameList object
        nameList.add("James");
        nameList.add("Bob");
        nameList.add("Bill");
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in nameList.");
        
        for(int index = 0; index < nameList.size(); index++){  //ArrayList 
            System.out.println(nameList.get(index));
        }
    }
    
}
