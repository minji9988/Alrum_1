package com.chobo.main_ver_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //객체 선언
    Fragment firstFragment_2;
    Fragment fourthFragment;

    // 비상전화 버튼 생성
//    ImageButton btn_emergency_call;

    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 네비게이션뷰에 있는 아이콘 클릭했을 때 화면이 바뀌는 구문
             예) 홈 아이콘을 클릭하면 홈(메인) 화면이 뜬다. */
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this, R.id.fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


        //FragmentManager : fragment를 다루는 작업을 해주는 객체
        firstFragment_2 = (FirstFragment) getSupportFragmentManager().findFragmentById(R.id.firstFragment);

        // 각각의 Fragment 객체 초기화
        firstFragment_2 = new FirstFragment();
        fourthFragment = new FourthFragment();



    }


    //프래그먼트가 바뀔때 작동하게끔 작성한 메서드
    public void onFragmentChange(int fragmentNum) {

        // 첫 번째 프레그먼트(메뉴 화면)에서 '프로필' 버튼을 클릭하면 네 번째 프레그먼트인 '비상전화' 화면으로 이동
        if(fragmentNum == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.action_container, fourthFragment).commit();

//        } else if(fragmentNum == 2) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.action_container, firstFragment).commit();

        }

    }

}


