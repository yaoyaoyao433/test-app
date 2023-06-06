package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class gy {
    private static volatile gy c;
    public final Context a;
    public Map<String, gz> b = new HashMap();

    private gy(Context context) {
        this.a = context;
    }

    public static gy a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (c == null) {
            synchronized (gy.class) {
                if (c == null) {
                    c = new gy(context);
                }
            }
        }
        return c;
    }

    public final boolean a(he heVar, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (com.xiaomi.push.service.az.a(heVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(heVar.i)) {
                heVar.i = com.xiaomi.push.service.az.a();
            }
            heVar.k = str;
            com.xiaomi.push.service.ba.a(this.a, heVar);
            return true;
        }
    }
}
