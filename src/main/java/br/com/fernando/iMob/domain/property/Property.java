package br.com.fernando.iMob.domain.property;

import br.com.fernando.iMob.domain.address.Address;
import br.com.fernando.iMob.domain.owner.Owner;

import java.util.List;

public class Property {
    private String name;
    private String description;
    private Integer no_bedrooms;
    private Integer no_bathrooms;
    private String lot;
    private String block;
    private List<String> urlPhotos;
    private Address address;
    private Owner owner;

    public Property(String name, String description, Integer no_bedrooms, Integer no_bathrooms, String lot, String block,
                    List<String> urlPhotos, Address address, Owner owner) {
        this.name = name;
        this.description = description;
        this.no_bedrooms = no_bedrooms;
        this.no_bathrooms = no_bathrooms;
        this.lot = lot;
        this.block = block;
        this.urlPhotos = urlPhotos;
        this.address = address;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNo_bedrooms() {
        return no_bedrooms;
    }

    public void setNo_bedrooms(Integer no_bedrooms) {
        this.no_bedrooms = no_bedrooms;
    }

    public Integer getNo_bathrooms() {
        return no_bathrooms;
    }

    public void setNo_bathrooms(Integer no_bathrooms) {
        this.no_bathrooms = no_bathrooms;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public List<String> getUrlPhotos() {
        return urlPhotos;
    }

    public void setUrlPhotos(List<String> urlPhotos) {
        this.urlPhotos = urlPhotos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}