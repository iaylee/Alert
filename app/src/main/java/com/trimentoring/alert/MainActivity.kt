package com.trimentoring.alert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trimentoring.alert.databinding.ActivityMainBinding
import com.trimentoring.alert.databinding.FragmentAlertListBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, AlertListFragment.newFragment())
            .commit()
    }
}