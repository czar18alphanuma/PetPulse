package com.example.petpulse

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToFragment = findViewById<Button>(R.id.btnGoToFragment)
        btnGoToFragment.setOnClickListener {
            navigateToBlankFragment()
        }
    }

    private fun navigateToBlankFragment() {
        val fragment = BlankFragment()
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
