package com.fu.dialogdemo;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //自定义弹框1
    public void dialogUI1(View v){
        final Dialog dialog;
        View diaView=View.inflate(MainActivity.this, R.layout.dialogui_center, null);
        dialog=new Dialog(MainActivity.this,R.style.dialog);
        dialog.setContentView(diaView);
        dialog.show();
        TextView tvInfo = (TextView) diaView.findViewById(R.id.tv_info);
        TextView tvSure = (TextView) diaView.findViewById(R.id.tv_sure);
        tvSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }

    //自定义弹框2
    public void dialogUI2(View v){
        final Dialog dialog;
        View diaView=View.inflate(MainActivity.this, R.layout.dialogui_center2, null);
        dialog=new Dialog(MainActivity.this,R.style.dialog);
        dialog.setContentView(diaView);
        dialog.show();
        TextView tvInfo = (TextView) diaView.findViewById(R.id.tv_info);
        TextView tvSure = (TextView) diaView.findViewById(R.id.tv_sure);
        TextView tvCancel = (TextView) diaView.findViewById(R.id.tv_cancel);
        tvSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }

    //自定义弹框3
    public void dialogUI3(View v){
        final Dialog dialog;
        View diaView=View.inflate(MainActivity.this, R.layout.dialogui_center3, null);
        dialog=new Dialog(MainActivity.this,R.style.dialog);
        dialog.setContentView(diaView);
        dialog.show();
        TextView tvInfo = (TextView) diaView.findViewById(R.id.tv_info);
        TextView tvSure = (TextView) diaView.findViewById(R.id.tv_sure);
        TextView tvCancel = (TextView) diaView.findViewById(R.id.tv_cancel);
        EditText etInput = (EditText) diaView.findViewById(R.id.et_input);
        tvSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }
    //自定义弹框3
    public void dialogUI4(View v){
        final Dialog dialog;
        View diaView=View.inflate(MainActivity.this, R.layout.dialogui_footer, null);
        dialog=new Dialog(MainActivity.this,R.style.dialogfooter);
        diaView.setMinimumWidth(R.dimen.width);
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        dialog.setContentView(diaView);
        dialog.show();
        Button btnCamera= (Button) diaView.findViewById(R.id.btn_camera);
        Button btnPhoto= (Button) diaView.findViewById(R.id.btn_photo);
        Button btnCancel= (Button) diaView.findViewById(R.id.btn_cancel);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.cancel();
            }
        });
        btnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }
}
