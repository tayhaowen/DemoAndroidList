package sg.edu.rp.c346.id20042303.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> alAndroidVersion;
    //ArrayAdapter<AndroidVersion> aa;
    CustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);

        alAndroidVersion = new ArrayList<>();
        alAndroidVersion.add(new AndroidVersion("Pie","9.0"));
        alAndroidVersion.add(new AndroidVersion("Oreo","8.0"));
        alAndroidVersion.add(new AndroidVersion("Nougat","7.0"));

        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,alAndroidVersion);
        //lv.setAdapter(aa);

        adapter = new CustomerAdapter(MainActivity.this, R.layout.row, alAndroidVersion);
        lv.setAdapter(adapter);
    }
}
