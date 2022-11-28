package com.ks.guiadedarksoulsiii;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Hechizos extends AppCompatActivity {

    private ListView mListView;
    private List<ModeloHechizos> Lista = new ArrayList<>();
    HechizosAdapter hechizosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechizos);

        getWindow().setStatusBarColor(Color.parseColor("#B80B06"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#B80B06")));
        getSupportActionBar().setTitle("Hechizos");

        mListView = findViewById(R.id.listView);

        Lista.add(new ModeloHechizos("Afinidad","Karla en 15.000 almas",
                "1","32","45",R.drawable.afinidad));
        Lista.add(new ModeloHechizos("Arma Magica","Yoel y Yuria de Londor por 4.500 almas","1","10",
                "25",R.drawable.amagica));
        Lista.add(new ModeloHechizos("Arma mágica de cristal","Orbeck por 10.000 almas despues de entregarle Pergamino de cristal","1",
                "30","50",R.drawable.amagicacristal));
        Lista.add(new ModeloHechizos("Arma oculta", "Orbeck por 1.500 almas despues de entregarle Pergamino dorado","1","12",
                "25",R.drawable.armaoculta));
        Lista.add(new ModeloHechizos("Asustar","Orbeck por 2.000 almas","1","10","15",R.drawable.asustar));
        Lista.add(new ModeloHechizos("Camaleón","Matar al peregrino en Iglesia de Yorska, Irithyll del Valle Boreal","1","12",
                "20",R.drawable.camaleon));
        Lista.add(new ModeloHechizos("Corriente de almas","Cadaver en el Gran Archivo","2","45","60",
                R.drawable.corrientealmas));
        Lista.add(new ModeloHechizos("Cuerpo oculto","Orbeck por 3.000 despues de entregarle Pergamino dorado","1","15",
                "15",R.drawable.cuerpoculto));
        Lista.add(new ModeloHechizos("Dardo de Farron","Orbeck por 500 almas","1","8","3",R.drawable.dardofarron));
        Lista.add(new ModeloHechizos("Escudo magico","Orbeck por 3.000 almas","1","10","30",R.drawable.escudomagico));
        Lista.add(new ModeloHechizos("Espada brillante de Farron","Orbeck por 3.000 almas","1","23","5",
                R.drawable.espadafarron));
        Lista.add(new ModeloHechizos("Espadon de alma","Orbeck 5.000 almas","1","22","28",R.drawable.espadonalma));
        Lista.add(new ModeloHechizos("Filo oscuro","Karla por 8.000 almas","1","30","33",R.drawable.filoscuro));
        Lista.add(new ModeloHechizos("Flecha de alma","Orbeck por 1.000 almas","1","10","7",R.drawable.flechalma));
        Lista.add(new ModeloHechizos("Flecha de alma pesada","Orbeck por 3.000, Yuria por 2.000 almas","1","13","11",R.drawable.flechalmapesada));
        Lista.add(new ModeloHechizos("Gran alma profunda","recompensa de juramento Fiel Aldrich, 10 residuos humanos","1","20","11",R.drawable.granalmaprofunda));
        Lista.add(new ModeloHechizos("Gran arma magica","cadaver en Torreon de Farron","1","15","35",R.drawable.granarmamagica));
        Lista.add(new ModeloHechizos("Gran dardo de Farron","Orbeck por 2.000 almas despues de entregarle Pergamino de sabio","1","23","4",R.drawable.grandardof));
        Lista.add(new ModeloHechizos("Gran escudo magico","drop de los gusanos en celdas de la Mazmorra de Irithyll","1","18","45",R.drawable.granescudom));
        Lista.add(new ModeloHechizos("Granizo de Farron","Orbeck por 5.000 almas despues de entregarle Pergamino de sabio","1","28","4",R.drawable.granizof));
        Lista.add(new ModeloHechizos("Gran flecha de alma","Orbeck por 3.000 almas","1","15","11",R.drawable.granflechalma));
        Lista.add(new ModeloHechizos("Gran flecha de alma pesada","Orbeck por 4.000 almas","1","18","14",R.drawable.granflechalmapesada));
        Lista.add(new ModeloHechizos("Lanza de alma","Orbeck por 5.000 almas despues de entregarle Pergamino de Logan","1","32","40",R.drawable.lanzalma));
        Lista.add(new ModeloHechizos("Lanza de alma de cristal","Orbeck por 10.000 almas despues de entregarle Pergamino de cristal","1","48","55",R.drawable.lanzalmacristal));
        Lista.add(new ModeloHechizos("Lanzar luz","Orbeck por 1.000 almas despues de entregarle Pergamino dorado","1","15","20",R.drawable.lanzarluz));
        Lista.add(new ModeloHechizos("Masa de alma de cristal dirigida","Orbeck por 18.000 almas despues de entregarle Pergamino de cristal","1","30","53",R.drawable.masalma));
        Lista.add(new ModeloHechizos("Masa de alma dirigida","Orbeck por 6.000 almas despues de entregarle Pergamino de Logan","1","20","20",R.drawable.masalmadirigida));
        Lista.add(new ModeloHechizos("Mercurio pestilente","Orbeck por 1.000 almas despues de entregarle Pergamino de sabio","1","30","17",
                R.drawable.mercurio));
        Lista.add(new ModeloHechizos("Muro de luz retorcido","Orbeck por 6.000 almas despues de entregarle pergamino dorado","1","27","10",
                R.drawable.muroluz));
        Lista.add(new ModeloHechizos("Reparar","Orbeck por 2.000 alamas despues de entregarle Pergamino dorado","1","15","20",R.drawable.reparar));
        Lista.add(new ModeloHechizos("Señuelo auditivo","Orbeck por 2.000 almas","1","18","15",R.drawable.senuelo));

        hechizosAdapter = new HechizosAdapter(Hechizos.this,R.layout.item_row_hechizos,Lista);

        mListView.setAdapter(hechizosAdapter);
    }
}