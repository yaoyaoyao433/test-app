package com.meituan.roodesign.widgets.animator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a38df3e59e325b0f211156ea8407a37", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a38df3e59e325b0f211156ea8407a37") : new a();
    }

    public static long a(long[]... jArr) {
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a4d62400feaf6a10b0d19ac4a62dc53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a4d62400feaf6a10b0d19ac4a62dc53")).longValue();
        }
        long j = 0;
        if (jArr.length == 0) {
            return 0L;
        }
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] != null && jArr[i].length != 0 && jArr[i][jArr[i].length - 1] > j) {
                j = jArr[i][jArr[i].length - 1];
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.ValueAnimator a(com.meituan.roodesign.widgets.animator.b r31) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.roodesign.widgets.animator.a.a(com.meituan.roodesign.widgets.animator.b):android.animation.ValueAnimator");
    }
}
