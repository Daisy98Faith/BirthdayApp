// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.android.birthdayapp;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    public MainActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001b);
        bundle = (TextView)findViewById(0x7f0d007c);
        TextView textview = (TextView)findViewById(0x7f0d007d);
        TextView textview1 = (TextView)findViewById(0x7f0d007e);
        ImageView imageview = (ImageView)findViewById(0x7f0d007b);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Yes, it's really yours.", 0).show();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;
            final String val$welcome[];

            public void onClick(View view)
            {
                Snackbar.make(view, "Have a happy birthday.", -2).setAction("THANKS", new android.view.View.OnClickListener() {

                    final _cls2 this$1;

                    public void onClick(View view)
                    {
                        Toast.makeText(_fld0, welcome[(new Random()).nextInt(welcome.length)], 1).show();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                }).show();
            }

            
            {
                this$0 = MainActivity.this;
                welcome = as;
                super();
            }
        });
        textview1.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Yes, it's really from me.", 0).show();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        imageview.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;
            final String val$idle[];

            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, idle[(new Random()).nextInt(idle.length)], 1).show();
            }

            
            {
                this$0 = MainActivity.this;
                idle = as;
                super();
            }
        });
    }
}
