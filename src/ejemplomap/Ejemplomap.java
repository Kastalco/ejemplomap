/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import modelo.Persona;

/**
 *
 * @author camilo_andres.munoz
 */
public class Ejemplomap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList <Persona> listap = new LinkedList<>();
       LinkedList <Persona> listap2 = new LinkedList<>();
       
       
        HashMap<Integer, LinkedList <Persona>> map1 = new HashMap <>();
        LinkedHashMap<Integer,LinkedList <Persona>> map2 = new LinkedHashMap<>();
        TreeMap<Integer, LinkedList <Persona>> map3 = new TreeMap<>();
        
        listap.add(new Persona(" David", " 1130", 31));
        listap.add(new Persona(" Joselo", " 1145", 28));
        listap.add(new Persona(" Cristian", " 1785", 51));
        
        map1.put(3, listap);
        
        listap2.add(new Persona(" Camila", " 1134", 20));
        listap2.add(new Persona(" Amparo", " 1145", 25));
        listap2.add(new Persona(" Marina", " 1874", 38));
        
        map1.put(2, listap2);
        
      
        
        System.out.println(map1);
        System.out.println("_________");
//        System.out.println(m2);
//        System.out.println("_________");
//        System.out.println(m3);
        
        
    }
    
    
    
    public static String mostrar (Map<Integer,LinkedList<Persona>> m) {
    
    String mostrar ="";
    
    Iterator <Map.Entry<Integer, LinkedList<Persona>>> it = m.entrySet().iterator();
     while (it.hasNext()){
    

    
         Map.Entry<Integer, LinkedList<Persona>> pair = it.next();
         
         mostrar += pair.getKey();
         
         for (int i = 0; i < pair.getValue().size(); i++) {
             
             mostrar +=  "      "+ pair.getValue().get(i)+ "\n";
             
             
         }
         
    

        
    }
    
    return mostrar;
    } 
}
