package com.example.taptap;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class shiyi extends MainActivity {
    Button bt;
    Button bt0;
    ImageView iv;
    int Alpha = 255;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// 保存当前页面状态信息
        Bundle bundle = this.getIntent().getExtras();// 获取前一个页面传递来的数据
        String password1 = bundle.getString("password1");
        String mypassword = bundle.getString("password");
        if (password1.equals(mypassword)) {
            setContentView(R.layout.yse);// 显示下一跳页面
            bt = (Button) findViewById(R.id.login_button2);
            bt.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {

                    Intent intent = new Intent();

                    intent.setClass(shiyi.this, MainActivity.class);// 指定接下来要启动的class

                    startActivity(intent);
                }
            });

        } else {
            setContentView(R.layout.register);// 显示下一跳页面
            Toast.makeText(shiyi.this, "两次输入的密码不一致!",
                    Toast.LENGTH_SHORT).show();
            bt = (Button) findViewById(R.id.login_button11);
            bt.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {

                    Intent intent = new Intent();

                    intent.setClass(shiyi.this, register.class);// 指定接下来要启动的class

                    startActivity(intent);
                }
            });
        }

    }
}
