package viratech.layout.my

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewholder>() {


    private lateinit var onItemCLickCallback: OnItemCLickCallback
    fun setOnItemClickCallback(onItemCLickCallback: OnItemCLickCallback){
        this.onItemCLickCallback=onItemCLickCallback
    }
    class ListViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imageView)
        var tvName: TextView = itemView.findViewById(R.id.textView_name)
        var tvDetail: TextView = itemView.findViewById(R.id.textView_detail)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {


        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return ListViewholder(view)


    }

    override fun getItemCount(): Int = listUser.size


    override fun onBindViewHolder(holder: ListViewholder, position: Int) {


        val (name, description, photo) = listUser[position]

        holder.imgPhoto.setImageResource(photo)
        holder.tvDetail.text = "@" + description
        holder.tvName.text = name
        holder.itemView.setOnClickListener {
          onItemCLickCallback.onItemClicked(listUser[holder.adapterPosition])
        }


    }

    interface OnItemCLickCallback{
        fun onItemClicked(data:User)
    }
}





