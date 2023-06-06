package com.huawei.hms.framework.network.grs.d;

import com.huawei.hms.framework.common.Logger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    private static final String a = "e";

    public static boolean a(Long l) {
        if (l == null) {
            Logger.v(a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v(a, "isSpExpire spValue NumberFormatException.");
        }
        if (l.longValue() - System.currentTimeMillis() >= 0) {
            Logger.v(a, "isSpExpire false.");
            return false;
        }
        Logger.v(a, "isSpExpire true.");
        return true;
    }

    public static boolean a(Long l, long j) {
        if (l == null) {
            Logger.v(a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.v(a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
