package com.example.laboratorio2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registro.*

class LoginActivity : AppCompatActivity() {

    var contreg="92"
    var emailreg="85"
   // var contmainn="1"
   // var emailmainn="1"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //contmainn=intent.getStringExtra("Emailm")
        //emailmainn=intent.getStringExtra("contraseniam")



        bt_registro.setOnClickListener{
            var intent=Intent(this,RegistroActivity::class.java)
            startActivityForResult(intent,1234)
        }

        bt_ingresar.setOnClickListener {

            var contlog = et_cont.text.toString()
            var emaillog=et_email.text.toString()


            //if(contreg==contlog && emailreg==emaillog || contreg==contmainn && emailreg==emailmainn ){
            if(contreg==contlog && emailreg==emaillog ){
                var intent=Intent(this,MainActivity::class.java)
                intent.putExtra("Email", emailreg)
                intent.putExtra("contrasenia",contreg)
                //startActivity(intent)
                startActivityForResult(intent,5678)
                Toast.makeText(this,"Iniciando sesión",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Contraseña o email incorrecto",Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //val bundle =intent.extras
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==1234 && resultCode== Activity.RESULT_OK) {

            contreg = data!!.extras!!.getString("contrasenia").toString()
            emailreg = data!!.extras!!.getString("Email").toString()


        }

             super.onActivityResult(requestCode, resultCode, data)
            if (requestCode == 5678 && resultCode == Activity.RESULT_CANCELED) {
               finish()
            }


    }

     override fun onBackPressed() {
        super.onBackPressed()

    }


    override fun onResume() {
        super.onResume()
        Log.d("metodo","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("metodo","onPause")
    }


    override fun onStop() {
        super.onStop()
        Log.d("metodo","onStop")
    }


    override fun onRestart() {
        super.onRestart()
        Log.d("metodo","onRestart")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("metodo","onDestroy")
    }

}
