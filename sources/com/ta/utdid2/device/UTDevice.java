package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.a.a.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UTDevice {
    public static String d(Context context) {
        a b = b.b(context);
        return (b == null || g.m29a(b.f())) ? "ffffffffffffffffffffffff" : b.f();
    }

    public static String e(Context context) {
        String h = c.a(context).h();
        return (h == null || g.m29a(h)) ? "ffffffffffffffffffffffff" : h;
    }

    @Deprecated
    public static String getUtdid(Context context) {
        return d(context);
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        return e(context);
    }
}
