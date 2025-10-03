package com.example.projectfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projectfragment.ui.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            navigateTo(HomeFragment.newInstance(), addToBackStack = false)
        }
    }

    fun navigateTo(fragment: Fragment, addToBackStack: Boolean = true) {
        val tx = supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)

        if (addToBackStack) {
            tx.addToBackStack(fragment::class.java.simpleName)
        }
        tx.commit()
    }
}