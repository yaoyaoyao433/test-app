package com.meituan.android.quickpass.uptsm.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static a b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2);
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e4a00b7794c1f6caca980370475b329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e4a00b7794c1f6caca980370475b329");
        } else {
            b.a(0L, str, 0, 0, i, 0, 0, 0, null);
        }
    }

    public static void a(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "306d15c9bb12ac24878428e3de933628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "306d15c9bb12ac24878428e3de933628");
        } else {
            b.a(0L, str, 0, 0, i, 0, 0, (int) j, null);
        }
    }
}
