package com.sankuai.waimai.addrsdk.retrofit.interceptor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.t;
import com.sankuai.waimai.addrsdk.utils.d;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        t e;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a16dc86e0650356142e75b2161e0ba69", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a16dc86e0650356142e75b2161e0ba69");
        }
        aj request = aVar.request();
        String b = request.b();
        if (!TextUtils.isEmpty(b) && (e = t.e(b)) != null) {
            String f = e.f();
            String a2 = d.a();
            if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(a2) && !a2.contains(f)) {
                try {
                    return aVar.a(request.a().b(e.m().b(a2).b().toString()).a());
                } catch (Exception unused) {
                }
            }
        }
        return aVar.a(request);
    }
}
