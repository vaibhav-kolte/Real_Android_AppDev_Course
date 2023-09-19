package com.suvai.realandroidappdevcourse.activityLifeCycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import com.suvai.realandroidappdevcourse.R
import com.suvai.realandroidappdevcourse.databinding.ActivityStateChangeBinding

class StateChangeActivity : AppCompatActivity() {
    var text = ""
    private lateinit var binding: ActivityStateChangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStateChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG, "onCreate: ")
        text = "\nonCreate"
        binding.myText.text = text
        binding.btnShow.setOnClickListener {
            if (binding.inputType.text.isNotEmpty())
                Toast.makeText(this, "onCreate() : ${binding.inputType.text}", Toast.LENGTH_SHORT)
                    .show()
            else
                Toast.makeText(this, "onCreate() : Nothing to show", Toast.LENGTH_SHORT)
                    .show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(Companion.TAG, "onStart: ")
        text += "\nonStart"
        binding.myText.text = text
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
        text += "\nonResume"
        binding.myText.text = text
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
        text += "\nonPause"
        binding.myText.text = text
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
        text += "\nonStop"
        binding.myText.text = text
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: ")
        text += "\nonRestart"
        binding.myText.text = text
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
        text += "\nonDestroy"
        binding.myText.text = text
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState: ")
        text += "\nonSaveInstanceState"
        binding.myText.text = text
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.i(TAG, "onRestoreInstanceState: ")
        text += "\nonRestoreInstanceState"
        binding.myText.text = text
    }

    companion object {
        private const val TAG = "StateChangeActivity"
    }
}