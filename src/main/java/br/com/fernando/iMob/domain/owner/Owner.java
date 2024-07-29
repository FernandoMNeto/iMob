package br.com.fernando.iMob.domain.owner;

import br.com.fernando.iMob.domain.property.Property;

import java.util.List;

public class Owner {
    private String urlPhoto;
    private String name;
    private String cpf;
    private String rg;
    private String email;
    private List<Property> properties;

    public Owner(String urlPhoto, String name, String cpf, String rg, String email, List<Property> properties) {
        this.urlPhoto = urlPhoto;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.properties = properties;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
