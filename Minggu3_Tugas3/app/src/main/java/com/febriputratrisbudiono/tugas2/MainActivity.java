package com.febriputratrisbudiono.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionLinLayout(View view) {
        Toast.makeText(this, "Linier Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout2(View view) {
        Toast.makeText(this, "Relative Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout3(View view) {
        Toast.makeText(this, "Controller Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout4(View view) {
        Toast.makeText(this, "Linier Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout5(View view) {
        Toast.makeText(this, "Tabel Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout6(View view) {
        Toast.makeText(this, "Material Design", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout7(View view) {
        Toast.makeText(this, "Scroll View", Toast.LENGTH_SHORT).show();
    }

    public void actionLinLayout8(View view) {
        Toast.makeText(this, "Scroll View Horizontal", Toast.LENGTH_SHORT).show();
    }
}