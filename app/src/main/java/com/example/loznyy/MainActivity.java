package com.example.loznyy;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private int licznikKliknienc =0;
private TextView textViewPytanie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewPytanie = findViewById(R.id.textViewPytanie);
    }

    public void sprawdzOk(View view) {
        Toast.makeText(MainActivity.this, "ten kolor nalezy do flagi polski nie klikaj go", Toast.LENGTH_SHORT).show();
    }

    public void sprawdzUkryj(View view) {
        view.setVisibility(INVISIBLE);
        licznikKliknienc++;
        if (licznikKliknienc ==4) {
            textViewPytanie.setText("Brawo \n to jest flaga polski");
        }
    }
}