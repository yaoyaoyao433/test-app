package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.dianping.monitor.impl.c;
import com.dianping.monitor.impl.m;
import com.dianping.titans.bridge.BridgeConfigManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SendInnerLogJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "200451b1a3b6fa80d8c13b4180c02c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "200451b1a3b6fa80d8c13b4180c02c5c");
            return;
        }
        String optString = jsBean().argsJson.optString("channel");
        String optString2 = jsBean().argsJson.optString("type");
        if (TextUtils.equals("raptor", optString) && TextUtils.equals("bridge", optString2)) {
            if (BridgeConfigManager.isDebug()) {
                c.a(true);
            }
            Context context = jsHost().getContext();
            m mVar = new m(BridgeConfigManager.getCatId(), context, GetUUID.getInstance().getUUID(jsHost().getContext()));
            JSONObject optJSONObject = jsBean().argsJson.optJSONObject("config");
            if (optJSONObject == null || optJSONObject.length() == 0) {
                jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorMsg(";config"));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("keyNames");
            if (optJSONObject2 == null || optJSONObject2.length() == 0) {
                jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorMsg(";keyNames"));
                return;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = optJSONObject2.optJSONArray(next);
                ArrayList arrayList = new ArrayList();
                if (optJSONArray == null) {
                    arrayList.add(Float.valueOf(0.0f));
                } else {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            arrayList.add(Float.valueOf((float) optJSONArray.getDouble(i)));
                        } catch (JSONException unused) {
                            int errorCode = KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode();
                            KNBJsErrorInfo kNBJsErrorInfo = KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid;
                            jsCallbackError(errorCode, kNBJsErrorInfo.getErrorMsg(";keyNames|" + next + ";" + optJSONArray.optJSONObject(i)));
                            return;
                        }
                    }
                    continue;
                }
                mVar.a(next, arrayList);
            }
            JSONObject optJSONObject3 = jsBean().argsJson.optJSONObject("extra");
            if (optJSONObject3 == null || optJSONObject3.length() == 0) {
                jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorMsg(";extra"));
                return;
            }
            Iterator<String> keys2 = optJSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                mVar.a(next2, optJSONObject3.optString(next2));
            }
            mVar.a("page", jsHost().getUrl());
            mVar.a("appid", BridgeConfigManager.getKNBAppId());
            mVar.a("titans_version", "20.14.1");
            try {
                mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            mVar.a();
        }
        jsCallback();
    }
}
