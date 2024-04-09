package com.example.myhistory_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declarations
        var show  = findViewById<EditText>(R.id.ageInput)
        var input2 = findViewById<TextView>(R.id.resultInput)
        var input3 = findViewById<EditText>(R.id.errorInput)
        var generate = findViewById<Button>(R.id.generateBtn)
        var clear = findViewById<Button>(R.id.clearBtn)

        //get the button message
        //generate?.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Buttun clicked", Toast.LENGTH_LONG).show()

            //clear?.setOnClickListener {
                //Toast.makeText(this@MainActivity, "Button clicked", Toast.LENGTH_LONG).show()

                //for display
        var william = "William Shakespeare was an english playwright ,poet and actor.He passed at the age 52"
        val abraham = "Abraham Lincon was a politian,lawyer and a stateman."
        val winnie = "Winnie Mandela was a South African anti-apartheid activist .she passed at the 81."
        val neil = "Neil Armstrong was the first man to walk on the moon .He passed at the age 82"
        val walt = "Walt Disney he was a film producer and an entrepreneur.He passed at the age 65"
        val Queen ="Queen Elizibath was the Queen of the United Kingdom.She passed away at the age of 96"
        val isaac ="Isaac Newton was an english polymath active as a mathematician. He passed at age 84"
        val steve ="Steve Biko was anti-apartheid activist in South Africa. He passed away at the age of 30"
        val solomon ="Solomon Mahlangu was a South African freedom fighter.He passed at the age of "

                //for clear
                val nothing = ""

                //information
                generate?. setOnClickListener {
                        val research = show.text.toString()
                        if (research.isBlank()) {
                            Toast.makeText(this, "Empty,Enter a value.", Toast.LENGTH_LONG).show()
                        } else if (research.toInt() < 20 || research.toInt() > 100) {
                            Toast.makeText(this, "Enter the age between 20 and 100", Toast.LENGTH_LONG).show()
                        } else {
                            if (research.toInt()==52)
                                input2.text=william.toString()
                            if (research.toInt()==56)
                                input2.text=abraham.toString()
                            if (research.toInt()==81)
                                input2.text=winnie
                            if (research.toInt()==82)
                                input2.text=neil
                            if (research.toInt()==65)
                                input2.text=walt
                            if (research.toInt()==84)
                                input2.text=isaac
                            if (research.toInt()==96)
                                input2.text=Queen
                            if (research.toInt()==30)
                                input2.text=steve

                            }
                          //for the button clear
                    clear?.setOnClickListener {
                        input2.text=nothing

                    }



                    }
                }







                    }

                //}

            //}










                








