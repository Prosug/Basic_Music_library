
import Class.FileSong;
import Class.Song;
import Class.User;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileSong f=new FileSong("Uno");
        
        f.WriteFile(new Song("A",1,"T","HDDDD"));
        f.WriteFile(new Song("SA",1,"R","NDD"));
        f.WriteFile(new Song("WAAA",1,"T","DM"));
        User u=new User("AAA",14,"VVV",f);
        u.Show();
        
    }
    
}
