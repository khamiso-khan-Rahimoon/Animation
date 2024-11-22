package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.animation.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class Sign_up : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private val binding:ActivitySignUpBinding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        binding.SignInbtn.setOnClickListener {
            startActivity(Intent(this,Sign_In::class.java))
        }

        binding.SignUppbtnxxx.setOnClickListener {
           val email = binding.emailsignup.text.toString()
           val password =  binding.passwordSignUp.text.toString()
            val confirmPassword = binding.confirmpasswordSignUp.text.toString()

            if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show()
            }else if (password != confirmPassword){
                Toast.makeText(this, "Confirm Password not Match", Toast.LENGTH_SHORT).show()
            }else{

                auth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful){
                            Toast.makeText(this, "Registration completed", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this,Sign_In::class.java))
                        }else{
                            Toast.makeText(this, "Sign up Failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                        }

                    }

            }


        }

    }
}