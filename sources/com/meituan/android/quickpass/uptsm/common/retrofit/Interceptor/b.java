package com.meituan.android.quickpass.uptsm.common.retrofit.Interceptor;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b3593ad59194e67afdeb6a9e430dd5", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b3593ad59194e67afdeb6a9e430dd5") : aVar.a(aVar.request().a().b("model", Build.MODEL.toString()).b("brand", Build.BRAND.toString()).b("os", "android").b("osver", Build.VERSION.RELEASE.toString()).b("vname", com.meituan.android.quickpass.uptsm.constant.b.a).a());
    }
}
