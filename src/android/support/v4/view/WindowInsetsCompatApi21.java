// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.WindowInsets;

class WindowInsetsCompatApi21
{

    WindowInsetsCompatApi21()
    {
    }

    public static Object consumeStableInsets(Object obj)
    {
        return ((WindowInsets)obj).consumeStableInsets();
    }

    public static int getStableInsetBottom(Object obj)
    {
        return ((WindowInsets)obj).getStableInsetBottom();
    }

    public static int getStableInsetLeft(Object obj)
    {
        return ((WindowInsets)obj).getStableInsetLeft();
    }

    public static int getStableInsetRight(Object obj)
    {
        return ((WindowInsets)obj).getStableInsetRight();
    }

    public static int getStableInsetTop(Object obj)
    {
        return ((WindowInsets)obj).getStableInsetTop();
    }

    public static boolean hasStableInsets(Object obj)
    {
        return ((WindowInsets)obj).hasStableInsets();
    }

    public static boolean isConsumed(Object obj)
    {
        return ((WindowInsets)obj).isConsumed();
    }

    public static Object replaceSystemWindowInsets(Object obj, Rect rect)
    {
        return ((WindowInsets)obj).replaceSystemWindowInsets(rect);
    }
}
