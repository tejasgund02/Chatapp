package com.jvs.chatapp.screens;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jvs.chatapp.databinding.ActivitySigninBinding;

public class SigninActivity extends AppCompatActivity {

    ActivitySigninBinding binding;

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding =  ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

}