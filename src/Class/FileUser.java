/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


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
     
        User u=new User();
        try {
            u.ReadFile(read);
        } catch (Exception e) {
            System.out.println("Final del archivo");
        }
        finally{
            read.close();
           
        }
    }
    public void Show() throws IOException{
        FileInputStream fil=new FileInputStream(FileName);
        DataInputStream read=new DataInputStream(fil);    
        User u=new User();
        try {
            while(true){   
                u.ReadFile(read);
                u.Show();
            }
        } catch (Exception e) {
            System.out.println("Final del archivo");
        }
        finally{
            read.close();
        }
    }
    public void WriteFile(User u) throws IOException{
        FileOutputStream fil=new FileOutputStream(FileName,true );
        DataOutputStream write=new DataOutputStream(fil);  
        try {
            u.WriteFile(write);
        } catch (Exception e) {
            System.out.println("Erro al insertar los datos..");
        }
        finally{
            write.close();
        }
    }
    public String getFileName() {
        return FileName;
    }
    public void setFileName(String fileName) {
        FileName = fileName;
    }
    
}
