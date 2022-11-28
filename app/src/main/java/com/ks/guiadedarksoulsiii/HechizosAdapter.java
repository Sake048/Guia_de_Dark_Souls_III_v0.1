package com.ks.guiadedarksoulsiii;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class HechizosAdapter extends ArrayAdapter<ModeloHechizos> {

    private List<ModeloHechizos> mList;
    private Context mContext;
    private int resourceLayout;

    public HechizosAdapter(@NonNull Context context, int resource, @NonNull List<ModeloHechizos> objects) {
        super(context, resource, objects);
        this.mList = objects;
        this.mContext = context;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null)
            view = LayoutInflater.from(mContext).inflate(resourceLayout, null);

        ModeloHechizos modelo = mList.get(position);

        ImageView imagen = view.findViewById(R.id.imageView);
        imagen.setImageResource(modelo.getImage());

        TextView textoNombre = view.findViewById(R.id.txtNombre);
        textoNombre.setText(modelo.getNombre());

        TextView textoObtencion = view.findViewById(R.id.txtObtencion);
        textoObtencion.setText("Obtencion: "+modelo.getObtencion());

        TextView textoEspacios = view.findViewById(R.id.txtEspacios);
        textoEspacios.setText("Espacios: "+modelo.getObtencion());

        TextView textoInteligenciaN = view.findViewById(R.id.txtInteligenciaN);
        textoInteligenciaN.setText("Inteligencia necesaria: "+modelo.getInteligenciaNece());

        TextView textoCostePC = view.findViewById(R.id.txtCostePC);
        textoCostePC.setText("Coste en PC: "+modelo.getCostePC());

        return view;
    }
}
