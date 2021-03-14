package com.example.cycleviefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addA(view: View)
    {
        val trans = manager.beginTransaction()
        val fragA = FragA()
        if(!fragA.isAdded)
        {
            trans.add(R.id.fragContainer, fragA, "fragA")
            trans.commit()
        }
    }
    fun delA(view: View)
    {
        val trans = manager.beginTransaction()
        val fragA = manager.findFragmentByTag("fragA")
        if(fragA != null)
        {
            trans.remove(fragA)
            trans.commit()
        }
    }

    fun addB(view: View)
    {
        val trans = manager.beginTransaction()
        val fragB = FragB()
        if(!fragB.isAdded)
        {
            trans.add(R.id.fragContainer, fragB, "fragB")
            trans.commit()
        }
    }

    fun delB(view: View)
    {
        val trans = manager.beginTransaction()
        val fragB = manager.findFragmentByTag("fragB")
        if(fragB != null) {
            trans.remove(fragB)
            trans.commit()
        }
    }

    fun repA(view: View)
    {

    }

    fun repB(view: View)
    {

    }
}