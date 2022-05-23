/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schooldatastorage;

/**
 *
 * @author adits
 */
public class Student {
    int subj1, subj2, subj3, subj4, subj5;
    //StorageClass acts as a book
    Student(int a, int b, int c, int d, int e){
        subj1 = a;
        subj2 = b;
        subj3 = c;
        subj4 = d;
        subj5 = e;
        
    }
    public String toString(){
        return "Average:  "+ ((subj1+subj2+subj3+subj4+subj5)/5);
    }
 
}
