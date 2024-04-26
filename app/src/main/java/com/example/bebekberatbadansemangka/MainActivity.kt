package com.example.bebekberatbadansemangka

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtbb = findViewById<EditText>(R.id.editbb)
        val edttb = findViewById<EditText>(R.id.edittb)
        val txtbb = findViewById<TextView>(R.id.txtbb)
        val txttb= findViewById<TextView>(R.id.txttb)
        val btntampil = findViewById<Button>(R.id.btntampil)


        btntampil.setOnClickListener {

            val beratbadan = edtbb.text.toString()
            txtbb.text = "berat badan anda adalah " + beratbadan
            val tinggibadan = edttb.text.toString()
            txttb.text = "tinggi badan  adalah " + tinggibadan

        }

    }
}