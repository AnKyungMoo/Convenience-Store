package com.km.convenience_store.presenter.convenience

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.km.convenience_store.databinding.ActivityConvenienceStoreBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConvenienceStoreActivity: AppCompatActivity() {
    private lateinit var binding: ActivityConvenienceStoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConvenienceStoreBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}