package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.cep.CustomCepContext;
import com.meituan.android.common.aidata.cep.ICustomCepServiceListener;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver;
import com.meituan.android.common.aidata.jsengine.AutoJSServiceManager;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.modules.autopredict.PredictMethod;
import com.meituan.android.common.aidata.jsengine.utils.JSCallback;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
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
public class AutoPredictManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final AutoPredictManager STUB = new AutoPredictManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static AutoPredictManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d96a0cb68febb6e428666d2eb016d7d0", RobustBitConfig.DEFAULT_VALUE) ? (AutoPredictManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d96a0cb68febb6e428666d2eb016d7d0") : InnerClass.STUB;
    }

    public void registerAutoPredict(AiBundle aiBundle, String str, JSONArray jSONArray, String str2) {
        Object[] objArr = {aiBundle, str, jSONArray, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d4a2f5575fe6a829c4e7b481d475579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d4a2f5575fe6a829c4e7b481d475579");
        } else if (aiBundle != null && !TextUtils.isEmpty(str) && jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    AutoJSServiceManager.getInstance().registerJSExecuteInfo(aiBundle, str);
                    AIDataDelegate.getInstance().subscribeCustomCepServiceCallback(new CEPSubscriberConfig.Builder().featureList(Collections.singletonList(optString)).build(), getCepListener(str, optString, str2));
                }
            }
        }
    }

    private ICustomCepServiceListener getCepListener(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6189a9ad9299a1e75fef43612aa8813", RobustBitConfig.DEFAULT_VALUE) ? (ICustomCepServiceListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6189a9ad9299a1e75fef43612aa8813") : new ICustomCepServiceListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.AutoPredictManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.cep.ICustomCepServiceListener
            public void onRuleMatchSucceed(String str4, String str5, List<StreamData> list, int i, CustomCepContext customCepContext) {
                Object[] objArr2 = {str4, str5, list, Integer.valueOf(i), customCepContext};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "96bab87e21f30e0a2bc3485f5e8469a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "96bab87e21f30e0a2bc3485f5e8469a7");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("modelName", str);
                    jSONObject.put(PredictMethod.KEY_BIZ_PREDICT_MODULE, str3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cepId", TextUtils.isEmpty(str2) ? "-999" : str2);
                    if (TextUtils.isEmpty(str5)) {
                        str5 = "-999";
                    }
                    jSONObject2.put(RaptorUploaderImpl.SUB_CEP_ID, str5);
                    if (customCepContext != null) {
                        jSONObject2.put(RaptorUploaderImpl.CEP_VERSION, TextUtils.isEmpty(customCepContext.cepVer) ? "-999" : customCepContext.cepVer);
                        jSONObject2.put(RaptorUploaderImpl.CEP_UNIQUE_ID, TextUtils.isEmpty(customCepContext.cepUniqueId) ? "-999" : customCepContext.cepUniqueId);
                    }
                    jSONObject.put(PredictMethod.KEY_CEP_CONFIG, jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
                AutoJSServiceManager.getInstance().executeJS(6, str, jSONArray, new JSCallback() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.AutoPredictManager.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                    public void onSuccess(String str6, JSValueWrapper jSValueWrapper, int i2, long j) {
                        Object objectData;
                        Object[] objArr3 = {str6, jSValueWrapper, Integer.valueOf(i2), new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fa91e5212d37c71109f2f043c37bd13f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fa91e5212d37c71109f2f043c37bd13f");
                        } else if (jSValueWrapper == null || (objectData = jSValueWrapper.getObjectData()) == null) {
                            onFailed(str6, new BlueException("JSValueWrapper is null"), i2, j);
                        } else {
                            try {
                                JSONObject jSONObject3 = new JSONObject(objectData.toString());
                                if (jSONObject3.optBoolean(PredictMethod.KEY_POST_BY_NATIVE, false)) {
                                    return;
                                }
                                jSONObject3.remove(PredictMethod.KEY_POST_BY_NATIVE);
                                JSONObject optJSONObject = jSONObject3.optJSONObject("error");
                                if (optJSONObject != null) {
                                    AutoJSServiceManager.getInstance().callbackObserver(str, null, new BlueException(optJSONObject.optString("msg"), optJSONObject.optString("code")), false);
                                    StringBuilder sb = new StringBuilder("cep auto predict fail:");
                                    sb.append(str);
                                    sb.append(" : ");
                                    sb.append(optJSONObject);
                                    return;
                                }
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("name", jSONObject3.optString("modelName"));
                                jSONObject4.put("version", jSONObject3.optString("modelVersion"));
                                jSONObject4.put("model_unique_id", jSONObject3.optString(PredictMethod.KEY_MODEL_UNIQUE_ID));
                                jSONObject4.put("output", jSONObject3.opt("output"));
                                StringBuilder sb2 = new StringBuilder("cep auto predict success:");
                                sb2.append(str);
                                sb2.append(" : ");
                                sb2.append(jSONObject4);
                                AutoJSServiceManager.getInstance().callbackObserver(str, jSONObject4, null, true);
                            } catch (Exception e2) {
                                onFailed(str6, new BlueException(e2, "JSONObject parse exception"), i2, j);
                            }
                        }
                    }

                    @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                    public void onFailed(String str6, BlueException blueException, int i2, long j) {
                        Object[] objArr3 = {str6, blueException, Integer.valueOf(i2), new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6e5f05c92dbfe7f68fc15d5ddff2a2d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6e5f05c92dbfe7f68fc15d5ddff2a2d9");
                            return;
                        }
                        AutoJSServiceManager.getInstance().callbackObserver(str, null, blueException, false);
                        new StringBuilder("cep auto predict fail:").append(str);
                    }
                });
            }
        };
    }

    public AbsJSExecuteObserver addAutoPredictObserver(String str, final IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecbcf1cb4aa124c14dd3a9d76b2b058b", RobustBitConfig.DEFAULT_VALUE) ? (AbsJSExecuteObserver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecbcf1cb4aa124c14dd3a9d76b2b058b") : AutoJSServiceManager.getInstance().registerJSExecuteObserver(str, new AbsJSExecuteObserver() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.AutoPredictManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver
            public void onSuccess(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33b8464badfad4954cef390eedd78937", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33b8464badfad4954cef390eedd78937");
                } else if (iPredictionJsonListener == null) {
                } else {
                    if (obj instanceof JSONObject) {
                        iPredictionJsonListener.onSuccess((JSONObject) obj);
                    } else {
                        onFail(new Exception("result is not JSONObject"));
                    }
                }
            }

            @Override // com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver
            public void onFail(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6329da026fbe6f269fd9f6c2a72faf10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6329da026fbe6f269fd9f6c2a72faf10");
                } else if (iPredictionJsonListener != null) {
                    iPredictionJsonListener.onFailed(exc);
                }
            }
        });
    }
}
