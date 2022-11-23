package umats.ac.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tujuan = findViewById(R.id.tujuan);
        Button pemantik = findViewById(R.id.pemantik);
        Button peta = findViewById(R.id.petakonsep);
        Button apersepsi = findViewById(R.id.apersepsi);
        Button katakunci = findViewById(R.id.katakunci);
        Button materi = findViewById(R.id.materi);
        Button tentang = findViewById(R.id.tentang);

        tujuan.setOnClickListener(this);
        pemantik.setOnClickListener(this);
        peta.setOnClickListener(this);
        apersepsi.setOnClickListener(this);
        katakunci.setOnClickListener(this);
        materi.setOnClickListener(this);
        tentang.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tujuan:
                Intent haltujuan = new Intent(MainActivity.this,tujuanpembelajaran.class);
                startActivity(haltujuan);
                break;
            case R.id.pemantik:
                Intent halpemantik = new Intent(MainActivity.this,pemantik.class);
                startActivity(halpemantik);
                break;
            case R.id.petakonsep:
                Intent halpetakonsep = new Intent(MainActivity.this,peta.class);
                startActivity(halpetakonsep);
                break;
            case R.id.katakunci:
                Intent halkatakunci = new Intent(MainActivity.this,kata_kunci.class);
                startActivity(halkatakunci);
                break;
            case R.id.apersepsi:
                Intent halapersepsi = new Intent(MainActivity.this,apersepsi.class);
                startActivity(halapersepsi);
                break;
            case R.id.materi:
                Intent  halmateri = new Intent(MainActivity.this,materi.class);
                startActivity(halmateri);
                break;
            case R.id.tentang:
                Intent haltentang = new Intent(MainActivity.this,tentang.class);
                startActivity(haltentang);
                break;


        }
    }


}
