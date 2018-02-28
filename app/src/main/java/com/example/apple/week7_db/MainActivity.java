package com.example.apple.week7_db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        db.addContact(new Contact("Sarayut", "0634366972"));
        db.addContact(new Contact("aaa","01111111111"));
        List<Contact> contacts = db.getAllContacts();

        Toast t = Toast.makeText(this, contacts.get(0)._name, Toast.LENGTH_SHORT);
        t.show();

        String[] datas = new String[contacts.size()];

        String[] datas1 = new String[contacts.size()];
        for (int i = 0; i < datas.length; i++) {
            datas[i] = contacts.get(i)._name;
        }
        for (int i = 0; i < datas1.length; i++) {
            datas1[i] = contacts.get(i)._phone_number;
        }

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), datas,datas1);
        ListView listView = (ListView) findViewById(R.id.ListView1);
        listView.setAdapter(adapter);
    }
}
