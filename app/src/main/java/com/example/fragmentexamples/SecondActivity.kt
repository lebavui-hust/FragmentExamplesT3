package com.example.fragmentexamples

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val fragment1 = BlankFragment.newInstance("RED")
        val fragment2 = BlankFragment.newInstance("GREEN")

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView1, fragment1)
            .add(R.id.fragmentContainerView2, fragment2)
            .commit()
    }
}