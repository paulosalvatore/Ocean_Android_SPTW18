package br.com.paulosalvatore.ocean_android_sptw18

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detalhes.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.design.longSnackbar
import org.jetbrains.anko.longToast
import org.jetbrains.anko.noButton
import org.jetbrains.anko.yesButton


class DetalhesActivity : AppCompatActivity() {

	val imagem_url = "https://img.global.news.samsung.com/br/wp-content/uploads/2017/08/20170814_195142.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

	    Glide.with(this).load(imagem_url).into(imageView)

	    val nomeCompleto = intent.getStringExtra("nome_completo")
	    textView.text = nomeCompleto

//        Toast.makeText(this, "Tela aberta", Toast.LENGTH_LONG).show()
	    longToast("Tela aberta")

	    textView.setOnClickListener {
		    alert("Deseja fechar a tela?", "Fechar Tela") {
			    yesButton { finish() }
			    noButton { layout.longSnackbar("Tela não será fechada") }
		    }.show()
	    }
    }
}
