package com.example.lizeyuan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String string = new String("");
        string = new String("第二次提交");
        string = new String("第三次提交");
        string = new String("第四次提交");
        string = new String("分支1第1次提交");
        string = new String("分支1第2次提交");
// 到这里已经合并完分支了
        string = new String("master第2次提交");

        string = new String("分支master第1次提交");
        string = new String("分支2第1次提交");
        string = new String("分支2第2次提交");
        string = new String("分支2第3次提交");
        // rebase完成
        //rebase第二次完成
        //rebase第三次完成




        string.charAt(0);




    }
}
