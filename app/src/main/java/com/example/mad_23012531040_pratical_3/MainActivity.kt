package com.example.mad_23012531040_pratical_3


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEdit = findViewById<EditText>(R.id.etEmail)
        val passEdit = findViewById<EditText>(R.id.etPassword)
        val loginBtn = findViewById<Button>(R.id.btnLogin)

        loginBtn.setOnClickListener {
            val email = emailEdit.text.toString()
            val pass = passEdit.text.toString()

            if (email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please enter email & password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
                // TODO: Navigate to next activity if needed
            }
        }
    }
}
