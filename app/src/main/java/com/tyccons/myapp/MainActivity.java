package com.tyccons.myapp;

import android.content.Intent;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int PICK_CONTACT=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View view)
    {
        Intent intent;
        if(view.getId()==R.id.calendar)
        {
            intent= new Intent(Intent.ACTION_INSERT);
            intent.setData(CalendarContract.Events.CONTENT_URI);
            startActivity(intent);
        }
        if(view.getId()==R.id.contact)
        {
            intent=new Intent(Intent.ACTION_PICK);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            startActivityForResult(intent, PICK_CONTACT);
        }
    }
}
