package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.cu;
import com.xiaomi.push.cv;
/* loaded from: classes6.dex */
public final class i implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        context = g.a;
        cu a = cu.a(context);
        com.xiaomi.push.m.a(a.a).a(new cv(a), 0);
    }
}
