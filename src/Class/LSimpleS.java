package Class;

public class LSimpleS {
    private NodoS root;
    public LSimpleS(){
        root=null;
    }
    public void AdicionarP(NodoS nuevo){
        if(this.root == null){
            this.root=nuevo;
        }
        else{
            nuevo.setSig(this.root); 
            this.root=nuevo;
        }
    }
    public void AdicionarP2(NodoS nuevo){
        nuevo.setSig(this.root);
        this.root=nuevo;
    }

    public void AdicionarF(NodoS nuevo){    
        if(this.root==null){
            this.root=nuevo;
        }
        else{
            NodoS aux=this.root;
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
            aux.setSig(nuevo);
        }    
    }
    
    public void Mostrar(){
        NodoS aux=this.root;
        while(aux!=null){
            aux.Mostrar();
            aux=aux.getSig();
        }
    }
    public NodoS getRoot() {
        return root;
    }
    public void setRoot(NodoS root) {
        this.root = root;
    }
}
