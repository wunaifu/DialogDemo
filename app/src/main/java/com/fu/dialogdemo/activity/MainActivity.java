package com.fu.dialogdemo.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.fu.dialogdemo.R;
import com.fu.dialogdemo.widget.CustomDatePicker;
import com.fu.dialogdemo.widget.TimeUtil;

import java.util.Date;

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

    //自定义弹框3
    public void dialogUI5(View v){
        final Dialog dialog;
        View diaView=View.inflate(MainActivity.this, R.layout.dialogui_loading_vertical, null);
        //diaView.getBackground().setAlpha(250);
        dialog=new Dialog(MainActivity.this,R.style.dialog);
        dialog.setContentView(diaView);
        dialog.show();
        ProgressBar pbBg = (ProgressBar) diaView.findViewById(R.id.pb_bg);
        pbBg.setIndeterminateDrawable(this.getResources().getDrawable(R.drawable.dialogui_rotate_mum));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.cancel();
            }
        }, 2000);
    }
    //自定义弹框3
    public void dialogUI6(View v){
        String now = TimeUtil.dateToStringNoS(new Date());
        String startTime = "1949-01-01 00:00";
        String endTime = "2050-01-01 00:00";
        CustomDatePicker customDatePicker = new CustomDatePicker(this, new CustomDatePicker.ResultHandler() {
            @Override
            public void handle(String time) { // 回调接口，获得选中的时间
                Toast.makeText(MainActivity.this,time,Toast.LENGTH_SHORT).show();
            }
        }, startTime, endTime); // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        customDatePicker.showSpecificTime(true); // 显示时和分
        customDatePicker.setIsLoop(true); // 允许循环滚动
        customDatePicker.show(now);
    }
    //自定义弹框3
    public void dialogUI7(View v){
        String now = TimeUtil.dateToStringNoS(new Date());
        String startTime = "1949-01-01 00:00";
        String endTime = "2050-01-01 00:00";
        CustomDatePicker customDatePicker = new CustomDatePicker(this, new CustomDatePicker.ResultHandler() {
            @Override
            public void handle(String time) { // 回调接口，获得选中的时间
                time = time.substring(0, 10);
                Toast.makeText(MainActivity.this,time,Toast.LENGTH_SHORT).show();
            }
        }, startTime, endTime); // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        customDatePicker.showSpecificTime(false); // 显示时和分
        customDatePicker.setIsLoop(true); // 允许循环滚动
        customDatePicker.show(now);
    }
    //自定义弹框3
    public void dialogUI8(View v){
        Intent intent = new Intent(MainActivity.this, SpinnerSActivity.class);
        startActivity(intent);
    }
}
