package com.project.carecalories;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HistoryActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView currentDate = (TextView) findViewById(R.id.textView18);
        currentDate.setText( new SimpleDateFormat("dd-MM-yyyy").format(new Date()) );

        Button buttonBack = (Button) findViewById(R.id.button17);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
