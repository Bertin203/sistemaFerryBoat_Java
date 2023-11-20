package classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String CPF;
    private String nome;    
    private String dataNascimento;    
    
    public static List<Cliente> clientes = new ArrayList<>();
    
    public void addCliente(Cliente c){
        clientes.add(c);
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
