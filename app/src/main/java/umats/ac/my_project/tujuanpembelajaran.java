package umats.ac.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class tujuanpembelajaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuanpembelajaran);
        getSupportActionBar().setTitle("tujuanpembelajaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
