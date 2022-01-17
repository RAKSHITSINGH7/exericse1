
package studentarray;

import java.util.HashSet;
import java.util.Scanner;

/**
 * This class +++ Insert class description here +
 * 
 * @author Rakshit Singh
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student Name: ");
        s1.setName(input.nextLine());
        
        System.out.println("name: "+s1.getName());
        
        
        Student[] studList = new Student[5];
    }

}
