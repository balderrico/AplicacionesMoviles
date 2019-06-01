package bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class basededatos extends SQLiteOpenHelper {


    public basededatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        for(int i=0; i<5;i++){


        }

        String table_autor = "CREATE TABLE autor("+
                "pk_autor INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nombre varchar(100) not null," +
                "primer_apellido varchar(100) not null,"+
                "segundo_apellido varchar(100) not null," +
                "FOREIGN KEY (pk_autor) REFERENCES autor(pk_autor)"+
                ");";

        db.execSQL(table_autor);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
