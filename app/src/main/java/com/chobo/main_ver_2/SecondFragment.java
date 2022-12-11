package com.chobo.main_ver_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

public
class SecondFragment extends Fragment {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public
    SecondFragment () {
        // Required empty public constructor
    }


    public static
    SecondFragment newInstance ( String param1, String param2 ) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public
    void onCreate ( Bundle savedInstanceState ) {


        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public
    View onCreateView ( LayoutInflater inflater, ViewGroup container,
                        Bundle savedInstanceState ) {

        View v = inflater.inflate(R.layout.fragment_second, container, false);

        // 메인 페이지 버튼들 초기화
        ImageButton btn_main_todayallergy = (ImageButton) v.findViewById(R.id.btn_main_todayallergy);
        ImageButton btn_main_medicinetime = (ImageButton) v.findViewById(R.id.btn_main_medicinetime);
        ImageButton btn_main_check = (ImageButton) v.findViewById(R.id.btn_main_check);


        // 메인(홈) 화면(SecondFragement.xml)의 '오늘의 알러지수' 버튼 클릭 시 '오늘의 알러지수'페이지로 이동
        btn_main_todayallergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(getContext(), TodayAllergy.class);
                startActivity(intent);
            }
        });

        // 메인(홈) 화면(SecondFragement.xml)의 '약 복용 시간' 버튼 클릭 시 '약 복용 시간'페이지로 이동
        btn_main_medicinetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(getContext(), MedicineTime.class);
                startActivity(intent);
            }
        });

        // 메인(홈) 화면(SecondFragement.xml)의 '알러지 물질 체크' 버튼 클릭 시 '알러지 체크'페이지로 이동
        btn_main_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(getContext(), MedicineTime.class);
                startActivity(intent);
            }
        });

        return v;

    }


}