package viratech.layout.my

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import viratech.layout.my.databinding.RowUserBinding
import java.util.*

class UserAdapter(private val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewholder>() {

        private val TAG="my activity"
    private  lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback (onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClicked(data:User)
    }



   class ListViewholder(var binding : RowUserBinding ) : RecyclerView.ViewHolder(binding.root) {




   }




     //  var imgPhoto: ImageView = itemView.findViewById(R.id.imageView)
       // var tvName: TextView = itemView.findViewById(R.id.textView_name)
        //var tvDetail: TextView = itemView.findViewById(R.id.textView_detail)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {

        val binding = RowUserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListViewholder(binding)
        Log.i(TAG,"erorr dsini")
    }

    override fun getItemCount(): Int = listUser.size


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewholder, position: Int) {

val uses= listUser [position]

       val pho=listUser[position].photo
     //   holder.itemView.setOnClickListener {
       //     onItemClickCallback.onItemClicked(listUser[holder.adapterPosition])
       // }






    }




}







