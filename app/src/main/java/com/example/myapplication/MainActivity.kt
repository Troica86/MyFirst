package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(
            MY_OWN_LOG_TAG, "1Ты видел деву на скале\n" +
                    "В одежде белой над волнами"
        )

    }

    override fun onStart() {
        super.onStart()
        Log.d(
            MY_OWN_LOG_TAG, "2Когда, бушуя в бурной мгле,\n" +
                    "Играло море с берегами,"
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(
            MY_OWN_LOG_TAG, "3Когда луч молний озарял\n" +
                    "Ее всечасно блеском алым"
        )
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            MY_OWN_LOG_TAG, "4И ветер бился и летал\n" +
                    "С ее летучим покрывалом?\n"
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            MY_OWN_LOG_TAG, "5Прекрасно море в бурной мгле\n" +
                    "И небо в блесках без лазури;"
        )

    }

    override fun onRestart() {
        super.onRestart()

        Log.d(MY_OWN_LOG_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            MY_OWN_LOG_TAG, "6Но верь мне: дева на скале\n" +
                    "Прекрасней волн, небес и бури."
        )
    }
}