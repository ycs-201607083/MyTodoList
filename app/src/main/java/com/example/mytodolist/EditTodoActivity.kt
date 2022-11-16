package com.example.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytodolist.databinding.ActivityEditTodoBinding

private lateinit var bindingEditTodo: ActivityEditTodoBinding
class EditTodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingEditTodo.root)

        
    }
}