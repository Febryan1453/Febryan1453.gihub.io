package com.febryan.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.febryan.intentactivity.databinding.ActivityMoveObjectBinding;

public class MoveObjectActivity extends AppCompatActivity {

    private ActivityMoveObjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMoveObjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Mobil mobil = getIntent().getParcelableExtra("MOBIL");

        binding.tvMerk.setText(mobil.getMerk());
        binding.tvPlatNomor.setText(mobil.getPlatNomor());
        binding.tvKodePlat.setText(String.valueOf(mobil.getKodePlat()));
        binding.tvTahun.setText(String.valueOf(mobil.getTahun()));
        binding.tvKilometer.setText(String.valueOf(mobil.getKilometer()));
        binding.tvKondisi.setText(mobil.isKondisi() ? "Baru" : "Bekas");

    }
}