package com.meituan.android.yoda.model.behavior.tool;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static g b;
    private static View d;
    private static List<MotionEvent> c = new ArrayList(128);
    private static long e = 0;
    private static Random f = new Random();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (r4 > (com.meituan.robust.PatchProxy.isSupport(r6, null, r7, true, "3586c9f8da9107a0eb72ebe70c5ed962", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Long) com.meituan.robust.PatchProxy.accessDispatch(r6, null, r7, true, "3586c9f8da9107a0eb72ebe70c5ed962")).longValue() : com.meituan.android.yoda.model.behavior.tool.h.f.nextInt(10) + 10)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r20, android.view.MotionEvent r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.model.behavior.tool.h.a(android.view.View, android.view.MotionEvent, boolean):void");
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e318ecc4f8ee100b7beac635f9d31868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e318ecc4f8ee100b7beac635f9d31868");
            return;
        }
        c.clear();
        d = null;
        e = 0L;
    }
}
