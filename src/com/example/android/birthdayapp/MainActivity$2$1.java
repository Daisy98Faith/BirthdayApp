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

class this._cls1
    implements android.view.ner
{

    final l.welcome this$1;

    public void onClick(View view)
    {
        Toast.makeText(_fld0, welcome[(new Random()).nextInt(welcome.length)], 1).show();
    }

    l.welcome()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/example/android/birthdayapp/MainActivity$2

/* anonymous class */
    class MainActivity._cls2
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;
        final String val$welcome[];

        public void onClick(View view)
        {
            Snackbar.make(view, "Have a happy birthday.", -2).setAction("THANKS", new MainActivity._cls2._cls1()).show();
        }

            
            {
                this$0 = final_mainactivity;
                welcome = _5B_Ljava.lang.String_3B_.this;
                super();
            }
    }

}
