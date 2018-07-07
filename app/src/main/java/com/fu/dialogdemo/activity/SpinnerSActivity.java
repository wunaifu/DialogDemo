package com.fu.dialogdemo.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.fu.dialogdemo.R;
import com.fu.dialogdemo.widget.CustomDatePicker;
import com.fu.dialogdemo.widget.TimeUtil;

import java.util.Date;

public class SpinnerSActivity extends Activity implements AdapterView.OnItemSelectedListener{
    private Spinner one;
    private Spinner two;
    private Spinner three;
    private ArrayAdapter<String> adapter;
    private String[] oneStrs;
    private String[] twoStrs;
    private String[] threeStrs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        one = (Spinner) findViewById(R.id.one);
        two = (Spinner) findViewById(R.id.two);
        three = (Spinner) findViewById(R.id.three);
        one.setOnItemSelectedListener(this);
        two.setOnItemSelectedListener(this);
        three.setOnItemSelectedListener(this);

        oneStrs = new String[]{"广东", "海南"};
        adapter=new ArrayAdapter<String>(SpinnerSActivity.this,android.R.layout.simple_spinner_item, oneStrs);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        one.setAdapter(adapter);
        one.setSelection(0);

        //twoStrs = new String[]{"江门", "中山", "湛江"};



        //threeStrs = new String[]{"廉江", "蓬江", "横栏"};


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.one:
                Toast.makeText(SpinnerSActivity.this,oneStrs[position],Toast.LENGTH_SHORT).show();
                if (oneStrs[position].equals("广东")) {
                    twoStrs = new String[]{"江门", "湛江"};
                } else {
                    twoStrs = new String[]{"海口", "三亚"};
                }
                adapter=new ArrayAdapter<String>(SpinnerSActivity.this,android.R.layout.simple_spinner_item, twoStrs);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                two.setAdapter(adapter);
                two.setSelection(0);
                break;
            case R.id.two:
                Toast.makeText(SpinnerSActivity.this,twoStrs[position],Toast.LENGTH_SHORT).show();
                if (twoStrs[position].equals("江门")) {
                    threeStrs = new String[]{"蓬江", "新会"};
                } else if (twoStrs[position].equals("湛江")){
                    threeStrs = new String[]{"廉江", "遂溪"};
                }else if (twoStrs[position].equals("海口")){
                    threeStrs = new String[]{"海口1", "海口2"};
                }else if (twoStrs[position].equals("三亚")){
                    threeStrs = new String[]{"三亚1", "三亚2"};
                }
                adapter=new ArrayAdapter<String>(SpinnerSActivity.this,android.R.layout.simple_spinner_item, threeStrs);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                three.setAdapter(adapter);
                three.setSelection(0);
                break;
            case R.id.three:
                Toast.makeText(SpinnerSActivity.this,threeStrs[position],Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        switch (parent.getId()) {
            case R.id.one:

                break;
            case R.id.two:

                break;
            case R.id.three:

                break;
        }
    }
}
