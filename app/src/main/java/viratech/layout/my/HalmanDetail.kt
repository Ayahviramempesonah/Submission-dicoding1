package viratech.layout.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import viratech.layout.my.databinding.ActivityHalmanDetailBinding

class HalmanDetail : AppCompatActivity() {
        private lateinit var binding:ActivityHalmanDetailBinding

    companion object {
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityHalmanDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


            val data=intent.getParcelableExtra<User>(EXTRA_USER) as User

            binding.apply {
               circleImageView .setImageResource(data.photo)
                textView.text=data.name
                textView2.text=    "@"+data.description
            }




    }
}