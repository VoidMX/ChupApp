package tech.voidmx.chupapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvSingle, cvMulti;

        cvSingle = findViewById(R.id.cvGameMode_1);
        cvMulti = findViewById(R.id.cvGameMode_2);

        cvSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGameSets = new Intent(MainActivity.this,GameSets.class);
                startActivity(intentGameSets);
            }
        });

        cvMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMultiphone = new Intent(MainActivity.this,MultiphoneMenu.class);
                startActivity(intentMultiphone);
            }
        });

    }
}
