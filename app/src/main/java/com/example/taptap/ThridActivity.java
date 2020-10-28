package com.example.taptap;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ThridActivity extends AppCompatActivity {

    // fruitList用于存储数据
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // 先拿到数据并放在适配器上
        initFruits(); //初始化水果数据
        FruitAdapter adapter=new FruitAdapter(ThridActivity.this,R.layout.fruit_item,fruitList);

        // 将适配器上的数据传递给listView
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // 为ListView注册一个监听器，当用户点击了ListView中的任何一个子项时，就会回调onItemClick()方法
        // 在这个方法中可以通过position参数判断出用户点击的是那一个子项
    }

    // 初始化数据
    private void initFruits(){
        for(int i=0;i<10;i++){
            Fruit a=new Fruit("a",R.drawable.a);
            fruitList.add(a);
            Fruit b=new Fruit("B",R.drawable.b);
            fruitList.add(b);
            Fruit c=new Fruit("C",R.drawable.c);
            fruitList.add(c);
            Fruit d=new Fruit("D",R.drawable.d);
            fruitList.add(d);
        }
    }
}