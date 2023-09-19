package com.suvai.realandroidappdevcourse.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.suvai.realandroidappdevcourse.R
import com.suvai.realandroidappdevcourse.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityViewBindingBinding
    private var value:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply{
            btnAdd.setOnClickListener(this@ViewBindingActivity)
            btnTake.setOnClickListener(this@ViewBindingActivity)
            btnGrow.setOnClickListener(this@ViewBindingActivity)
            btnShrink.setOnClickListener(this@ViewBindingActivity)
            btnHide.setOnClickListener(this@ViewBindingActivity)
            btnReset.setOnClickListener(this@ViewBindingActivity)
        }
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.btnAdd -> {
                value++
                binding.textView.text = value.toString()
            }
            R.id.btnTake->{
                value--
                binding.textView.text = value.toString()
            }
            R.id.btnGrow->{
                binding.textView.textScaleX = binding.textView.textScaleX + 1
            }
            R.id.btnShrink->{
                binding.textView.textScaleX = binding.textView.textScaleX - 1
            }
            R.id.btnHide->{
                if(binding.textView.visibility == View.VISIBLE){
                    binding.textView.visibility = View.INVISIBLE
                    binding.btnHide.text = "Show"
                }else{
                    binding.textView.visibility = View.VISIBLE
                    binding.btnHide.text = "Hide"
                }
            }
            R.id.btnReset->{
                value = 0
                binding.textView.text = value.toString()
            }

        }
    }
}