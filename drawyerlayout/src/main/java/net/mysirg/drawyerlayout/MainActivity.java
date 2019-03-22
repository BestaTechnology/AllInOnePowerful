package net.mysirg.drawyerlayout;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    DrawerLayout drawerLayout;
    ListView listView;

    String[] planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout =(DrawerLayout)findViewById(R.id.drawerlayout);
        listView =(ListView)findViewById(R.id.drawerList);
        planets = getResources().getStringArray(R.array.planets);

        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planets));

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),planets[position]+""+" was clicked",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
