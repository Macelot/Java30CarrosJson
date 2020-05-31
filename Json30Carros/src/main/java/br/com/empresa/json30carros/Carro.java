package br.com.empresa.json30carros;

import java.text.DecimalFormat;
import java.util.ArrayList;

class Carro {
    String nome;
    String marca;
    Double preco;
    Integer portas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public void print(ArrayList<Carro> carros){
        DecimalFormat df;
        df = new DecimalFormat("   #,##0.00");
        System.out.println("-------------------------------------------------------");
        System.out.print((String.format("%-10s", "Nome")));//sempre teremos 10 espaços note que os espaços extra ficam no final, pois usamos o sinal de menos -
        System.out.printf("%15s","Marca");//sempre teremos 15 espaços, este é um formato mais padrão, os espaços extra ficam na frente
        System.out.printf("%10s","Preço");// ocuparemos 9 mais 1 espaço = 10 posições no total, 2 depois do separador, 1 separador, 3 do milhar, mais 3 antes do milhar 
        System.out.printf("%7s","Portas");
        System.out.printf("%13s","Preço");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < carros.size(); i++) {
            System.out.print((String.format("%-10s", carros.get(i).getNome())));//sempre teremos 10 espaços note que os espaços extra ficam no final, pois usamos o sinal de menos -
            System.out.printf("%15s",carros.get(i).getMarca());//sempre teremos 15 espaços, este é um formato mais padrão, os espaços extra ficam na frente
            System.out.printf("%10.2f",carros.get(i).getPreco());// ocuparemos 8 posições no total
            System.out.printf("%7d",carros.get(i).getPortas());//sempre vasmo ter dois espços para o inteiro
            System.out.printf("%13s",df.format(carros.get(i).getPreco()));
            System.out.println("");
        }
    }
    
    
}