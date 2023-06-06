package com.dianping.sdk.pike.service;

import com.dianping.sdk.pike.agg.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r {
    public static ChangeQuickRedirect a;
    public q b;
    final Map<String, List<a>> c;
    final Map<String, List<b>> d;
    final Map<String, List<d.a>> e;

    public r(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824a5fdd9d6648e986f3db1623459c7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824a5fdd9d6648e986f3db1623459c7a");
            return;
        }
        this.b = qVar;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ecfa1489434e05711a7a2720361391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ecfa1489434e05711a7a2720361391");
            return;
        }
        for (Map.Entry<String, List<a>> entry : this.c.entrySet()) {
            List<a> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                Iterator<a> it = value.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public final a a(String str) {
        List<a> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a0b4ff9fb4a39634e3bd7c57bbfbf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a0b4ff9fb4a39634e3bd7c57bbfbf3");
        }
        if (com.dianping.nvtunnelkit.utils.f.a(str) || (list = this.c.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public final b b(String str) {
        List<b> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede626a171e73b55b29f35db4d42b942", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede626a171e73b55b29f35db4d42b942");
        }
        if (com.dianping.nvtunnelkit.utils.f.a(str) || (list = this.d.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}
