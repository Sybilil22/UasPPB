package wtchon.mon.sybilmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var makanan: makanan

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makanan = findViewById(R.id.makanan)
        makanan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.makanan -> run {
                    val intentBiasa = Intent(this@MainActivity, wtchon.mon.sybilmart.makanan::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}