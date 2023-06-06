package com.meituan.android.yoda.config.launch;

import android.support.annotation.Nullable;
import com.meituan.android.yoda.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static a b;
    private static a c;

    static {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c.a;
        b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5531c8472459e7740fea6868624f01b4", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5531c8472459e7740fea6868624f01b4") : new c();
    }

    public static a a() {
        return c != null ? c : b;
    }

    public static void b() {
        c = null;
    }

    public static void a(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b8cff7dc021c11606d9235e7e8da1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b8cff7dc021c11606d9235e7e8da1c");
            return;
        }
        c = null;
        c = aVar;
    }
}
