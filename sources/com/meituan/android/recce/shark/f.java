package com.meituan.android.recce.shark;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.recce.shark.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends a {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.android.recce.shark.a
    public final com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws Exception {
        boolean z;
        e.a aVar2;
        ap apVar;
        String a;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc5d3e03dad4c7d11cec4f2e9ee4c19", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc5d3e03dad4c7d11cec4f2e9ee4c19");
        }
        aj request = aVar.request();
        Object[] objArr2 = {request};
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "74ea23e67580c7ee9178916fdfb2d3b4", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "74ea23e67580c7ee9178916fdfb2d3b4")).booleanValue();
        } else {
            z = request != null && o.a(request.i());
        }
        if (z) {
            return aVar.a(request);
        }
        String str = "";
        try {
            str = Uri.parse(request.b()).getPath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.currentTimeMillis();
        try {
            aVar2 = e.a(request.i());
        } catch (Exception e2) {
            e2.printStackTrace();
            aVar2 = null;
        }
        if (aVar2 == null || !aVar2.a() || aVar2.f == null) {
            return aVar.a(request);
        }
        com.sankuai.meituan.retrofit2.raw.b a2 = aVar.a(request.a().a(aVar2.f).a());
        System.currentTimeMillis();
        try {
            try {
                String str2 = aVar2.b;
                ap body = a2.body();
                Object[] objArr3 = {str2, body};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8d357933f7248b6b67b782ecf333431c", RobustBitConfig.DEFAULT_VALUE)) {
                    apVar = (ap) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8d357933f7248b6b67b782ecf333431c");
                } else if (TextUtils.isEmpty(str2) || body == null) {
                    throw new IOException("input params error: " + str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + body);
                } else {
                    apVar = body.newBuilder().a("application/json;charset=UTF-8").a(a.getBytes().length).a(new ByteArrayInputStream(d.a(str2, body.string()).getBytes())).a();
                }
            } catch (Exception e3) {
                ap body2 = a2.body();
                e3.printStackTrace();
                apVar = body2;
            }
            return new b.a().a(a2.url()).a(a2.code()).b(a2.reason()).a(apVar).a();
        } finally {
            TextUtils.isEmpty(str);
        }
    }
}
