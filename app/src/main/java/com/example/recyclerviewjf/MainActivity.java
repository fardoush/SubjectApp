package com.example.recyclerviewjf;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private int[] images={R.drawable.c,R.drawable.php,R.drawable.c,R.drawable.php,R.drawable.c,R.drawable.php,R.drawable.c,R.drawable.php,R.drawable.c,R.drawable.php};
    private String[] name ={"C Programming","Php","C Programming","Php","C Programming","Php","C Programming","Php","C Programming","Php"};
    
    private List<Subject> subjectList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        prepareData();

//        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
//        startActivity(intent);

    }

    private void prepareData() {
        for (int i=0;i<name.length;i++){
            subjectList.add(new Subject(images[i],name[i]));
            }
        SubjectAdapter adapter= new SubjectAdapter(this,subjectList);
        recyclerView.setAdapter(adapter);

    }

    private void initView() {
        recyclerView=findViewById(R.id.recyclerId);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
