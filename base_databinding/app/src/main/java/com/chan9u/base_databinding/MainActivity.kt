package com.chan9u.base_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.chan9u.base_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // activity_main.xml 최상위를 <layout> 으로 변경하면 자동으로 ActivityMainBinding 생성
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this
        binding.message = "Binding Message"

        binding.btnClick.setOnClickListener {
            Toast.makeText(this, "btnOnClick >> ", Toast.LENGTH_SHORT).show()
        }
    }

    fun btnOnClick(view: View) {
        when (view.id) {
            R.id.btn_click -> {
                Toast.makeText(this, "btnOnClick >> ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun strEvent(message: String) {
        Toast.makeText(this, "strEvent >> $message", Toast.LENGTH_SHORT).show()
    }
}