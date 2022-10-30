package com.ks.guiadedarksoulsiii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class almas extends Fragment {

    private ListView lista;

    public almas() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<almas_entrada> datos = new ArrayList<almas_entrada>();

        datos.add(new almas_entrada("Alma debilitada","50"));
        datos.add(new almas_entrada("Alma de cadaver abandonado","200"));
        datos.add(new almas_entrada("Gran alma de cadaver abandonado","400"));
        datos.add(new almas_entrada("Alma de paladin orgulloso","500"));
        datos.add(new almas_entrada("Gran alma de viajero desconocido","1000"));
        datos.add(new almas_entrada("Gran alma de paladin orgulloso","1000"));
        datos.add(new almas_entrada("Alma de soldado anonimo","2000"));
        datos.add(new almas_entrada("Alma de heroe intrepido","2000"));
        datos.add(new almas_entrada("Gran alma de soldado anonimo","3000"));
        datos.add(new almas_entrada("Alma de luchador exhausto","5000"));
        datos.add(new almas_entrada("Alma guerrero experimentado","5000"));
        datos.add(new almas_entrada("Gran alma guerrero experimentado","7500"));
        datos.add(new almas_entrada("Gran alma de luchador exhausto","8000"));
        datos.add(new almas_entrada("Alma de caballero alicaido","10000"));
        datos.add(new almas_entrada("Gran alma de caballero alicaido","20000"));
        datos.add(new almas_entrada("Alma de veterano venerable","20000"));
        datos.add(new almas_entrada("Alma de campeon","25000"));
        datos.add(new almas_entrada("Alma de gran campeon","50000"));

        lista = (ListView) lista.findViewById(R.id.list);
        lista.setAdapter(new almas_adapter(this,R.layout.fragment_almas, datos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if(entrada != null){
                    TextView texto = (TextView) view.findViewById(R.id.texto);
                    if(texto != null)
                        texto.setText(((almas_entrada)entrada).get_texto());

                    TextView subTexto = (TextView) view.findViewById(R.id.subtexto);
                    if(subTexto != null)
                        subTexto.setText(((almas_entrada)entrada).get_subTexto());
                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_almas, container, false);
    }
}