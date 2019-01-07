package tech.voidmx.chupapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashScreenThread = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(1500)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e : Exception) {
                    e.printStackTrace()
                }
            }
        }
        splashScreenThread.start()
    }
}
