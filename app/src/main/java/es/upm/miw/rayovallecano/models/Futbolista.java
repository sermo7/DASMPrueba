package es.upm.miw.rayovallecano.models;

/**
 * Created by bm0822 on 30/10/2015.
 */
public class Futbolista {

    private int _id;
    private String  _nombre;
    private int _dorsal;
    private boolean _lesionado;
    private String _equipo;
    private String _url_imagen;

    public int get_dorsal() {
        return _dorsal;
    }

    public void set_dorsal(int _dorsal) {
        this._dorsal = _dorsal;
    }

    public String get_equipo() {
        return _equipo;
    }

    public void set_equipo(String _equipo) {
        this._equipo = _equipo;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public boolean is_lesionado() {
        return _lesionado;
    }

    public void set_lesionado(boolean _lesionado) {
        this._lesionado = _lesionado;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_url_imagen() {
        return _url_imagen;
    }

    public void set_url_imagen(String _url_imagen) {
        this._url_imagen = _url_imagen;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "_dorsal=" + _dorsal +
                ", _id=" + _id +
                ", _nombre='" + _nombre + '\'' +
                ", _lesionado=" + _lesionado +
                ", _equipo='" + _equipo + '\'' +
                ", _url_imagen='" + _url_imagen + '\'' +
                '}';
    }

    public Futbolista(int _dorsal, String _equipo, int _id, boolean _lesionado, String _nombre, String _url_imagen) {
        this._dorsal = _dorsal;
        this._equipo = _equipo;
        this._id = _id;
        this._lesionado = _lesionado;
        this._nombre = _nombre;
        this._url_imagen = _url_imagen;
    }
}
