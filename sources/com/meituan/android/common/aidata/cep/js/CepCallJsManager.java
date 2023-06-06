package com.meituan.android.common.aidata.cep.js;

import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.cep.CustomCepContext;
import com.meituan.android.common.aidata.cep.ICustomCepServiceListener;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.jsengine.AutoJSServiceManager;
import com.meituan.android.common.aidata.jsengine.ControllerInfo;
import com.meituan.android.common.aidata.jsengine.IAutoJSRunController;
import com.meituan.android.common.aidata.jsengine.IAutoJSRunInterceptor;
import com.meituan.android.common.aidata.jsengine.InterceptorContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepCallJsManager {
    public static final String JS_PARAM_CEP_EVENTS = "events";
    public static final String JS_PARAM_CEP_FEATURE = "feature";
    public static final String JS_PARAM_CEP_ID = "cepId";
    public static final String JS_PARAM_CEP_TIMES = "times";
    public static final String JS_PARAM_CEP_UNIQUE_ID = "uniqueId";
    public static final String JS_PARAM_CEP_VERSION = "version";
    public static final String JS_PARAM_KEY_CEP = "cep";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class InnerClass {
        private static final CepCallJsManager STUB = new CepCallJsManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static CepCallJsManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2e3fd1a82c3fab3eec2117d3f001e3b", RobustBitConfig.DEFAULT_VALUE) ? (CepCallJsManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2e3fd1a82c3fab3eec2117d3f001e3b") : InnerClass.STUB;
    }

    public void registerJS(AiBundle aiBundle, AiBundle.JSConfig jSConfig) {
        Object[] objArr = {aiBundle, jSConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed1ef69b3203871b5b27d1e01e25331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed1ef69b3203871b5b27d1e01e25331");
            return;
        }
        if (aiBundle != null && !aiBundle.isAutoJSBundleInValid() && (jSConfig instanceof CepCallJsConfig)) {
            String bundleScene = jSConfig.getBundleScene();
            if (!TextUtils.isEmpty(bundleScene)) {
                AutoJSServiceManager.getInstance().registerJSExecuteInfo(aiBundle, bundleScene);
                List<String> cepList = ((CepCallJsConfig) jSConfig).getCepList();
                new StringBuilder("jsResource cep info : ").append(cepList);
                if (cepList == null || cepList.size() <= 0) {
                    return;
                }
                for (String str : cepList) {
                    if (!TextUtils.isEmpty(str)) {
                        AIDataDelegate.getInstance().subscribeCustomCepServiceCallback(new CEPSubscriberConfig.Builder().featureList(Collections.singletonList(str)).build(), getCepListener(bundleScene));
                    }
                }
                return;
            }
        }
        new StringBuilder("jsConfig is not valid : ").append(jSConfig);
    }

    private ICustomCepServiceListener getCepListener(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "171c3fe85a7bb1f0927f4ff077231273", RobustBitConfig.DEFAULT_VALUE) ? (ICustomCepServiceListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "171c3fe85a7bb1f0927f4ff077231273") : new ICustomCepServiceListener() { // from class: com.meituan.android.common.aidata.cep.js.CepCallJsManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.cep.ICustomCepServiceListener
            public void onRuleMatchSucceed(final String str2, final String str3, final List<StreamData> list, final int i, final CustomCepContext customCepContext) {
                Object[] objArr2 = {str2, str3, list, Integer.valueOf(i), customCepContext};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a561d1f0925018588f3a26355c4d5ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a561d1f0925018588f3a26355c4d5ac");
                    return;
                }
                new StringBuilder("cep onRuleMatchSucceed : ").append(str);
                IAutoJSRunInterceptor jSRunInterceptor = AutoJSServiceManager.getInstance().getJSRunInterceptor(str);
                if (jSRunInterceptor != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" has jsRunInterceptor");
                    InterceptorContext interceptorContext = new InterceptorContext();
                    interceptorContext.feature = str2;
                    interceptorContext.cepId = str3;
                    interceptorContext.times = i;
                    interceptorContext.events = list;
                    jSRunInterceptor.onIntercept(interceptorContext, new IAutoJSRunController() { // from class: com.meituan.android.common.aidata.cep.js.CepCallJsManager.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.jsengine.IAutoJSRunController
                        public void runJS(ControllerInfo controllerInfo) {
                            Object[] objArr3 = {controllerInfo};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b28b3a050923f5b09e3c3437bcf69b92", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b28b3a050923f5b09e3c3437bcf69b92");
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(" jsRunInterceptor invoke run , execute JS");
                            AutoJSServiceManager.getInstance().executeJS(str, CepCallJsManager.this.generateJSParams(controllerInfo == null ? null : controllerInfo.getCustomParam(), str2, str3, list, i, customCepContext));
                        }
                    });
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" jsRunInterceptor is null , execute JS");
                AutoJSServiceManager.getInstance().executeJS(str, CepCallJsManager.this.generateJSParams(null, str2, str3, list, i, customCepContext));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray generateJSParams(Object obj, String str, String str2, List<StreamData> list, int i, CustomCepContext customCepContext) {
        Object[] objArr = {obj, str, str2, list, Integer.valueOf(i), customCepContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab1df6e4c3c0125abf39c20605d8832d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab1df6e4c3c0125abf39c20605d8832d");
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("feature", str);
            jSONObject2.put("cepId", str2);
            jSONObject2.put("times", i);
            JSONArray jSONArray2 = new JSONArray();
            if (list != null && list.size() > 0) {
                for (StreamData streamData : list) {
                    if (streamData != null) {
                        jSONArray2.put(streamData.toJson());
                    }
                }
            }
            jSONObject2.put("events", jSONArray2);
            if (customCepContext != null) {
                jSONObject2.put("version", customCepContext.cepVer);
                jSONObject2.put(JS_PARAM_CEP_UNIQUE_ID, customCepContext.cepUniqueId);
            }
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(JS_PARAM_KEY_CEP, jSONObject2);
            jSONObject.put("platform", 1);
            if (obj != null) {
                jSONObject.put("customParam", obj);
            }
        } catch (JSONException unused2) {
        }
        jSONArray.put(jSONObject);
        new StringBuilder("js params is ").append(jSONArray);
        return jSONArray;
    }
}
