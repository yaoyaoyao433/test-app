package com.sankuai.mesh.core;

import android.content.Intent;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import com.sankuai.mesh.core.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MeshContactHandler extends BaseJsHandler {
    private static final String KEY_METHOD_NAME = "methodName";
    private static final String KEY_PARAMS = "params";
    private static final String KEY_SCHEME = "scheme";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<c> activityResultConsumers;
    private MeshBaseUrl baseUrl;
    private String methodName;
    private String tradeNo;

    public MeshContactHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffd84c4fdb51d217c381f5937819c52c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffd84c4fdb51d217c381f5937819c52c");
            return;
        }
        this.baseUrl = null;
        this.activityResultConsumers = new ArrayList();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8423bc0d782ab83a442f8e094dd1a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8423bc0d782ab83a442f8e094dd1a87");
            return;
        }
        this.methodName = jsBean().argsJson.optString(KEY_METHOD_NAME);
        String optString = jsBean().argsJson.optString("scheme");
        b.a(this.mJsHost.getActivity(), this.mJsHost);
        if (!TextUtils.isEmpty(this.methodName)) {
            this.baseUrl = getMeshScheme(this.methodName, jsBean().argsJson.optJSONObject("params"));
        } else if (!TextUtils.isEmpty(optString)) {
            this.baseUrl = com.sankuai.mesh.util.e.a(optString);
        }
        if (this.baseUrl != null && this.baseUrl.getParameters() != null && this.baseUrl.getParameters().get("trade_number") != null) {
            this.tradeNo = this.baseUrl.getParameters().get("trade_number").getAsString();
        }
        logBridgeCalled(this.baseUrl);
        if (this.baseUrl != null) {
            e.a(this.mJsHost.getActivity(), this.baseUrl, new c.a() { // from class: com.sankuai.mesh.core.MeshContactHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.mesh.core.c.a
                public final void a(MeshBaseUrl meshBaseUrl) {
                    Object[] objArr2 = {meshBaseUrl};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "509bb1c1d4dff9ff2177e1b2b9559add", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "509bb1c1d4dff9ff2177e1b2b9559add");
                    } else {
                        MeshContactHandler.this.response(meshBaseUrl);
                    }
                }
            }, new a() { // from class: com.sankuai.mesh.core.MeshContactHandler.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.mesh.core.a
                public final void a(c cVar, MeshBaseUrl meshBaseUrl) {
                    Object[] objArr2 = {cVar, meshBaseUrl};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e9f1f74dd867d67e75cc147fb98f848", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e9f1f74dd867d67e75cc147fb98f848");
                    } else if (cVar.consumeActivityResult()) {
                        MeshContactHandler.this.registerActivityConsumer(cVar);
                    }
                }
            });
        } else {
            response(com.sankuai.mesh.util.e.b("scheme解析出错"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void response(MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "226d3e660b9fecf0b46c9dadd36876ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "226d3e660b9fecf0b46c9dadd36876ce");
            return;
        }
        if (!TextUtils.isEmpty(this.methodName)) {
            if (meshBaseUrl != null && !meshBaseUrl.isRequest()) {
                if (meshBaseUrl.isRequestSuccess()) {
                    jsCallback();
                    logBridgeResponsed(meshBaseUrl, true, -1, "");
                } else {
                    String str = "";
                    if (meshBaseUrl.getError() != null) {
                        JsonObject error = meshBaseUrl.getError();
                        r2 = error.get("errorCode") != null ? error.get("errorCode").getAsInt() : -1;
                        if (error.get("errorMsg") != null) {
                            str = error.get("errorMsg").getAsString();
                        } else if (error.get("message") != null) {
                            str = error.get("message").getAsString();
                        }
                    }
                    jsCallbackError(r2, str);
                    logBridgeResponsed(meshBaseUrl, false, r2, str);
                }
            }
            unRegisterAllActivityConsumer();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (meshBaseUrl != null) {
            try {
                jSONObject.put("scheme", meshBaseUrl.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jsCallback(jSONObject);
        logBridgeResponsed(meshBaseUrl, true, -1, "");
    }

    private MeshBaseUrl getMeshScheme(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "503fe12f0fdc45014467775bf51a7ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "503fe12f0fdc45014467775bf51a7ec5");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.DOT);
        if (indexOf == -1) {
            response(com.sankuai.mesh.util.e.b("methodName格式错误"));
            return null;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        MeshBaseUrl meshBaseUrl = new MeshBaseUrl();
        meshBaseUrl.setApi(substring2);
        meshBaseUrl.setService(substring);
        meshBaseUrl.setSourceType("h5");
        meshBaseUrl.setParameters(com.sankuai.mesh.util.c.a(jSONObject.toString()));
        meshBaseUrl.setUniqueId(com.sankuai.mesh.util.e.a());
        meshBaseUrl.setBusinessId("nativeBus");
        return meshBaseUrl;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6acc292b3f8dfc9e3c4d54ac0a953c02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6acc292b3f8dfc9e3c4d54ac0a953c02");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (com.sankuai.mesh.util.a.a(this.activityResultConsumers)) {
            return;
        }
        for (c cVar : this.activityResultConsumers) {
            cVar.onActivityResult(i, i2, intent);
        }
    }

    public void registerActivityConsumer(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db2c4dab27b98a0e7c3a1257fe284879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db2c4dab27b98a0e7c3a1257fe284879");
        } else {
            this.activityResultConsumers.add(cVar);
        }
    }

    public void unRegisterAllActivityConsumer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d919933391791d1531470a057be8a61e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d919933391791d1531470a057be8a61e");
        } else {
            this.activityResultConsumers.clear();
        }
    }

    private void logBridgeCalled(MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9921b92eadeaf5f50bcc3d320ace5f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9921b92eadeaf5f50bcc3d320ace5f05");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeNo", this.tradeNo);
        if (meshBaseUrl != null) {
            hashMap.put("meshBaseUrl", meshBaseUrl.toString());
        }
        hashMap.put("bridgeName", jsBean().method);
        hashMap.put(KEY_METHOD_NAME, this.methodName);
        com.sankuai.mesh.util.d.a("b_pay_mesh_bridge_call_sc", hashMap);
    }

    private void logBridgeResponsed(MeshBaseUrl meshBaseUrl, boolean z, int i, String str) {
        Object[] objArr = {meshBaseUrl, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e97ea3293f6ac471e89b03b5f7dfce75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e97ea3293f6ac471e89b03b5f7dfce75");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeNo", this.tradeNo);
        if (meshBaseUrl != null) {
            hashMap.put("meshBaseUrl", meshBaseUrl.toString());
        }
        hashMap.put("bridgeName", jsBean().method);
        hashMap.put(KEY_METHOD_NAME, this.methodName);
        if (z) {
            hashMap.put("status", "success");
        } else {
            hashMap.put("status", "fail");
            hashMap.put("errorCode", Integer.valueOf(i));
            hashMap.put("errorMsg", str);
        }
        com.sankuai.mesh.util.d.a("b_pay_mesh_bridge_response_sc", hashMap);
    }
}
