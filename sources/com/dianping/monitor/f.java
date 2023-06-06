package com.dianping.monitor;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f e;
    public final g b;
    public final AtomicLong c;
    public final AtomicInteger d;

    private f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfdc89c8d5bf8e9f7b1ebc01bcdb70fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfdc89c8d5bf8e9f7b1ebc01bcdb70fd");
            return;
        }
        this.b = new g(context != null ? context.getApplicationContext() : null);
        this.c = new AtomicLong(0L);
        this.d = new AtomicInteger(0);
    }

    public static f a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ee1e64bdbe255533a36a3319297f76d", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ee1e64bdbe255533a36a3319297f76d");
        }
        if (e == null) {
            synchronized (f.class) {
                if (e == null) {
                    e = new f(context);
                }
            }
        }
        return e;
    }
}
