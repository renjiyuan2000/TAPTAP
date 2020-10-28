package com.example.taptap;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends Activity {
    Button bt;
    Button bt0;
    ImageView iv;
    int Alpha = 255;
    private TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// 保存当前页面状态信息

        Bundle bundle = this.getIntent().getExtras();// 获取前一个页面传递来的数据
        String myName = bundle.getString("name");
        String mypassword = bundle.getString("password");

        if ((myName.equals("string") & mypassword.equals("123"))
        ) //密码规则自己在这里面设置
        {

            setContentView(R.layout.second);// 显示下一跳页面
            tv = (TextView) findViewById(R.id.tv1);
            tv.setText("          欢迎" + myName + "登陆");

        } else {
            setContentView(R.layout.no);// 显示下一跳页面
        }
    }

}
