/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 * Midterm - Feb 21
 * @author julieando
 */

import java.util.Scanner; 
public class TestUserprofile {
    public static void main(String[] args) {
        UserProfile newProfile = new UserProfile(); 
        Scanner input = new Scanner(System.in);
        //enter username 
        System.out.println("Enter Username: ");
        String name = input.nextLine();
        newProfile.setUserID(name);
        
        //show genre list
        
        System.out.println("List Genres: " + newProfile.getGenre());
        
        //pick genre
        System.out.println("Pick a genre: ");
        String pickGenre = input.nextLine(); 
        newProfile.setGenre("");
        
        System.out.println("Your profile has not been created"); 
        
        
          
        
    }
    
}
