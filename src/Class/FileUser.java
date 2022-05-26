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

/**
 *
 * @author PC
 */
public class FileUser {
    private String FileName;
    public FileUser(String name){
        this.FileName=name;
    }
    public void ReadFile() throws FileNotFoundException{
        FileInputStream fil=new FileInputStream(FileName);
        DataInputStream read=new DataInputStream(fil);
    }
    public void WriteFile() throws FileNotFoundException{
        FileOutputStream fil=new FileOutputStream(FileName,true );
        DataOutputStream write=new DataOutputStream(fil);
    }
}
