package com.vivo.push.util;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class w extends b {
    private static w b;

    public static synchronized w b() {
        w wVar;
        synchronized (w.class) {
            if (b == null) {
                b = new w();
            }
            wVar = b;
        }
        return wVar;
    }

    public final synchronized void a(Context context) {
        if (this.a == null) {
            this.a = context;
            a(context, "com.vivo.push_preferences");
        }
    }

    public final byte[] c() {
        byte[] c = c(b("com.vivo.push.secure_cache_iv", ""));
        return (c == null || c.length <= 0) ? new byte[]{34, 32, 33, 37, 33, 34, 32, 33, 33, 33, 34, 41, 35, 32, 32, 32} : c;
    }

    public final byte[] d() {
        byte[] c = c(b("com.vivo.push.secure_cache_key", ""));
        return (c == null || c.length <= 0) ? new byte[]{33, 34, 35, 36, 37, 38, 39, 40, 41, 32, 38, 37, 36, 35, 34, 33} : c;
    }

    private static byte[] c(String str) {
        int i;
        byte[] bArr = null;
        try {
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            if (split.length > 0) {
                byte[] bArr2 = new byte[split.length];
                try {
                    i = split.length;
                    bArr = bArr2;
                } catch (Exception e) {
                    e = e;
                    bArr = bArr2;
                    p.a("SharePreferenceManager", "getCodeBytes error:" + e.getMessage());
                    return bArr;
                }
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = Byte.parseByte(split[i2].trim());
            }
        } catch (Exception e2) {
            e = e2;
        }
        return bArr;
    }
}
