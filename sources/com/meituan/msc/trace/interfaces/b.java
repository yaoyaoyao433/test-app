package com.meituan.msc.trace.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    private static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06b7516c8eff2d50f1fd50dd6e434732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06b7516c8eff2d50f1fd50dd6e434732");
        } else if (b == null) {
            throw new IllegalStateException("init method should be called at first");
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "888a3ae25b6c3c5e8d2f90297dfe699f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "888a3ae25b6c3c5e8d2f90297dfe699f")).booleanValue();
        }
        c();
        return b.a();
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b246f72502ce3e1825517125481b97cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b246f72502ce3e1825517125481b97cb");
        } else {
            c();
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff7c36837547f4d47416addacb525866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff7c36837547f4d47416addacb525866");
        } else {
            c();
        }
    }

    public static void a(String str, long j, long j2, String str2) {
        Object[] objArr = {str, new Long(j), new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae5dc8183547e235d10c30d013efd5cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae5dc8183547e235d10c30d013efd5cc");
        } else {
            c();
        }
    }

    public static void b(String str, long j, long j2, String str2) {
        Object[] objArr = {str, new Long(j), new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "998ca036547c6d64f669085fd5ca8f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "998ca036547c6d64f669085fd5ca8f03");
        } else {
            c();
        }
    }

    public static void c(String str, long j, long j2, String str2) {
        Object[] objArr = {str, new Long(j), new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0900ffef0194b466c6e2716077732610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0900ffef0194b466c6e2716077732610");
        } else {
            c();
        }
    }
}
