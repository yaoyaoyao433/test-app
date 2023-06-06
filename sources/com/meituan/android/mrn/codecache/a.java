package com.meituan.android.mrn.codecache;

import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.mrn.utils.worker.c {
    public static ChangeQuickRedirect a;
    private c f;

    public a(c cVar) {
        super("ClearOutOfDateCodeCache");
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801d43c740acf5a18bd895f057f986e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801d43c740acf5a18bd895f057f986e9");
        } else {
            this.f = cVar;
        }
    }

    @Override // com.meituan.android.mrn.utils.worker.c
    public final void a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6256fa2348b0439e7f786ffe6339cddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6256fa2348b0439e7f786ffe6339cddb");
            return;
        }
        c cVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "06c04c98b85ca5cf4aa06d1ec3160796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "06c04c98b85ca5cf4aa06d1ec3160796");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, com.meituan.android.mrn.monitor.a>> it = com.meituan.android.mrn.monitor.b.a().b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, com.meituan.android.mrn.monitor.a> next = it.next();
            long currentTimeMillis = System.currentTimeMillis() - next.getValue().b;
            b bVar = b.b;
            Object[] objArr3 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            Iterator<Map.Entry<String, com.meituan.android.mrn.monitor.a>> it2 = it;
            if (currentTimeMillis > (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "f88773b451b16448bc76261a628b2488", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "f88773b451b16448bc76261a628b2488")).intValue() : ((Integer) t.b.a("CodeCache.maxLiveDays")).intValue()) * 86400000) {
                hashSet.add(next.getKey());
            }
            it = it2;
            i = 0;
        }
        for (e eVar : cVar.d.c()) {
            if (hashSet.contains(eVar.b)) {
                cVar.a(eVar.b, eVar.c, 2);
            }
        }
    }
}
