package com.example.apple.week7_db;

/**
 * Created by apple on 28/2/2018 AD.
 */

public class Contact {

    public int _id;
    public String _name;
    public String _phone_number;

    public Contact(){}

    public Contact(String _name, String _phone_number) {
        this._name = _name;
        this._phone_number = _phone_number;
    }

    public Contact(int _id, String _name, String _phone_number) {
        this._id = _id;
        this._name = _name;
        this._phone_number = _phone_number;
    }
}
