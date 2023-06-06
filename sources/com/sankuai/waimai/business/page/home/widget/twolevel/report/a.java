package com.sankuai.waimai.business.page.home.widget.twolevel.report;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.mads.b;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.launcher.util.aop.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Executor b;
    public String c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.widget.twolevel.report.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0793a {
        public int a = -1;
        public int b = -1;
    }

    public static /* synthetic */ Object a(a aVar, HomeSecondFloorResponse homeSecondFloorResponse, String str) {
        Object[] objArr = {homeSecondFloorResponse, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "dae716e97ed2709ea7ae20b258c8cab6", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "dae716e97ed2709ea7ae20b258c8cab6");
        }
        if (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || homeSecondFloorResponse.homeSecondFloorData.traceInfo == null) {
            return null;
        }
        return homeSecondFloorResponse.homeSecondFloorData.traceInfo.get(str);
    }

    public static /* synthetic */ String a(a aVar, HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2e28e731d33a09fad26c8678cd8a8ef9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2e28e731d33a09fad26c8678cd8a8ef9") : (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || homeSecondFloorResponse.homeSecondFloorData.resource == null) ? "" : String.valueOf(homeSecondFloorResponse.homeSecondFloorData.resource.resourceId);
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, HomeSecondFloorResponse homeSecondFloorResponse) throws JSONException {
        Map<String, Object> map;
        Set<String> keySet;
        Object[] objArr = {jSONObject, homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "af2ec968ff0c3ee76ab26480e07b88bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "af2ec968ff0c3ee76ab26480e07b88bf");
        } else if (jSONObject != null && homeSecondFloorResponse != null && homeSecondFloorResponse.homeSecondFloorData != null && homeSecondFloorResponse.homeSecondFloorData.traceInfo != null && (keySet = (map = homeSecondFloorResponse.homeSecondFloorData.traceInfo).keySet()) != null) {
            for (String str : keySet) {
                if (!TextUtils.isEmpty(str) && !TextUtils.equals("adType", str) && !TextUtils.equals("chargeInfo", str) && !TextUtils.equals("monitorImpUrl", str) && !TextUtils.equals("monitorClickUrl", str)) {
                    jSONObject.put(str, map.get(str));
                }
            }
        }
    }

    public static /* synthetic */ String b(a aVar, HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2171e214b6cf18c25e5e08de09efc4cd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2171e214b6cf18c25e5e08de09efc4cd") : (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || homeSecondFloorResponse.homeSecondFloorData.resource == null) ? "" : String.valueOf(homeSecondFloorResponse.homeSecondFloorData.resource.moduleId);
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1486e9ab2103b40b00d2d3e2e3916e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1486e9ab2103b40b00d2d3e2e3916e");
            return;
        }
        this.c = str;
        this.b = c.b();
    }

    public final void a(final HomeSecondFloorResponse homeSecondFloorResponse, final int i) {
        Object[] objArr = {homeSecondFloorResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cd143561a225ea3f2b360cf8be07cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cd143561a225ea3f2b360cf8be07cd");
        } else if (homeSecondFloorResponse == null || this.b == null) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorReporter", "second floor entrance expose， esceneType = " + i, new Object[0]);
            b.a(this.b, new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.report.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77aaea98e29b0fc7b8ee8294f9834106", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77aaea98e29b0fc7b8ee8294f9834106");
                        return;
                    }
                    String a2 = a.a(homeSecondFloorResponse);
                    Object a3 = a.a(a.this, homeSecondFloorResponse, "chargeInfo");
                    String str = a3 instanceof String ? (String) a3 : null;
                    Object a4 = a.a(a.this, homeSecondFloorResponse, "adType");
                    if (a4 instanceof Integer) {
                        i2 = ((Integer) a4).intValue();
                    } else if (a4 instanceof Double) {
                        i2 = ((Double) a4).intValue();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("activity_id", a2);
                        jSONObject.put("escene_type", i);
                        jSONObject.put("entry_item_id", a.a(a.this, homeSecondFloorResponse));
                        jSONObject.put("module_id", a.b(a.this, homeSecondFloorResponse));
                        a.a(a.this, jSONObject, homeSecondFloorResponse);
                        if (i2 > 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("adType", i2);
                            jSONObject2.put("adChargeInfo", com.sankuai.waimai.business.page.common.util.c.a(str));
                            jSONObject.put("ad", jSONObject2);
                            com.sankuai.waimai.ad.monitor.b.a("b_waimai_wfuy44fp_mv", "LX", i2, "home_second_floor", com.sankuai.waimai.foundation.core.common.a.a().e());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Map<String, Object> jsonObjectToMap = JsonUtil.jsonObjectToMap(jSONObject);
                    JudasManualManager.a a5 = JudasManualManager.b("b_waimai_wfuy44fp_mv").a("c_m84bv26");
                    a5.b = a.this.c;
                    a5.b(jsonObjectToMap).a();
                    if (i2 > 0) {
                        com.sankuai.waimai.ad.monitor.b.a("b_waimai_wfuy44fp_mv", "SH", i2, "home_second_floor", com.sankuai.waimai.foundation.core.common.a.a().e());
                        com.sankuai.waimai.ad.mads.a.a(i2, new b.a("b_waimai_wfuy44fp_mv", str + "&activity_id=" + a2 + "&escene_type=" + i, 3));
                    }
                    Object a6 = a.a(a.this, homeSecondFloorResponse, "monitorImpUrl");
                    if (a6 instanceof String) {
                        com.sankuai.waimai.ad.mads.a.a((String) a6);
                    }
                }
            });
        }
    }

    public static String a(HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d79ccbbabba1c0a2819a4d62c6d468b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d79ccbbabba1c0a2819a4d62c6d468b2");
        }
        if (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || homeSecondFloorResponse.homeSecondFloorData.resource == null || homeSecondFloorResponse.homeSecondFloorData.resource.view == null) {
            return null;
        }
        return homeSecondFloorResponse.homeSecondFloorData.resource.view.activityId;
    }
}
