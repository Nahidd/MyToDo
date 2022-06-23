package com.tanvir.training.todoappbatch04.daos

import androidx.room.*
import com.tanvir.training.todoappbatch04.entities.UserModel

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(userModel: UserModel) : Long

    @Delete
    suspend fun deleteUser(userModel: UserModel)

    @Update
    suspend fun updateUser(userModel: UserModel)

    @Query("select * from tbl_user where email = :email")
    suspend fun getUserByEmail(email: String) : UserModel?
}