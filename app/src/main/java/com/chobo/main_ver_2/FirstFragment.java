package com.chobo.main_ver_2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public
class FirstFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    //메인 액티비티 객체 선언
    MainActivity activity;

    //화면이 붙을때 작동하는 메서드
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //현재 소속된 액티비티를 메인 액티비티로 한다.
        activity = (MainActivity) getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //액티비티에서 떨어져서 더이상 참조 불가능
        activity=null;
    }

    public
    FirstFragment () {
        // Required empty public constructor
    }

    public static
    FirstFragment newInstance ( String param1, String param2 ) {
        FirstFragment fragment = new FirstFragment();
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


        View v = inflater.inflate(R.layout.fragment_first, container, false);

        ImageButton menu_allergy_btn = (ImageButton) v.findViewById(R.id.menu_allergy_btn);
        ImageButton menu_medicine_time_btn = (ImageButton) v.findViewById(R.id.menu_medicine_time_btn);
        ImageButton menu_check_btn = (ImageButton) v.findViewById(R.id.menu_check_btn);

//        //메뉴에 있는 프로필 버튼 초기화
//        ImageButton menu_profile_btn = (ImageButton) v.findViewById(R.id.menu_profile_btn);

//        //프로필 버튼 클릭 시 MainActivity에 있는
//        menu_profile_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick( View view ) {
//                activity.onFragmentChange(1);
//            }
//        });

        // 메인(홈) 화면(FirstFragement.xml)의 '알러지 지수 버튼' 클릭 시 '알러지 지수' 페이지로 이동
        menu_allergy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(getContext(), TodayAllergy.class);
                startActivity(intent);
            }
        });

        // 메인(홈) 화면(FirstFragement.xml)의 '약 복용 시간 버튼' 클릭 시 '약 복용 시간' 페이지로 이동
        menu_medicine_time_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(getContext(), MedicineTime.class);
                startActivity(intent);
            }
        });

        // 메인(홈) 화면(FirstFragement.xml)의 '알러지 물질 체크 버튼' 클릭 시 '알러지 물질체크' 페이지로 이동
        menu_check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent(getContext(), MedicineTime.class);
                startActivity(intent);
            }
        });
        return v;
    }
}

//package com.chobo.main_ver_2;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageButton;
//
///**
// * A simple {@link Fragment} subclass.
// * Use the {@link FirstFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
//public
//class FirstFragment extends Fragment {
//
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private String mParam1;
//    private String mParam2;
//
//    public
//    FirstFragment () {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment FirstFragment.
//     */
//    public static
//    FirstFragment newInstance ( String param1, String param2 ) {
//        FirstFragment fragment = new FirstFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public
//    void onCreate ( Bundle savedInstanceState ) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public
//    View onCreateView ( LayoutInflater inflater, ViewGroup container,
//                        Bundle savedInstanceState ) {
//
//
//        View v = inflater.inflate(R.layout.fragment_first, container, false);
//
//        ImageButton menu_allergy_btn = (ImageButton) v.findViewById(R.id.menu_allergy_btn);
//        ImageButton menu_medicine_time_btn = (ImageButton) v.findViewById(R.id.menu_medicine_time_btn);
//        ImageButton menu_check_btn = (ImageButton) v.findViewById(R.id.menu_check_btn);
//
//
//        // 메인(홈) 화면(FirstFragement.xml) '알러지 체크'
//        menu_allergy_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick ( View view ) {
//                Intent intent = new Intent(getContext(), MedicineTime.class);
//                startActivity(intent);
//            }
//        });
//
//        return v;
//
//    }
//
//
//}