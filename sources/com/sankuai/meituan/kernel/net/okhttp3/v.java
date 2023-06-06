package com.sankuai.meituan.kernel.net.okhttp3;

import android.content.Context;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Interceptor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class v implements Interceptor {
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
    }

    public v(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d027b882fdfdced8220c7f3e9b85a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d027b882fdfdced8220c7f3e9b85a87");
        } else {
            this.d = context;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.okhttp3.v.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
