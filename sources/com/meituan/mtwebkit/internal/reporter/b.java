package com.meituan.mtwebkit.internal.reporter;

import com.meituan.mtwebkit.internal.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x06a6, code lost:
        if (r30.equals("mtwebview_preload") != false) goto L19;
     */
    @Override // com.meituan.mtwebkit.internal.reporter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r30, java.util.Map<java.lang.String, java.lang.Object> r31) {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.reporter.b.a(java.lang.String, java.util.Map):void");
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a32274cb218eed50254e39d3cac458", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a32274cb218eed50254e39d3cac458") : com.meituan.mtwebkit.internal.a.b() ? "1" : "0";
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b18b290c0000adb34768562544be7e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b18b290c0000adb34768562544be7e")).booleanValue() : i < h.y();
    }
}
