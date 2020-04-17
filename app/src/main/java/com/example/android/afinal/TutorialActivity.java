package com.example.android.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends AppCompatActivity {
    private List<Tutorial> tutorials;
    private TutorialAdapter tutorialsAdapter;
    private RecyclerView recyclerView;
    private List<String> link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setTitle("Tutorials List");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tutorialsAdapter = new TutorialAdapter(tutorials,this,link);
        recyclerView.setAdapter(tutorialsAdapter);

    }

    private void initialData(){
        tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(R.drawable.e1,getString(R.string.ep1),getString(R.string.dur1)));
        tutorials.add(new Tutorial(R.drawable.e2,getString(R.string.ep2),getString(R.string.dur2)));
        tutorials.add(new Tutorial(R.drawable.e3,getString(R.string.ep3),getString(R.string.dur3)));
        tutorials.add(new Tutorial(R.drawable.e4,getString(R.string.ep4),getString(R.string.dur4)));
        tutorials.add(new Tutorial(R.drawable.e5,getString(R.string.ep5),getString(R.string.dur5)));
        tutorials.add(new Tutorial(R.drawable.e6,getString(R.string.ep6),getString(R.string.dur6)));
        tutorials.add(new Tutorial(R.drawable.e7,getString(R.string.ep7),getString(R.string.dur7)));
        tutorials.add(new Tutorial(R.drawable.e8,getString(R.string.ep8),getString(R.string.dur8)));
        tutorials.add(new Tutorial(R.drawable.e9,getString(R.string.ep9),getString(R.string.dur9)));
        tutorials.add(new Tutorial(R.drawable.e10,getString(R.string.ep10),getString(R.string.dur10)));
        tutorials.add(new Tutorial(R.drawable.e11,getString(R.string.ep11),getString(R.string.dur11)));
        tutorials.add(new Tutorial(R.drawable.e12,getString(R.string.ep12),getString(R.string.dur12)));
        tutorials.add(new Tutorial(R.drawable.e13,getString(R.string.ep13),getString(R.string.dur13)));
        tutorials.add(new Tutorial(R.drawable.e14,getString(R.string.ep14),getString(R.string.dur14)));
        tutorials.add(new Tutorial(R.drawable.e15,getString(R.string.ep15),getString(R.string.dur15)));
        tutorials.add(new Tutorial(R.drawable.e16,getString(R.string.ep16),getString(R.string.dur16)));

        link = new ArrayList<>();
        link.add("QaHk70PVgr0");
        link.add("C_lbFaIbJi4");
        link.add("8Ayrx0II0oQ");
        link.add("WEGnl6zBzvI");
        link.add("04Y013bEazE");
        link.add("Ga7Acqde8E8");
        link.add("GJ4qvdCpknY");
        link.add("JVu5mje7y0w");
        link.add("bzMAhntWkcM");
        link.add("pCXDQmfNIZw");
        link.add("JW3slJKbhHU");
        link.add("7LySouKNwcc");
        link.add("TC92uqmbqWU");
        link.add("ndXchVJ1aWI");
        link.add("qkN0NwZ9mg8");
        link.add("H-Hggllgcao");
    }

}
