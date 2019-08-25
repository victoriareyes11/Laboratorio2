package com.example.laboratorio2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        bt_registroya.setOnClickListener{
            var contrasenia=et_contreg.text.toString()
            var confcontrasenia=et_confcontreg.text.toString()
            if(contrasenia.length>5) {
                if (contrasenia == confcontrasenia) {


                    val intent = Intent(this, LoginActivity::class.java)
                    intent.putExtra("Email", et_emailreg.text.toString())
                    intent.putExtra("contrasenia", et_contreg.text.toString())
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                } else {

                    Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "Contraseña debe contener minimo 6 caracteres", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this,"Ingresar", Toast.LENGTH_SHORT).show()

    }




}
