package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menyambungkan dengan file activity_main.xml
        setContentView(R.layout.activity_main)

        // Mengenali elemen-elemen desain berdasarkan ID-nya
        val inputNama = findViewById<EditText>(R.id.inputNama)
        val inputNim = findViewById<EditText>(R.id.inputNim)
        val btnTampilkan = findViewById<Button>(R.id.btnTampilkan)
        val layoutOutput = findViewById<LinearLayout>(R.id.layoutOutput)
        val tvOutputNama = findViewById<TextView>(R.id.tvOutputNama)
        val tvOutputNim = findViewById<TextView>(R.id.tvOutputNim)

        // Memberikan aksi ketika tombol diklik
        btnTampilkan.setOnClickListener {
            val nama = inputNama.text.toString()
            val nim = inputNim.text.toString()

            // Jika input tidak kosong, tampilkan datanya
            if (nama.isNotEmpty() && nim.isNotEmpty()) {
                tvOutputNama.text = "Halo $nama!"
                tvOutputNim.text = "NIM Anda: $nim"

                // Memunculkan area output yang sebelumnya disembunyikan (gone)
                layoutOutput.visibility = View.VISIBLE
            }
        }
    }
}
