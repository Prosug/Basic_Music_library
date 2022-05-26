/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author PC
 */
public class User {
    private String name;
    private int Age;
    private String Gender;
    private FileSong ls;
    public User(){
        
    }

    public User(String name, int Age, String Gender, FileSong ls) {
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
        this.ls = ls;
    }
            
    public void Show() throws IOException{
        System.out.println("Name: "+this.name+" Age: "+this.Age+"Gender: "+this.Gender);
        ls.ReadFile2();
    }
    public void ReadFile(DataInputStream read,ObjectInputStream read2) throws IOException, ClassNotFoundException{
        name=read.readUTF();
        Age=read.readInt();
        Gender=read.readUTF();
        ls=(FileSong)read2.readObject();   
    }
    public void WriteFile(DataOutputStream write,ObjectOutputStream write2) throws IOException{
        write.writeUTF(name);
        write.writeInt(Age);
        write.writeUTF(Gender);
        write2.writeObject(ls);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public FileSong getLs() {
        return ls;
    }

    public void setLs(FileSong ls) {
        this.ls = ls;
    }
    
}
