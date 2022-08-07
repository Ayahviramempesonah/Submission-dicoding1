package viratech.layout.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HalmanDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halman_detail)




      val tvUserName=  findViewById<TextView>(R.id.textView)
        val tvPhoto=  findViewById<ImageView>(R.id.circleImageView)
       val tvNameDetail=  findViewById<TextView>(R.id.textView2)


       val name =intent.getStringExtra("Name")
        val icon = intent.getIntExtra("PHOTO",0)
       val desc= intent.getStringExtra("Desc")
     tvPhoto.setImageResource(icon)
       tvUserName.text =  "NAMA= "+name
       tvNameDetail.text= "USERNAME= " + "@"+desc
    }
}