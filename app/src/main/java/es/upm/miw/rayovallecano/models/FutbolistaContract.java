package es.upm.miw.rayovallecano.models;

import android.provider.BaseColumns;

/**
 * Created by bm0822 on 30/10/2015.
 */
public abstract class FutbolistaContract {

    public static class tablaFutbolista implements BaseColumns {

        public static final String TABLE_NAME= "futbolistas";

        public static  final String COL_NAME_ID = _ID;
        public static final String COL_NAME_NOMBRE=  "nombre";
        public static final String COL_NAME_DORSAL=  "dorsal";
        public static final String COL_NAME_LESIONADO=  "lesionado";
        public static final String COL_NAME_EQUIPO=  "equipo";
        public static final String COL_NAME_URL=  "url_imagen";
    }





}
