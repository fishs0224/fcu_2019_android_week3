package edu.fcu.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class SettingActivity extends AppCompatActivity {

    Button BtnSAVE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        //取得所有物件
        BtnSAVE = (Button) findViewById(R.id.BtnSAVE);

        //設定物件的 內容 (on click event)
        BtnSAVE.setOnClickListener(btnSAVEOnClick);



    }

    private View.OnClickListener btnSAVEOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(SettingActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
}
