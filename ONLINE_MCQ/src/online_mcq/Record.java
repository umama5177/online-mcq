/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

/**
 *
 * @author lenovo
 */
public class Record {
    public static String name;
  public static int marks;
  public static int isSubmitted=0;
  public static int isBack;
  public static String[] question=new String[60];
 public static String filename;
  public static String[] answerCheck=new String[10];
  public static char[] inputAnswer=new char[10];
 public static char check[]=new char[10];
 
        Record(){}
     Record(String name, String filename,int marks ) {
        Record.name = name;
        Record.marks = marks;
        Record.filename = filename;
    }

    public void setName(String name) {
        Record.name = name;
    }

    public void setMarks(int marks) {
        Record.marks = marks;
    }

    public void setFilename(String filename) {
        Record.filename = filename;
    }

    String getName() {
        return name;
    }

     int getMarks() {
        return marks;
    }

     String getfilename() {
        return filename;
    }

    void setfilename(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
