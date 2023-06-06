package com.meituan.android.common.aidata.jsengine.modules.autopredict;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.android.common.aidata.jsengine.modules.AbstractNativeMethod;
import com.meituan.android.common.aidata.jsengine.modules.IJSNativeModuleCallback;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GetFeatureMethod extends AbstractNativeMethod {
    private static final String KEY_FEATURE_CONFIGS = "configs";
    public static final String KEY_FEATURE_JS_PARAMS = "jsFeatureParam";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeMethod
    public String getMethodName() {
        return AIDataModule.MODULE_METHOD_GET_FEATURES;
    }

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeMethod
    public void invoke(String str, String str2, final String str3, final IJSNativeModuleCallback iJSNativeModuleCallback) {
        BlueException blueException;
        JSONObject jSONObject;
        ArrayList arrayList;
        Object[] objArr = {str, str2, str3, iJSNativeModuleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f3a2ac7f369563af5753a43cba7bcc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f3a2ac7f369563af5753a43cba7bcc1");
            return;
        }
        try {
            jSONObject = new JSONArray(str2).optJSONObject(0);
            blueException = null;
        } catch (Exception e) {
            e.getMessage();
            blueException = new BlueException(e, BaseRaptorUploader.ERROR_FAILED_PARSE_ARGS_GET_FEATURE);
            jSONObject = null;
        }
        if (jSONObject == null) {
            callbackFail(blueException, str3, iJSNativeModuleCallback);
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_FEATURE_CONFIGS);
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    GetFeatureRequest getFeatureRequest = new GetFeatureRequest();
                    getFeatureRequest.isRealTime = optJSONObject.optBoolean(JSFeatureConfig.KEY_BUNDLE_FEATURE_REALTIME);
                    getFeatureRequest.feature = optJSONObject.optString("featureName");
                    if (!TextUtils.isEmpty(getFeatureRequest.feature)) {
                        arrayList.add(getFeatureRequest);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        final JSONObject optJSONObject2 = jSONObject.optJSONObject("jsFeatureParam");
        AIData.getFeature(arrayList, optJSONObject2 != null ? new JSFeatureOutParamsCallback() { // from class: com.meituan.android.common.aidata.jsengine.modules.autopredict.GetFeatureMethod.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback
            public JSONObject getOutParams(String str4) {
                Object[] objArr2 = {str4};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c17d73c4fd0509be5548c2731535428d", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c17d73c4fd0509be5548c2731535428d") : optJSONObject2.optJSONObject(str4);
            }
        } : null, new IFeatureListener() { // from class: com.meituan.android.common.aidata.jsengine.modules.autopredict.GetFeatureMethod.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.feature.IFeatureListener
            public void onSuccess(@Nullable FeatureResult featureResult) {
                Object[] objArr2 = {featureResult};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9097059d066ebb6934bf37bd7ad00fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9097059d066ebb6934bf37bd7ad00fc");
                } else if (iJSNativeModuleCallback == null) {
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    if (featureResult != null) {
                        try {
                            jSONObject2.put("data", featureResult.toJsonObject());
                        } catch (Exception unused) {
                        }
                    }
                    iJSNativeModuleCallback.invoke(str3, jSONObject2);
                }
            }

            @Override // com.meituan.android.common.aidata.feature.IFeatureListener
            public void onFailed(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "030427fb0fef87f4f3b0f81750091af1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "030427fb0fef87f4f3b0f81750091af1");
                } else {
                    GetFeatureMethod.this.callbackFail(exc, str3, iJSNativeModuleCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFail(Exception exc, String str, IJSNativeModuleCallback iJSNativeModuleCallback) {
        String str2;
        String str3;
        Object[] objArr = {exc, str, iJSNativeModuleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a50bf82912d5e1aa4fd8035f5868f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a50bf82912d5e1aa4fd8035f5868f7");
        } else if (iJSNativeModuleCallback == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (exc instanceof BlueException) {
                str2 = ((BlueException) exc).getErrorCode();
                str3 = exc.getMessage();
            } else if (exc != null) {
                str2 = "-1";
                str3 = exc.getMessage();
            } else {
                str2 = "-1";
                str3 = RaptorConstants.ERROR_UNKNOWN_VALUE;
            }
            try {
                jSONObject.put("code", str2);
                jSONObject.put("msg", str3);
            } catch (JSONException unused) {
            }
            iJSNativeModuleCallback.invoke(str, jSONObject);
        }
    }
}
