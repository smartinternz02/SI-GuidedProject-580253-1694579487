package com.example.assignment1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color // Import Color class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER_VERTICAL  // Center vertically
        layout.setPadding(16, 16, 16, 16)

        val titleTextView = TextView(this)
        titleTextView.text = "                     Login"
        titleTextView.textSize = 30f
        titleTextView.setTextColor(Color.BLUE) // Set text color to dark blue
        layout.addView(titleTextView)

        val emailEditText = EditText(this)
        emailEditText.hint = "Enter your email"
        val emailLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        emailLayoutParams.topMargin = 24  // Add a gap
        emailEditText.layoutParams = emailLayoutParams
        layout.addView(emailEditText)

        val passwordEditText = EditText(this)
        passwordEditText.hint = "Enter password"
        passwordEditText.inputType = android.text.InputType.TYPE_CLASS_TEXT or
                android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
        val passwordLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        passwordLayoutParams.topMargin = 16  // Add a gap
        passwordEditText.layoutParams = passwordLayoutParams
        layout.addView(passwordEditText)

        val loginButton = Button(this)
        loginButton.text = "Login"
        loginButton.textSize = 20f
        val loginButtonLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        loginButtonLayoutParams.topMargin = 32  // Add a gap
        loginButtonLayoutParams.gravity = Gravity.CENTER_HORIZONTAL  // Center horizontally
        loginButton.layoutParams = loginButtonLayoutParams
        loginButton.setBackgroundColor(Color.BLUE) // Set background color to dark blue
        loginButton.setTextColor(Color.WHITE) // Set text color to white
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Perform login logic here
            if (email == "your@email.com" && password == "yourpassword") {
                // Successful login
            } else {
                // Invalid credentials
            }
        }
        layout.addView(loginButton)

        setContentView(layout)
    }
}
