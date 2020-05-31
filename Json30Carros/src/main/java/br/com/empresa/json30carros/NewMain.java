/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.json30carros;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author marce
 * https://csvjson.com/csv2json
 * https://stackoverflow.com/questions/10926353/how-to-read-json-file-into-java-with-simple-json-library
 * https://crunchify.com/how-to-read-json-object-from-file-in-java/
 * https://stackoverflow.com/questions/1946668/sorting-using-comparator-descending-order-user-defined-classes
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car;
        car= new Carro();
        
        CarrosControle cc;
        cc=new CarrosControle();

        ArrayList<Carro> carros;
        carros= cc.createCarro();
        
        System.out.println("----Original");
        car.print(carros);
        
        ComparaPorPreco cpp ;
        cpp=new ComparaPorPreco();
        Collections.sort(carros,cpp);
        System.out.println("----Ordenado");
        car.print(carros);
        Collections.reverse(carros);
        System.out.println("----Reverso");
        car.print(carros);
        
        System.out.println("----Mais Caros");
        car.print(cc.maisCaro(carros));
        
        System.out.println("----Soma Preço");
        System.out.println(cc.somaPreco(carros));
        
        DecimalFormat df;
        df = new DecimalFormat("   #,##0.00");
        
        System.out.printf("%13s",df.format(cc.somaPreco(carros)));
    }
    
}
