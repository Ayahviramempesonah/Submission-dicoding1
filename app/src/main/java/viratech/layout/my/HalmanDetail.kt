package viratech.layout.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HalmanDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halman_detail)




    //   val tvUserName=  findViewById<TextView>(R.id.textView)
        val tvPhoto=  findViewById<ImageView>(R.id.circleImageView)
     //   val tvNameDetail=  this.findViewById<TextView>(R.id.textView2)


       val name =intent.getStringExtra("name")
        val icon = intent.getIntExtra("icon",0)
      //  val desc= intent.getStringExtra("desc")
     tvPhoto.setImageResource(icon)
       // tvUserName.text = name
     //   tvNameDetail.text=
    }
}