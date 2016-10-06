package com.project.carecalories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends Activity {

    private UserTABLE objUserTABLE;
    private ShopTABLE objShopTABLE;
    private MenuTABLE objMenuTABLE;
    private TypeTABLE objTypeTABLE;

     @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

         objUserTABLE = new UserTABLE(this);
         objShopTABLE = new ShopTABLE(this);
         objMenuTABLE = new MenuTABLE(this);
         objTypeTABLE = new TypeTABLE(this);

         Button buttonBack = (Button) findViewById(R.id.button);
         buttonBack.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 finish();
             }
         });

        String[] str1 = new String[]{"RESTAURANT 1", "RESTAURANT 2", "RESTAURANT 3", "RESTAURANT 4", "RESTAURANT 5", "RESTAURANT 6", "RESTAURANT 7", "RESTAURANT 8", "RESTAURANT 9", "OTHER"};

         TextView currentDate = (TextView) findViewById(R.id.textView2);
         currentDate.setText( new SimpleDateFormat("dd-MM-yyyy").format(new Date()) );

        ListView listView = (ListView) findViewById(R.id.listView) ;
        listView.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1, str1));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long ard3) {
                Intent intent;
                switch (arg2) {
                    case 0:
                        intent = new Intent(getApplicationContext(), FirstActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), SecondActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), ThirdActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), FourthActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), FifthActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), SixthActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), SeventhActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), EighthActivity.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), NinthActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), OtherActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}