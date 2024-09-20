package com.example.buoi_03.buoi_08

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


//su dung QUERY va cap nhat du lieu
@Dao
interface UserProfileDAO {
    //lay tat ca du lieu da luu trong database
    @Query("Select * from userprofile order by id asc")
    fun getAllUser(): List<UserProfile>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user: UserProfile)

    @Query("Delete from userprofile")
    suspend fun deleteALl()

    @Update
    suspend fun update(user: UserProfile)
}