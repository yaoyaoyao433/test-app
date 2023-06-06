package com.sankuai.mesh.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.titans.js.JsHost;
import com.google.gson.JsonObject;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.aidata.cep.js.CepCallJsManager;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import com.sankuai.mesh.util.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static int b;

    public static String a() {
        String format;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d1855620fabc37d8f5c1ac8ac1c88dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d1855620fabc37d8f5c1ac8ac1c88dd");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(("2-") + System.currentTimeMillis() + CommonConstant.Symbol.MINUS);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "35bce90a7d03db6a3f248280f2cf245d", RobustBitConfig.DEFAULT_VALUE)) {
            format = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "35bce90a7d03db6a3f248280f2cf245d");
        } else {
            int i = b + 1;
            b = i;
            if (i >= 1000) {
                b = 1;
            }
            format = String.format(Locale.getDefault(), "%03d", Integer.valueOf(b));
        }
        sb.append(format);
        return sb.toString();
    }

    public static MeshBaseUrl a(String str) {
        HashMap hashMap;
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c0b6c8c1b77cb76c6f66120a4c024b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c0b6c8c1b77cb76c6f66120a4c024b6");
        }
        MeshBaseUrl meshBaseUrl = new MeshBaseUrl();
        try {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1689472a6a87fd13a4d3f99033625d8f", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (HashMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1689472a6a87fd13a4d3f99033625d8f");
            } else {
                HashMap hashMap2 = new HashMap();
                if (str != null) {
                    String trim = str.trim();
                    if (!"".equals(trim)) {
                        String[] split2 = trim.split("\\?");
                        if (split2.length != 1) {
                            for (String str2 : split2[1].split("&")) {
                                if (!TextUtils.isEmpty(str2)) {
                                    String[] split3 = str2.split("=");
                                    hashMap2.put(split3[0], split3[1]);
                                }
                            }
                        }
                    }
                }
                hashMap = hashMap2;
            }
            meshBaseUrl.setBusinessId((String) hashMap.get("businessId"));
            meshBaseUrl.setSourceType((String) hashMap.get("sourceType"));
            meshBaseUrl.setService((String) hashMap.get("service"));
            meshBaseUrl.setApi((String) hashMap.get("api"));
            meshBaseUrl.setUniqueId((String) hashMap.get(CepCallJsManager.JS_PARAM_CEP_UNIQUE_ID));
            meshBaseUrl.setApiAdaptId((String) hashMap.get("apiAdaptId"));
            MeshBaseUrl meshBaseUrl2 = (MeshBaseUrl) c.a(MeshBaseUrl.class, Uri.decode((String) hashMap.get("apiAdaptIds")), "apiAdaptIds");
            if (meshBaseUrl2 != null) {
                meshBaseUrl.setApiAdaptIds(meshBaseUrl2.getApiAdaptIds());
            }
            meshBaseUrl.setParameters(c.a(Uri.decode((String) hashMap.get("parameters"))));
            meshBaseUrl.setData(c.a(Uri.decode((String) hashMap.get("data"))));
            meshBaseUrl.setError(c.a(Uri.decode((String) hashMap.get("error"))));
            meshBaseUrl.setStatus((String) hashMap.get("status"));
            return meshBaseUrl;
        } catch (Exception unused) {
            f.a(b(meshBaseUrl).a("message", "解析scheme失败").a("apiStatus", "doing").b);
            return null;
        }
    }

    public static MeshBaseUrl a(MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33cd47d4ea96ec1add49d738ceca859f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33cd47d4ea96ec1add49d738ceca859f");
        }
        MeshBaseUrl.MeshApiType currentApiType = meshBaseUrl.getCurrentApiType();
        meshBaseUrl.autoIncrementIndex();
        if (currentApiType == null) {
            return null;
        }
        MeshBaseUrl m14clone = meshBaseUrl.m14clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(currentApiType);
        m14clone.setApiAdaptIds(arrayList);
        return m14clone;
    }

    public static JsonObject a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c67a9986a94aed8bad7014840bb16373", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c67a9986a94aed8bad7014840bb16373");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appName", com.sankuai.mesh.core.d.a().getAppName());
        jsonObject.addProperty("appVersion", com.sankuai.mesh.core.d.a().getAppVersion());
        jsonObject.addProperty(DeviceInfo.OS_NAME, "android");
        jsonObject.addProperty("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        jsonObject.addProperty("titansxVersion", "20.10.1");
        jsonObject.addProperty("meshVersion", "0.0.6");
        JsHost a2 = com.sankuai.mesh.core.b.a(context);
        if (a2 != null && a2.getWebView() != null) {
            jsonObject.addProperty("ua", a2.getWebView().getSettings().getUserAgentString());
        }
        return jsonObject;
    }

    public static f.a b(MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eea790469b2abc2abcc78c88bdc3f9ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (f.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eea790469b2abc2abcc78c88bdc3f9ae");
        }
        f.a aVar = new f.a();
        return meshBaseUrl == null ? aVar : aVar.a("sourceType", meshBaseUrl.getSourceType()).a("businessId", meshBaseUrl.getBusinessId()).a("serviceName", meshBaseUrl.getService()).a(HiAnalyticsConstant.HaKey.BI_KEY_APINAME, meshBaseUrl.getApi()).a("apiStatus", meshBaseUrl.getStatus()).a("adapterId", meshBaseUrl.getApiAdaptId());
    }

    public static MeshBaseUrl a(MeshBaseUrl meshBaseUrl, boolean z, JsonObject jsonObject) {
        Object[] objArr = {meshBaseUrl, Byte.valueOf(z ? (byte) 1 : (byte) 0), jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d02ffa15c20a09c057d7725ecdaa603e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d02ffa15c20a09c057d7725ecdaa603e");
        }
        MeshBaseUrl m14clone = meshBaseUrl.m14clone();
        if (z) {
            m14clone.setStatus("success");
            m14clone.setData(jsonObject);
        } else {
            m14clone.setStatus("fail");
            m14clone.setError(jsonObject);
        }
        m14clone.setParameters(null);
        m14clone.setApiAdaptIds(null);
        return m14clone;
    }

    public static MeshBaseUrl b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "534c4559f48e70304d91fb34c8f5f336", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "534c4559f48e70304d91fb34c8f5f336");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("code", (Number) 500);
        jsonObject.addProperty("message", str);
        MeshBaseUrl meshBaseUrl = new MeshBaseUrl();
        meshBaseUrl.setStatus("fail");
        meshBaseUrl.setError(jsonObject);
        return meshBaseUrl;
    }
}
