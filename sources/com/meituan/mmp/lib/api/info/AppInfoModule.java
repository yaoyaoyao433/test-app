package com.meituan.mmp.lib.api.info;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.config.a;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppInfoModule extends ServiceApi {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8868b4c94f61c6b7527d8a58f1327004", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8868b4c94f61c6b7527d8a58f1327004") : new String[]{"getAccountInfoSync"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        JSONObject jSONObject2;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730177c9ea46935a26e07167fdbb26c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730177c9ea46935a26e07167fdbb26c1");
            return;
        }
        if (((str.hashCode() == 495464320 && str.equals("getAccountInfoSync")) ? (char) 0 : (char) 65535) == 0) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ca2a6ad9d5210528b3b8128bbf59f79", RobustBitConfig.DEFAULT_VALUE)) {
                    jSONObject2 = (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ca2a6ad9d5210528b3b8128bbf59f79");
                } else {
                    jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    a appConfig = getAppConfig();
                    boolean isDebug = appConfig.l.isDebug();
                    String version = appConfig.l.getVersion();
                    if (version == null) {
                        version = "";
                    }
                    jSONObject3.put("appId", appConfig.c());
                    jSONObject3.put("appName", appConfig.d());
                    jSONObject3.put("version", version);
                    jSONObject3.put("release", appConfig.g());
                    jSONObject3.put(RemoteMessageConst.Notification.ICON, appConfig.f());
                    jSONObject3.put("envVersion", isDebug ? "develop" : "release");
                    jSONObject2.put("miniProgram", jSONObject3);
                }
                iApiCallback.onSuccess(jSONObject2);
                return;
            } catch (JSONException unused) {
                iApiCallback.onFail(codeJson(-1, "get account info api error!"));
                return;
            }
        }
        iApiCallback.onFail(codeJson(84063, "api does not exist"));
    }
}
