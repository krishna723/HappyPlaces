package com.example.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.happyplaces.databinding.ActivityAddHappyPlacesBinding

class AddHappyPlacesActivity : AppCompatActivity() {
    var binding: ActivityAddHappyPlacesBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddHappyPlacesBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.toolbarAddPlaces)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding?.toolbarAddPlaces?.setNavigationOnClickListener{
            onBackPressed()
        }
    }
}