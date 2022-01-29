package logistica.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{


    private String telefone;
    private List<Endereco> enderecos;

   
    public void adcionarEndereco(Endereco endereco) {

        if (endereco == null) {
            throw new RuntimeException("Endereco nao pode ser nulo");
        }
        
        getEnderecos().add(endereco);
        
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }



}
