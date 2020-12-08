package com.example.iron_man

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.iron_man.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

private lateinit var binding: ActivityMainBinding
var textAllIronMan = ""
var data = arrayOf("Взлететь", "Приземлиться", "Выстрел из руки", "Самонаводящяяся ракета","Выстрел из 2 рук", "Удар рукой","Выстрел из груди","Лазер", "Skills")
var data1 = arrayOf("Move","StopMove","go move","CreateProtected","DestroidProtected")

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navView.setNavigationItemSelectedListener(this)
        var ironMan = IronMan()
        var target = MoveTarget()

        binding.apply {
            buttonFly.setOnClickListener {
                textAllIronMan += ironMan.onFlyIronMan()
                textViewSob.text = textAllIronMan
            }
            buttonLanded.setOnClickListener {
                textAllIronMan += ironMan.landedIron()
                binding.textViewSob.text = textAllIronMan
            }
            buttonHeandShot.setOnClickListener {
                textAllIronMan += ironMan.handshot(target)
                binding.textViewSob.text = textAllIronMan
                textViewHp.text = "${target.hptarget}%"
                textViewProt.text = "${target.protTarget}%"
            }
            buttonHomingmis.setOnClickListener {
                textAllIronMan += ironMan.homingmissile(target)
                binding.textViewSob.text = textAllIronMan
                textViewHp.text = "${target.hptarget}%"
                textViewProt.text = "${target.protTarget}%"
            }
            buttonDablHandShot.setOnClickListener {
                textAllIronMan += ironMan.dableHandShot(target)
                binding.textViewSob.text = textAllIronMan
                textViewHp.text = "${target.hptarget}%"
                textViewProt.text = "${target.protTarget}%"
            }
            button8PachHad.setOnClickListener {
                textAllIronMan += ironMan.punchHad(target)
                binding.textViewSob.text = textAllIronMan
                textViewHp.text = "${target.hptarget}%"
                textViewProt.text = "${target.protTarget}%"
            }
            buttonHartShot.setOnClickListener {
                textAllIronMan += ironMan.hartShot(target)
                binding.textViewSob.text = textAllIronMan
                textViewHp.text = "${target.hptarget}%"
                textViewProt.text = "${target.protTarget}%"
            }
            buttonLazer.setOnClickListener {
                textAllIronMan += ironMan.lazer(target)
                binding.textViewSob.text = textAllIronMan
                textViewHp.text = "${target.hptarget}%"
                textViewProt.text = "${target.protTarget}%"
            }
            buttonRestart.setOnClickListener {

            }


        }



        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        binding.apply {
//            spinner.adapter = adapter
//            spinner.prompt = "Title"
//            spinner.setSelection(8)
//            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(parent: AdapterView<*>?, view: View,
//                                            position: Int, id: Long) {
//                    when (position) {
//                        0 -> {
//                            target.fly()
//                            textAllIronMan += ironMan.onfly()
//                            binding.textViewIronMan.text = textAllIronMan
//                        }
//                        1 -> {
//                            target.Landed()
//                            textAllIronMan += ironMan.landed()
//                            binding.textViewIronMan.text = textAllIronMan
//                        }
//                        2 -> {
//                            textAllIronMan += ironMan.handshot(target)
//                            binding.textViewIronMan.text = textAllIronMan
//                        }
//                        3 -> { textAllIronMan += ironMan.homingmissile(target)
//                            binding.textViewIronMan.text = textAllIronMan
//                        }
//                        4 -> { textAllIronMan += ironMan.dableHandShot(target)
//                        binding.textViewIronMan.text = textAllIronMan
//                        }
//                        5 -> { textAllIronMan += ironMan.punchHad(target)
//                            binding.textViewIronMan.text = textAllIronMan}
//
//                        6 -> { textAllIronMan += ironMan.hartShot(target)
//                            binding.textViewIronMan.text = textAllIronMan}
//
//                        7 -> { textAllIronMan += ironMan.lazer(target)
//                            binding.textViewIronMan.text = textAllIronMan}
//                    }
//                }
//                override fun onNothingSelected(arg0: AdapterView<*>?) {}
//            }
//        }
        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, data1)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        binding.apply {
//            spinner2.adapter = adapter1
//            spinner2.prompt = "Title1"
//            spinner2.setSelection(2)
//            spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(parent: AdapterView<*>?, view: View,
//                                            position: Int, id: Long) {
//                    when (position) {
//                        0 -> {
//                            textAllIronMan += "\nЦель в движении попасть сложнее"
//                            binding.textViewIronMan.text = textAllIronMan
//                            target.move()
//                        }
//                        1 -> {
//                            textAllIronMan += "\nЦель остоновилась!Попасть проше."
//                            binding.textViewIronMan.text = textAllIronMan
//                            target.stopmove()
//                        }
//                        3 -> {textAllIronMan += "\nЦель создала шит попасть невозможно"
//                              binding.textViewIronMan.text = textAllIronMan
//                              target.createprotektor()
//                        }
//                        4 -> {textAllIronMan += "\nШит цели уничтожен попасть возможно"
//                              binding.textViewIronMan.text = textAllIronMan
//                              target.destroidprotected()}
//                    }
//                }
//                override fun onNothingSelected(arg0: AdapterView<*>?) {}
//            }
//        }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var target = MoveTarget()
        var textProz = ""
        when (item.itemId) {
            R.id.fly_up -> {
                target.fly()
                textAllIronMan += "\nВраг взлетел попасть сложнее!"
                binding.textViewSob.text = textAllIronMan
                textProz = target.getProbability().toString()
                binding.textViewProbolity.text = "$textProz%Вероятность попасть"
            }
            R.id.landed -> {
                target.landed()
                textAllIronMan += "\nВраг приземлился попасть проше!"
                binding.textViewSob.text = textAllIronMan
                textProz = target.getProbability().toString()
                binding.textViewProbolity.text = "$textProz%Вероятность попасть"
            }
            R.id.Move -> {
                target.move()
                textAllIronMan += "\nВраг в движении попасть сложнее"
                binding.textViewSob.text = textAllIronMan
                textProz = target.getProbability().toString()
                binding.textViewProbolity.text = "$textProz%Вероятность попасть"
            }
            R.id.StopWove -> {
                target.stopmove()
                textAllIronMan += "\nВраг остоновился попасть проше"
                binding.textViewSob.text = textAllIronMan
                textProz = target.getProbability().toString()
                binding.textViewProbolity.text = "$textProz%Вероятность попасть"
            }

        }
        return true
    }
}