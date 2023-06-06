package com.sankuai.waimai.foundation.location.v2;

import android.util.Pair;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    ConcurrentHashMap<String, WeakReference<com.sankuai.waimai.foundation.location.v2.listener.c>> b;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5985b6cd58508936a671a49edec21bbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5985b6cd58508936a671a49edec21bbf");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    public final void a(com.sankuai.waimai.foundation.location.v2.listener.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9481a264b300eef7fc0e6f31b548478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9481a264b300eef7fc0e6f31b548478");
        } else if (cVar != null) {
            this.b.put(cVar.toString(), new WeakReference<>(cVar));
        }
    }

    public final void b(com.sankuai.waimai.foundation.location.v2.listener.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e52c868f72f0de4e25b437659b6e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e52c868f72f0de4e25b437659b6e84");
        } else if (cVar != null) {
            this.b.remove(cVar.toString());
        }
    }

    public final void a(final WmAddress wmAddress, final String str, final boolean z) {
        Object[] objArr = {wmAddress, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46fc01a70f2cd82b862dadb8efd87428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46fc01a70f2cd82b862dadb8efd87428");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.foundation.location.v2.i.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "507a411c2184cdd16490e427545140ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "507a411c2184cdd16490e427545140ec");
                        return;
                    }
                    try {
                        Set<String> keySet = i.this.b.keySet();
                        com.sankuai.waimai.foundation.location.e.c().b();
                        if (z && wmAddress.getWMLocation() != null && !wmAddress.getWMLocation().isCorrectedWithHistoryAddress()) {
                            com.sankuai.waimai.foundation.location.e.c().c();
                        }
                        for (String str2 : keySet) {
                            WeakReference<com.sankuai.waimai.foundation.location.v2.listener.c> weakReference = i.this.b.get(str2);
                            if (weakReference != null) {
                                com.sankuai.waimai.foundation.location.v2.listener.c cVar = weakReference.get();
                                if (cVar == null) {
                                    i.this.b.remove(str2);
                                } else {
                                    cVar.onPoiChange(wmAddress, z);
                                    com.sankuai.waimai.foundation.location.e.c().a("PoiAddressDelegate", "notifyChangeAddress", Pair.create("callTag", str), Pair.create("Listener", cVar), Pair.create(GearsLocator.ADDRESS, wmAddress));
                                }
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.location.e.c().a("PoiAddressDelegate", "notifyChangeAddress", Pair.create("callTag", str), Pair.create("ForeachError", e.getMessage()));
                    }
                }
            });
        }
    }
}
