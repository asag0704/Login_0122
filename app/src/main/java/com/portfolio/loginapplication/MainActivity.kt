package com.portfolio.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent

        /**
         * if (intent != null) {
         *     val id: String? = intent.getStringExtra("id")
         * }
         *
         * val id: String = intent?.getStringExtra("id")
         * 위 두 코드는 모두 같은 동작을 하는 코드입니다.
         *
         *
         * intent.get~~ 는 널값일 가능성이 있어서 Nullable 선언을 해줘야합니다! (val id: String? = intent?.getStringExtra("Id)
         */
        val id: String? = intent.getStringExtra("Id")
        val pw: String? = intent.getStringExtra("Ps")

        IdTxt.text = id
        PasswordTxt.text = pw
    }
}
