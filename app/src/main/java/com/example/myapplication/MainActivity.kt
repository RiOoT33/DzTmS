package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

    class MainActivity : AppCompatActivity() {

        var userlist: MutableList<Person> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addUser("Иван", "Иванов",31)
        addUser("Никита", "Иванов",30)
        addUser("костя", "Иванов",43)

        output()
    }
    private fun addUser(name:String,secondName:String, age: Int ){
        val user = Person(name,secondName,age)
        userlist.add(user)
    }
    private fun output(){
    for (user in userlist){
        println(user)
    }
    }
}

