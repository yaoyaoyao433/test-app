package com.meituan.android.neohybrid.v2.neo.nsr;

import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.neohybrid.util.n;
import com.meituan.android.neohybrid.v2.neo.nsr.b;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final LinkedHashMap<String, List<b>> b = new LinkedHashMap<>();

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9590cd20f51ff8d73a07b0f9fc022a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9590cd20f51ff8d73a07b0f9fc022a4");
        } else if (aVar != null) {
            Iterator<Map.Entry<String, List<b>>> it = b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<b>> next = it.next();
                if (next != null && next.getValue() != null && !next.getValue().isEmpty()) {
                    Iterator<b> it2 = next.getValue().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        b next2 = it2.next();
                        if (next2 == null || next2.b != aVar) {
                            i = 1;
                        } else {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = b.a;
                            if (PatchProxy.isSupport(objArr2, next2, changeQuickRedirect2, false, "9422f3b1739462f3d03bde6aa30a0f0b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, next2, changeQuickRedirect2, false, "9422f3b1739462f3d03bde6aa30a0f0b");
                            } else if (next2.b != null) {
                                com.meituan.android.neohybrid.v2.core.a aVar2 = next2.b;
                                String str = next2.c;
                                Object[] objArr3 = new Object[i];
                                objArr3[0] = str;
                                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.core.a.a;
                                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "87b01971cc59dadd79cff7f03f1d808b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "87b01971cc59dadd79cff7f03f1d808b");
                                } else {
                                    for (c.b bVar : aVar2.h) {
                                        bVar.e(str);
                                    }
                                }
                                next2.b = null;
                            }
                            it2.remove();
                        }
                    }
                    if (next.getValue().isEmpty()) {
                        it.remove();
                    }
                    i = 1;
                }
            }
        }
    }

    private static com.meituan.android.neohybrid.v2.core.a a(List<b> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16876ac57851ab4779d5ec88589b3d79", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.v2.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16876ac57851ab4779d5ec88589b3d79");
        }
        if (i.a((Collection) list)) {
            return null;
        }
        ListIterator<b> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous != null) {
                com.meituan.android.neohybrid.v2.core.a aVar = (previous.d == b.a.SUCC || z) ? previous.b : null;
                if (aVar != null) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public static com.meituan.android.neohybrid.v2.core.a a(com.meituan.android.neohybrid.neo.nsr.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4770223314aff0ba8e4d44aba224497c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.v2.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4770223314aff0ba8e4d44aba224497c");
        }
        if (aVar == null) {
            return null;
        }
        String str = aVar.a;
        if (aVar.b) {
            str = n.a(str);
        }
        boolean z = aVar.c;
        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d017b27cf08661c46dbac8b59061314b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.v2.core.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d017b27cf08661c46dbac8b59061314b");
        }
        List<b> list = b.get(str);
        com.meituan.android.neohybrid.v2.core.a a2 = a(list, z);
        if (a2 == null || list == null) {
            return null;
        }
        list.clear();
        a2.d(str);
        return a2;
    }
}
