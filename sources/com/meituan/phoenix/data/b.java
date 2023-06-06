package com.meituan.phoenix.data;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public ConcurrentHashMap<String, d> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4898055e413a3471e064e71eda9cb2ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4898055e413a3471e064e71eda9cb2ef");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e376f3e3a6d70edb0b0db2989f427c1", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e376f3e3a6d70edb0b0db2989f427c1") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static b a = new b();
    }

    public final void a(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3d23f2b2ba0137273676300ce7d809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3d23f2b2ba0137273676300ce7d809");
        } else if (TextUtils.isEmpty(str) || dVar == null) {
        } else {
            this.b.put(str, dVar);
        }
    }

    public final void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57828e28cf889ecd8db1b8da9a65fa2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57828e28cf889ecd8db1b8da9a65fa2f");
            return;
        }
        d a2 = com.meituan.phoenix.data.a.a(str);
        if (a2 == null) {
            c.a(str, str2);
            return;
        }
        a(str, a2);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.meituan.phoenix.data.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d266f946302e25cc66cdd90179f2aa61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d266f946302e25cc66cdd90179f2aa61");
                } else {
                    c.a(str, str2);
                }
            }
        }, 10000L);
    }
}
