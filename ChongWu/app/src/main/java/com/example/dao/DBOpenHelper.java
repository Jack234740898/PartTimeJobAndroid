package com.example.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {
    
    private static final int VERSION = 1;
    private static final String DBNAME = "account.db";
    
    public DBOpenHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        
        String userSql = "create table tb_user (user varchar(20),password varchar(20))";
        db.execSQL(userSql);
        
        String secneSql = "create table tb_scene (name text, describe text, drawableName text)";
        db.execSQL(secneSql);
    
        String foodSql = "create table tb_food (name text, describe text, drawableName text)";
        db.execSQL(foodSql);
    
        String arcSql = "create table tb_architecture (name text, describe text, drawableName text)";
        db.execSQL(arcSql);
    
        String chongwuSql = "create table tb_chongwu (name text, type text, size text)";
        db.execSQL(chongwuSql);
    
        String shangjiaSql = "create table tb_shangjia (name text, address text, phone text)";
        db.execSQL(shangjiaSql);
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    
    }
}
