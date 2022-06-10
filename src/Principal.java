
import Class.FileSong;
import Class.FileUser;
import Class.LSimpleS;
import Class.NodoS;
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
     /*    FileSong fs=new FileSong("FileS1");
       fs.WriteFile(new Song("Leve de ope",14,"G", "ss"));
        fs.WriteFile(new Song("cc ope",14,"G", "g"));
        fs.WriteFile(new Song("ggg ope",14,"G", "f"));
        fs.WriteFile(new Song("ggg ope",14,"G", "h"));
        FileSong fs2=new FileSong("FileS2");
        fs2.WriteFile(new Song("Name", 4, "Gender", "NameAutor"));*/
        FileUser fu= new FileUser("FileU");
        //fu.WriteFile(new User("Adrian", 14, "M", "FileS1"));
        //fu.WriteFile(new User("Gustavo", 144, "F", "FileS2"));
        fu.Show();

    }
    
}
