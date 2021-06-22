package com.febryan.intentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.febryan.intentactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.d(TAG, "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    //    Batas Akhir Siklus Activity

    public void move(View view) {
        Intent intent = new Intent(MainActivity.this, MoveActivity.class);
        startActivity(intent);
    }

    public void moveData(View view) {
        String nama = "Adit Pernama";
        int umur = 20;
        double tinggi = 160.2;

        //Kirim data
        Intent intent = new Intent(MainActivity.this, MoveDataActivity.class);
        intent.putExtra("NAMA", nama);
        intent.putExtra("UMUR", umur);
        intent.putExtra("TINGGI", tinggi);
        startActivity(intent);
    }

    public void moveDataToApplication(View view) {
        String telp = "082191170349";
        Intent intent =new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + telp));
        startActivity(intent);
    }

    public void moveObject(View view) {

        Mobil mobil = new Mobil();
        mobil.setMerk("BMW");
        mobil.setKodePlat('B');
        mobil.setKilometer(22.3);
        mobil.setKondisi(true);
        mobil.setTahun(2021);
        mobil.setPlatNomor("4D5S");

        Intent intent = new Intent(MainActivity.this, MoveObjectActivity.class);
        intent.putExtra("MOBIL", mobil);
        startActivity(intent);

    }

    public void moveWithResult(View view) {
        Intent intent = new Intent(MainActivity.this, MoveWithResultActivity.class);
        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100){
            if (resultCode == 200){
                String nama = data.getStringExtra("NAMA-BARANG");
                String jum = data.getStringExtra("JUM-BARANG");
                binding.tvNamaBarang.setText(nama);
                binding.tvJumlahBarang.setText(jum);
            }
        }

    }
}