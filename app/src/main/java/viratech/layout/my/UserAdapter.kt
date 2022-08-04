package viratech.layout.my

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewholder>() {

    private val TAG = "my activity"
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: User)
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


    // @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewholder, position: Int) {

        val (name, description, photo) = listUser[position]

        holder.imgPhoto.setImageResource(photo)
        holder.tvDetail.text = "@" + description
        holder.tvName.text = name
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listUser[holder.adapterPosition])

        }

    }


}







