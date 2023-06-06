package com.sankuai.waimai.platform.capacity.network.interceptor;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;
    private static final Map<String, String> b;

    static {
        ArrayMap arrayMap = new ArrayMap();
        b = arrayMap;
        arrayMap.put("wmapi.meituan.com", "api/");
        b.put("wmapi-mt.meituan.com", "mtapi/");
        b.put("dpapi.waimai.meituan.com", "dp/");
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        String str;
        List<String> j;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b488abdbbd8ea2446340e099c9b4a09", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b488abdbbd8ea2446340e099c9b4a09");
        }
        aj request = aVar.request();
        Object[] objArr2 = {request};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "930db80fcd7c9aaa48b5c09cc411d9e8", RobustBitConfig.DEFAULT_VALUE)) {
            request = (aj) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "930db80fcd7c9aaa48b5c09cc411d9e8");
        } else if (request == null) {
            request = null;
        } else {
            String b2 = request.b();
            if (!TextUtils.isEmpty(b2)) {
                t e = t.e(b2);
                String f = e.f();
                String h = e.h();
                if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(h) && b.containsKey(f)) {
                    if (com.sankuai.waimai.foundation.core.a.f()) {
                        str = "dpapi.waimai.meituan.com";
                    } else {
                        str = com.sankuai.waimai.foundation.core.a.e() ? "wmapi-mt.meituan.com" : "wmapi.meituan.com";
                    }
                    if ((!f.equals(str) || !h.startsWith(b.get(f), 1)) && (j = e.j()) != null && j.size() != 0) {
                        String str2 = j.get(0);
                        Map<String, String> map = b;
                        if (map.containsValue(str2 + "/")) {
                            String str3 = b.get(str);
                            String substring = str3.substring(0, str3.length() - 1);
                            if (str2.equals(substring)) {
                                substring = str2;
                            }
                            request = request.a().b(e.m().b(str).a(0, substring).b().toString()).a();
                        }
                    }
                }
            }
        }
        return aVar.a(request);
    }
}
