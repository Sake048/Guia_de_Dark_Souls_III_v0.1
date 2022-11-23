package com.ks.guiadedarksoulsiii;

import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;


public class guia extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    public guia() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpViewPagerAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guia, container, false);
    }

    private void setUpViewPagerAdapter(){
        viewPagerAdapter.addFragment(new TabCementerioCeniza(), "Cementerio de Ceniza");
        viewPagerAdapter.addFragment(new TabSantuarioEnlace(), "Santuario de Enlace");
        viewPagerAdapter.addFragment(new TabGranMuro(), "Gran muro de Lothric");
        viewPagerAdapter.addFragment(new TabAsentamientoNM(), "Asentamiento de no muertos");
        viewPagerAdapter.addFragment(new TabCaminoSacrificios(), "Camino de los Sacrificios");
        viewPagerAdapter.addFragment(new TabTorreonFarron(), "Torreon de Farron");
        viewPagerAdapter.addFragment(new TabCatedralOscuridad(), "Catedral de la Oscuridad");
        viewPagerAdapter.addFragment(new TabCatacumbasCarthus(), "Catacumbas de Carthus");
        viewPagerAdapter.addFragment(new TabLagoArdiente(), "Lago Ardiente");
        viewPagerAdapter.addFragment(new TabIrithyl(),"Irithyll del Valle Boreal");
        viewPagerAdapter.addFragment(new TabMazmorraIrithyll()"Mazmorra de Irithyll");
        viewPagerAdapter.addFragment(new TabCapitalProfanada(), "Capital Profanada");
        viewPagerAdapter.addFragment(new TabAnorLondo(),"Anor Londo");
        viewPagerAdapter.addFragment(new TabCastilloLothric(),"Castillo de Lothric");
        viewPagerAdapter.addFragment(new TabJardinReyCons(),"Jardin del Rey Consumido");
        viewPagerAdapter.addFragment(new TabTumbasOlvidadas(),"Tumbas Olvidadas");
        viewPagerAdapter.addFragment(new TabGranArchivo(),"Gran Archivo");
        viewPagerAdapter.addFragment(new TabPicoArchidragon()"Pico del Archidragon");
        viewPagerAdapter.addFragment(new TabHornoPrimeraLLama(),"Horno de la Primera LLama");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}