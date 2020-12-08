package com.example.iron_man

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.iron_man.databinding.ActivityListBotBinding

var a = 0
var databot = arrayOf("bot0","bot1","bot2","bot3","НАЖМИ ЧТО БЫ ВЫБРАТЬ ВРАГА!")

private lateinit var binding: ActivityListBotBinding

class ListBot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBotBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var cheakPickBot1 = false
        var tipifoto = ""

        binding.button.setOnClickListener {
            if (cheakPickBot1){
           val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            }
            else {val text = "Сначала выберете противника"
                  val duration = Toast.LENGTH_SHORT
                  val toast = Toast.makeText(applicationContext,text,duration)
                  toast.setGravity(Gravity.TOP,0,0)
                  toast.show()
            }
        }




        val adapterforbot = ArrayAdapter(this, R.layout.simple_spinner_item, databot)
        adapterforbot.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.apply {
            spinner4.adapter = adapterforbot
            spinner4.prompt = "Title"
            spinner4.setSelection(4)
            spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View,
                                            position: Int, id: Long) {
                    when (position) {
                        0 -> {
                            cheakPickBot1 = true
                            Toast.makeText(applicationContext ,"Вы выбрали слабого врага", Toast.LENGTH_SHORT).show()
                        }
                        1 -> { cheakPickBot1 = true
                            Toast.makeText(applicationContext ,"Вы выбрали врага по сильнее", Toast.LENGTH_SHORT).show()
                        }
                        2 -> { cheakPickBot1 = true
                            Toast.makeText(applicationContext ,"Вы выбрали член! Ой тоесть среднего врага", Toast.LENGTH_SHORT).show()
                        }
                        3 -> { cheakPickBot1 = true
                            Toast.makeText(applicationContext ,"Я АХУЕЕЕНННЫЙ ПРОГРАМИИИИИСТЬ!!!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                override fun onNothingSelected(arg0: AdapterView<*>?) {}
            }
        }


    }
}