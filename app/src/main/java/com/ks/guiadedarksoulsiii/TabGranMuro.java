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

public class TabGranMuro extends Fragment {


    public TabGranMuro() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tab_gran_muro, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] guia3={"Al utilizar el viaje rapido no estaras frente a ninguna hoguera, asi que sal por la puerta doble, baja las escaleras y " +
                "ahí estará la hoguera Gran muro de Lothric"
        ,"Desde la hoguera ve por la derecha bajando las escaleras, cuidado con los enemigos(elimina a los enemigos que se transforman si no quieres pasarlo mal), " +
                "aqui encontraras un cadaver con Arco largo y Flecha normal x12"
        ,"Baja de la torre, en las escaleras de la derecha hay una puerta que no puedes abrir, tambien encontraras un cadaver con Alma de cadáver abandonado",
        "Regresa a la hoguera y baja por las escaleras contrarias donde habrán mas enemigos y por la parte izquierda un cadaver con otra Alma de cadáver abandonado",
        "Por el cadaver del dragon ve por la izquierda de las escaleras y sube las escaleras llegando al cuerpo del dragon, despeja la zona, sube por las escaleras de " +
                "la izquierda, elimina a al enemigo y examina el cadaver junto a la puerta cerrada para conseguir los Binoculares",
        "Por el dragon dejate caer por un hueco en la pared, pasa por la puerta y examina el cadaver del bordillo que contiene Resina de pino dorada x2",
        "Entra en la habitacion, despeja la zona y examina el cadaver que contiene Bomba incendiaria x2, baja por las escaleras del centro para encontrar otro cadaver " +
                "con un Alma de cadáver abandonado y sal por la puerta al exterior",
        "Al salir elimina a los enemigos que esten mas cerca y sube por las escaleras, aparecera un enorme dragon el cual se encargara de eliminar a los demas enemigos por ti, " +
                "golpea al dragon con el arco que agarraste anteriormente desde una posicion segura hasta que se marche",
        "Cuando se marche recibiras un Fragmento grande de titanita, sube por la zona, lootea a los enemigos muertos y tambien un cadaver que contiene el arma Claymore",
        "Pasa por la puerta del extremo de la zona, baja las escaleras, veras un cofre al fondo, CUIDADO que es un Mimico, derrotalo para obtener Hacha de guerra profunda",
        "Sube por las escaleras y abre la puerta para salir, limpia la zona y cuidado con el caballero, examina el cadaver del lado izquierdo que contiene un Alma de cadáver abandonado",
        "Por la puerta del fondo encontraras un enemigo, encontraras un cadaver en la viga, examinalo para obtener Bomba incendiaria x3",
        "Pasa por la puerta del lado, sube las escaleras y encontraras la hoguera Torre del muro, enciendela y recoge el Fragmento de titanita del cadaver de la esquina",
        "Regresa a la sala, baja las escaleras, elimina a los enemigos y baja otra escalera, ahi encontraras un enemigo y una puerta que no podras abrir, en la sala de los barriles " +
                "encontraras un cadaver con Cuchillo arrojadizo x8, elimina a los enemigos y en la siguiente sala encontraras la espada Rompemalla en un cadaver",
        "Baja las escaleras, entra a la sala y encontraras una celda, en ella se encuentra Greirat pero necesitas la Llave de celda, asi que vuelve por donde viniste, sube por la escalera y " +
                "abre la puerta que da al exterior, a la derecha hay un cadaver con un Alma de cadáver abandonado",
        "Sube por las pequeñas escaleras y baja hasta los tejados, elimina a los enemigos que se transforman, examina el cadaver para obtener Bomba incendiaria x3. Mas adelante en el bordillo" +
                "hay otro cadaver con Gran alma de cadáver abandonado, tambien veras un lagarto de cristal",
        "Baja por la escalera del tejado, cerca encontraras un cadaver en la barandilla que contiene Bomba incendiaria x3 y en la izquierda otro cadaver con Bomba incendiaria negra x3",
        "Ve al interior del edificio por la puerta, elimina al caballero, pasa por la puerta, a la izquierda veras unas tinajas grandes, rompelas para encontrar un enemigo y un cadaver " +
                "con Amuleto de cazador no muerto x2, sube las escaleras y en la sala veras un cadaver con Fragmento de titanita",
        "Regresa a la parte donde estaba el caballero con la lanza y en una esquina habrá un cadaver con Alma de cadáver abandonado",
        "Pasa por la puerta del fondo, en la pasarela de madera por la izquierda aparecerá un enemigo, entra en esa sala y encontraras un cadaver detras de unas cajas, examinalo para obtener Espada ancha",
        "Sal de la sala y en la pasarela por la izquierda baja las escaleras, pasando la puerta entraras en una habitacion con enemigos, ve a la pequeña sala de enfrente para encontrar un enemigo y " +
                "un cofre con el Escudo de águila de plata",
        "Despues de despejar la sala, sobre la mesa encontraras un Fragmento de estus y detras de unas cajas por la escalera que bajaste encontraras un Fragmento de titatina",
        "Baja por las escaleras del fondo y encontraras un cadaver con la Llave de celda. Ahora si puedes ir donde Greirat y hablarle",
        "Luego de hablar con Greirat, regresa a la zona de antes y sube por las escaleras, llegando a la pasarela de madera de antes, ve al otro lado, antes de pasar a la habitacion rompe las cajas de la " +
                "izquierda, al fondo se encuentra un cadaver con Flor verde x2, rompe las cajas y dejate caer para encontrar un cofre con la Espada recta de Astora",
        "Ahora ve a la sala donde te habias encontrado con el caballero, sal afuera y ve por la derecha, baja por la escalera del borde, elimina a los enemigos, " +
                "en los cadaveres del centro hay un Ascua en cada uno, en el de la esquina de la parte baja encontraras el arma Estoque",
        "Pasando la puerta, a la izquierda hay un cadaver con Alma de cadáver abandonado, sube las escaleras de la derecha, elimina a los enemigos",
        "Ahora veras dos escaleras, sube primero por la derecha y recoge Gran alma de cadáver abandonado, salta al tejado para conseguir Anillo de sacrificio",
        "Dejate caer al patio, sube la otra escalera, cuidado con el grupo de enemigos, ahora si das media vuelta, junto a la puerta de donde viniste hay un cadaver con Flor verde x3",
        "Pasa por la puerta del fondo, sube por el ascensor, entre las cajas encontraras Cuchillo arrojadizo x6",
        "Abre la puerta cerrada para salir al exterior, veras un enemigo con hacha, regresa al patio tras la plaza de los cadáveres y elimina a los 2 caballeros",
        "Entra en el edificio para hablar con Emma, ella te dará el Estandarte peq. de Lothric y tambien te permitirá unirte al juramento de la Senda azul",
        "Sal de la catedral, sube por las escaleras de la derecha, elimina al caballero de capa azul para conseguir Gema refinada, por las escaleras de la izquierda encontraras un enemigo y " +
                "el arma Lucerne",
        "Sigue bajando por las escaleras de la izquierda donde llegaras a una puerta doble roja para enfrentarte al jefe Vordt del Valle Boreal",
        "Despues de eliminar al jefazo enciende la hoguera Vordt del Valle Boreal y pasa por la puerta. Acercate al bordillo y elige la opcion Alzar estandarte y ser llevado a la siguiente zona, " +
                "Asentamiento de no muertos"};

        ListView listView=(ListView) view.findViewById(R.id.listaGranMuro);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,guia3);

        listView.setAdapter(adapter);
    }
}