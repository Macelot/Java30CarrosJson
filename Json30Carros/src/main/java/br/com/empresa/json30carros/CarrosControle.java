/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.json30carros;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author marce
 */
public class CarrosControle {
    
    ArrayList<Carro> carros;
    Carro car;
    
    public ArrayList createCarro(){ 
        carros=new ArrayList();
        JSONParser parser = new JSONParser();
        try {
            JSONArray carrosArquivo = (JSONArray) parser.parse( new InputStreamReader(new FileInputStream("30Carros.json"), "UTF-8"));
            for (Object o : carrosArquivo){
                JSONObject car_ = (JSONObject) o;
                String nome = car_.get("nome").toString();
                String marca = (String) car_.get("marca");
                Double preco = Double.parseDouble(car_.get("preco").toString().replace(",", ""));
                Integer portas = Integer.parseInt(car_.get("portas").toString());
                            
                car= new Carro();
                car.setNome(nome);
                car.setMarca(marca);
                car.setPreco(preco);
                car.setPortas(portas);
                carros.add(car);
            }
        } catch (Exception e) {
                e.printStackTrace();
        }   
        return carros;      
    }
    
    public ArrayList<Carro> maisCaro(ArrayList<Carro> carros){
        ArrayList<Carro> carrosCarros;
        carrosCarros=new ArrayList();

        //achar o valor mais alto
        Double mais=0.0;
        for (int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getPreco()>mais){
                mais=carros.get(i).getPreco();
            }  
        }
        
        for (int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getPreco()>=mais ){
                mais=carros.get(i).getPreco();
                carrosCarros.add(carros.get(i));
            }  
        }
        return carrosCarros;      
    }
    
    public Double somaPreco(ArrayList<Carro> carros){
        ArrayList<Carro> carrosCarros;
        
        //achar o valor mais alto
        Double total=0.0;
        for (int i = 0; i < carros.size(); i++) {
             total+=carros.get(i).getPreco();
        }
        
        return total;      
    }
    
}
