package com.meituan.android.recce.shark;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements Interceptor {
    public static ChangeQuickRedirect a;

    public abstract com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws Exception;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56bfd231cbac3828e1194c194d868a6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56bfd231cbac3828e1194c194d868a6e");
        }
        try {
            return a(aVar);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar.a(aVar.request());
        }
    }
}
