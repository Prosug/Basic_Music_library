
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
        LSimpleS f=new LSimpleS();
        
        f.AdicionarF(new NodoS(new Song("A",1,"T","HDDDD")));
     
        f.AdicionarF(new NodoS(new Song("SA",1,"R","NDD")));
        f.AdicionarF(new NodoS(new Song("WAAA",1,"T","DM")));
        User u=new User("AAA",14,"VVV",f);

        LSimpleS f2=new LSimpleS();
        
        f2.AdicionarF(new NodoS(new Song("A",1,"T","HDDDD")));
        f2.AdicionarF(new NodoS(new Song("SA",1,"R","NDD")));
        f2.AdicionarF(new NodoS(new Song("WAAA",1,"T","DM")));

        User u2=new User("ADRAINA", 4, "Gender", f2);

        FileUser user=new FileUser("Nuevo3");
        user.WriteFile(u);
        user.WriteFile(u2);
        user.Show();

    }
    
}
