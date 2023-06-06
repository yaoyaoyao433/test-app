package com.sankuai.waimai.platform.mach.statistics;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import org.json.JSONException;
import org.json.JSONObject;
import rx.j;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CatJsNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context mContext;
    private String volleyTag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface CatJsReportRequest {
        @GET
        rx.d<ap> report(@Url String str);
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String module() {
        return "wmmonitor";
    }

    public CatJsNativeMethod(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e071f645f9f20e348520d16a07e2f4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e071f645f9f20e348520d16a07e2f4b");
            return;
        }
        this.mContext = context;
        this.volleyTag = str;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6270e3ec99d23f8bf7e827966cfc5854", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6270e3ec99d23f8bf7e827966cfc5854") : new String[]{"reportCat"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        JSONObject optJSONObject;
        int i = 0;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da50e296b6e82e5116698253f2005141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da50e296b6e82e5116698253f2005141");
        } else if (TextUtils.isEmpty(str) || !"reportCat".equals(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("url");
                if (TextUtils.isEmpty(optString)) {
                    aVar.a(str3, "{\"status\":\"1\"");
                    return;
                }
                String str4 = "";
                JSONObject optJSONObject2 = jSONObject.optJSONObject(SearchIntents.EXTRA_QUERY);
                if (optJSONObject2 != null) {
                    str4 = optJSONObject2.optString("p");
                    i = optJSONObject2.optInt("v");
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("tags")) != null) {
                    appendCatCommonTag(optJSONObject);
                    optJSONObject3.put("tags", optJSONObject);
                }
                reportCat(optString + "?p=" + str4 + "&v=" + i + "&data=" + optJSONObject3, str3, aVar);
            } catch (JSONException unused) {
                aVar.a(str3, "{\"status\":\"1\"");
            }
        }
    }

    private void appendCatCommonTag(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4d2ef36c6d5bc3c69f425dd584b2b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4d2ef36c6d5bc3c69f425dd584b2b1c");
        } else if (jSONObject == null) {
        } else {
            try {
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i());
                jSONObject.put("platform", "android");
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, Build.VERSION.RELEASE);
                jSONObject.put("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod");
                jSONObject.put(NetLogConstants.Tags.NETWORK_TYPE, p.b(this.mContext));
                jSONObject.put("app_name", com.sankuai.waimai.platform.b.A().q());
                jSONObject.put("user_id", com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? com.sankuai.waimai.platform.domain.manager.user.a.i().d() : -1L);
                jSONObject.put("uuid", com.sankuai.waimai.platform.b.A().c());
            } catch (JSONException unused) {
            }
        }
    }

    private void reportCat(String str, final String str2, final com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c14f4ac4d4b5dddbe3a1d7450968d581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c14f4ac4d4b5dddbe3a1d7450968d581");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CatJsReportRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CatJsReportRequest.class)).report(str), new j<ap>() { // from class: com.sankuai.waimai.platform.mach.statistics.CatJsNativeMethod.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                }

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9318a727722d0377837d5d8664d8f5d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9318a727722d0377837d5d8664d8f5d2");
                    } else {
                        aVar.a(str2, "{\"status\":\"0\"");
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4032747fb98b6c6939c11733c670bfcb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4032747fb98b6c6939c11733c670bfcb");
                    } else {
                        aVar.a(str2, "{\"status\":\"1\"");
                    }
                }
            }, this.volleyTag);
        }
    }
}
