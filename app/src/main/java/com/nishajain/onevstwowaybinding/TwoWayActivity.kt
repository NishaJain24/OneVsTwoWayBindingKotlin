package com.nishajain.onevstwowaybinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.nishajain.onevstwowaybinding.databinding.ActivityTwoWayBinding


class TwoWayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWayBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_way)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}