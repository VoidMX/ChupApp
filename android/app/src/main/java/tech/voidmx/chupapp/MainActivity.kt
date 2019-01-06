package tech.voidmx.chupapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cvSingle = findViewById<CardView>(R.id.cvGameMode_1)
        val cvMulti = findViewById<CardView>(R.id.cvGameMode_2)

        cvSingle.setOnClickListener {
            Toast.makeText(this,"Single phone", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GameSets::class.java)
            startActivity(intent)
        }

        cvMulti.setOnClickListener {
            Toast.makeText(this,"Multi-phone", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MultiphoneMenu::class.java)
            startActivity(intent)
        }
    }
}
