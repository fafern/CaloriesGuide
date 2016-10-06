package com.project.carecalories;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String[] str = new String[]{"PROFILE", "HISTORY", "CALORIES", "EXERCISE"};


        TextView currentDate = (TextView) findViewById(R.id.textView3);
        currentDate.setText( new SimpleDateFormat("dd-MM-yyyy").format(new Date()) );


        ListView listView1 = (ListView) findViewById(R.id.listView1) ;
        listView1.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1, str));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent;
                switch (arg2) {
                    case 0:
                        intent = new Intent(getApplicationContext(), ProfileActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), HistoryActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), ExerciseActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
