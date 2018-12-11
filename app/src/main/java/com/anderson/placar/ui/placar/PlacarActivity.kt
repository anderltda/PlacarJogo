package com.anderson.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anderson.placar.R
import com.anderson.placar.utils.KEY_EXTRA_TIME_A
import com.anderson.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var placaA = 0
    private var placaB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if (savedInstanceState != null) {
            placaA = savedInstanceState.getInt("PLACAR_CASA")
            placaB = savedInstanceState.getInt("PLACAR_VISITANTE")

            tvPlacarTimeA.text = placaA.toString()
            tvPlacarTimeB.text = placaB.toString()
        }

        tvTimeA.text = intent.extras.getString(KEY_EXTRA_TIME_A)
        tvTimeB.text = intent.extras.getString(KEY_EXTRA_TIME_B)

        bt3PontosTimeA.setOnClickListener{adicionarPontoTimeA(3)}
        bt2PontosTimeA.setOnClickListener{adicionarPontoTimeA(2)}
        bt1PontoTimeA.setOnClickListener{adicionarPontoTimeA(1)}

        bt3PontosTimeB.setOnClickListener{adicionarPontoTimeB(3)}
        bt2PontosTimeB.setOnClickListener{adicionarPontoTimeB(2)}
        bt1PontoTimeB.setOnClickListener{adicionarPontoTimeB(1)}
    }

    private fun adicionarPontoTimeA(ponto: Int) {
        placaA += ponto
        tvPlacarTimeA.text = placaA.toString()
    }

    private fun adicionarPontoTimeB(ponto: Int) {
        placaB += ponto
        tvPlacarTimeB.text = placaB.toString()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("PLACAR_CASA", placaA)
        outState?.putInt("PLACAR_VISITANTE", placaB)
    }

}
