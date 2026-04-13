package com.example.a2.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.example.a2.BR;

public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private int age;
    private String passportNo;

    public User() {}

    public User(String firstName, String lastName, int age, String passportNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.passportNo = passportNo;
    }

    @Bindable
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public int getAge() { return age; }
    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getPassportNo() { return passportNo; }
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
        notifyPropertyChanged(BR.passportNo);
    }
}