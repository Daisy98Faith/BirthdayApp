// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompatApi24

static interface 
    extends 
{

    public abstract void onChildrenLoaded(String s, List list, Bundle bundle);

    public abstract void onError(String s, Bundle bundle);
}
