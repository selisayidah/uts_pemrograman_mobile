package umats.ac.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class apersepsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apersepsi);
        getSupportActionBar().setTitle("apersepsi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
