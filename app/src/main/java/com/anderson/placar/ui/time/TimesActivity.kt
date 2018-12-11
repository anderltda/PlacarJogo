package com.anderson.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anderson.placar.R
import com.anderson.placar.ui.placar.PlacarActivity
import com.anderson.placar.ui.placaraac.PlacarAACActivity
import com.anderson.placar.ui.placaraac.PlacarAACViewModel
import com.anderson.placar.utils.KEY_EXTRA_TIME_A
import com.anderson.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_times.*

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)

        btIniciarJogo.setOnClickListener{
            val intent = Intent(this, PlacarAACActivity::class.java)
            intent.putExtra(KEY_EXTRA_TIME_A, inputTimeA.text.toString())
            intent.putExtra(KEY_EXTRA_TIME_B, inputTimeB.text.toString())
            startActivity(intent)
        }

        btNovoJogo.setOnClickListener {

        }
    }
}
