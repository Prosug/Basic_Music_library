/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


/**
 *
 * @author PC
 */
public class User {
    private String name;
    private int Age;
    private String Gender;
    private String FileNameS;

   
    public User(){
       
    }

    public User(String name, int Age, String Gender,String FileNameS) {
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
        this.FileNameS=FileNameS; 
    }
            
    public void Show() throws IOException{
        System.out.println("Name: "+this.name+" Age: "+this.Age+"Gender: "+this.Gender);
        FileSong s=new FileSong(FileNameS);
        s.ReadFile2();
    }
    public void ReadFile(DataInputStream read) throws IOException, ClassNotFoundException{
        name=read.readUTF();
        Age=read.readInt();
        Gender=read.readUTF();
        FileNameS=read.readUTF();
    }
    public void WriteFile(DataOutputStream write) throws IOException{
        write.writeUTF(name);
        write.writeInt(Age);
        write.writeUTF(Gender);
        write.writeUTF(FileNameS);
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

    public String getFileNameS() {
        return FileNameS;
    }

    public void setFileNameS(String fileNameS) {
        FileNameS = fileNameS;
    }
}
