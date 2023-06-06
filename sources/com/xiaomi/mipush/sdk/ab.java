package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.az;
/* loaded from: classes6.dex */
public final class ab {
    public static a a(Context context, as asVar) {
        az.a a = az.a(asVar);
        if (a == null || TextUtils.isEmpty(a.a) || TextUtils.isEmpty(a.b)) {
            return null;
        }
        return (a) com.xiaomi.push.am.a(a.a, a.b, context);
    }
}
