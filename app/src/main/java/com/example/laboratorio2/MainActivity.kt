package com.example.laboratorio2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

class MainActivity : AppCompatActivity() {
    var Emailmain="1"
    //var Contmain=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Emailmain=intent.getStringExtra("Email")
        tv_emailmain.text= Emailmain

        //Contmain=et_cont.text.toString()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow_menu,menu)
        return true
    }

       fun onGroupItemClick (item: MenuItem): Boolean {
        when(item!!.itemId){
            R.id.item_salir ->
             {
                var intent = Intent(this, LoginActivity::class.java)
                 //intent.putExtra("Emailm",Emailmain)
                 //intent.putExtra("contraseniam",Contmain)
                 setResult(Activity.RESULT_OK,intent)
                //startActivity(intent)
                 Toast.makeText(this,"Cerrando sesión",Toast.LENGTH_SHORT).show()
                 finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        var intent=Intent(this,LoginActivity::class.java)
       // startActivityForResult(intent,5678)
        setResult(Activity.RESULT_CANCELED,intent)


    }


}
