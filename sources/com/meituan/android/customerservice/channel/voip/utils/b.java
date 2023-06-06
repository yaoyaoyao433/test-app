package com.meituan.android.customerservice.channel.voip.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static a b;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11d0df3a42b1ec8995f2d7da4c2a1743", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11d0df3a42b1ec8995f2d7da4c2a1743")).longValue();
        }
        if (b != null) {
            return b.a();
        }
        return -1L;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b528e0e33835bf157fcdaf49f58ce98a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b528e0e33835bf157fcdaf49f58ce98a") : b != null ? b.d() : "";
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7b5f0b5b6c2244cde888b1c1cf7b4f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7b5f0b5b6c2244cde888b1c1cf7b4f3")).booleanValue();
        }
        if (b != null) {
            return b.e();
        }
        return false;
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e29384942df1b7cf56e6a3de081e1342", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e29384942df1b7cf56e6a3de081e1342") : b != null ? b.f() : "";
    }

    public static int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5edc0a9280d0c45b476a5d1e3a6418a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5edc0a9280d0c45b476a5d1e3a6418a3")).intValue();
        }
        if (b != null) {
            return b.g();
        }
        return 0;
    }
}
