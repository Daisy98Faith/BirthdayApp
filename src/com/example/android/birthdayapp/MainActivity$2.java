// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.android.birthdayapp;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;
import java.util.Random;

// Referenced classes of package com.example.android.birthdayapp:
//            MainActivity

class val.welcome
    implements android.view.tener
{

    final MainActivity this$0;
    final String val$welcome[];

    public void onClick(View view)
    {
        Snackbar.make(view, "Have a happy birthday.", -2).setAction("THANKS", new android.view.View.OnClickListener() {

            final MainActivity._cls2 this$1;

            public void onClick(View view1)
            {
                Toast.makeText(this$0, welcome[(new Random()).nextInt(welcome.length)], 1).show();
            }

            
            {
                this$1 = MainActivity._cls2.this;
                super();
            }
        }).show();
    }

    _cls1.this._cls1()
    {
        this$0 = final_mainactivity;
        val$welcome = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
