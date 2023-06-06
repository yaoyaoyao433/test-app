package com.sankuai.waimai.platform.net.interceptor.okhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.r;
import com.squareup.okhttp.t;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i implements t {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.platform.capacity.log.c b;

    public i(com.sankuai.waimai.platform.capacity.log.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9876a5d3bae125063c9d05de351d1f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9876a5d3bae125063c9d05de351d1f0");
        } else {
            this.b = cVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01be  */
    @Override // com.squareup.okhttp.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.squareup.okhttp.z intercept(com.squareup.okhttp.t.a r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.okhttp.i.intercept(com.squareup.okhttp.t$a):com.squareup.okhttp.z");
    }

    private HashMap<String, String> a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a1395d00c753355d2fe9730f6bac4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a1395d00c753355d2fe9730f6bac4c");
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
