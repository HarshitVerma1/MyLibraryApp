package com.harshit.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView javaCardview,pythonCardView,javaScriptCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        javaCardview=findViewById(R.id.Java);
        javaScriptCardView=findViewById(R.id.JavaScript);
        pythonCardView=findViewById(R.id.Python);
        allActions();
    }

    private void allActions() {
        javaCardview.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,PDFViewer.class);
            startActivity(intent);
        });
        pythonCardView.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,PDFViewer.class);
            startActivity(intent);
        });
        javaScriptCardView.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,PDFViewer.class);
            startActivity(intent);
        });
    }
}