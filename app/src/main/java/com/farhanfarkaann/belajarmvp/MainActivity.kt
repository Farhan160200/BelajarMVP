package com.farhanfarkaann.belajarmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.farhanfarkaann.belajarmvp.databinding.ActivityMainBinding
import com.farhanfarkaann.belajarmvp.model.ModelMVP

class MainActivity : AppCompatActivity(), FirstView {
    private lateinit var binding : ActivityMainBinding

    lateinit var presenterImp: FirstPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO 6 inisialisasi presenter
        presenterImp = FirstPresenterImp(this)
        binding.buttonSubmit.setOnClickListener {
            presenterImp.tambahData(binding.inputText.text.toString())
        }


    }
    override fun berhasil(hasil: ModelMVP) {

        //TODO 6 TAMPILAN DI ALERT
            title = hasil.textmsgg
        Toast.makeText(this, "$title", Toast.LENGTH_SHORT).show()

  

            }



    override fun error() {
        //TODO 7
        Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
    }
}