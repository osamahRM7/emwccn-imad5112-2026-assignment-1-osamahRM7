package com.example.mealbox

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1. Link the UI components from the XML
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val suggestionText = findViewById<TextView>(R.id.suggestionText)


        // 2. Set up the Suggest Button Logic
        btnSuggest.setOnClickListener {
            val input = timeInput.text.toString().trim().lowercase()


            // Logging for the assignment requirement
            Log.d("SocialSparks", "User entered: $input")

            // Social Spark Logic using if/else
            if (input == "morning") {
                suggestionText.text = "Send a 'Good morning' text to a family member."
            } else if (input == "mid-morning") {
                suggestionText.text = "Reach out to a colleague with a quick 'Thank you'."
            } else if (input == "afternoon") {
                suggestionText.text = "Share a funny meme or interesting link with a friend."
            } else if (input == "mid-afternoon") {
                suggestionText.text = "Send a quick 'thinking of you' message."
            } else if (input == "dinner") {
                suggestionText.text = "Call a friend or relative for a 5-minute catch-up"
            } else if (input == "night" ) {
                suggestionText.text = "Leave a thoughtful comment on a friend's post"
            } else {
                // Error Handling Requirement
                suggestionText.text = "Please enter a valid time (e.g. morning, dinner)"
                Log.w("SocialSparks", "Invalid input received: $input")
            }
        }

        // 3. Set up the Reset Button
        btnReset.setOnClickListener {
            timeInput.text.clear()
            suggestionText.text = ""
            Log.d("SocialSparks", "App Reset")
        }
    }
}