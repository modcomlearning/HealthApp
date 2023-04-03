package com.lit.hyraxhealthapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //We FInd the Cards using their IDs.
        //Each card will Naivigate to its Specfic Activity/Page.
        val about = findViewById<CardView>(R.id.cardabout)
        about.setOnClickListener {
            Toast.makeText(applicationContext, "About Covid", Toast.LENGTH_SHORT).show()
            val x = Intent(applicationContext, About::class.java)
            startActivity(x)
        }//end

        val causes = findViewById<CardView>(R.id.cardcauses)
        causes.setOnClickListener {
            Toast.makeText(applicationContext, "Covid Causes", Toast.LENGTH_SHORT).show()
            val x = Intent(applicationContext, Causes::class.java)
            startActivity(x)
        }//end

        val prevention = findViewById<CardView>(R.id.cardprevention)
        prevention.setOnClickListener {
            Toast.makeText(applicationContext, "Covid Prevention", Toast.LENGTH_SHORT).show()
            val x = Intent(applicationContext, Prevention::class.java)
            startActivity(x)
        }//end


        val symptoms = findViewById<CardView>(R.id.cardsymptoms)
        symptoms.setOnClickListener {
            Toast.makeText(applicationContext, "Covid Symptoms", Toast.LENGTH_SHORT).show()
            val x = Intent(applicationContext, Symptoms::class.java)
            startActivity(x)
        }//end

        val tollfree = findViewById<CardView>(R.id.cardtollfree)
        tollfree.setOnClickListener {
            Toast.makeText(applicationContext, "Covid TollFree", Toast.LENGTH_SHORT).show()
            val x = Intent(applicationContext, TollFree::class.java)
            startActivity(x)
        }//end

        val locate = findViewById<CardView>(R.id.cardlocate)
        locate.setOnClickListener {
            Toast.makeText(applicationContext, "Covid Vaccine Locations", Toast.LENGTH_SHORT).show()
            val x = Intent(applicationContext, Locations::class.java)
            startActivity(x)
        }//end
    }
}