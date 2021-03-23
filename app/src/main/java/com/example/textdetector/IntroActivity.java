package com.example.textdetector;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {
    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabindicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
         tabindicator = findViewById(R.id.tablayout);
        // fill list screen

        List<ScreenItem> items = new ArrayList<>();
        items.add(new ScreenItem("Flashpayers","Plus qu'un service,Envoyez de l'amour à vos proches ou que vous soyez", R.drawable.img12 ));
        items.add(new ScreenItem("Livraison Rapide","Peu importe ou se trouve vos proches Nous acheminons le service ou le collier que vous nous chargez de leur trannsmettre", R.drawable.img2 ));
        items.add(new ScreenItem("Paiement sécurisé","100% fiable et rapide avec les derniers et les pionniers du service en ce secteur votre paiement peut être suivi par vous mêmes et en plus vous êtes satisfaits ou remboursés", R.drawable.img3 ));

        // setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,items);
        screenPager.setAdapter(introViewPagerAdapter);

        // setup tablayout with viewpager

        tabindicator.setupWithViewPager(screenPager);
    }
}