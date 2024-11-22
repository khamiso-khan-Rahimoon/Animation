package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animation.databinding.ActivitySignInBinding
import com.example.animation.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class Sign_In : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private val binding:ActivitySignInBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater)
    }

        // Already User log in check
        override fun onStart() {
            super.onStart()
            val currentUser:FirebaseUser?= auth.currentUser
            if (currentUser!=null){
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)



        auth = FirebaseAuth.getInstance()

        binding.Register.setOnClickListener {
            startActivity(Intent(this,Sign_up::class.java))
        }

        binding.LogInbtn.setOnClickListener {
            val email = binding.emailsignInp.text.toString()
            val pasword = binding.passwordSignIn.text.toString()

            if (email.isEmpty() || pasword.isEmpty()){
                Toast.makeText(this, "fill all above fields", Toast.LENGTH_SHORT).show()
            }else{
                auth.signInWithEmailAndPassword(email,pasword)
                    .addOnCompleteListener { task->
                        if (task.isSuccessful){
                            Toast.makeText(this, "Loged In successful", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this,MainActivity::class.java))
                            finish()
                        }else{
                            Toast.makeText(this, "Sign In Failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }



    }
}