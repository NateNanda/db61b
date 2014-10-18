/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db61b;

/**
 *
 * @author WorkingDirectory
 */
public class BasiscTests {
    
    public static void main(String[]args) {
        Database db = new Database();
        String [] titles = {"N", "name", "Grade"};
        Table t1 = new Table(titles);
        String [] s1= {"1", "ac", "a+"};
        Row row1  = new Row(s1);
        String [] s2= {"2", "ac", "a+"};
        Row row2  = new Row(s2);
        String [] s3= {"3", "ac", "a+"};
        Row row3  = new Row(s3);
        String [] s4= {"3", "ac", "a+"};
        Row row4  = new Row(s4);
        
        t1.add(row1);
        t1.add(row2);
        t1.add(row3);
        t1.add(row4);
        
        db.put("students", t1);
        db.put("studs", t1);
        
        Table returned = db.get("students");
        Table returned2 = db.get("studs");
        
        //t1.print();
        //returned.print();
        returned2.print();
        
        
    }
    
}
