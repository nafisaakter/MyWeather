package com.example.myweather
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myweather.databinding.ActivityInfoBinding

class InfoScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set OnClickListener for the back button
        binding.backButton.setOnClickListener {
            // Navigate back to MainActivity
            finish()
        }
    }
}
