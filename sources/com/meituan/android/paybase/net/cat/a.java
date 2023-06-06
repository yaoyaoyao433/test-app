package com.meituan.android.paybase.net.cat;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.t;
import com.squareup.okhttp.u;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements t {
    public static ChangeQuickRedirect a;

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acf769cf35932c681c7946969dba1a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acf769cf35932c681c7946969dba1a3");
        }
        x a2 = aVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        z a3 = aVar.a(a2);
        int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
        byte[] e = a3.f().e();
        try {
            str = a2.b().getHost() + a2.b().getPath();
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        try {
            i2 = b.a(a2.a().getProtocol());
            try {
                i = b.a(a2);
            } catch (Exception e3) {
                e = e3;
                i = 0;
            }
        } catch (Exception e4) {
            e = e4;
            i = 0;
            i2 = 0;
            i3 = 0;
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorInterceptor_intercept").a("message", e.getMessage()).b);
            i4 = i;
            i5 = i2;
            str2 = str;
            i6 = i3;
            i7 = -1401;
            z a4 = a3.g().a(aa.a(a3.f().a(), e)).a();
            com.meituan.android.paybase.config.a.d().a(currentTimeMillis, str2, 0, i5, i7, i4, i6, currentTimeMillis2, "");
            return a4;
        }
        try {
            Object[] objArr2 = {a3, e};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9c8fa89f652a19d9a8e7bae7fcea7dc8", RobustBitConfig.DEFAULT_VALUE)) {
                i3 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9c8fa89f652a19d9a8e7bae7fcea7dc8")).intValue();
            } else if (a3 == null) {
                i3 = 0;
            } else {
                i3 = (e == null ? 0 : e.length) + b.a(a3.e());
            }
        } catch (Exception e5) {
            e = e5;
            i3 = 0;
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorInterceptor_intercept").a("message", e.getMessage()).b);
            i4 = i;
            i5 = i2;
            str2 = str;
            i6 = i3;
            i7 = -1401;
            z a42 = a3.g().a(aa.a(a3.f().a(), e)).a();
            com.meituan.android.paybase.config.a.d().a(currentTimeMillis, str2, 0, i5, i7, i4, i6, currentTimeMillis2, "");
            return a42;
        }
        try {
            Object[] objArr3 = {a3, e, Integer.valueOf(currentTimeMillis2)};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            i7 = -1301;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4c55f79c3987eae734fde037f3d7eded", RobustBitConfig.DEFAULT_VALUE)) {
                i7 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4c55f79c3987eae734fde037f3d7eded")).intValue();
            } else if (a3 != null) {
                int b = a3.b();
                if (a3.b() / 100 == 2) {
                    if (currentTimeMillis2 <= 25000) {
                        z = false;
                    }
                    if (z) {
                        i7 = -700;
                    } else if (a3.f() != null) {
                        u a5 = a3.f().a();
                        if (a5 != null && DaBaiDao.JSON_DATA.equalsIgnoreCase(a5.a())) {
                            Charset a6 = a5.a(Charset.forName("UTF-8"));
                            String a7 = a3.a("Content-Encoding");
                            if (e != null && e.length > 0) {
                                b = b.a(b.a(e, a6, a7), a3.b());
                            }
                        }
                    }
                }
                i7 = b;
            }
            i4 = i;
            i5 = i2;
            str2 = str;
            i6 = i3;
        } catch (Exception e6) {
            e = e6;
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorInterceptor_intercept").a("message", e.getMessage()).b);
            i4 = i;
            i5 = i2;
            str2 = str;
            i6 = i3;
            i7 = -1401;
            z a422 = a3.g().a(aa.a(a3.f().a(), e)).a();
            com.meituan.android.paybase.config.a.d().a(currentTimeMillis, str2, 0, i5, i7, i4, i6, currentTimeMillis2, "");
            return a422;
        }
        z a4222 = a3.g().a(aa.a(a3.f().a(), e)).a();
        com.meituan.android.paybase.config.a.d().a(currentTimeMillis, str2, 0, i5, i7, i4, i6, currentTimeMillis2, "");
        return a4222;
    }
}
