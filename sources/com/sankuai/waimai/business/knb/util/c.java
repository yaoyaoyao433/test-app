package com.sankuai.waimai.business.knb.util;

import android.support.annotation.WorkerThread;
import com.dianping.titansadapter.TitansWebManager;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.v;
import com.sankuai.waimai.platform.widget.emptylayout.ICatReport;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Executor b = new v();

    public static void a(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9662eee3996f9407b602dbcefee1c81d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9662eee3996f9407b602dbcefee1c81d");
            return;
        }
        City m = g.a().m();
        final String cityCode = m != null ? m.getCityCode() : "";
        final String localOneId = OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
        final String valueOf = String.valueOf(NetWorkUtils.getNetworkType("dj-cfdc7b9dfb4da1d3", com.meituan.android.singleton.b.a));
        final String i = com.sankuai.waimai.platform.b.A().i();
        com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.business.knb.util.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "422a6065319844e1ab27c665846087b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "422a6065319844e1ab27c665846087b8");
                } else {
                    c.a(str, str2, str3, cityCode, localOneId, valueOf, i);
                }
            }
        });
    }

    @WorkerThread
    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df245bbe762b945c633cd4b5584bf9f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df245bbe762b945c633cd4b5584bf9f1");
            return;
        }
        String str8 = "";
        if (str != null && str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
            str8 = str.substring(0, str.indexOf(CommonConstant.Symbol.QUESTION_MARK));
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("project", "com.sankuai.wmcustomfront.webview");
            jSONObject.put("pageUrl", str8);
            jSONObject.put("realUrl", str);
            jSONObject.put("category", "wardenCustom");
            jSONObject.put("sec_category", "wardenCustom");
            jSONObject.put("level", "warn");
            jSONObject.put("unionId", str5);
            jSONObject.put("os", "android");
            jSONObject.put("region", str4);
            jSONObject.put("network", str6);
            jSONObject.put(DeviceInfo.TM, System.currentTimeMillis());
            jSONObject.put("content", "tracer_type,%E5%BC%82%E5%B8%B8%E5%85%9C%E5%BA%95|error_level_sub,%E5%AE%B9%E5%99%A8%E5%BC%82%E5%B8%B8|error_code," + str2 + "|level,warn|content,no_code|appVersion," + str7);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        try {
            ((ICatReport) new ar.a().a("https://catfront.dianping.com/").a(i.a("defaultokhttp")).a(f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a().a(ICatReport.class)).report("https://catfront.dianping.com/api/log?v=1&sdk=1.5.28&pageId=" + str3, TitansWebManager.ua(), str, jSONArray.toString()).a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.waimai.business.knb.util.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d2354c7480c6ce936bffd0cb9979405", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d2354c7480c6ce936bffd0cb9979405");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("reportWebViewError", "SUCCEED: " + response.b(), new Object[0]);
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    Object[] objArr2 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bf4dec1579e60565b7dc2b7fef4d869", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bf4dec1579e60565b7dc2b7fef4d869");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.e("reportWebViewError", "FAILED {response body is null}", new Object[0]);
                    }
                }
            });
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
