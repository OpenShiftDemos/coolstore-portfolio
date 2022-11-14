package com.redhat.coolstore.customers;

public class Customer {

    private Long id;

    private String username;

    private String name;

    private String surname;

    private String address;

    private String zipCode;

    private String city;

    private String country;

    public static Customer of(final com.redhat.coolstore.entity.Customer entity) {

        final Customer customer = new Customer();
        customer.setId(entity.getId());
        customer.setName(entity.getName());
        customer.setSurname(entity.getUsername());
        customer.setUsername(entity.getUsername());
        customer.setAddress(entity.getAddress());
        customer.setCity(entity.getCity());
        customer.setZipCode(entity.getZipCode());
        customer.setCountry(entity.getCountry());

        return customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
