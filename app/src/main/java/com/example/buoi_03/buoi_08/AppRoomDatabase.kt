package com.example.buoi_03.buoi_08

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(UserProfile::class), version = 1)
class AppRoomDatabase {
    abstract class AppDatabase : RoomDatabase() {
        abstract fun UserProfileDAO(): UserProfileDAO

        companion object {
            @Volatile
            private var INSTANCE: AppDatabase? = null

            fun getDatabase(context: Context): AppDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "user_database"
                    ).build()
                    INSTANCE = instance
                    instance
                }
            }
        }
    }
}