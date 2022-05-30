package com.company.l2m6

import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.URLUtil
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.company.l2m6.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var listUrl: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        random()

        binding.btnClick.setOnClickListener {
            if (URLUtil.isValidUrl(binding.etTitle.text.toString())) {
                val url = Uri.parse(binding.etTitle.text.toString())
                Glide.with(this).load(url)
                    .into(binding.ivGoogle)
            } else {
                Toast.makeText(this, getString(R.string.toast), Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnRandom.setOnClickListener {
            val random = (0 until listUrl.size - 1).random()
            Glide.with(this).load(listUrl[random])
                .into(binding.ivGoogle)
        }
    }

    fun random() {
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://png.pngtree.com/png-vector/20201229/ourmid/pngtree-an-adult-tabby-cat-png-image_2664939.jpg")
        listUrl.add("https://w7.pngwing.com/pngs/235/163/png-transparent-ghost-drawing-halloween-ghost-pics-white-marine-mammal-fictional-character.png")
        listUrl.add("https://img1.freepng.ru/20180425/fse/kisspng-flying-squirrel-bat-raccoon-rodent-gliding-5ae061f29744f9.7920944915246545786196.jpg")
        listUrl.add("https://w7.pngwing.com/pngs/451/624/png-transparent-fire-flame-decal-fire-blue-ring-text.png")
        listUrl.add("https://avatanplus.com/files/resources/original/57b89792ded2c156a91015e1.png")
        listUrl.add("https://www.nicepng.com/png/detail/126-1261957_-.png")
        listUrl.add("https://pngicon.ru/file/uploads/vinni-pukh-v-png.png")
        listUrl.add("https://e1.pngegg.com/pngimages/255/162/png-clipart-render-naruto-uzumaki-naruti.png")
        listUrl.add("https://photoshop-kopona.com/uploads/posts/2019-02/1549532809_water-1.jpg")
        listUrl.add("https://thypix.com/wp-content/uploads/2021/02/pixel-sunglasses-17-700x407.png")
        listUrl.add("https://overcoder.net/img/1/2/99/19825.png")
    }
}