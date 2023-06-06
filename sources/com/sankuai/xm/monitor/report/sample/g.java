package com.sankuai.xm.monitor.report.sample;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g implements c {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, HashMap<String, Long>> b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99db3f2761ebcf32812499bfd65b747", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99db3f2761ebcf32812499bfd65b747");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    @Override // com.sankuai.xm.monitor.report.sample.c
    public final boolean a(String str, String str2, d dVar) {
        Long l;
        Object[] objArr = {str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc71b59c10781a1f05933274bff01a4e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc71b59c10781a1f05933274bff01a4e")).booleanValue();
        }
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            HashMap<String, Long> hashMap = this.b.get(str);
            return hashMap == null || (l = hashMap.get(str2)) == null || SystemClock.uptimeMillis() - l.longValue() > hVar.b;
        }
        return false;
    }

    @Override // com.sankuai.xm.monitor.report.sample.c
    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a317c19bc26bcdb4d507bce1ba1828", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a317c19bc26bcdb4d507bce1ba1828");
        } else if (z) {
            HashMap<String, Long> hashMap = this.b.get(str);
            if (hashMap != null) {
                hashMap.put(str2, Long.valueOf(SystemClock.uptimeMillis()));
                return;
            }
            HashMap<String, Long> hashMap2 = new HashMap<>();
            hashMap2.put(str2, Long.valueOf(SystemClock.uptimeMillis()));
            this.b.put(str, hashMap2);
        }
    }
}
