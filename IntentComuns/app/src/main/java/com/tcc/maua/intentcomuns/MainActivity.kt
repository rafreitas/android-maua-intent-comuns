package com.tcc.maua.intentcomuns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.phoneNumber
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDial.setOnClickListener{
            val number = edPhone.text.toString()
            chamarDiscador(number)
        }

        btnCall.setOnClickListener{}
        val number = edPhone.text.toString()
        chamarTelefone(number)
    }

    fun chamarDiscador(phoneNumber : String){
        val intent = Intent(Intent.ACTION_DIAL) //Recebe o objeto do tipo intent. Tem a inteção de chamar o discador.
        intent.data = Uri.parse("tel:$phoneNumber")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    fun chamarTelefone(phoneNumber : String){
        val intent = Intent(Intent.ACTION_CALL) //Recebe o objeto do tipo intent. Tem a inteção de chamar o discador.
        intent.data = Uri.parse("tel:$phoneNumber")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

}
