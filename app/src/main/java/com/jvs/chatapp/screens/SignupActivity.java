package com.jvs.chatapp.screens;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jvs.chatapp.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {
    ActivitySignupBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

}