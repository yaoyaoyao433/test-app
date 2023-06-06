package com.meituan.android.legwork.mrn.interceptor;

import android.net.Uri;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.common.util.g;
import com.meituan.android.legwork.net.encrypt.LegworkEncryptUtil;
import com.meituan.android.legwork.net.util.c;
import com.meituan.android.legwork.net.util.d;
import com.meituan.android.legwork.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final b intercept(Interceptor.a aVar) throws IOException {
        aj a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd8003592bc9b9a720fca550c946f17", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd8003592bc9b9a720fca550c946f17");
        }
        aj request = aVar.request();
        Object[] objArr2 = {request};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "45f910a47dd43761a69e6611ac37ddd1", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (aj) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "45f910a47dd43761a69e6611ac37ddd1");
        } else {
            aj a3 = request.a().b("M-TraceId", d.a()).b("content-type", "application/x-www-form-urlencoded;charset=utf-8").b("token", com.meituan.android.legwork.common.user.a.a().f()).b(c.a(s.a(request.b(), com.meituan.android.legwork.net.b.a().a(com.meituan.android.legwork.a.b)))).a();
            if (g.a().i) {
                a2 = LegworkEncryptUtil.handleEncrypt(a3);
            } else {
                Object[] objArr3 = {a3};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b0dc2ac790d2513cc1d7c2ca55b430fd", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (aj) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b0dc2ac790d2513cc1d7c2ca55b430fd");
                } else if (2 == PmUtil.a()) {
                    a2 = a3;
                } else {
                    aj.a a4 = a3.a();
                    Uri parse = Uri.parse(a3.b());
                    com.sankuai.waimai.platform.encrypt.c.a().a(a4, parse, parse.buildUpon());
                    a2 = a4.a();
                }
            }
            c.b(a2);
        }
        return aVar.a(a2);
    }
}
