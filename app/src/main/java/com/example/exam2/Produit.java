package com.example.exam2;

import java.io.Serializable;

public class Produit implements Serializable {
    private int idP;
    private String libelle;

    public Produit(int idP, String libelle, String famille, Double prixAchat, Double prixVente) {
        this.idP = idP;
        this.libelle = libelle;
        this.famille = famille;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    private String famille;
    private Double prixAchat;
    private Double prixVente;

    public Produit() {

    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public Double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Double prixVente) {
        this.prixVente = prixVente;
    }



}
