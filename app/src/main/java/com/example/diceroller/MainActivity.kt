package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    //Buttonが押されたらランダム値を生成してテキストに反映させる関数
    private fun rollDice() {
        val resultText = findViewById<TextView>(R.id.result_text)
        //1~7までの乱数を生成する
        val randomInt = Random.nextInt(1, 7)
        //生成した乱数をテキストにキャストする
        resultText.text = randomInt.toString()
    }
}