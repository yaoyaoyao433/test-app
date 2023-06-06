package com.sankuai.waimai.alita.modules;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.alita.core.jsexecutor.modules.m;
import java.util.Map;
import org.json.JSONObject;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class WMNetworkRequestMethod extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
    public static ChangeQuickRedirect b;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class JSRequest {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map<String, String> parameters;
        public String path;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface JSRequestService {
        @POST
        @FormUrlEncoded
        rx.d<ap> get(@Url String str, @FieldMap Map<String, String> map);
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return a.c;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(final String str, String str2, final String str3, final m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775f9ec903c4bd5aa93395d075636103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775f9ec903c4bd5aa93395d075636103");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a(str + " | WMNetworkRequestMethod | " + str2);
        if (TextUtils.isEmpty(str2)) {
            a(mVar, str3, "args is empty");
            return;
        }
        JSRequest jSRequest = (JSRequest) com.sankuai.waimai.mach.utils.b.a().fromJson(str2, (Class<Object>) JSRequest.class);
        if (TextUtils.isEmpty(jSRequest.path)) {
            a(mVar, str3, "path is empty");
            return;
        }
        if (jSRequest.path.startsWith("/")) {
            jSRequest.path = jSRequest.path.substring(1);
        }
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.c + ": taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        String str4 = jSRequest.path;
        Map<String, String> map = jSRequest.parameters;
        j<ap> jVar = new j<ap>() { // from class: com.sankuai.waimai.alita.modules.WMNetworkRequestMethod.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                ap apVar = (ap) obj;
                Object[] objArr2 = {apVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2d05314ac2533aebb464b8905593f71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2d05314ac2533aebb464b8905593f71");
                } else if (apVar != null) {
                    String string = apVar.string();
                    com.sankuai.waimai.alita.core.utils.c.a("httpRequest | onNext | " + apVar);
                    if (TextUtils.isEmpty(string)) {
                        StringBuilder sb = new StringBuilder("JsBridge ");
                        WMNetworkRequestMethod wMNetworkRequestMethod = WMNetworkRequestMethod.this;
                        sb.append(a.c);
                        sb.append(".failed: taskKey = ");
                        sb.append(str);
                        sb.append(", callbackId = ");
                        sb.append(str3);
                        sb.append(", e = data is null");
                        com.sankuai.waimai.alita.platform.debug.b.a(sb.toString());
                        WMNetworkRequestMethod.this.a(mVar, str3, "data is null");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        StringBuilder sb2 = new StringBuilder("JsBridge ");
                        WMNetworkRequestMethod wMNetworkRequestMethod2 = WMNetworkRequestMethod.this;
                        sb2.append(a.c);
                        sb2.append(".success: taskKey = ");
                        sb2.append(str);
                        sb2.append(", callbackId = ");
                        sb2.append(str3);
                        sb2.append(", result = ");
                        sb2.append(jSONObject);
                        com.sankuai.waimai.alita.platform.debug.b.a(sb2.toString());
                        WMNetworkRequestMethod.this.a(str, mVar, str3, jSONObject);
                    } catch (Exception e) {
                        StringBuilder sb3 = new StringBuilder("JsBridge ");
                        WMNetworkRequestMethod wMNetworkRequestMethod3 = WMNetworkRequestMethod.this;
                        sb3.append(a.c);
                        sb3.append(".failed: taskKey = ");
                        sb3.append(str);
                        sb3.append(", callbackId = ");
                        sb3.append(str3);
                        sb3.append(", e = ");
                        sb3.append(e.toString());
                        com.sankuai.waimai.alita.platform.debug.b.a(sb3.toString());
                        WMNetworkRequestMethod.this.a(mVar, str3, e.getMessage());
                    }
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6806d634f9b640d3300aef747ad73b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6806d634f9b640d3300aef747ad73b5");
                } else {
                    com.sankuai.waimai.alita.core.utils.c.a("httpRequest | onCompleted");
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a73895d6293c0e5ddb969dcc369aa11c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a73895d6293c0e5ddb969dcc369aa11c");
                    return;
                }
                com.sankuai.waimai.alita.core.utils.c.a("httpRequest | onError | " + th.getMessage());
                StringBuilder sb = new StringBuilder("JsBridge ");
                WMNetworkRequestMethod wMNetworkRequestMethod = WMNetworkRequestMethod.this;
                sb.append(a.c);
                sb.append(".failed: taskKey = ");
                sb.append(str);
                sb.append(", callbackId = ");
                sb.append(str3);
                sb.append(", e = ");
                sb.append(th.toString());
                com.sankuai.waimai.alita.platform.debug.b.a(sb.toString());
                WMNetworkRequestMethod.this.a(mVar, str3, th.getMessage());
            }
        };
        Object[] objArr2 = {str4, map, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79d210014b2457b5d9bedf27cd3c81ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79d210014b2457b5d9bedf27cd3c81ed");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((JSRequestService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) JSRequestService.class)).get(str4, map), jVar, "ALITA_JS_WM_NETWORKREQUEST", false);
        }
    }
}
