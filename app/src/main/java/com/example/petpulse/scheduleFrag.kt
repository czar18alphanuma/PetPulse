package com.example.petpulse

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.random.Random

class scheduleFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        // Retrieve data from arguments
        val name = arguments?.getString("name")
        val gender = arguments?.getString("gender")
        val breed = arguments?.getString("breed")
        val dateOfBirth = arguments?.getString("dateOfBirth")
        val issue = arguments?.getString("issue")
        val preferredVet = arguments?.getString("preferredVet")
        val currentMeds = arguments?.getString("currentMeds")
        val medList = arguments?.getString("medList")
        val lastCheckup = arguments?.getString("lastCheckup")
        val allergies = arguments?.getString("allergies")
        val requestType = arguments?.getString("requestType")
        val urgentExplain = arguments?.getString("urgentExplain")
        val firstName = arguments?.getString("firstName")
        val middleName = arguments?.getString("middleName")
        val lastName = arguments?.getString("lastName")
        val dateOfBirthOwner = arguments?.getString("dateOfBirthOwner")
        val phone = arguments?.getString("phone")
        val secondaryPhone = arguments?.getString("secondaryPhone")
        val primaryAddress = arguments?.getString("primaryAddress")
        val secondaryAddress = arguments?.getString("secondaryAddress")
        val email = arguments?.getString("email")
        val preferredContact = arguments?.getString("preferredContact")

        val linearLayoutContainer = view.findViewById<LinearLayout>(R.id.linearLayoutContainer)

        // Display data
        val textViewInfo = TextView(context)
        textViewInfo.text = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPET INFO\nName: $name\nGender: $gender\n" +
                "Breed: $breed\nDOB: $dateOfBirth\nIssue: $issue\nPreferred Vet: $preferredVet\nMedications (Y/N): $currentMeds\n" +
                "Medications list: $medList\nLast checkup: $lastCheckup\nAllergies: $allergies\nRequest type: $requestType\n" +
                "If urgent explain: $urgentExplain\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tOWNER INFO\n" +
                "First name: $firstName\nMiddle name: $middleName\nLast name: $lastName\nDOB: $dateOfBirthOwner\n" +
                "Phone number: $phone\nSecondary phone number: $secondaryPhone\nPrimary address: $primaryAddress\nSecondary address: $secondaryAddress\n" +
                "Email: $email\nPreferred contact: $preferredContact\n"


        // random appointment
        val appointment = generateRandomAppointment()
        val textViewAppointment = TextView(context)
        textViewAppointment.text = "Appointment: $appointment"



        linearLayoutContainer?.apply {
            addView(textViewInfo)
            addView(textViewAppointment)
        }

        val homeButton = view.findViewById<Button>(R.id.homeButton)
        homeButton.setOnClickListener {
            activity?.finish()
        }

        return view
    }

    private fun generateRandomAppointment(): String {
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        val times = arrayOf("9:00 AM", "11:00 AM", "2:00 PM", "4:00 PM")
        val day = days[Random.nextInt(days.size)]
        val time = times[Random.nextInt(times.size)]
        return "$day at $time"
    }
}
