package com.example.booksale.features.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = CustomerPojo.class, version = 1)
public abstract class Databases extends RoomDatabase {
    private static Databases instance;
    private static final String DB_NAME = "StudentDatabase";

    public static synchronized Databases getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, Databases.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
