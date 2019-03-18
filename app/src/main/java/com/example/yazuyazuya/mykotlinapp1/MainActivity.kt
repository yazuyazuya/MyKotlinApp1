package com.example.yazuyazuya.mykotlinapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * activity_main.xmlの変更・追加部分 (DesignじゃなくてTextの方)
         *
         * android.support.constraint.ConstraintLayout内の
         * android:id="@+id/rootLayout"
         * tools:context="com.example.yazuyazuya.mykotlinapp1.MainActivity"
         *
         * TextView内の
         * android:id="@+id/textview"
         *
         **/

        /*
        var greet = "Hello, Kotlin!"
        textview.text = greet
        */

        // Button切り替え用のフラグ
        var flag = false

        // リスナーをボタンに登録
        button.setOnClickListener {

            if (flag) {
                // flagがtrueの時
                // textview.setText(getString(R.string.hello))
                textview.text = "Hello, Kotlin!"
                flag = false
            } else {
                // flagがfalseの時
                // textview.setText(getString(R.string.world))
                textview.text = "Default"
                flag = true
            }
        }

    }

}
