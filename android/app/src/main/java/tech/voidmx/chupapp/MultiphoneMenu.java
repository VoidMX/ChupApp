package tech.voidmx.chupapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MultiphoneMenu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiphonemenu);

        Button btnCreate, btnJoin;

        btnCreate = findViewById(R.id.btn_createMatch);
        btnJoin = findViewById(R.id.btn_joinMatch);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGameSets = new Intent(MultiphoneMenu.this,GameSets.class);
                startActivity(intentGameSets);
            }
        });

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJoin = new Intent(MultiphoneMenu.this,JoinMatch.class);
                startActivity(intentJoin);
            }
        });
    }
}
