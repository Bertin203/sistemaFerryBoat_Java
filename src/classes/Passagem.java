package classes;

import java.util.ArrayList;
import java.util.List;
    

public class Passagem {
    private String CPF_Cliente;
    private String placa_carro;
    private String porteVeiculo;
    private String data;
    private int qtdPassageiros;
    
    public static List<Passagem> passagens = new ArrayList<>();
    
    public void addPassagem(Passagem p){
        passagens.add(p);
    }
    
    public String getCPF_Cliente(){
        return CPF_Cliente;
    }
    
    public void setCPF_Cliente(String clienteCPF){
        this.CPF_Cliente = clienteCPF;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    public String getPorteVeiculo() {
        return porteVeiculo;
    }

    public void setPorteVeiculo(String porteVeiculo) {
        this.porteVeiculo = porteVeiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    
    public Double valorGeral(){
        Porte pt = new Porte();
        double valor = 0;
            for(int i = 0; i < passagens.size(); i++){
                valor += (passagens.get(i).qtdPassageiros * 5.70) + pt.getValor(passagens.get(i).porteVeiculo);
            }
        return valor;
    }
    
    public Double valorpVeiculo(String placaCarro){
        Porte pt = new Porte();
        double valor = 0;
            for(int i = 0; i < passagens.size();i++){
                if(passagens.get(i).placa_carro.equals(placaCarro)){
                    valor += (passagens.get(i).qtdPassageiros * 5.70) + pt.getValor(passagens.get(i).porteVeiculo);
                } 
            }
        return valor;
    }
    
    public Double valorpPorte(String porte){
        Porte pt = new Porte();
        double valor = 0;
            for(int i = 0; i < passagens.size();i++){
                if(passagens.get(i).porteVeiculo.equals(porte)){
                    valor += (passagens.get(i).qtdPassageiros * 5.70) + pt.getValor(passagens.get(i).porteVeiculo);
                } 
            }
        return valor;
    }
}
