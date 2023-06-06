package com.sankuai.waimai.platform.widget.emptylayout;

import android.content.Context;
import com.dianping.titansadapter.TitansWebManager;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.utils.v;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a = null;
    public static String b = "error_pageid";
    public static String c = "rn_error_pageid";
    public static String d = "error_unknown_pageid";
    private static String e = "ReportToCatFrontHelper";
    private static final Executor f = new v();

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3af8db955b64f982d7ccd9127c46eb98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3af8db955b64f982d7ccd9127c46eb98");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("project", "com.sankuai.wmcustomfront.mrn");
            jSONObject.put("pageUrl", str);
            jSONObject.put("category", str2);
            jSONObject.put("sec_category", str2);
            jSONObject.put("level", "warn");
            jSONObject.put("unionId", str5);
            jSONObject.put(DeviceInfo.TM, System.currentTimeMillis());
            jSONObject.put("os", "android");
            jSONObject.put("region", str4);
            jSONObject.put("network", str6);
            jSONObject.put("content", "tracer_type,pageError|level,warn|appVersion," + str7);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        try {
            ((ICatReport) new ar.a().a("https://catfront.dianping.com/").a(com.meituan.android.singleton.i.a("defaultokhttp")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a().a(ICatReport.class)).report("https://catfront.dianping.com/api/log?v=1&sdk=1.5.28&pageId=" + str3, TitansWebManager.ua(), "waimai_error_pageid", jSONArray.toString()).a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.waimai.platform.widget.emptylayout.h.2
                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                }
            });
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
    }

    public static void a(final String str, String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98aebd0923b344740e9b68e51f6fbef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98aebd0923b344740e9b68e51f6fbef8");
            return;
        }
        City m = com.sankuai.waimai.foundation.location.v2.g.a().m();
        final String cityCode = m != null ? m.getCityCode() : "";
        final String localOneId = OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.monitor.utils.e.a;
        final String valueOf = String.valueOf(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6cb69250ddab131e26ebf63dfa84a5a7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6cb69250ddab131e26ebf63dfa84a5a7")).intValue() : com.sankuai.waimai.monitor.utils.a.b(context));
        final String i = com.sankuai.waimai.platform.b.A().i();
        String str4 = "";
        if (com.sankuai.waimai.foundation.core.a.d()) {
            str4 = "wm_";
        } else if (com.sankuai.waimai.foundation.core.a.e()) {
            str4 = "mt_";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str4 = "dp_";
        }
        final String str5 = str4 + str2;
        com.sankuai.waimai.launcher.util.aop.b.a(f, new Runnable() { // from class: com.sankuai.waimai.platform.widget.emptylayout.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "757c10add589fa2a1bb617e71b307d93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "757c10add589fa2a1bb617e71b307d93");
                } else {
                    h.a(str, str5, str3, cityCode, localOneId, valueOf, i);
                }
            }
        });
    }
}
