package com.sankuai.meituan.kernel.net.nvnetwork;

import android.content.Context;
import android.util.Pair;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l implements r {
    public static ChangeQuickRedirect a;
    public static final Pair<String, String> b = new Pair<>("__needVhost", "notNeedVhost");
    private static final Map<String, String> c;
    private Context d;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("api.mobile.meituan.com", "api.meituan.com");
        c.put("api.hotel.meituan.com", "api.meituan.com");
        c.put("api.meishi.meituan.com", "api.meituan.com");
        c.put("open.shopping.meituan.com", "api.meituan.com");
        c.put("api.waimai.meituan.com", "api.meituan.com");
        c.put("lvxing.meituan.com", "api.meituan.com");
    }

    public l(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41820582aaba1954121a758b6a73564", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41820582aaba1954121a758b6a73564");
        } else {
            this.d = context;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    @Override // com.dianping.nvnetwork.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rx.d<com.dianping.nvnetwork.q> intercept(com.dianping.nvnetwork.r.a r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.nvnetwork.l.intercept(com.dianping.nvnetwork.r$a):rx.d");
    }
}
