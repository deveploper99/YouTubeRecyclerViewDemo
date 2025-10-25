package com.example.youtube

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter: ContentAdapter
    private lateinit var videoList: ArrayList<ContentModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this,)


        videoList= arrayListOf()

        videoList.add(
            ContentModel(
                title = "Lyrical | Saiyaara Title Song | Ahaan, Aneet | Tanishk Bagchi, Faheem Abdullah, Arslan| Irshad Kamil",
                channelNameView = "YRF · 788k views · 18 hours ago",
                image = "https://img.youtube.com/vi/FudfVyYWNxQ/maxresdefault.jpg",
                channelLogo = "https://img.youtube.com/vi/FudfVyYWNxQ/maxresdefault.jpg"
            )
        )


        videoList.add(
            ContentModel(
                title = "O Re Piya | Full Song | Aaja Nachle | Madhuri Dixit | Rahat Fateh Ali Khan | Salim-Sulaiman, Jaideep",
                channelNameView = "YRF · 788k views · 18 hours ago",
                image = "https://img.youtube.com/vi/iv7lcUkFVSc/maxresdefault.jpg",
                channelLogo = "https://yt3.ggpht.com/ukiLOR2xcRjb4vEfv_DvcTU-5WgGyhwL3w1jQxvTBVdMbBlrtDopxKwg8Scs66C8nFgXu-cl=s48-c-k-c0x00ffffff-no-rj"
            )
        )
        videoList.add(
            ContentModel(
                title = "Long Distance Love | Coke Studio Bangla | Season 3 | Ankan X Afrin | Shuvendu",
                channelNameView = "YRF · 788k views · 18 hours ago",
                image = "https://img.youtube.com/vi/sqJ2QhjBQaw/maxresdefault.jpg",
                channelLogo = "https://img.youtube.com/vi/sqJ2QhjBQaw/maxresdefault.jpg"
            )
        )
        videoList.add(
            ContentModel(
                title = "Tomake Chai (তোমাকে চাই) | Gangster | Arijit Singh | Arindom | Yash | Mimi | SVF Musis",
                channelNameView = "YRF · 788k views · 18 hours ago",
                image = "https://img.youtube.com/vi/JAP_Acr8jUM/maxresdefault.jpg",
                channelLogo = "https://img.youtube.com/vi/JAP_Acr8jUM/maxresdefault.jpg"
            )
        )




        adapter = ContentAdapter(videoList)
        recyclerview.adapter = adapter



    }
}