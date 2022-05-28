/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author PC
 */
public class FileUser {
    private String FileName;
    public FileUser(String name){
        this.FileName=name;
    }
    public void ReadFile() throws IOException{
        FileInputStream fil=new FileInputStream(FileName);
        DataInputStream read=new DataInputStream(fil);
        ObjectInputStream read2= new ObjectInputStream(fil);
        User u=new User();
        try {
            u.ReadFile(read, read2);
        } catch (Exception e) {
            System.out.println("Final del archivo");
        }
        finally{
            read.close();
            read2.close();
        }
    }
    public void WriteFile(User u) throws IOException{
        FileOutputStream fil=new FileOutputStream(FileName,true );
        DataOutputStream write=new DataOutputStream(fil);
        ObjectOutputStream write2=new ObjectOutputStream(fil);
        try {
            u.WriteFile(write, write2);
        } catch (Exception e) {
            System.out.println("Erro al insertar los datos..");
        }
        finally{
            write.close();
            write2.close();
        }
    }
    public String getFileName() {
        return FileName;
    }
    public void setFileName(String fileName) {
        FileName = fileName;
    }
    
}
