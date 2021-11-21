package co.gov.mintic.misiontic.udea.ciclo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var txtEstadoActual : TextView? = null
    var txtEstadoAnterior : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtEstadoActual = findViewById<TextView>(R.id.txtEstadoActual)
        txtEstadoAnterior= findViewById<TextView>(R.id.txtEstadoAnterior)
        mostarEstado("Creada", "iniciada")
    }

    override fun onStart() {
        super.onStart()
        mostarEstado("Iniciada", txtEstadoActual!!.text.toString())
    }

    override fun onResume() {
        super.onResume()
        mostarEstado("Reanudada", txtEstadoActual!!.text.toString())
    }

    override fun onPause() {
        super.onPause()
        mostarEstado("Pausada", txtEstadoActual!!.text.toString())
    }

    override fun onStop() {
        super.onStop()
        mostarEstado("Parada", txtEstadoActual!!.text.toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        mostarEstado("Destruida", txtEstadoActual!!.text.toString())
    }
    //onStart(),
    // onResume(),
    //onPause(),
    // onStop()
    // onDestroy()


    fun mostarEstado(actual: String, anterior: String){
        println("Estado actual: $actual")
        println("Estado anterior: $anterior")
        txtEstadoActual!!.text = actual
        txtEstadoAnterior!!.text = anterior
    }
}