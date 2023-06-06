package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class af {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    public static j a() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "604a28726edbe253d4c0e04e1164b41a", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "604a28726edbe253d4c0e04e1164b41a");
        }
        if (y.a().d == null) {
            synchronized (j.class) {
                if (b == null) {
                    b = new a();
                }
                aVar = b;
            }
            return aVar;
        }
        return y.a().d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a implements j {
        public a() {
        }
    }
}
