package com.facebook.react.common;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        q.a(context, "rn_default").a(str, str2);
    }

    public static File a(Context context) {
        File a = q.a(context, "rn_default", "cache", u.b);
        if (a != null) {
            a.mkdirs();
        }
        return a;
    }

    public static File b(Context context) {
        File b = q.b(context, "rn_default", "cache", u.b);
        if (b != null) {
            b.mkdirs();
        }
        return b;
    }
}
