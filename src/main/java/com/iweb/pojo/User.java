package com.iweb.pojo;

public class User {
    private Integer no;
    private String name;
    private Double balance;

    public User(Integer no, String name, Double balance) {
        this.no = no;
        this.name = name;
        this.balance = balance;
    }

    public User() {
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
