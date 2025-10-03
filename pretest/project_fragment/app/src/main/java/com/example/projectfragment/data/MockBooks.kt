package com.example.projectfragment.data

data class Book(val title: String, val author: String, val isFavorite: Boolean = false)

object MockBooks {
    val items: List<Book> = listOf(
        Book("Effective Java", "Joshua Bloch"),
        Book("Head First Kotlin", "Dawn Griffiths"),
        Book("Android Programming: The Big Nerd Ranch Guide", "Bill Phillips & Chris Stewart")
    )
}