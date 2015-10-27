package model;

import java.io.Serializable;

/**
 *
 * @author bruce
 */
public class CEP implements Serializable {
    
    private String cep, bairro, logradouro, localidade, uf;

    public CEP(String cep, String bairro, String logradouro, String localidade, String uf) {
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public CEP() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "CEP{" + "cep=" + cep + ", bairro=" + bairro + ", logradouro=" + logradouro + ", localidade=" + localidade + ", uf=" + uf + '}';
    }

    
    
    
}
