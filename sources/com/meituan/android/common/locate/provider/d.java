package com.meituan.android.common.locate.provider;

import android.os.Bundle;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class d {
    private static MtLocation a = null;
    private static long b = -1;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public MtLocation a;
        public long b;

        public a(MtLocation mtLocation, long j) {
            this.a = mtLocation;
            this.b = j;
        }
    }

    public static synchronized a a() {
        synchronized (d.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca139a725e6e5bec632c04bf32073f12", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca139a725e6e5bec632c04bf32073f12");
            }
            return new a(a, b);
        }
    }

    public static synchronized void a(int i) {
        Bundle extras;
        synchronized (d.class) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b6973f53e4b39c099c4a21ae28c0e5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b6973f53e4b39c099c4a21ae28c0e5d");
                return;
            }
            if (a != null && (extras = a.getExtras()) != null) {
                extras.putInt("gpsQuality", i);
            }
        }
    }

    public static synchronized void a(MtLocation mtLocation, long j) {
        synchronized (d.class) {
            a = mtLocation;
            b = j;
        }
    }
}
