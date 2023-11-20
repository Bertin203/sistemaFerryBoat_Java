package classes;

import java.util.ArrayList;
import java.util.List;


public class Veiculo {
    private String placa;
    private String modelo;
    
    public static List<Veiculo> veiculos = new ArrayList<>();
    
    public void addVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
