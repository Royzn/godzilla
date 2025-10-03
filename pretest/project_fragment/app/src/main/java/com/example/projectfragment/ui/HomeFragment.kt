package com.example.projectfragment.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfragment.MainActivity
import com.example.projectfragment.R
import com.example.projectfragment.adapter.BookAdapter
import com.example.projectfragment.data.MockBooks

class HomeFragment : Fragment() {
    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var bookAdapter: BookAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewBooks)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Initialize adapter with mutable copy of book list
        bookAdapter = BookAdapter(MockBooks.items.toMutableList()) { book, position ->
            // Handle item click here
            (requireActivity() as MainActivity).navigateTo(
                DetailFragment.newInstance(position),
                addToBackStack = true
            )
        }
        recyclerView.adapter = bookAdapter

        val prefs = requireContext().getSharedPreferences("settings", 0)
        val onlyFavorite = prefs.getBoolean("only_favorite", false)
        bookAdapter.filterFavorites(onlyFavorite)

        view.findViewById<View>(R.id.btnOpenSettings).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(
                SettingsFragment.newInstance(),
                addToBackStack = true
            )
        }
    }
}
