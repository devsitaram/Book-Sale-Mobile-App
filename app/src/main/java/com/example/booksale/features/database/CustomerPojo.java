package com.example.booksale.features.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class CustomerPojo {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customer_id")
    public int customerId;

    @ColumnInfo(name = "customer_name")
    public String customerName;

    @ColumnInfo(name = "password")
    public String password;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "address")
    public String address;

    @ColumnInfo(name = "phone")
    public String phone;

    @ColumnInfo(name = "age")
    public int age;

    // constructor
    public CustomerPojo(int customerId, String customerName, String password, String email, String address, String phone, int age) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }
}
