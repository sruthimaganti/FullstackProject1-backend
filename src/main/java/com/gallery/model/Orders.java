package com.gallery.model;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artworkTitle;
    private String buyerName;
    private int qty;
    private double price;

    public Orders() {}

    public Orders(Long id,String artworkTitle,String buyerName,int qty,double price) {
        this.id=id;
        this.artworkTitle=artworkTitle;
        this.buyerName=buyerName;
        this.qty=qty;
        this.price=price;
    }

    public Long getId() {
        return id;
    }

    public String getArtworkTitle() {
        return artworkTitle;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public void setArtworkTitle(String artworkTitle) {
        this.artworkTitle=artworkTitle;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName=buyerName;
    }

    public void setQty(int qty) {
        this.qty=qty;
    }

    public void setPrice(double price) {
        this.price=price;
    }

}