package com.sankuai.waimai.touchmatrix.mach;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.addrsdk.retrofit.c;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.touchmatrix.dialog.e;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
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
        d<ap> report(@Url String str);
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String module() {
        return "wmmonitor";
    }

    public CatJsNativeMethod(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "413ccfb3f5642fc0b319465382270965", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "413ccfb3f5642fc0b319465382270965");
            return;
        }
        this.mContext = context;
        this.volleyTag = str;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ac5b7a61a31e5cb3455af5800b51f0d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ac5b7a61a31e5cb3455af5800b51f0d") : new String[]{"reportCat"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        JSONObject optJSONObject;
        int i = 0;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64ede1c6b4862d0c8632217849fb62b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64ede1c6b4862d0c8632217849fb62b6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57e8fb213a11f682d7c1d95a74aa1848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57e8fb213a11f682d7c1d95a74aa1848");
        } else if (jSONObject == null) {
        } else {
            try {
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.foundation.core.common.a.a().e());
                jSONObject.put("platform", "android");
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, Build.VERSION.RELEASE);
                jSONObject.put("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod");
                jSONObject.put(NetLogConstants.Tags.NETWORK_TYPE, p.b(this.mContext));
                com.sankuai.waimai.foundation.core.common.a.a();
                jSONObject.put("app_name", com.sankuai.waimai.foundation.core.common.a.h());
                jSONObject.put("user_id", e.a().b() ? e.a().c() : -1L);
                jSONObject.put("uuid", GetUUID.getInstance().getUUID(this.mContext));
            } catch (JSONException unused) {
            }
        }
    }

    private void reportCat(String str, final String str2, final com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44718d96b2909cad56fee2c9bf8a731f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44718d96b2909cad56fee2c9bf8a731f");
        } else {
            c.a(((CatJsReportRequest) c.a(CatJsReportRequest.class)).report(str), new j<ap>() { // from class: com.sankuai.waimai.touchmatrix.mach.CatJsNativeMethod.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                }

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c889889091f3354850f8b1e098ec7fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c889889091f3354850f8b1e098ec7fb");
                    } else {
                        aVar.a(str2, "{\"status\":\"0\"");
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e1fc8a9eaa6b447c28fb6dbe7caa62a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e1fc8a9eaa6b447c28fb6dbe7caa62a9");
                    } else {
                        aVar.a(str2, "{\"status\":\"1\"");
                    }
                }
            }, this.volleyTag);
        }
    }
}
