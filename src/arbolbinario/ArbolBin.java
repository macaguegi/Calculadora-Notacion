
package arbolbinario;

import java.awt.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ArbolBin {

    private NodoA raiz;
    private int num_nodos;
    private int alt;
 
    public ArbolBin() {
        raiz = null;
        num_nodos = 0;
        alt = 0;
    }
 
    public void insertar(int dato){
       if(existe(dato)){
           JOptionPane.showMessageDialog(null,"Ya se encuentra el nodo agregado");
       return;
        
       } 
       NodoA nuevo = new NodoA(dato);
          if (raiz == null)
              raiz = nuevo;
          else
          {
              NodoA anterior = null;
              NodoA tmp = raiz;
              while (tmp != null)
              {
                 
                  anterior = tmp;
                  if (dato < tmp.getDato())
                      tmp = tmp.getIzq();
                  else
                      tmp = tmp.getDer();
              }
              if (dato < anterior.getDato())
                  anterior.setIzq(nuevo);
              else
                  anterior.setDer(nuevo);
          }
          num_nodos++;
    }
 
    public NodoA getRaiz() {
        return raiz;
    }
 
    public void setRaiz(NodoA raiz) {
        this.raiz = raiz;
    }
 
    public int getNumNodos() {
        return num_nodos;
    }
 
   public void preorden(NodoA aux,LinkedList recorrido){
          if (aux != null)
          {
              recorrido.add(aux.getDato());
              preorden (aux.getIzq(),recorrido);
              preorden (aux.getDer(),recorrido);
          }
    }
   public void inorden(NodoA aux,LinkedList recorrido){
          if (aux != null)
          {
              inorden (aux.getIzq(),recorrido);
              recorrido.add(aux.getDato());
              inorden (aux.getDer(),recorrido);
          }
    }
     public void postorden(NodoA aux,LinkedList recorrido){
          if (aux != null)
          {
              postorden (aux.getIzq(),recorrido);
              postorden (aux.getDer(),recorrido);
              recorrido.add(aux.getDato());
          }
    }
    public void porNivel(NodoA aux,LinkedList recorrido){
        LinkedList<NodoA> cola = new LinkedList<NodoA>();
        cola.addLast(aux);
        int nivelPadre =0;
        int nivelPadre1 =0;
        int nivelHijo =0;
        boolean validar=true;
        recorrido.add(raiz.getDato());
        while(cola.size()> 0){
            NodoA tmp = cola.pollFirst();
                      
           
           
            if(tmp.getIzq()!=null){
                
                
                recorrido.add( tmp.getIzq().getDato());
                cola.addLast(tmp.getIzq());
                
            }
            if(tmp.getDer()!=null){
                
                recorrido.add(tmp.getDer().getDato());
//recorrido.add("nivel"+nivelHijo);
              cola.addLast(tmp.getDer());
            }
                 
            
        }
    }
 
    public boolean existe(int dato) {
        NodoA aux = raiz;
        while (aux!=null) {
            if (dato==aux.getDato())
                return true;
            else
                if (dato>aux.getDato())
                    aux=aux.getDer();
                else
                    aux=aux.getIzq();
        }
        return false;
    }
 
 
    private void altura (NodoA aux,int nivel)  {
        if (aux != null) {    
            altura(aux.getIzq(),nivel+1);
            alt = nivel;
            altura(aux.getDer(),nivel+1);
        }
    }
   
 public int getAltura(){
        altura(raiz,1);
        return alt;
    }
 
    public boolean eliminar(int d){
        NodoA auxiliar = raiz;
        NodoA padre = raiz;
        boolean esHijoIzq=true;
        while (auxiliar.getDato() != d){
            padre = auxiliar;
            if(d < auxiliar.getDato()){
                esHijoIzq = true;
                auxiliar = auxiliar.getIzq();
            }else{
                esHijoIzq = false;
                auxiliar = auxiliar.getDer();
            }
            if(auxiliar == null){
                return false;
            }
        }
        if(auxiliar .getIzq() == null && auxiliar.getDer() == null){
            if(auxiliar == raiz){
                raiz = null;
            }else if(esHijoIzq){
               padre.setIzq(null);
            }else{
                padre.setDer(null);
            }
        }else if(auxiliar.getDer() == null){
            if(auxiliar == raiz){
                raiz = auxiliar.getIzq();
            }else if(esHijoIzq){
               padre.setIzq(auxiliar.getIzq());
            }else{
                padre.setDer(auxiliar.getIzq());
            }
        }   else if(auxiliar.getIzq() == null){
            if(auxiliar == raiz){
                raiz = auxiliar.getDer();
            }else if(esHijoIzq){
               padre.setIzq(auxiliar.getDer());
            }else{
                padre.setDer(auxiliar.getDer());
            }
        }else{
            NodoA reemplazo = obtenerNodoReemplazo(auxiliar);
            if(auxiliar == raiz){
                raiz = reemplazo;
            }else if(esHijoIzq){
                padre .setIzq(reemplazo);
            }else {
                padre.setDer(reemplazo);
            }
            reemplazo.setIzq( auxiliar.getIzq());
        }
        return true;
    }
    public NodoA obtenerNodoReemplazo(NodoA nodoReemp){
        NodoA reemplazarPadre = nodoReemp;
        NodoA reemplazo= nodoReemp;
        NodoA auxiliar = nodoReemp.getDer();
        while(auxiliar != null){
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.getIzq();
        }
        if(reemplazo != nodoReemp.getDer()){
            reemplazarPadre.setIzq(reemplazo.getDer());
            reemplazo.setDer(nodoReemp.getDer());
        }
        
        return reemplazo;
    }
}
