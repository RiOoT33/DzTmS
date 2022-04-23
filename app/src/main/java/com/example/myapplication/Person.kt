package com.example.myapplication

   data class Person( val   name:String, val secondName:String,val  age: Int) : Comparable<Person> {
      override fun compareTo(other: Person): Int = name.compareTo(other.name)
      override fun toString(): String = "$name ($secondName,$age)"
   }
