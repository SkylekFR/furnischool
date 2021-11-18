package com.emilien.champion.furnischool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emilien.champion.furnischool.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.app
import com.google.firestore.v1.Document
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainAddNewFurnitureButton.setOnClickListener {
            val hashMap: MutableMap<String, String> = HashMap()
            hashMap["test"] = "test"
            FirebaseFirestore.getInstance().collection("test").add(hashMap)
        }


    }
}