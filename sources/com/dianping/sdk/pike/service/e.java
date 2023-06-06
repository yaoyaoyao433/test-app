package com.dianping.sdk.pike.service;

import android.content.Context;
import com.dianping.sdk.pike.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e d;
    public final q b;
    public Map<String, q> c;
    private final Context e;
    private Object f;

    public static e a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e40ea34bb9061ce1b9fd19d210380631", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e40ea34bb9061ce1b9fd19d210380631");
        }
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = new e(context);
                }
            }
        }
        return d;
    }

    private e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a27bc950a531847f42a02a875d7a540", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a27bc950a531847f42a02a875d7a540");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.f = new Object();
        this.e = context;
        this.b = new q(context, "default");
    }

    public final q a(String str) {
        f.c cVar;
        q qVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e19c801f7428681f3430d682aa1a2330", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e19c801f7428681f3430d682aa1a2330");
        }
        try {
            if (com.dianping.nvtunnelkit.utils.f.b(str) && (cVar = com.dianping.sdk.pike.f.k().get(str)) != null && cVar.b != f.d.DEFAULT) {
                q qVar2 = this.c.get(cVar.a());
                if (qVar2 == null) {
                    synchronized (this.f) {
                        qVar = this.c.get(cVar.a());
                        if (qVar == null) {
                            qVar = new q(this.e, cVar.c);
                            this.c.put(cVar.a(), qVar);
                        }
                    }
                    return qVar;
                }
                return qVar2;
            }
        } catch (Exception e) {
            com.dianping.sdk.pike.i.a("PikeDelegate", "obtainRawClient error" + e);
        }
        return this.b;
    }
}
