/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodandarrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morri
 */
public class MethodAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   public static void main(String[] args)  {
        String[] Name = new String[80];
            int []scores = new int[80];
       
       
    }
    private static void ReadingNamesAndScores(String[]Name, int []scores, String filename){
         try {
           
            File score = new File("playerData2.txt");
            
            Scanner FileIn = new Scanner(score);
                    
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(MethodAndArrays.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File could not be found.");
        }
    }
    }

