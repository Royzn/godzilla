package com.example.projectfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfragment.R
import com.example.projectfragment.data.Book

class BookAdapter(
    private val books: MutableList<Book>,
    private val onItemClick: (Book, Int) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    private val fullList: List<Book> = books.toList() // immutable full list copy
    private var filteredBooks: MutableList<Book> = fullList.toMutableList()

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle: TextView = itemView.findViewById(R.id.textTitle)
        val textAuthor: TextView = itemView.findViewById(R.id.textAuthor)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(books[position], position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_card, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int = filteredBooks.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = filteredBooks[position]
        holder.textTitle.text = book.title
        holder.textAuthor.text = book.author
    }

    fun filterFavorites(showOnlyFavorites: Boolean) {
        filteredBooks = if (showOnlyFavorites) {
            fullList.filter { it.isFavorite }.toMutableList()
        } else {
            fullList.toMutableList()
        }
        notifyDataSetChanged()
    }
}
