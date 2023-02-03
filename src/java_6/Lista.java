
package java_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class Lista {
    String nome;
    public ArrayList<String> nomes = new ArrayList();
    
    
    
    
    public void adicionarLista(String nome){
        nomes.add(nome);
        
    }
    
    public void printLista() {
        System.out.println(nomes);
    }
    

}
