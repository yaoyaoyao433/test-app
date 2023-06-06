package com.sankuai.xm.network.net.http;

import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.network.httpurlconnection.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e implements d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.network.net.http.d
    public final com.sankuai.xm.network.net.e a(b bVar) throws Exception {
        int i;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f00c5f82117cb66a090c16f7d16ca357", 6917529027641081856L)) {
            return (com.sankuai.xm.network.net.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f00c5f82117cb66a090c16f7d16ca357");
        }
        com.sankuai.xm.network.net.d dVar = bVar.b;
        int i2 = (int) dVar.g;
        int i3 = (int) dVar.f;
        f.a aVar = null;
        String str = dVar.c;
        Map map = dVar.b;
        if (!TextUtils.isEmpty(dVar.i)) {
            str = dVar.i;
            if (map == null) {
                map = new HashMap();
            }
            if (dVar.j != null) {
                map.putAll(dVar.j);
            }
        }
        switch (dVar.e) {
            case 0:
                aVar = f.a(str, map, i2, i3);
                break;
            case 1:
                aVar = f.a(str, dVar.d == null ? "" : dVar.d, map, i2, i3);
                break;
            case 2:
                aVar = f.b(str, dVar.d == null ? "" : dVar.d, map, i2, i3);
                break;
            case 3:
                aVar = f.b(str, map, i2, i3);
                break;
        }
        com.sankuai.xm.network.net.e eVar = new com.sankuai.xm.network.net.e();
        eVar.b = aVar.d;
        eVar.d = aVar.e;
        eVar.e = aVar.c;
        long j = aVar.h;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.network.net.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "1cf312c02a298fc661add82690677fca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "1cf312c02a298fc661add82690677fca");
        } else {
            eVar.f = j;
        }
        if (TextUtils.isEmpty(dVar.c) || !dVar.c.startsWith(AbsApiFactory.HTTPS)) {
            if (!TextUtils.isEmpty(dVar.c)) {
                dVar.c.startsWith(AbsApiFactory.HTTP);
            }
            i = 0;
        } else {
            i = 8;
        }
        eVar.g = i;
        if (aVar.f != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, List<String>> entry : aVar.f.entrySet()) {
                if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                    hashMap.put(entry.getKey(), entry.getValue().get(0));
                }
            }
            eVar.c = hashMap;
        }
        return eVar;
    }
}
