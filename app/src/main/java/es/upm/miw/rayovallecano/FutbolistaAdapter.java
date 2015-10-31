package es.upm.miw.rayovallecano;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

import es.upm.miw.rayovallecano.models.Futbolista;

public class FutbolistaAdapter extends ArrayAdapter<Futbolista> {

    Context _contexto;

    private ArrayList<Futbolista> _futbolistas;

    public FutbolistaAdapter(Context context, ArrayList<Futbolista> futbolistas) {
        super(context, R.layout.layout_listado_futbolista);
        this._futbolistas = futbolistas;
        this._contexto=context;
    }


    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater inflater =
                    (LayoutInflater) _contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_listado_futbolista, null);
        }
    //Como nos interesa la posición
        Futbolista futbolista = this._futbolistas.get(position);
        //tengo el futbolista y tengo la vista solo me queda colocar los datos en su sitio (tengo tres text view y un imageview
        if (futbolista != null){
            TextView tvId = (TextView) convertView.findViewById(R.id.tvFutbolistaId);
            tvId.setText(String.format("%d",futbolista.get_id())); //Inserto el texto, pasándolo a String porque devolvía un integer
        }
        return convertView;
    }
}
