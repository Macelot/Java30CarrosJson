/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.json30carros;

import java.util.Comparator;

class ComparaPorNome implements Comparator<Carro>{
    @Override
    public int compare(Carro c1, Carro c2) {  
        if(c1 == null || c2 == null)  
            System.out.println("Nome em branco");  
        String  nome1 = c1.getNome();
        String  nome2 = c2.getNome(); 

        return  nome1.compareTo( nome2); 
    }
}