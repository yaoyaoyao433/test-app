package com.xiaomi.push;

import android.content.Context;
/* loaded from: classes6.dex */
public class dy {
    private static volatile dy b;
    public dz a;

    private dy(Context context) {
        this.a = du.a(context);
    }

    public static dy a(Context context) {
        if (b == null) {
            synchronized (dy.class) {
                if (b == null) {
                    b = new dy(context);
                }
            }
        }
        return b;
    }

    public final void a(long j) {
        this.a.a(j);
    }
}
