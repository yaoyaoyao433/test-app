package com.meituan.android.neohybrid.neo.http.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements Interceptor {
    public static ChangeQuickRedirect a;

    public abstract com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws IOException, com.meituan.android.neohybrid.exception.a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862e3a094840fe7c8b360caa2472a5fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862e3a094840fe7c8b360caa2472a5fd");
        }
        try {
            return a(aVar);
        } catch (com.meituan.android.neohybrid.exception.a e) {
            com.meituan.android.neohybrid.exception.a.a(e);
            return aVar.a(aVar.request());
        }
    }
}
