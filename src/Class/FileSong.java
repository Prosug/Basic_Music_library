/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class FileSong {
    private String NameFile;
    public FileSong(String name){
        this.NameFile=name;
    }
    public void ShowName(){
        System.out.println("Name: "+this.NameFile);
    }
    public void Check(){
        Scanner enter=new Scanner(System.in);
        File fil=new File(NameFile);
        if(fil.exists()){
            System.out.println("The File Exist.. do you want Delete? y/n");
            if(enter.nextLine().charAt(0)=='y'){
                fil.delete();
            }
        }else{
            System.out.println("The File does not Exist");
        }
    }
    public void ReadFile() throws FileNotFoundException, IOException{
        FileInputStream fil=new FileInputStream(NameFile);
        DataInputStream read=new DataInputStream(fil);
        Song s=new Song();
        try{
            s.ReadFile(read);
        }catch(IOException e){
            System.out.println("Exception: "+e);
        }finally{
            read.close();   
        }
    }
    public void ReadFile2() throws FileNotFoundException, IOException{
        FileInputStream fil=new FileInputStream(NameFile);
        DataInputStream read=new DataInputStream(fil);
        Song s=new Song();
        try{
            while(true){
                s.ReadFile(read);
                s.Show();
            }
        }catch(IOException e){
            System.out.println("Fin");
        }finally{
            read.close();   
        }
    }
    public void WriteFile(Song s) throws FileNotFoundException, IOException{
        FileOutputStream fil=new FileOutputStream(NameFile,true);
        DataOutputStream write=new DataOutputStream(fil);
        try{
            s.WriteFile(write);
        }catch(IOException e){
            System.out.println("Exception: "+e);
        }finally{
            write.close();
        }
    }

    public String getNameFile() {
        return NameFile;
    }

    public void setNameFile(String NameFile) {
        this.NameFile = NameFile;
    }
    
}
