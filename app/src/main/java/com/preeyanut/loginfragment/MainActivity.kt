package com.preeyanut.loginfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginFragment = LoginFragment()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.container,loginFragment,"LoginFragment")
        transaction.addToBackStack("LoginFragment")
        transaction.commit()
    }

    override fun onBackPressed() {
        val manager = supportFragmentManager.findFragmentById(R.id.container)

        if (manager is LoginFragment ) {
            finish()
        }
        else{
            super.onBackPressed()
        }
    }

}
