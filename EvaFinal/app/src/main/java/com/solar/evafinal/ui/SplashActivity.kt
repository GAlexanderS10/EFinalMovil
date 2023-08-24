package com.solar.evafinal.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat
import com.solar.evafinal.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //PASAR A OTRO ACTIVITY CON UN CONTADOR DE TIEMPO
        HandlerCompat.postDelayed(Handler(),{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            //NO VOLVER A MOSTRAR EL SPLASH
            finish()
        },null, 3000)
    }
}