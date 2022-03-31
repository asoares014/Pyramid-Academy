package org.genspark;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Phone> phone;
    private Address addy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public Address getAddy() {
        return addy;
    }

    public void setAddy(Address addy) {
        this.addy = addy;
    }

    public Student(){

    }

    public Student(int id, String name, List<Phone> phone, Address addy){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addy = addy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", addy=" + addy +
                '}';
    }
}
