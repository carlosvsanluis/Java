/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersgamealone;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SIO_9
 */
public class NumbersGameAlone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hesre
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Est ce que tu est une 1= pilot,2 = apprentice du jedi ou = jedi?");
                
        int difficulty = sc.nextInt();
                
        int limit = 0;
         
        if(difficulty==1){
            limit=10;
        }
        if(difficulty==2){
            limit=100;
        }
        if (difficulty==3){
            limit=1000;
        }
        int correctAnswer = rand.nextInt(limit);
        int yourNumberOfTries = 0;
        int yourGuess = 0;
        
        
        while (correctAnswer != yourGuess){
            System.out.println("Devinez le numero de la system ou la Death Star is 1-"+limit);
            yourGuess = input.nextInt();
            yourNumberOfTries++;
            
           
             if (yourGuess<correctAnswer){
                System.out.println("Le numero est trop bas utilisez le Force");
                
            }
            if (yourGuess>correctAnswer){
                System.out.println("Le numero est trop haut, le force est vraiment importante");
            }
            else if (yourGuess == correctAnswer){
    
        
        System.out.println("Tu est vraiment une Jedi");
        System.out.println("Cetait vraiment dans le sytem solar numero "+correctAnswer);
        System.out.println("jusqu apres "+ yourNumberOfTries+ " fois ");   
        }

        
}
                
        
    }
    
}
