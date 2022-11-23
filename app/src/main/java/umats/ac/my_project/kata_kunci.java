package umats.ac.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class kata_kunci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_kunci);
        getSupportActionBar().setTitle("kata_kunci");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
