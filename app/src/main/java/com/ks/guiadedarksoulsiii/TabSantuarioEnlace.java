package com.ks.guiadedarksoulsiii;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TabSantuarioEnlace extends Fragment {



    public TabSantuarioEnlace() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tab_santuario_enlace, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] guia2={"Habla con la Guardiana de fuego"
        ,"Utiliza la Espada en espiral en la hoguera del centro (Santuario de Enlace del Fuego) para activar el viaje rapido entre hogueras, si utilizas la hoguera te daras cuenta que tienes activada" +
                " la ubicacion Gran muro de Lothric"
        ,"Habla con Hawkwood para recibir el gesto Derrumbarse"
        ,"Habla con Ludleth Courland, el se encarga de fabricar armas y objetos con las almas de los jefes"
        ,"Por el tunel que esta debajo de donde viniste encontraras a la Sirvienta del Santuario y al fondo al Herrero Andre, el se encarga de mejorar tus armas",
        "Con las almas que has juntado comprale la Llave de la Torre a la Sirvienta del Santuario"
        ,"Desde La entrada del Santuario sube las escaleras, ya en el exterior encontraras un arbol el cual puedes examinar, sube las escaleras mas adelante para examinar un cadaver" +
                "y conseguir Alma de cadáver abandonado y abre la puerta con la Llave de la Torre"
        ,"Sube las escaleras en espiral, cruza el puente y sube por el ascensor, sube las escaleras para llegar a la cima y encontrar un cadaver con Alma de Guardiana del Fuego"
        ,"Da media vuelta por donde viniste y bajar por el mismo ascensor, estando de espaldas al ascensor mira a la derecha del puente, salta al bordillo para encontrar un cadaver con" +
                " Túnica de Guardiana del Fuego, Guantes de Guardiana del Fuego, Falda de Guardiana del Fuego",
        "Dejate caer para llegar a bajo del todo y encontrar un cadaver que contiene Anillo de estus",
        "Sal por la puerta para encontrarte con un enemigo, matalo para conseguir la Uchigatana, es probable que te suelte el Atuendo de maestro y Brazales de maestro"
        ,"Un poco mas adelante encontraras un cadaver sobre un arbol, este contiene el Escudo este-oeste, baja por las escaleras de la izquierda para encontrar un Ascua y al final un Hueso de regreso"
        ,"De regreso a la entrada del Santuario encontraras un perro y un cadaver con otro Ascua",
        "Regresa al puente de la torre tirate a los tejados de abajo y acercate al nido para interactuar con el Cuervo, interactua tambien con la escalera para crear un atajo",
        "Desde arriba tirate al tejado inferior, examina el cadaver para conseguir Hueso de regreso x3, Continua y entra al interior del edificio, el cadaver que ves en un borde contiene un Fragmento de estus",
        "Ve a la pared del fondo, es ilusoria, pasa por ella para dejarte caer al fondo y ver un cofre que contiene Anillo de serpiente plateada codiciosa",
        "Ahora cuando estes listo ve a tu hoguera mas cercana y viajar al Gran muro de Lothric"};

        ListView listView=(ListView) view.findViewById(R.id.listaSantuario);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,guia2);

        listView.setAdapter(adapter);
    }
}