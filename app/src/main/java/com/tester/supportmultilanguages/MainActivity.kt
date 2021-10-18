package com.tester.supportmultilanguages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zeugmasolutions.localehelper.Locales
import java.util.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val englishButton = findViewById<Button>(R.id.button_en)
        val arabicButton = findViewById<Button>(R.id.button_ar)

        englishButton.setOnClickListener {
            updateLocale(Locales.English)
        }

        arabicButton.setOnClickListener {
            updateLocale(Locales.Arabic)
        }
    }
}