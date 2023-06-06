package com.meizu.cloud.pushsdk.notification.c;

import android.content.Context;
import android.content.res.AssetManager;
import com.meituan.robust.common.StringUtil;
import com.meizu.cloud.pushinternal.DebugLogger;
/* loaded from: classes3.dex */
public final class d {
    private static d a;
    private AssetManager b;

    public static int a(Context context, String str, String str2) {
        DebugLogger.i("ResourceReader", "Get resource type " + str2 + StringUtil.SPACE + str);
        return context.getResources().getIdentifier(str, str2, context.getApplicationInfo().packageName);
    }

    public static d a(Context context) {
        if (a == null) {
            a = new d(context);
        }
        return a;
    }

    private d(Context context) {
        this.b = context.getAssets();
    }
}
