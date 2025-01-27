package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TEXT = "text_to_display"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bouton : Button = findViewById(R.id.button)
        val bouton2 : Button = findViewById(R.id.button2)
        val textView : TextView = findViewById(R.id.textView)
        val editText : EditText = findViewById(R.id.editTextText)

        var texteValide = ""

        bouton.setOnClickListener{
            val texteSaisi = editText.text.toString()
            textView.text = texteSaisi
            if (texteSaisi.isNotBlank()){
                texteValide = texteSaisi
            }
        }

        bouton2.setOnClickListener {
            if (texteValide != ""){
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(EXTRA_TEXT, texteValide)
                startActivity(intent)
            }
        }

    }
}