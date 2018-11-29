package br.com.paulosalvatore.ocean_android_sptw18

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEnviar.setOnClickListener {
            val nome = etNome.text.toString()
            val sobrenome = etSobrenome.text.toString()

            if (nome == "") {
                etNome.error = "Por favor, digite o seu nome"
            } else if (sobrenome == "") {
                etSobrenome.error = "Por favor, digite o seu sobrenome"
            } else {
                tvResultado.text = "$nome $sobrenome"
            }
        }
    }
}
