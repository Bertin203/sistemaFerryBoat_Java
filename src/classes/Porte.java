package classes;

import java.util.ArrayList;
import java.util.List;

public class Porte {
    private int id;
    private String tamanho;
    private double valor;
    
    public static List<Porte> portes = new ArrayList<>();
    
    public void addPorte(Porte pt){
        portes.add(pt);
    }

    public double getValor() {
        return valor;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int ID){
        this.id = ID;
    }
    
    public String getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public double getValor(String tamanhoPorte){
        double valor = 0.0;
            for(int i = 0; i < portes.size(); i++){
                if(portes.get(i).tamanho.equals(tamanhoPorte)){
                    valor = portes.get(i).valor;
                }
            }
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
}
