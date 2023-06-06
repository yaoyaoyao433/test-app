package com.meituan.android.paybase.net.interceptor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631c1c99f7ff387bc368ba2d833d5fd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631c1c99f7ff387bc368ba2d833d5fd2");
        }
        aj request = aVar.request();
        String b = request.b();
        Object[] objArr2 = {b};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3689656a2d32e18a4bef98caae3049bb", RobustBitConfig.DEFAULT_VALUE)) {
            b = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3689656a2d32e18a4bef98caae3049bb");
        } else {
            com.meituan.android.paybase.config.b d = com.meituan.android.paybase.config.a.d();
            if (d != null) {
                Uri.Builder buildUpon = Uri.parse(b).buildUpon();
                Uri parse = Uri.parse(d.b());
                buildUpon.scheme(parse.getScheme()).authority(parse.getAuthority());
                b = buildUpon.toString();
            }
        }
        return aVar.a(request.a().b(b).a());
    }
}
