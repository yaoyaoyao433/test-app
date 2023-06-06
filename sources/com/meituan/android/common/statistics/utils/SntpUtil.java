package com.meituan.android.common.statistics.utils;

import android.content.Context;
import com.meituan.android.time.a;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SntpUtil {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isTimeSynchronized = false;

    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b58cebaceac0947eff7f3c26b62fcc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b58cebaceac0947eff7f3c26b62fcc7");
        } else if (context != null) {
            c.a(context);
            c.d().b = new a() { // from class: com.meituan.android.common.statistics.utils.SntpUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.time.a
                public final void trustedTimeCallBack(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ebc61d51595c085112be0d335e0da96", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ebc61d51595c085112be0d335e0da96");
                    } else {
                        boolean unused = SntpUtil.isTimeSynchronized = z;
                    }
                }
            };
        }
    }

    public static synchronized boolean isTimeSynchronized() {
        boolean z;
        synchronized (SntpUtil.class) {
            z = isTimeSynchronized;
        }
        return z;
    }

    public static long currentTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a865851f72d617967e511e72d2414124", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a865851f72d617967e511e72d2414124")).longValue() : c.b();
    }

    public static synchronized void setTimeSynchronized(boolean z) {
        synchronized (SntpUtil.class) {
            isTimeSynchronized = z;
        }
    }
}
