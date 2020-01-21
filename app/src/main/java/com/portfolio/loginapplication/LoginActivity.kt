package com.portfolio.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toast


class LoginActivity : AppCompatActivity() {

    val Id: String = "1234"
    val Password: String = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginBtn.setOnClickListener {
            if (loginEdt.text.toString() == Id  && passwordEdt.text.toString() == Password) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(baseContext, MainActivity::class.java)
                intent.putExtra("Id", Id)
                intent.putExtra("Ps", Password)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
