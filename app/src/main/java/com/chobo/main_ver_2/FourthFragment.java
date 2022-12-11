package com.chobo.main_ver_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public
class FourthFragment extends Fragment {

    //메인 액티비티 객체 선언
    MainActivity activity;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public
    FourthFragment () {
        // Required empty public constructor
    }


    public static
    FourthFragment newInstance ( String param1, String param2 ) {
        FourthFragment fragment = new FourthFragment();
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


        View v = inflater.inflate(R.layout.fragment_fourth, container, false);

        // 네 번째 프레그먼트에 있는 비상전화 버튼 선언
        ImageButton btn_emergency_call = (ImageButton) v.findViewById(R.id.btn_emergency_call);

        // 비상전화 버튼 클릭시 119로 연락
        btn_emergency_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:119"));
                startActivity(intent);
            }
        });

        return v;


    }
}