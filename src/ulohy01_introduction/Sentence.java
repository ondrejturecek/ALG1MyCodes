/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy01_introduction;

/**
 *
 * @author Dagmar Malá
 */
public class Sentence {
    public static void main(String[] args) {
        String name = "Filip";
        int yob = 2010;
        char classId = 'A';
        final int CURENT_YEAR = 2024;
        final int START_OF_SCHOOL = 6;
        
        //processing
        int age = CURENT_YEAR - yob;
        int classNumber = age - START_OF_SCHOOL;
        
        //output
        String sentence = "Dite " + name + " ma " + age + " let" + " a chodi do " + classNumber + "." + classId + ".";
        
        System.out.println(sentence);
    }
}
