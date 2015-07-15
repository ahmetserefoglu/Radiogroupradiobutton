package com.example.ahmet.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MyActivity extends Activity {
     String txt1="";
     String txt2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        final RadioGroup radioGroup1=(RadioGroup) findViewById(R.id.radioGroup1);
        final RadioGroup radioGroup2=(RadioGroup) findViewById(R.id.radioGroup2);
        final  TextView text=(TextView)findViewById(R.id.text);

    radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            int id=radioGroup1.getCheckedRadioButtonId();
            RadioButton rd1=(RadioButton)findViewById(id);
            String ilk=rd1.getText().toString();
            txt1="RadioGroup1 " + ilk;
            text.setText(txt1+" "+txt2);

        }
    });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id1=radioGroup2.getCheckedRadioButtonId();
                RadioButton rd2=(RadioButton)findViewById(id1);
                String son=rd2.getText().toString();
                txt2="RadioGroup2 " + son;
                text.setText(txt1+" "+txt2);
            }

        });
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
