package com.example.projectfragment.ui

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.projectfragment.MainActivity
import com.example.projectfragment.R
import com.example.projectfragment.data.MockBooks

class DetailFragment : Fragment() {

    companion object {
        private const val ARG_INDEX = "arg_index"

        fun newInstance(index: Int) = DetailFragment().apply {
            arguments = Bundle().apply { putInt(ARG_INDEX, index) }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_detail, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val idx = arguments?.getInt(ARG_INDEX) ?: -1
        val book = MockBooks.items.getOrNull(idx)

        view.findViewById<TextView>(R.id.tvTitle).text = book?.title ?: "Unknown"
        view.findViewById<TextView>(R.id.tvAuthor).text = "by ${book?.author ?: "-"}"

        view.findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(HomeFragment.newInstance(), addToBackStack = false)
        }
    }
}