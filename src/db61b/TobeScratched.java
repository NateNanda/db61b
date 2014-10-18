/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db61b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author WorkingDirectory
 */
public class TobeScratched{
    public static  void main (String[] args) throws java.io.IOException{
        
        LineNumberReader reader;
        reader = new LineNumberReader(new FileReader("/Users/WorkingDirectory/Names.txt"));
        System.out.println(reader.getLineNumber());
        String s = null;
        s=reader.readLine().replace(",", " ").trim();
        
        System.out.println(s);
        
        String [] sArray = s.split("//s* //s*");
        for(int i = 0 ;i<sArray.length; i++) {
            System.out.println(sArray[i]);
            System.out.println(sArray.length);
        }
        
        
        
        if(reader.getLineNumber()==0) {
            //reader.
        }
        String line = null;
        while ((line = reader.readLine()) != null) {
            // ...
        }
        
       
        
    }
}

