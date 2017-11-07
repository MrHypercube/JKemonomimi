package jktest;

import com.MrHypercube.Kemonomimi;

public class JKTest {
    public static void main(String[] args) {
        Kemonomimi Test = new Kemonomimi();
        
        
        Test.Name = "Kitsune";
        Test.Type = "Fox";
        Test.Gender = "Female";
        Test.Weight = 200.0f;
        Test.NameBeforeMessage = true;
        
        Test.LogAll();
    } 
}
