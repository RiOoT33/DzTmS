package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    var userlist: MutableList<Person> = mutableListOf()


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user1 = Person("Ваван", "Иванов", 31)
        val user2 = Person("Антон", "Иванов", 17)
        val user3 = Person("Дима", "Иванов", 43)

        add(user1)
        add(user2)
        add(user3)
        showList()
        deleteByAge()
    }

    private fun add (user: Person) {
        userlist.add(user)
    }
    private fun showList () {
            userlist.sortBy { it.name }
        for (person in userlist) {
            println(toString(person))
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun deleteByAge() {
        userlist.removeIf{ it.age <= 18 }
        for (person in userlist) {
            println(toString(person))
        }
    }

    fun toString(person: Person): String {
        return "Name: ${person.name}  Surname:  ${person.secondName}  Age:  ${person.age}"
    }
}


