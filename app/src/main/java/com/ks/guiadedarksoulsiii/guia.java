package com.ks.guiadedarksoulsiii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class guia extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);

        getWindow().setStatusBarColor(Color.parseColor("#B80B06"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#B80B06")));

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new TabCementerioCeniza(), "Cementerio de Ceniza");
        vpAdapter.addFragment(new TabSantuarioEnlace(),"Santuario de Enlace");
        vpAdapter.addFragment(new TabGranMuro(),"Gran muro de Lothric");
        vpAdapter.addFragment(new TabAsentamientoNM(),"Asentamiento de no muertos");
        vpAdapter.addFragment(new TabCaminoSacrificios(),"Camino de los Sacrificios");
        vpAdapter.addFragment(new TabTorreonFarron(),"Torreon de Farron");
        vpAdapter.addFragment(new TabCatedralOscuridad(),"Catedral de la Osucuridad");
        vpAdapter.addFragment(new TabCatacumbasCarthus(),"Catacumbas de Carthus");
        vpAdapter.addFragment(new TabLagoArdiente(), "Lago Ardiente");
        vpAdapter.addFragment(new TabIrithyl(),"Irithyll del Valle Boreal");
        vpAdapter.addFragment(new TabMazmorraIrithyll(),"Mazmorra de Irithyll");
        vpAdapter.addFragment(new TabCapitalProfanada(),"Capital Profanada");
        vpAdapter.addFragment(new TabAnorLondo(),"Anor Londo");
        vpAdapter.addFragment(new TabCastilloLothric(),"Castillo de Lothric");
        vpAdapter.addFragment(new TabJardinReyCons(),"Jardin del Rey Consumido");
        vpAdapter.addFragment(new TabTumbasOlvidadas(),"Tumbas Olvidadas");
        vpAdapter.addFragment(new TabGranArchivo(),"Gran Archivo");
        vpAdapter.addFragment(new TabPicoArchidragon(),"Pico del Archidragon");
        vpAdapter.addFragment(new TabHornoPrimeraLLama(),"Horno de la Primera LLama");
        viewPager.setAdapter(vpAdapter);
    }
}