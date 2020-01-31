package com.portfolio.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast


class LoginActivity : AppCompatActivity() {

    // 항상 알맞는 접근제어자 붙이는 습관을 들이면 좋습니다.
    private val id: String = "1234"
    private val password: String = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            if (loginEdt.text.toString() == id  && passwordEdt.text.toString() == password) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Id", id)
                intent.putExtra("Ps", password)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
