package com.chobo.main_ver_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public
class MedicineTime extends AppCompatActivity {


    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_time);

        //알람 추가(플러스 버튼) 초기화
        ImageButton btn_make_time = findViewById(R.id.btn_make_time);

        // activity_medicine_time.xml에 있는 '플러스' 버튼 클릭 시 '알람'페이지로 이동
        btn_make_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent(MedicineTime.this, Alarm.class);
                startActivity(intent);
            }
        });


    }
}