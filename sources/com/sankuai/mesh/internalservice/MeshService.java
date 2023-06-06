package com.sankuai.mesh.internalservice;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.JsHost;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.a;
import com.sankuai.mesh.core.MeshMethod;
import com.sankuai.mesh.core.b;
import com.sankuai.mesh.core.c;
import com.sankuai.mesh.core.f;
import com.sankuai.mesh.util.e;
import com.sankuai.mesh.util.f;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MeshService extends c {
    private static final String DEST_URL = "destUrl";
    private static final String MESH_URL = "meshUrl";
    private static final String REQUEST_CODE = "requestCode";
    private static final String ROUTE_SCHEME = "mesh://meshRoute/openForResult";
    private static final String URL = "url";
    public static ChangeQuickRedirect changeQuickRedirect;

    @MeshMethod("init")
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "957aa136bbd0c7ee7a079f8a759afba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "957aa136bbd0c7ee7a079f8a759afba1");
            return;
        }
        String asString = this.mMeshBaseUrl.getParameters().get("subMethod").getAsString();
        if (!TextUtils.isEmpty(asString)) {
            b.a(this.mContext, asString);
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("uaInfo", e.a(this.mContext));
        jsonObject.add("apis", com.sankuai.mesh.util.c.a(f.a()));
        JsHost a = b.a(this.mContext);
        if (a != null && Build.VERSION.SDK_INT >= 26) {
            a.getWebView().setWebViewClient(new a(a.getWebView().getWebViewClient(), this.mContext));
        }
        callBackOk(jsonObject);
    }

    @MeshMethod("getAllApi")
    public void getAllApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1cc128706bdf1ef3bf30aa6e13b4c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1cc128706bdf1ef3bf30aa6e13b4c82");
        } else {
            callBackOk(f.a());
        }
    }

    @MeshMethod("getUA")
    public void getUA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "514f91080d76405afd20eab9693202f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "514f91080d76405afd20eab9693202f7");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("uaInfo", e.a(this.mContext));
        callBackOk(jsonObject);
    }

    @MeshMethod("redirectError")
    public void redirectError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bba533748b77ce8bc6cfc45b16785f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bba533748b77ce8bc6cfc45b16785f02");
        } else if (this.mMeshBaseUrl.getParameters() != null) {
            String asString = this.mMeshBaseUrl.getParameters().get("sourceUrl").getAsString();
            String asString2 = this.mMeshBaseUrl.getParameters().get("targetUrl").getAsString();
            HashMap<String, String> hashMap = b.b.get(this.mContext);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                b.b.put(this.mContext, hashMap);
            }
            hashMap.put(asString, asString2);
            callBackOk("");
        } else {
            callBackError("");
        }
    }

    @MeshMethod(NetLogConstants.Details.REDIRECT)
    public void redirect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3a819790d9e12b708fe9d63bb276a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3a819790d9e12b708fe9d63bb276a5b");
        } else if (this.mMeshBaseUrl.getParameters() != null) {
            b.a(this.mContext).loadUrl(this.mMeshBaseUrl.getParameters().get("reDirect").getAsString());
            callBackOk("");
        } else {
            callBackError("");
        }
    }

    @MeshMethod("openUrl")
    public void openUrl() {
        String asString;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10dff75c9a3b66d6a5d48f837d22ec9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10dff75c9a3b66d6a5d48f837d22ec9f");
        } else if (this.mMeshBaseUrl.getParameters() != null && this.mMeshBaseUrl.getParameters().get("url") != null) {
            JsonElement jsonElement = null;
            if (this.mMeshBaseUrl.hasApiType() && "h5".equals(this.mMeshBaseUrl.getApiAdaptIds().get(0).targetType)) {
                asString = this.mMeshBaseUrl.getParameters().get("h5_url").getAsString();
            } else {
                asString = this.mMeshBaseUrl.getParameters().get("url").getAsString();
                jsonElement = this.mMeshBaseUrl.getParameters().get("requestCode");
            }
            if (jsonElement != null && jsonElement.getAsString().matches("\\d+")) {
                if (this.mContext instanceof Activity) {
                    z = com.sankuai.mesh.util.b.a((Activity) this.mContext, asString, jsonElement.getAsInt());
                }
            } else {
                z = com.sankuai.mesh.util.b.a(this.mContext, asString);
            }
            if (z) {
                callBackOk("");
                return;
            }
            callBackError("");
            f.a b = e.b(this.mMeshBaseUrl);
            com.sankuai.mesh.util.f.a(b.a("message", "打开协议失败,url=" + asString + ",context=" + this.mContext).a("apiStatus", "doing").b);
        } else {
            callBackError("");
        }
    }

    @MeshMethod("batchInspectApi")
    public void batchInspect() {
        String obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5108b29f7553adaad2c57d84ab3f6d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5108b29f7553adaad2c57d84ab3f6d0b");
        } else if (this.mMeshBaseUrl.getParameters() == null || this.mMeshBaseUrl.getParameters().get("namespace") == null) {
            callBackError("");
        } else {
            String asString = this.mMeshBaseUrl.getParameters().get("namespace").getAsString();
            if (TextUtils.isEmpty(asString)) {
                callBackError("");
                return;
            }
            JsonObject jsonObject = new JsonObject();
            Field[] declaredFields = JsHandlerFactory.class.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(null);
                        if (obj2 instanceof HashMap) {
                            for (Map.Entry entry : ((HashMap) obj2).entrySet()) {
                                if (((String) entry.getKey()).contains(asString)) {
                                    if (entry.getValue() instanceof Class) {
                                        obj = ((Class) entry.getValue()).getName();
                                    } else {
                                        obj = entry.getValue().toString();
                                    }
                                    try {
                                        Class<?> cls = Class.forName(obj);
                                        if (cls != null && cls != Object.class) {
                                            jsonObject.addProperty((String) entry.getKey(), "存在");
                                        } else {
                                            jsonObject.addProperty((String) entry.getKey(), "不存在");
                                        }
                                    } catch (Exception unused) {
                                        jsonObject.addProperty((String) entry.getKey(), "不存在");
                                    }
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            callBackOk(jsonObject);
        }
    }

    @MeshMethod("openUrlForResult")
    public void openUrlForResult() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce6ce8ad7eef032dc229c498129e9b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce6ce8ad7eef032dc229c498129e9b8");
        } else if (this.mMeshBaseUrl.getParameters() != null && this.mMeshBaseUrl.getParameters().get("url") != null) {
            String asString = this.mMeshBaseUrl.getParameters().get("url").getAsString();
            int asInt = this.mMeshBaseUrl.getParameters().get("requestCode") != null ? this.mMeshBaseUrl.getParameters().get("requestCode").getAsInt() : 0;
            if (this.mContext instanceof Activity) {
                if (TextUtils.equals(this.mMeshBaseUrl.getSourceType(), "android")) {
                    String parseNewScheme = parseNewScheme(asString, asInt);
                    com.sankuai.mesh.core.e.a(this.mMeshBaseUrl.getUniqueId(), this.mIMeshApiCallBack);
                    z = com.sankuai.mesh.util.b.a((Activity) this.mContext, parseNewScheme);
                } else {
                    z = com.sankuai.mesh.util.b.a((Activity) this.mContext, asString, asInt);
                }
            }
            if (z) {
                return;
            }
            callBackError("");
            f.a b = e.b(this.mMeshBaseUrl);
            com.sankuai.mesh.util.f.a(b.a("message", "打开协议失败,url=" + asString + ",context=" + this.mContext).a("apiStatus", "doing").b);
        } else {
            callBackError("");
        }
    }

    private String parseNewScheme(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1d0cfaf7144b259997fc32b410dc2f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1d0cfaf7144b259997fc32b410dc2f5");
        }
        Uri.Builder buildUpon = Uri.parse(ROUTE_SCHEME).buildUpon();
        buildUpon.appendQueryParameter(DEST_URL, str);
        buildUpon.appendQueryParameter(MESH_URL, this.mMeshBaseUrl.toString());
        buildUpon.appendQueryParameter("requestCode", String.valueOf(i));
        return buildUpon.build().toString();
    }
}
