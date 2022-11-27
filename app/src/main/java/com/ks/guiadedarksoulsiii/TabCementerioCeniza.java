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

import java.sql.Array;

public class TabCementerioCeniza extends Fragment{

    public TabCementerioCeniza() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_cementerio_ceniza, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] guia1={"Al comenzar dirigete a la derecha, al fondo encontraras un cadaver con un Alma de cadáver abandonado"
                ,"Lootea el cuerpo en la fuente para obtener el Frasco de estus de ceniza"
                ,"Desde la fuente ve a la derecha, al final encontraras un lagarto de cristal si lo derrotas puedes conseguir una Escama de titanita" +
                " y en el cadaver de al fondo encontraras un Alma de viajero desconocido"
                ,"Regresa a la fuente, ve por las escaleras de la izquierda sigue hasta encontrar la primera hoguera Cementerio de Ceniza," +
                " enciendela y descansa para conseguir el gesto Descansar"
                ,"Desde la hoguera ve todo recto para saltar por el bordillo, en el encontraras un cadaver con un Fragmento de titanita"
                ,"Da media vuelta para ir por el camino del acantilado, cuidado con los enemigos, en esa zona encontraras un cadaver que contiene Bomba incendiaria x5"
                ,"Cuando estes listo pasa por el arco y veras al primer jefazo Iudex Gundyr, matalo para recibir Espada en espiral, " +
                "al matarlo podras descansar en la hoguera Iudex Gundyr"
                ,"Abre el porton del fondo y examina el cadaver junto a las lapidas para conseguir una Espada recta rota, ve por el camino inferior para encontrar" +
                " un cadaver al fondo que contiene un Hueso de regreso"
        };

        ListView listView=(ListView) view.findViewById(R.id.listaCementerio);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,guia1);

        listView.setAdapter(adapter);
    }
}