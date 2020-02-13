package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_Hasil,btn_Hasil2,btn_Hasil3,btn_Hasil4,btn_Hasil5,btn_Hasil6,btn_Hasil7;
    private TextView tvHasil;
    private EditText angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Hasil = findViewById(R.id.btn_hasil);
        btn_Hasil2 = findViewById(R.id.btn_hasil2);
        btn_Hasil3 = findViewById(R.id.btn_hasil3);
        btn_Hasil4 = findViewById(R.id.btn_hasil4);
        btn_Hasil5 = findViewById(R.id.btn_hasil5);
        btn_Hasil6 = findViewById(R.id.btn_hasil6);
        btn_Hasil7 = findViewById(R.id.btn_hasil7);
        tvHasil = findViewById(R.id.tv_hasil);
        angka = findViewById(R.id.angka);

        btn_Hasil.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = Math.sin(java.lang.Math.toRadians(angka));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});

        btn_Hasil2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = Math.cos(Math.toRadians(angka));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});

        btn_Hasil3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = Math.tan(Math.toRadians(angka));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});

        btn_Hasil4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = (Math.cos(Math.toRadians(angka)) / Math.sin(java.lang.Math.toRadians(angka)));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});

        btn_Hasil5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = (1 / Math.sin(Math.toRadians(angka)));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});

        btn_Hasil6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = (1 / Math.cos(Math.toRadians(angka)));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});

        btn_Hasil7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka = angka.getText().toString();
                    double angka = Double.parseDouble(sAngka);
                    double hasil = (Math.log10(angka));
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }}});
    }

}
