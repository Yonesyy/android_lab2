package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.example.a2.databinding.ActivityMainBinding;
import com.example.a2.models.User;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        binding.setUser(new User("Andrew", "Nikolsky", 19, "AB943284"));
    }
}