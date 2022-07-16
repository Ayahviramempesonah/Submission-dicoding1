package viratech.layout.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HalmanDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halman_detail)
        val tvTitle=findViewById<TextView>(R.id.textView_name)
        val tvPhoto=findViewById<TextView>(R.id.imageView)
        val tvDEsc=findViewById<TextView>(R.id.textView_detail)
    }
}