package com.example.petpulse

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class BlankFragment : Fragment() {

    private val TAG = "BlankFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)

        //EditText fields
        val editTextName = view.findViewById<EditText>(R.id.editTextName)
        val editTextGender = view.findViewById<EditText>(R.id.editTextGender)
        val editTextBreed = view.findViewById<EditText>(R.id.editTextBreed)
        val editTextDateOfBirthPet = view.findViewById<EditText>(R.id.editTextDateOfBirthPet)
        val editTextIssue = view.findViewById<EditText>(R.id.editTextIssue)
        val editTextPreferredVet = view.findViewById<EditText>(R.id.editTextPreferredVet)
        val editTextCurrentMeds = view.findViewById<EditText>(R.id.editTextCurrentMeds)
        val editTextMedList = view.findViewById<EditText>(R.id.editTextMedList)
        val editTextLastCheckup = view.findViewById<EditText>(R.id.editTextLastCheckup)
        val editTextAllergies = view.findViewById<EditText>(R.id.editTextAllergies)
        val editTextRequestType = view.findViewById<EditText>(R.id.editTextRequestType)
        val editTextUrgentExplain = view.findViewById<EditText>(R.id.editTextUrgentExplain)
        val editTextFirstName = view.findViewById<EditText>(R.id.editTextFirstName)
        val editTextMiddleName = view.findViewById<EditText>(R.id.editTextMiddleName)
        val editTextLastName = view.findViewById<EditText>(R.id.editTextLastName)
        val editTextDateOfBirthOwner = view.findViewById<EditText>(R.id.editTextDateOfBirthOwner)
        val editTextPhone = view.findViewById<EditText>(R.id.editTextPhone)
        val editTextSecondaryPhone = view.findViewById<EditText>(R.id.editTextSecondaryPhone)
        val editTextPrimaryAddress = view.findViewById<EditText>(R.id.editTextPrimaryAddress)
        val editTextSecondaryAddress = view.findViewById<EditText>(R.id.editTextSecondaryAddress)
        val editTextEmail = view.findViewById<EditText>(R.id.editTextEmail)
        val editTextPreferredContact = view.findViewById<EditText>(R.id.editTextPreferredContact)


        // Button to ScheduleFragment
        val btnGoToFragmentSchedule = view.findViewById<Button>(R.id.btnGoToFragmentSchedule)
        btnGoToFragmentSchedule.setOnClickListener {


            // Capture user input
            val bundle = Bundle()
            bundle.putString("name", editTextName.text.toString())
            bundle.putString("gender", editTextGender.text.toString())
            bundle.putString("breed", editTextBreed.text.toString())
            bundle.putString("dateOfBirth", editTextDateOfBirthPet.text.toString())
            bundle.putString("issue", editTextIssue.text.toString())
            bundle.putString("preferredVet", editTextPreferredVet.text.toString())
            bundle.putString("currentMeds", editTextCurrentMeds.text.toString())
            bundle.putString("medList", editTextMedList.text.toString())
            bundle.putString("lastCheckup", editTextLastCheckup.text.toString())
            bundle.putString("allergies", editTextAllergies.text.toString())
            bundle.putString("requestType", editTextRequestType.text.toString())
            bundle.putString("urgentExplain", editTextUrgentExplain.text.toString())
            bundle.putString("firstName", editTextFirstName.text.toString())
            bundle.putString("middleName", editTextMiddleName.text.toString())
            bundle.putString("lastName", editTextLastName.text.toString())
            bundle.putString("dateOfBirthOwner", editTextDateOfBirthOwner.text.toString())
            bundle.putString("phone", editTextPhone.text.toString())
            bundle.putString("secondaryPhone", editTextSecondaryPhone.text.toString())
            bundle.putString("primaryAddress", editTextPrimaryAddress.text.toString())
            bundle.putString("secondaryAddress", editTextSecondaryAddress.text.toString())
            bundle.putString("email", editTextEmail.text.toString())
            bundle.putString("preferredContact", editTextPreferredContact.text.toString())


            val fragment = scheduleFrag()
            fragment.arguments = bundle
            navigateToScheduleFrag(fragment)
        }

        return view
    }

    private fun navigateToScheduleFrag(fragment: Fragment) {
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
