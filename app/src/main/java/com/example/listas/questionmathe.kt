package com.example.listas
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.listas.R
class questionmathe: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questionmathe)
        val result1 = findViewById<CheckBox>(R.id.check1)
        val result2 = findViewById<CheckBox>(R.id.check2)
        val result3 = findViewById<CheckBox>(R.id.check3)

        val button = findViewById<Button>(R.id.qualify)
        button.setOnClickListener {
            var selection = ""
            if (result1.isChecked) {
                selection += " Respuesta Correcta " + " Calificacion :10/10"
            }
            if (result2.isChecked) {
                selection += " INCORRECTO " + " Calificacion : 0/10"
            }
            if (result3.isChecked) {
                selection += " INCORRECTO " + " Calificacion :0/10"
            }

            if (selection.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "No ha seleccionado la respuesta",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                // You can add logic here to handle the selected answer,
                // for example, display it in a TextView
                Toast.makeText(applicationContext, "Selección: $selection", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, materias::class.java)
                startActivity(intent)
            }
        }
    }
}