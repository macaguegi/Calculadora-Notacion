
package arbolbinario;



public class NodoA {

    private int dato;
    private NodoA izq,der;
    public NodoA(int dato){
        this.dato = dato;
        izq = null;
        der = null;
    }
 
    public int getDato() {
        return dato;
    }
 
    public NodoA getIzq() {
        return izq;
    }
 
    public NodoA getDer() {
        return der;
    }
 
    public void setDato(int dato) {
        this.dato = dato;
    }
 
    public void setIzq(NodoA izq) {
        this.izq = izq;
    }
 
    public void setDer(NodoA der) {
        this.der = der;
    } 
}

