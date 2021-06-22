package com.febryan.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.febryan.intentactivity.databinding.ActivityMoveWithResultBinding;

public class MoveWithResultActivity extends AppCompatActivity {

    private ActivityMoveWithResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMoveWithResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSend.setOnClickListener(v -> {
            String namaBarang = binding.edtNamaBarang.getText().toString();
            String jumlah = binding.edtJumlahBarang.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("NAMA-BARANG", namaBarang);
            intent.putExtra("JUM-BARANG", jumlah);
            setResult(200, intent);
            finish();
        });

    }
}