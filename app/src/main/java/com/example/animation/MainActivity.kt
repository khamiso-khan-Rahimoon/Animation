package com.example.animation

import android.content.Intent
import android.os.Bundle

import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animatedTextview = findViewById<TextView>(R.id.textView)
//        binding.next?.setOnClickListener {
//            val intent = Intent(this,Lottie_Animation::class.java)
//            startActivity(intent)
//        }
        val nextbutton = findViewById<Button>(R.id.next)
        nextbutton.setOnClickListener {
            val intent = Intent(this,Lottie_Animation::class.java)
            startActivity(intent)
        }

        binding.fadeIn.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.fade_in)
            animatedTextview.startAnimation(animationFade)

        }
        binding.fadeOut.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.fade_out)
            animatedTextview.startAnimation(animationFade)

        }
        binding.blink.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.blink)
            animatedTextview.startAnimation(animationFade)

        }
        binding.bounce.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.bounce)
            animatedTextview.startAnimation(animationFade)

        }
        binding.flip.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.flip)
            animatedTextview.startAnimation(animationFade)

        }
        binding.move.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.move)
            animatedTextview.startAnimation(animationFade)

        }
        binding.pulse.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.pulse)
            animatedTextview.startAnimation(animationFade)

        }
        binding.rotate.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.rotate)
            animatedTextview.startAnimation(animationFade)

        }
        binding.shake.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.shake)
            animatedTextview.startAnimation(animationFade)

        }
        binding.slideDown.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.slide_down)
            animatedTextview.startAnimation(animationFade)


        }
        binding.slideLeft.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.slide_left)
            animatedTextview.startAnimation(animationFade)

        }
        binding.SlideRight.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.slide_right)
            animatedTextview.startAnimation(animationFade)

        }
        binding.slideUp.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.slide_up)
            animatedTextview.startAnimation(animationFade)

        }
        binding.zoomIn.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            animatedTextview.startAnimation(animationFade)

        }
        binding.zoomOut.setOnClickListener {
            val animationFade = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            animatedTextview.startAnimation(animationFade)

        }

    }
}