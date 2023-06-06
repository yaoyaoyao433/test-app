package com.meituan.android.paybase.net.interceptor;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        ak a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237655a9d75395a15b7acd75c7e4346d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237655a9d75395a15b7acd75c7e4346d");
        }
        aj request = aVar.request();
        ak i = request.i();
        Object[] objArr2 = {i};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bbe3066afbd3740d05ba1f1d164f90d", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (ak) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bbe3066afbd3740d05ba1f1d164f90d");
        } else {
            Map<String, String> a3 = com.meituan.android.paybase.retrofit.interceptor.a.a(i);
            com.meituan.android.paybase.config.b d = com.meituan.android.paybase.config.a.d();
            if (d != null) {
                a3.put("nb_channel", d.c());
                a3.put("nb_platform", d.d());
                a3.put("nb_osversion", d.e());
                a3.put("nb_version", d.q());
                MtLocation f = d.f();
                if (f != null) {
                    a3.put("nb_location", f.getLatitude() + CommonConstant.Symbol.UNDERLINE + f.getLongitude());
                }
                a3.put("nb_ci", d.g());
                a3.put("nb_deviceid", d.j());
                a3.put("nb_uuid", d.j());
                a3.put("nb_app", d.k());
                a3.put("nb_appversion", d.l());
                if (!TextUtils.isEmpty(d.p())) {
                    a3.put("token", d.p());
                }
                a3.put("nb_device_model", Build.MODEL);
                Object[] objArr3 = {d};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69584086315726328d41f85ddb8e7f7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69584086315726328d41f85ddb8e7f7b");
                } else if (d != null) {
                    HashMap hashMap = new HashMap();
                    if (TextUtils.isEmpty(d.c())) {
                        hashMap.put("nb_channel", "nb_channel为空");
                    }
                    if (TextUtils.isEmpty(d.d())) {
                        hashMap.put("nb_platform", "nb_platform为空");
                    }
                    if (TextUtils.isEmpty(d.e())) {
                        hashMap.put("nb_osversion", "nb_osversion为空");
                    }
                    if (TextUtils.isEmpty(d.q())) {
                        hashMap.put("nb_version", "nb_version为空");
                    }
                    if (d.f() == null) {
                        hashMap.put("nb_location", "nb_location为空");
                    }
                    if (TextUtils.isEmpty(d.g())) {
                        hashMap.put("nb_ci", "nb_ci为空");
                    }
                    if (TextUtils.isEmpty(d.h())) {
                        hashMap.put("nb_deviceid", "nb_deviceid为空");
                    }
                    if (TextUtils.isEmpty(d.j())) {
                        hashMap.put("nb_uuid", "nb_uuid为空");
                    }
                    if (TextUtils.isEmpty(d.k())) {
                        hashMap.put("nb_app", "nb_app为空");
                    }
                    if (TextUtils.isEmpty(d.l())) {
                        hashMap.put("nb_appversion", "nb_appversion为空");
                    }
                    if (TextUtils.isEmpty(Build.MODEL)) {
                        hashMap.put("nb_device_model", "nb_device_model为空");
                    }
                    if (!i.a(hashMap)) {
                        com.meituan.android.paybase.common.analyse.a.a("b_3vf0u4f4", hashMap);
                        com.meituan.android.paybase.common.analyse.cat.a.a("nbParamEmpty", "nb参数校验异常");
                    }
                }
            }
            a2 = com.meituan.android.paybase.retrofit.interceptor.a.a(a3);
        }
        return aVar.a(request.a().a(a2).a());
    }
}
