package vcmsa.ci.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.telecom.Call.Details
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            val btnNext = findViewById<Button>(R.id.Nextbtn)
            val btnExit = findViewById<Button>(R.id.Exitbtn)


            btnNext.setOnClickListener {
                val intent = Intent(this, openFileInput::class.java)
                startActivity(intent)
            }

             btnExit.setOnClickListener{
                finishAffinity()}
             }


        }
    }





