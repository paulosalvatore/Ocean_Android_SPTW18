package br.com.paulosalvatore.ocean_android_sptw18

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

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

                /*val intent = Intent(this, DetalhesActivity::class.java)
                intent.putExtra("nome_completo", "$nome $sobrenome")
                startActivity(intent)*/
                startActivity<DetalhesActivity>("nome_completo" to "$nome $sobrenome")
            }
        }
    }
}
