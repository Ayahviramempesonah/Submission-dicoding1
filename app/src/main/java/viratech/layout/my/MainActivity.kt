package viratech.layout.my

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvUser: RecyclerView
    private val list = ArrayList<User>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)




        rvUser = findViewById(R.id.row_user)
        rvUser.setHasFixedSize(true)

        list.addAll(listUseres)
        showRecycler()


    }


    private val listUseres: ArrayList<User>
        get() {

            val dataname = resources.getStringArray(R.array.name)
            val dataUserName = resources.getStringArray(R.array.username)
            val dartaPhoto = resources.obtainTypedArray(R.array.avatar)

            val listUserNya = ArrayList<User>()
            for (i in dataname.indices) {
                val user = User(dataname[i], dataUserName[i], dartaPhoto.getResourceId(i, -1))
                listUserNya.add(user)
            }
            return listUserNya

        }

    private fun showRecycler() {

        rvUser.layoutManager = LinearLayoutManager(this)
        val listUserAdapter = UserAdapter(list)
        rvUser.adapter = listUserAdapter


    }


}
