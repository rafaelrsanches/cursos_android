package com.example.abas.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.abas.R;
import com.example.abas.fragments.EmAltaFragment;
import com.example.abas.fragments.HomeFragment;
import com.example.abas.fragments.InscricoesFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout viewPagerTab;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerTab = findViewById(R.id.viewPagerTab);
        viewPager = findViewById(R.id.viewPager);

        // Configura abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Home", HomeFragment.class)
                .add("Inscrições", InscricoesFragment.class)
                .add("Em Alta", EmAltaFragment.class)
                .create()
        );

        // Configura o adapter
        viewPager.setAdapter(adapter);
        viewPagerTab.setViewPager(viewPager);
    }
}
