package br.com.fernando.iMob.infra.persistence;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "owner")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String urlPhoto;
    private String name;
    @Column(unique = true, length = 11)
    private String cpf;
    private String rg;
    private String email;
    @OneToMany(mappedBy = "owner")
    private List<PropertyEntity> properties;

    public OwnerEntity() {  }

    public OwnerEntity(String urlPhoto, String name, String cpf, String rg, String email, List<PropertyEntity> properties) {
        this.urlPhoto = urlPhoto;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.properties = properties;
    }

    public UUID getId() {
        return id;
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

    public List<PropertyEntity> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyEntity> properties) {
        this.properties = properties;
    }
}
