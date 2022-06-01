package Class;

public class NodoS {
    private  Song val;
    private NodoS sig;
    public NodoS(){

    }
    
    public NodoS(Song val) {
        this.val = val;
        this.sig = null;
    }

    public void Mostrar(){
        val.Show();
    }
    public Song getVal() {
        return val;
    }
    public void setVal(Song val) {
        this.val = val;
    }
    public NodoS getSig() {
        return sig;
    }
    public void setSig(NodoS sig) {
        this.sig = sig;
    }
    
}
