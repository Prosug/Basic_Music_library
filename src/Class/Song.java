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
public class Song {
    private String Name;
    private double duration;
    private String Gender;
    private String NameAutor;
    public Song(){
        
    }
    public Song(String Name, double duration, String Gender, String NameAutor) {
        this.Name = Name;
        this.duration = duration;
        this.Gender = Gender;
        this.NameAutor = NameAutor;
    }
    
    public void Show(){
        System.out.println("Name: "+this.Name+"Duration: "+this.duration+"Gender: "+this.Gender);
        System.out.println("NameAutor: "+this.NameAutor);
    }
    public void ReadFile(DataInputStream read) throws IOException{
        Name=read.readUTF();
        duration=read.readDouble();
        Gender=read.readUTF();
        NameAutor=read.readUTF();
    }
    public void WriteFile(DataOutputStream write) throws IOException{
        write.writeUTF(Name);
        write.writeDouble(duration);
        write.writeUTF(Gender);
        write.writeUTF(NameAutor);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getNameAutor() {
        return NameAutor;
    }

    public void setNameAutor(String NameAutor) {
        this.NameAutor = NameAutor;
    }
    
}
