package com.example.projectfragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Switch
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.projectfragment.MainActivity
import com.example.projectfragment.R

class SettingsFragment : Fragment() {

    companion object {
        fun newInstance() = SettingsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_settings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val prefs = requireContext().getSharedPreferences("settings", 0)
        val editor = prefs.edit()

        val switchOnlyFavorite = view.findViewById<Switch>(R.id.switchOnlyFavorite)
        switchOnlyFavorite.isChecked = prefs.getBoolean("only_favorite", false)

        switchOnlyFavorite.setOnCheckedChangeListener { _, isChecked ->
            editor.putBoolean("only_favorite", isChecked)
            editor.apply()
            Toast.makeText(requireContext(), "Only Favorite: $isChecked saved", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(HomeFragment.newInstance(), addToBackStack = false)
        }
    }
}