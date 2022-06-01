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
    private LSimpleS ls;
   
    public User(){
       
    }

    public User(String name, int Age, String Gender, LSimpleS ls) {
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
        this.ls = ls;
    }
            
    public void Show() throws IOException{
        System.out.println("Name: "+this.name+" Age: "+this.Age+"Gender: "+this.Gender);
        ls.Mostrar();
        
    }
    public void ReadFile(DataInputStream read,ObjectInputStream read2) throws IOException, ClassNotFoundException{
        name=read.readUTF();
        Age=read.readInt();
        Gender=read.readUTF();
    
        Song s=new Song();
        s.ReadFile(read);
        ls.AdicionarF(new NodoS(s));
     /*
        for(int i=0;i<2;i++){
            Song s=new Song();
            s.ReadFile(read);
            ls.AdicionarF(new NodoS(s));
        }*/

    }
    public void WriteFile(DataOutputStream write,ObjectOutputStream write2) throws IOException{
        write.writeUTF(name);
        write.writeInt(Age);
        write.writeUTF(Gender);
        NodoS aux=ls.getRoot();
        while(aux!=null){
            aux.getVal().WriteFile(write);
            aux=aux.getSig();
        }
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

    public LSimpleS getLs() {
        return ls;
    }

    public void setLs(LSimpleS ls) {
        this.ls = ls;
    }
    
}
