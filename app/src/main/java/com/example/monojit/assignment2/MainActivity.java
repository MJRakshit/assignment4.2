package com.example.monojit.assignment2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   List<OurContactsList>ourContactsLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView contactsList= (ListView)findViewById(R.id.contactsList);
        initOurContacts();
        ContactsAdapter contactsAdapter= new ContactsAdapter(this,ourContactsLists);
        contactsList.setAdapter(contactsAdapter);
    }
    void initOurContacts(){
        ourContactsLists=new ArrayList<OurContactsList>();
        ourContactsLists.add(new OurContactsList("Monoj","878787"));
        ourContactsLists.add(new OurContactsList("Arnab","787f7889"));
        ourContactsLists.add(new OurContactsList("Babai","646898908"));
        ourContactsLists.add(new OurContactsList("Hadoop","75709"));
        ourContactsLists.add(new OurContactsList("Tina","783769867"));
        ourContactsLists.add(new OurContactsList("Pankaj","8943058340"));
        ourContactsLists.add(new OurContactsList("Dilip","76790"));

    }
}
