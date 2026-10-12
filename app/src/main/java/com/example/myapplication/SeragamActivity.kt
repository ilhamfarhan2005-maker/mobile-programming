package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeragamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seragam)

        val inputHari = findViewById<EditText>(R.id.inputHari)
        val btnCekSeragam = findViewById<Button>(R.id.btnCekSeragam)
        val layoutHasilSeragam = findViewById<LinearLayout>(R.id.layoutHasilSeragam)
        val tvHasilSeragam = findViewById<TextView>(R.id.tvHasilSeragam)
        val tvPenjelasanIfElse = findViewById<TextView>(R.id.tvPenjelasanIfElse)
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        btnCekSeragam.setOnClickListener {
            val hariInput = inputHari.text.toString().trim()

            if (hariInput.isEmpty()) {
                inputHari.error = "Harap masukkan nama hari!"
                return@setOnClickListener
            }

            // Praktek Percabangan IF - ELSE IF - ELSE
            val seragam: String
            val keterangan: String

            if (hariInput.equals("Senin", ignoreCase = true)) {
                seragam = "Seragam Putih Abu-abu / OSIS Lengkap dengan Dasi & Topi"
                keterangan = "Logika: 'if (hari == Senin)' terpenuhi."
            } else if (hariInput.equals("Selasa", ignoreCase = true)) {
                seragam = "Seragam Identitas / Batik Sekolah"
                keterangan = "Logika: 'else if (hari == Selasa)' terpenuhi."
            } else if (hariInput.equals("Rabu", ignoreCase = true)) {
                seragam = "Seragam Pramuka Lengkap"
                keterangan = "Logika: 'else if (hari == Rabu)' terpenuhi."
            } else if (hariInput.equals("Kamis", ignoreCase = true)) {
                seragam = "Seragam Baju Adat / Olahraga"
                keterangan = "Logika: 'else if (hari == Kamis)' terpenuhi."
            } else if (hariInput.equals("Jumat", ignoreCase = true)) {
                seragam = "Seragam Busana Muslim / Kerohanian"
                keterangan = "Logika: 'else if (hari == Jumat)' terpenuhi."
            } else if (hariInput.equals("Sabtu", ignoreCase = true) || hariInput.equals("Minggu", ignoreCase = true)) {
                seragam = "Libur! Tidak Perlu Memakai Seragam"
                keterangan = "Logika: 'else if (hari == Sabtu/Minggu)' terpenuhi."
            } else {
                seragam = "Hari tidak valid!"
                keterangan = "Logika: 'else' terpenuhi (nama hari tidak dikenali)."
            }

            // Tampilkan hasil
            tvHasilSeragam.text = "Seragam: $seragam"
            tvPenjelasanIfElse.text = keterangan
            layoutHasilSeragam.visibility = View.VISIBLE
        }

        btnKembali.setOnClickListener {
            finish()
        }
    }
}
