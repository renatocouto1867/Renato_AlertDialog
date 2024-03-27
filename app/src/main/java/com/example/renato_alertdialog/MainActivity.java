package com.example.renato_alertdialog;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> lista;
    public static String itemText;
    public static MyAdapter myAdapter;
    private ListView listView;

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

        listView = findViewById(R.id.lista);
        carregaLista();

        listView.setOnItemClickListener((parent, view, position, id) -> {
            itemText = (String) parent.getItemAtPosition(position);
            Auxiliar.openDialogFragment(getSupportFragmentManager(), "dialog");
        });
    }

    private void carregaLista() {
        lista = (ArrayList<String>) Auxiliar.criaLista(MainActivity.this);
        myAdapter = new MyAdapter(this.getLayoutInflater(), lista);
        listView.setAdapter(myAdapter);
    }


}