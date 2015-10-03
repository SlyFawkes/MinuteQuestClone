package com.example.slyfawkes.minutequestclone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView optionsListView = (ListView)findViewById(R.id.listview);

        optionsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selection = ((TextView) view).getText().toString();

                switch (selection) {
                    case "New Game":
                        Intent i = new Intent(getApplicationContext(), GameActivity.class);
                        startActivity(i);
                    case "Exit":
                        finish();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        android.os.Process.killProcess(android.os.Process.myPid());
        super.onDestroy();
    }
}
