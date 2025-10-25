package com.example.youtube

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import kotlin.contracts.contract

class ContentAdapter(private val videoList : ArrayList<ContentModel>,
                     private val listener : OnItemClickListener):
    RecyclerView.Adapter<ContentAdapter.VideoviewHolder>() {

        interface OnItemClickListener{
            fun OnItemclick(video: ContentModel)
        }

    class VideoviewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageCover = itemView.findViewById<ImageView>(R.id.imageView)
        val profileImage = itemView.findViewById<CircleImageView>(R.id.profile_image)
        val title = itemView.findViewById<TextView>(R.id.textView_title)
        val channelIn = itemView.findViewById<TextView>(R.id.textView_sub)




    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VideoviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return VideoviewHolder(view)
    }

    override fun onBindViewHolder(
        holder: VideoviewHolder,
        position: Int
    ) {
        val video  = videoList[position]
        holder.title.text = video.title
        holder.channelIn.text =video.channelNameView

        Glide.with(holder.itemView.context)
            .load(video.image)
            .into(holder.imageCover)


        Glide.with(holder.itemView.context)
            .load(video.image)
            .into(holder.profileImage)

        holder.itemView.setOnClickListener {
            listener.OnItemclick(video)

            val intent = Intent(holder.itemView.context, videoPlayer::class.java)
            intent.putExtra("videoUrl",)
        }


    }

    override fun getItemCount(): Int {
        return videoList.size
    }


}