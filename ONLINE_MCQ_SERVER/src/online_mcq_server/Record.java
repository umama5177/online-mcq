/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq_server;

/**
 *
 * @author lenovo
 */
public class Record {
    public String name;
    public int marks;
    public String subject;

    public Record(String name, int marks, String subject) {
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }
    
}
