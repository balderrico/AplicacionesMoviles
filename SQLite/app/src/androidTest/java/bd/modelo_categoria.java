package bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import sqlite.config.config_db;

public class modelo_categoria {
    private int id_categoria;
    private String nombre_cat;
    private SQLiteDatabase base_datos;

    public modelo_categoria(int id_categoria, String nombre_cat){
        this.id_categoria=0;
        this.nombre_cat="";

    }

    private void inicializar_dv(Context context){
        admin= new base_datos(context, config_db.name_bd,factory.null,config_db.version_bd);
        base_datos = admin.getWriteTableDatabase;

    }

    public int getId_categoria() {
        return id_categoria;

    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;

    }

    public String getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) {
        this.nombre_cat = nombre_cat;

    }

    public boolean save(Context context){
        this.inicializar_dv(context);
        ContentValues valor_objeto = new ContentValues();
        if(this.id_categoria==0){

            //registrar
            valor_objeto.put("id_categoria",this.id_categoria);
            valor_objeto.put("nombre_cat",this.nombre_cat);

            base_datos.insert("categoria",null,valor_objeto);
            base_datos.close();

            return true;
        }else{
            //actualizar
            valor_objeto.put("id_categoria",this.id_categoria);
            valor_objeto.put("nombre_cat",this.nombre_cat);

            int actualizado =  base_datos.update("categoria",valor_objeto,"id_categoria"+this.id_categoria,            null);
            null);

            base_datos.close();
            if(actualizado==1){
                return true;
            }
            return false;

        }
    }

    public void get(Context context,int id_categoria){

        this.inicializar_dv(context);
        String query ="select * from categoria where id_categoria = "+id_categoria;
        //leer de base de datos
        Cursor registro = base_datos.rawQuery(query,null);
        if(registro.moveToFirst()){
            this.id_categoria=registro.getInt(0);
            this.nombre_cat=registro.getString(1);
        }
        base_datos.close();
    }

    public void delete(Context context){
        this.inicializar_dv(context);;
        //eliminar
        int eliminado=base_datos.delete("categoria","id_categoria"+this.id_categoria,null);
        base_datos.close();

        if(eliminado==1){
            this.id_categoria=0;
            this.nombre_cat="";
        }
    }

}





