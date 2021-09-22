package com.example.vha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class HeartMonitor extends AppCompatActivity {

    private Python py;
    private PyObject module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_monitor);
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        py = Python.getInstance();
        module = py.getModule("plot");
    }
    public void onDayClick(View v){
        byte[] bytes = module.callAttr("plot").toJava(byte[].class);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0, bytes.length);
        ImageView graph = findViewById(R.id.heartgraph);
        graph.setImageBitmap(bitmap);
    }
}