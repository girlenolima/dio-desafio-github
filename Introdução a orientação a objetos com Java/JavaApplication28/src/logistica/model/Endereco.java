
package logistica.model;


class Endereco {
   
    private TipoEndereco enderecos;
    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String CEP;
    private String referencia;
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public TipoEndereco getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(TipoEndereco enderecos) {
        this.enderecos = enderecos;
    }
    
    
    
    
    
}
