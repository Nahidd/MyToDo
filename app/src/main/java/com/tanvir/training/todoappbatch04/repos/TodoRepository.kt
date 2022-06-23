package com.tanvir.training.todoappbatch04.repos

import androidx.lifecycle.LiveData
import com.tanvir.training.todoappbatch04.daos.TodoDao
import com.tanvir.training.todoappbatch04.entities.TodoModel

class TodoRepository(val todoDao: TodoDao) {

    suspend fun insertTodo(todoModel: TodoModel): Long {
        return todoDao.insertTodo(todoModel)
    }

    fun getTodoByUserId(userId: Long) = todoDao.getTodosByUserId(userId)
    fun getTODoById(id: Long): LiveData<TodoModel> = todoDao.getTodosById(id)

    fun getTodoByStatusUserId(userId: Long, status: Int) =
        todoDao.getTodosByStatusAndUserId(userId, status)

    fun getTodosByPriorityAndUserId(userId: Long, priority: String) =
        todoDao.getTodosByPriorityAndUserId(userId, priority)

    suspend fun updateTodo(todoModel: TodoModel) = todoDao.updateTodo(todoModel)

    suspend fun deleteTodo(todoModel: TodoModel) = todoDao.deleteTodo(todoModel)


}