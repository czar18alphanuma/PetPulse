package com.example.petpulse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)

        // Button to ScheduleFragment
        val btnGoToFragmentSchedule = view.findViewById<Button>(R.id.btnGoToFragmentSchedule)
        btnGoToFragmentSchedule.setOnClickListener {
            navigateToScheduleFragment()
        }

        return view
    }

    private fun navigateToScheduleFragment() {
        val fragment = scheduleFrag()
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container2, fragment) // container ID needed
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
