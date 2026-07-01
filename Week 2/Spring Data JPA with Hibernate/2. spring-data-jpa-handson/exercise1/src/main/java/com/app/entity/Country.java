package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code", length = 2)
    private String coCode;

    @Column(name = "co_name")
    private String coName;

    public Country() {}

    public String getCoCode() { return coCode; }
    public void setCoCode(String coCode) { this.coCode = coCode; }
    public String getCoName() { return coName; }
    public void setCoName(String coName) { this.coName = coName; }
}