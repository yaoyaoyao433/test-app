package com.meituan.android.privacy.proxy;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class t {
    public static ChangeQuickRedirect a;
    private static volatile t c;
    Map<String, a> b;

    public t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfd959646caed4dc20cc1aedd09fb9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfd959646caed4dc20cc1aedd09fb9c");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    public static t a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a6d49bd702fbb76dec967c2d266fbe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a6d49bd702fbb76dec967c2d266fbe3");
        }
        if (c == null) {
            synchronized (t.class) {
                if (c == null) {
                    c = new t();
                }
            }
        }
        return c;
    }

    public final boolean a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c84e9ec9cc59b472032edde117d36cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c84e9ec9cc59b472032edde117d36cb")).booleanValue();
        }
        a aVar = this.b.get(str);
        return aVar == null || SystemClock.elapsedRealtime() - aVar.b > j * 1000;
    }

    public final long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5efc1e32a4c571ddd8640d51675ef44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5efc1e32a4c571ddd8640d51675ef44")).longValue();
        }
        a aVar = this.b.get(str);
        if (aVar != null) {
            return aVar.b;
        }
        return -1L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public Object a;
        public long b;

        public a() {
        }

        public a(Object obj, long j) {
            this.a = obj;
            this.b = j;
        }
    }
}
