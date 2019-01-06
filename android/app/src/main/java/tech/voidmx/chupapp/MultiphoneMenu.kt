package tech.voidmx.chupapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MultiphoneMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiphone_menu)

        val btCreateMatch = findViewById<Button>(R.id.btCreateMatch)
        val btJoinMatch = findViewById<Button>(R.id.btJoinMatch)

        btCreateMatch.setOnClickListener{
            Toast.makeText(this, "Crear partida", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GameSets::class.java)
            startActivity(intent)
        }

        btJoinMatch.setOnClickListener{
            Toast.makeText(this, "Unirse a partida", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, JoinMatch::class.java)
            startActivity(intent)
        }
    }
}
