package com.sankuai.waimai.machpro.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.h;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public LinkedHashMap<String, Long> c;
    private final Object d;
    private long e;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f9f549506834fe11b8279cfee7599e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f9f549506834fe11b8279cfee7599e");
            return;
        }
        this.d = new Object();
        this.c = new LinkedHashMap<>();
        this.b = str;
        this.e = h.a();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d92ccc9673cf4afdd995ffbedee1efe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d92ccc9673cf4afdd995ffbedee1efe2");
            return;
        }
        synchronized (this.d) {
            this.c.put(str, Long.valueOf(h.a() - this.e));
        }
    }
}
