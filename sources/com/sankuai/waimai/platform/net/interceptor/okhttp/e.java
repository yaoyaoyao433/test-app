package com.sankuai.waimai.platform.net.interceptor.okhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.r;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements t {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.platform.capacity.log.c b;

    public e(com.sankuai.waimai.platform.capacity.log.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a0dd5650967e46a86fdab3fd78f3a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a0dd5650967e46a86fdab3fd78f3a9");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae2ef4d55310193e3880f54f75329ee", RobustBitConfig.DEFAULT_VALUE) ? (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae2ef4d55310193e3880f54f75329ee") : a(aVar);
    }

    private z a(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ff59e32abb5dad0ebf026c0b06687d", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ff59e32abb5dad0ebf026c0b06687d");
        }
        x a2 = aVar.a();
        StringBuilder sb = new StringBuilder();
        sb.append(a2.a().getHost());
        sb.append(a2.a().getPath());
        long currentTimeMillis = System.currentTimeMillis();
        int contentLength = (int) ((a2.d == null ? 0L : a2.d.contentLength()) + com.sankuai.waimai.platform.net.util.c.a(a2.c) + a2.a().toString().getBytes().length);
        try {
            return aVar.a(a2);
        } catch (Exception e) {
            if (!(e instanceof a)) {
                this.b.a(a2.a.toString(), b.a(e), contentLength, 0, (int) (System.currentTimeMillis() - currentTimeMillis), f.a().a(a2.a().getHost()), a2.b, a(a2.c), null);
            }
            throw e;
        }
    }

    private HashMap<String, String> a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5141573bd674ee13b32c237c56cbb503", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5141573bd674ee13b32c237c56cbb503");
        }
        if (rVar == null || rVar.a.length / 2 == 0) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            hashMap.put(rVar.a(i), rVar.b(i));
        }
        return hashMap;
    }
}
