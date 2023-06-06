package com.sankuai.xm.monitor.report.sample;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, HashSet<String>> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e25f15f12e1f5c5e8af041b288436c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e25f15f12e1f5c5e8af041b288436c");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    @Override // com.sankuai.xm.monitor.report.sample.c
    public final boolean a(String str, String str2, d dVar) {
        Object[] objArr = {str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc55de93428f48c37acd3610b372b69", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc55de93428f48c37acd3610b372b69")).booleanValue();
        }
        if (dVar instanceof b) {
            HashSet<String> hashSet = this.b.get(str);
            return hashSet == null || !hashSet.contains(str2);
        }
        return false;
    }

    @Override // com.sankuai.xm.monitor.report.sample.c
    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5905a4cc65209567903053e485738450", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5905a4cc65209567903053e485738450");
        } else if (z) {
            HashSet<String> hashSet = this.b.get(str);
            if (hashSet != null) {
                hashSet.add(str2);
                return;
            }
            HashSet<String> hashSet2 = new HashSet<>();
            hashSet2.add(str2);
            this.b.put(str, hashSet2);
        }
    }
}
