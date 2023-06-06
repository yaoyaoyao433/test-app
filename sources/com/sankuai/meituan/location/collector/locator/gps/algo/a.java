package com.sankuai.meituan.location.collector.locator.gps.algo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static int b = 0;
    private static long c = 0;
    private static long d = 0;
    private static double e = -1.0d;

    /* renamed from: com.sankuai.meituan.location.collector.locator.gps.algo.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0600a {
        public long a;
        public double b;

        public C0600a(long j, double d) {
            this.a = j;
            this.b = d;
        }
    }

    public static C0600a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcec00dc2af00a6db036deaadf54886e", RobustBitConfig.DEFAULT_VALUE) ? (C0600a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcec00dc2af00a6db036deaadf54886e") : new C0600a(d, e);
    }
}
