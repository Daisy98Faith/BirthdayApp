// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.android.birthdayapp;

import android.view.View;
import android.widget.Toast;
import java.util.Random;

// Referenced classes of package com.example.android.birthdayapp:
//            MainActivity

class val.idle
    implements android.view.tener
{

    final MainActivity this$0;
    final String val$idle[];

    public void onClick(View view)
    {
        Toast.makeText(MainActivity.this, val$idle[(new Random()).nextInt(val$idle.length)], 1).show();
    }

    ()
    {
        this$0 = final_mainactivity;
        val$idle = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
