package com.meituan.phoenix.data;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(final String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "672147af1c1a21ddc26e70b50cd9eeae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "672147af1c1a21ddc26e70b50cd9eeae");
            return;
        }
        try {
            Call<d> phoenixData = ((PhoenixDataService) new ar.a().a(com.meituan.phoenix.a.b ? "http://portal.fe.test.sankuai.com" : "http://portal-portm.meituan.com").a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a()).a().a(PhoenixDataService.class)).getPhoenixData(str, str2);
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "phoenixKey: " + str + " config: " + str2, new Object[0]);
            }
            phoenixData.a(new f<d>() { // from class: com.meituan.phoenix.data.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<d> call, Response<d> response) {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17b6ff099f0250f623e3d534dcd21d1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17b6ff099f0250f623e3d534dcd21d1e");
                        return;
                    }
                    if (com.meituan.phoenix.a.a) {
                        com.meituan.phoenix.util.b.a("Phoenix", "---> Phoenix Response : " + str + " data: " + response.e().toString(), new Object[0]);
                    }
                    b.a().a(str, response.e());
                    String str3 = str;
                    d e = response.e();
                    Object[] objArr3 = {str3, e};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2fc144e5c231b7e40bcb9a0f98af3273", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2fc144e5c231b7e40bcb9a0f98af3273")).booleanValue();
                    } else if (TextUtils.isEmpty(str3)) {
                    } else {
                        a.a().a(str3, new Gson().toJson(e));
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<d> call, Throwable th) {
                    Object[] objArr2 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95d4257851f2e839d8b941cd29463d6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95d4257851f2e839d8b941cd29463d6e");
                    } else if (com.meituan.phoenix.a.a) {
                        com.meituan.phoenix.util.b.a("Phoenix", "---> Phoenix Response Failed：" + call.e().b() + "\nThrowable:  \n" + th, new Object[0]);
                    }
                }
            });
        } catch (IllegalArgumentException unused) {
        }
    }
}
