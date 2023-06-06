package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static f d;
    public Map<String, List<com.sankuai.waimai.mach.container.b>> b;
    private Map<String, List<com.sankuai.waimai.mach.recycler.c>> c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e577a0140a70e5c83e3a6ba32f9c73e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e577a0140a70e5c83e3a6ba32f9c73e6");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public static synchronized f a() {
        synchronized (f.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0941f26f428249781fde5fa47268f49c", RobustBitConfig.DEFAULT_VALUE)) {
                return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0941f26f428249781fde5fa47268f49c");
            }
            if (d == null) {
                d = new f();
            }
            return d;
        }
    }

    public final synchronized void a(com.sankuai.waimai.mach.recycler.c cVar, @NonNull String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d6e775c44b846b2c6313cbcf1e5198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d6e775c44b846b2c6313cbcf1e5198");
            return;
        }
        List<com.sankuai.waimai.mach.recycler.c> list = this.c.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            this.c.put(str, arrayList);
            return;
        }
        if (!a(list, cVar)) {
            list.add(cVar);
        }
    }

    @Deprecated
    public boolean a(List<com.sankuai.waimai.mach.container.b> list, com.sankuai.waimai.mach.container.b bVar) {
        Object[] objArr = {list, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fafa7289d52c1c97968d17b892eb71ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fafa7289d52c1c97968d17b892eb71ae")).booleanValue();
        }
        com.sankuai.waimai.mach.container.a aVar = (com.sankuai.waimai.mach.container.a) bVar;
        Iterator<com.sankuai.waimai.mach.container.b> it = list.iterator();
        while (it.hasNext()) {
            com.sankuai.waimai.mach.container.a aVar2 = (com.sankuai.waimai.mach.container.a) it.next();
            if (TextUtils.equals(aVar2.o, aVar.o) && a(aVar2, aVar)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    private boolean a(com.sankuai.waimai.mach.container.b bVar, com.sankuai.waimai.mach.container.b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923f643108572dadb28dde3791204628", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923f643108572dadb28dde3791204628")).booleanValue();
        }
        if ((bVar instanceof com.sankuai.waimai.bussiness.order.base.mach.b) && (bVar2 instanceof com.sankuai.waimai.bussiness.order.base.mach.b)) {
            return TextUtils.equals(((com.sankuai.waimai.bussiness.order.base.mach.b) bVar).e, ((com.sankuai.waimai.bussiness.order.base.mach.b) bVar2).e);
        }
        return true;
    }

    private boolean a(List<com.sankuai.waimai.mach.recycler.c> list, com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80498cfbb6fa3a4faf1adca6e5c65e94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80498cfbb6fa3a4faf1adca6e5c65e94")).booleanValue();
        }
        for (com.sankuai.waimai.mach.recycler.c cVar2 : list) {
            if (TextUtils.equals(cVar2.j, cVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775a3b5fc85ba35e250bae1b90ce1be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775a3b5fc85ba35e250bae1b90ce1be5");
        } else {
            c(str, map);
        }
    }

    private synchronized void c(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff918196db82bb5a80563dd1ab06a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff918196db82bb5a80563dd1ab06a21");
            return;
        }
        List<com.sankuai.waimai.mach.recycler.c> list = this.c.get(str);
        if (list != null && !list.isEmpty()) {
            for (com.sankuai.waimai.mach.recycler.c cVar : list) {
                if (cVar.l() != null) {
                    cVar.l().sendJsEvent(str, map);
                }
            }
        }
    }

    public final void b(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a282b2df3bc7b4effcfa20574dad1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a282b2df3bc7b4effcfa20574dad1eb");
            return;
        }
        List<com.sankuai.waimai.mach.container.b> list = this.b.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.sankuai.waimai.mach.container.b bVar : list) {
            bVar.b(str, map);
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaffb17609ffc7eaf5643c1fc7c31982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaffb17609ffc7eaf5643c1fc7c31982");
        } else {
            this.c.clear();
        }
    }
}
