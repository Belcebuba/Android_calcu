package com.example.practica2eventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    var opera: Int =0
    var num1: Double =0.0
    lateinit var n1: TextView
    lateinit var  n2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1)
        n2= findViewById(R.id.n2)

        val btc: Button = findViewById(R.id.btc)
        val btigu: Button= findViewById(R.id.btigu)

        btigu.setOnClickListener {
            var num2: Double= n2.text.toString().toDouble()
            var resp: Double= 0.0

            when(opera)
            {
                1 -> resp = num1 + num2
                2 -> resp = num1 - num2
                3 -> resp = num1 * num2
                4 -> resp = num1 / num2
            }
            n1.setText(resp.toString())
            n2.text = ""
        }
        btc.setOnClickListener{
            n1.setText("")
            n2.setText("")
            num1= 0.0
            opera= 0

        }

    }
    fun presdig(view: View)
    {
        val n2: TextView = findViewById(R.id.n2)
        val num2 : String = n2.text.toString()
        when(view.id)
        {
            R.id.bt0 ->n2.setText(num2+"0")
            R.id.bt1 ->n2.setText(num2+"1")
            R.id.bt2 ->n2.setText(num2+"2")
            R.id.bt3 ->n2.setText(num2+"3")
            R.id.bt4 ->n2.setText(num2+"4")
            R.id.bt5 ->n2.setText(num2+"5")
            R.id.bt6 ->n2.setText(num2+"6")
            R.id.bt7 ->n2.setText(num2+"7")
            R.id.bt8 ->n2.setText(num2+"8")
            R.id.bt9 ->n2.setText(num2+"9")
            R.id.btp ->n2.setText(num2+".")
        }






    }
    fun clicop(view: View)
    {
        num1= n2.text.toString().toDouble()

        var num2_text: String = n2.text.toString()
        when(view.id )
        {
            R.id.btsum ->{
                n1.setText(num2_text+ "+")
                opera =1
            }
            R.id.btrest ->{
                n1.setText(num2_text+ "-")
                opera =2
            }
            R.id.btmul ->{
                n1.setText(num2_text+ "*")
                opera =3
            }
            R.id.btdiv ->{
                n1.setText(num2_text+ "/")
                opera =4
            }
        }
        n2.text=""
    }
}