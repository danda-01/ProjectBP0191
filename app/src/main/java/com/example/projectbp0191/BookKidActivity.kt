package com.example.projectbp0191

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp0191.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding:ActivityBookKidBinding

    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_book_kid)

        binding.buttonFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        binding.buttonFairy.setOnClickListener{
            replaceFragment(FableFragment())
        }

        binding.buttonFairy.setOnClickListener{
            replaceFragment(ScienceFragment())
        }

    }
}