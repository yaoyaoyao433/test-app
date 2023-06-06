package com.sankuai.meituan.mapfoundation.starship;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static volatile Map<String, c> b = new ConcurrentHashMap();

    public static c a(d... dVarArr) {
        Object[] objArr = {dVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cf904de3780bbc6d0750babf4182e98", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cf904de3780bbc6d0750babf4182e98");
        }
        Object[] objArr2 = {null, dVarArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8370cfd0e02ce56cfc9bb070febb384e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8370cfd0e02ce56cfc9bb070febb384e") : a(true, null, dVarArr);
    }

    public static c a(boolean z, com.sankuai.meituan.mapfoundation.starship.interceptor.a aVar, d... dVarArr) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, dVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1bc74f2ea2484b5b81989565de4ef3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1bc74f2ea2484b5b81989565de4ef3f");
        }
        StringBuilder sb = new StringBuilder("key:");
        for (d dVar : dVarArr) {
            sb.append(dVar.toString());
            sb.append(";");
        }
        String sb2 = sb.toString();
        c cVar = b.get(sb2);
        if (cVar == null) {
            synchronized (j.class) {
                if (cVar == null) {
                    try {
                        cVar = new i(z, aVar, dVarArr);
                        b.put(sb2, cVar);
                    } finally {
                    }
                }
            }
        }
        return cVar;
    }
}
