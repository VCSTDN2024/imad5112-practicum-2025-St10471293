package vcmsa.ci.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } val editTText = findViewById<EditText>(R.id.editTText)
        "ocean eyes".also { editTText.text = it }

        val editTText = findViewById<EditText>(R.id.editTText)
        "bad guy".also { editTText.text = it }

        val editTText = findViewById<EditText>(R.id.editTText)
        "happier".also { editTText.text = it }

        val textView4 = findViewById<EditText>(R.id.editTText)
        "lovely".also { textView4.text = it }

    val homebtn = findViewById<Button>(R.id.homebtn)
    homebtn.setOnClickListener(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}

    }


}