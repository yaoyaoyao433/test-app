package com.meituan.android.common.aidata.mrn;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.feature.bean.SqlBean;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver;
import com.meituan.android.common.aidata.jsengine.ControllerInfo;
import com.meituan.android.common.aidata.jsengine.IAutoJSRunController;
import com.meituan.android.common.aidata.jsengine.IAutoJSRunInterceptor;
import com.meituan.android.common.aidata.jsengine.InterceptorContext;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.PrintStream;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNNativeProxy implements IRNAIDataInterface {
    public static final String MODULE_NAME = "Blue";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ConcurrentHashMap<String, IAutoJSRunController> mAutoJSRunnerControllerMap;
    private static ConcurrentHashMap<AutoRunnerObserverBean, Object> mAutoRunSubscribeMap;
    private static ConcurrentHashMap<SubscriberBean, ICepArrayServiceListener> mSubscribeMap;
    private ReactApplicationContext mReactContext;

    public String getName() {
        return MODULE_NAME;
    }

    public RNNativeProxy(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92330a221ed33145a312009be6ff510", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92330a221ed33145a312009be6ff510");
            return;
        }
        this.mReactContext = null;
        this.mReactContext = reactApplicationContext;
        mSubscribeMap = new ConcurrentHashMap<>();
        mAutoRunSubscribeMap = new ConcurrentHashMap<>();
        mAutoJSRunnerControllerMap = new ConcurrentHashMap<>();
    }

    @Override // com.meituan.android.common.aidata.mrn.IRNAIDataInterface
    public void startService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ead4eab11eb8cd5b3d16b75cfb5840f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ead4eab11eb8cd5b3d16b75cfb5840f6");
        } else {
            AIData.startServiceWithBiz(str);
        }
    }

    @Override // com.meituan.android.common.aidata.mrn.IRNAIDataInterface
    public void stopService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11aa2de4dfa04167d2fc03c745c83db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11aa2de4dfa04167d2fc03c745c83db0");
        } else {
            AIData.stopServiceWithBiz(str);
        }
    }

    @Override // com.meituan.android.common.aidata.mrn.IRNAIDataInterface
    public void getFeatures(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5174608d7e6f8c2d25129af543918337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5174608d7e6f8c2d25129af543918337");
            return;
        }
        final FeatureRequestBean parseFeatureRequest = Protocol.parseFeatureRequest(readableMap);
        if (parseFeatureRequest != null) {
            if (parseFeatureRequest.featureRequests.size() == 0) {
                return;
            }
            AIData.getFeature(parseFeatureRequest.featureRequests, parseFeatureRequest.jsFeatureParam != null ? new JSFeatureOutParamsCallback() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback
                public JSONObject getOutParams(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "060fe554f93ca8bfdad77d385ef037fe", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "060fe554f93ca8bfdad77d385ef037fe") : parseFeatureRequest.jsFeatureParam.optJSONObject(str);
                }
            } : null, new IFeatureListener() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                public void onSuccess(@Nullable FeatureResult featureResult) {
                    Object[] objArr2 = {featureResult};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3184d65a10984c8430f66fb7f24f6e8b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3184d65a10984c8430f66fb7f24f6e8b");
                    } else if (featureResult != null) {
                        if (promise != null) {
                            promise.resolve(featureResult.getJsonString());
                        }
                    } else if (promise != null) {
                        promise.reject("getFeature is null");
                    }
                }

                @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                public void onFailed(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d6faf6f73a650d1c946f0f82cef2dc0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d6faf6f73a650d1c946f0f82cef2dc0");
                    } else if (promise != null) {
                        promise.reject(exc);
                    }
                }
            });
        } else if (promise != null) {
            promise.reject(new InvalidParameterException("input is invalid"));
        }
    }

    @Override // com.meituan.android.common.aidata.mrn.IRNAIDataInterface
    public void queryDatabase(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45f5740beb32c83a038d840015354573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45f5740beb32c83a038d840015354573");
            return;
        }
        SqlBean parseSqlClause = Protocol.parseSqlClause(readableMap);
        if (parseSqlClause == null) {
            if (promise != null) {
                promise.reject(new InvalidParameterException("input is invalid"));
                return;
            }
            return;
        }
        List<ResultRow> query = AIData.query(parseSqlClause.select, parseSqlClause.from, parseSqlClause.where, parseSqlClause.groupBy, parseSqlClause.having, parseSqlClause.orderBy, parseSqlClause.limit);
        if (query == null) {
            if (promise != null) {
                promise.reject(new IOException("query is error"));
            }
        } else if (promise != null) {
            JSONArray jSONArray = null;
            if (query != null) {
                try {
                    if (query.size() > 0) {
                        jSONArray = new JSONArray();
                        for (ResultRow resultRow : query) {
                            jSONArray.put(resultRow.toJSONObject());
                        }
                    }
                } catch (Throwable unused) {
                    promise.reject(new JSONException("json exception"));
                    return;
                }
            }
            if (jSONArray != null) {
                promise.resolve(jSONArray.toString());
            } else {
                promise.resolve("");
            }
        }
    }

    @Override // com.meituan.android.common.aidata.mrn.IRNAIDataInterface
    @ReactMethod
    public void addCEPSubscriber(ReadableMap readableMap) {
        final SubscriberBean parseCEPSubscriber;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8867701aacca5894143cb09d98ef9a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8867701aacca5894143cb09d98ef9a6");
        } else if (readableMap == null || (parseCEPSubscriber = Protocol.parseCEPSubscriber(readableMap)) == null || parseCEPSubscriber.mSubscribeId == null || parseCEPSubscriber.mCepIdList == null || parseCEPSubscriber.mCepIdList.size() <= 0) {
        } else {
            CEPSubscriberConfig build = new CEPSubscriberConfig.Builder().featureList(parseCEPSubscriber.mCepIdList).build();
            ICepArrayServiceListener iCepArrayServiceListener = new ICepArrayServiceListener() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener
                public void onRuleMatchSucceed(String str, String str2, List<StreamData> list, int i) {
                    Object[] objArr2 = {str, str2, list, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0a84eb1fb3b6633cc2d17e9cbce53c21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0a84eb1fb3b6633cc2d17e9cbce53c21");
                    } else {
                        RNNativeProxy.this.dispatchCepEvent(parseCEPSubscriber, str, str2, list, i);
                    }
                }
            };
            AIData.subscribeCepServiceCallback(build, iCepArrayServiceListener);
            mSubscribeMap.put(parseCEPSubscriber, iCepArrayServiceListener);
        }
    }

    @Override // com.meituan.android.common.aidata.mrn.IRNAIDataInterface
    @ReactMethod
    public void removeCEPSubscriber(ReadableMap readableMap) {
        SubscriberBean parseCEPUnsubscriber;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c699d43356394ac470cefc3e7ba1d54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c699d43356394ac470cefc3e7ba1d54");
        } else if (readableMap == null || (parseCEPUnsubscriber = Protocol.parseCEPUnsubscriber(readableMap)) == null) {
        } else {
            AIData.unsubscribeCepServiceCallback(mSubscribeMap.get(parseCEPUnsubscriber));
            mSubscribeMap.remove(parseCEPUnsubscriber);
        }
    }

    public void dispatchCepEvent(SubscriberBean subscriberBean, String str, String str2, List<StreamData> list, int i) {
        Object[] objArr = {subscriberBean, str, str2, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "652f74a9cc4929a1ff4ec5618ebbe655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "652f74a9cc4929a1ff4ec5618ebbe655");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("eventType", EventType.CEP);
            WritableMap createMap2 = Arguments.createMap();
            if (subscriberBean != null) {
                createMap2.putString("containerID", subscriberBean.mRnContainerID);
                createMap2.putString("subscriberID", subscriberBean.mSubscribeId);
                createMap2.putString("feature", str);
                createMap2.putString("cepId", str2);
            }
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putInt("times", i);
            if (list != null && list.size() > 0) {
                WritableArray createArray = Arguments.createArray();
                for (StreamData streamData : list) {
                    if (streamData != null) {
                        createArray.pushMap(streamData.toWritableMap());
                    }
                }
                createMap3.putArray("events", createArray);
            }
            createMap2.putMap("content", createMap3);
            createMap.putMap("eventData", createMap2);
            sendEvent(this.mReactContext, "kBlueMRNEvent", createMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void sendEvent(ReactContext reactContext, String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {reactContext, str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28019d8f7a06665743968a2c9d2bc41f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28019d8f7a06665743968a2c9d2bc41f");
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("reactContext=" + reactContext);
        if (reactContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    public void mrnContainerReleased(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a00ac5f79f8571199a93812202c84e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a00ac5f79f8571199a93812202c84e82");
        } else if (readableMap.hasKey("containerID") && ReadableType.String == readableMap.getType("containerID")) {
            String string = readableMap.getString("containerID");
            clearCache(string);
            removeObserverByContainerId(string);
        }
    }

    public void clearCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b58d3c90c04dae6cbb5b52a21b90e593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b58d3c90c04dae6cbb5b52a21b90e593");
        } else if (mSubscribeMap == null || TextUtils.isEmpty(str)) {
        } else {
            synchronized (this) {
                Iterator<Map.Entry<SubscriberBean, ICepArrayServiceListener>> it = mSubscribeMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<SubscriberBean, ICepArrayServiceListener> next = it.next();
                    SubscriberBean key = next.getKey();
                    if (key != null && TextUtils.equals(key.mRnContainerID, str)) {
                        AIData.unsubscribeCepServiceCallback(next.getValue());
                        it.remove();
                    }
                }
            }
        }
    }

    public void executeMLModel(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffc8ee984a143379746f81abe13c0e36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffc8ee984a143379746f81abe13c0e36");
            return;
        }
        final ModelBean parseModelBean = Protocol.parseModelBean(readableMap);
        if (parseModelBean == null || TextUtils.isEmpty(parseModelBean.bundleName)) {
            return;
        }
        JSFeatureOutParamsCallback jSFeatureOutParamsCallback = parseModelBean.jsFeatureParam != null ? new JSFeatureOutParamsCallback() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback
            public JSONObject getOutParams(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c03449f3728dfa0d4e9f5a323499c81e", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c03449f3728dfa0d4e9f5a323499c81e") : parseModelBean.jsFeatureParam.optJSONObject(str);
            }
        } : null;
        IPredictionJsonListener iPredictionJsonListener = new IPredictionJsonListener() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener
            public void onSuccess(@Nullable JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7474e398a960b720477c9afbf15b6f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7474e398a960b720477c9afbf15b6f5");
                } else if (jSONObject == null) {
                    promise.reject(new Exception("predict result is null"));
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        if (jSONObject.has("name")) {
                            jSONObject2.put("name", jSONObject.optString("name"));
                        }
                        if (jSONObject.has("version")) {
                            jSONObject2.put("version", jSONObject.optString("version"));
                        }
                        if (jSONObject.has("output")) {
                            Object opt = jSONObject.opt("output");
                            if (opt != null && (opt instanceof JSONObject)) {
                                JSONObject jSONObject3 = (JSONObject) opt;
                                if (jSONObject3.has("result")) {
                                    jSONObject2.put("result", jSONObject3.opt("result"));
                                } else {
                                    jSONObject2.put("result", opt);
                                }
                            } else {
                                jSONObject2.put("result", opt);
                            }
                        }
                        promise.resolve(g.a(jSONObject2));
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            }

            @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener
            public void onFailed(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "40784a16ecb083ad335c122c6ad146cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "40784a16ecb083ad335c122c6ad146cd");
                } else {
                    promise.reject(exc);
                }
            }
        };
        if (parseModelBean.outFeature == null) {
            AIData.executeMLModel(parseModelBean.bundleName, jSFeatureOutParamsCallback, iPredictionJsonListener);
        } else {
            AIData.executeMLModel(parseModelBean.outFeature, parseModelBean.bundleName, jSFeatureOutParamsCallback, iPredictionJsonListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:6:0x001b, B:8:0x0021, B:10:0x0029, B:12:0x0031, B:14:0x0039, B:16:0x003d, B:17:0x004f, B:21:0x005e, B:36:0x008a, B:38:0x008e, B:42:0x0099, B:39:0x0091, B:40:0x0094, B:41:0x0097, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x007f), top: B:47:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:6:0x001b, B:8:0x0021, B:10:0x0029, B:12:0x0031, B:14:0x0039, B:16:0x003d, B:17:0x004f, B:21:0x005e, B:36:0x008a, B:38:0x008e, B:42:0x0099, B:39:0x0091, B:40:0x0094, B:41:0x0097, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x007f), top: B:47:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:6:0x001b, B:8:0x0021, B:10:0x0029, B:12:0x0031, B:14:0x0039, B:16:0x003d, B:17:0x004f, B:21:0x005e, B:36:0x008a, B:38:0x008e, B:42:0x0099, B:39:0x0091, B:40:0x0094, B:41:0x0097, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x007f), top: B:47:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:6:0x001b, B:8:0x0021, B:10:0x0029, B:12:0x0031, B:14:0x0039, B:16:0x003d, B:17:0x004f, B:21:0x005e, B:36:0x008a, B:38:0x008e, B:42:0x0099, B:39:0x0091, B:40:0x0094, B:41:0x0097, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x007f), top: B:47:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeLXEvent(com.facebook.react.bridge.ReadableMap r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.aidata.mrn.RNNativeProxy.changeQuickRedirect
            java.lang.String r11 = "795be285dfe419e65dfe912b6f481a3e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            com.meituan.android.common.aidata.mrn.LxEventBean r13 = com.meituan.android.common.aidata.mrn.Protocol.parseLxEventBean(r13)     // Catch: java.lang.Exception -> Laa
            if (r13 == 0) goto La9
            java.lang.String r1 = r13.nm     // Catch: java.lang.Exception -> Laa
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Laa
            if (r1 != 0) goto La9
            java.lang.String r1 = r13.category     // Catch: java.lang.Exception -> Laa
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Laa
            if (r1 != 0) goto La9
            java.lang.String r1 = r13.bid     // Catch: java.lang.Exception -> Laa
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Laa
            if (r1 != 0) goto La9
            boolean r1 = r13.isCustomEvent     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto L4f
            java.lang.String r2 = r13.nm     // Catch: java.lang.Exception -> Laa
            java.lang.String r3 = r13.pageInfoKey     // Catch: java.lang.Exception -> Laa
            java.lang.String r4 = r13.bid     // Catch: java.lang.Exception -> Laa
            java.util.Map<java.lang.String, java.lang.Object> r5 = r13.val_lab     // Catch: java.lang.Exception -> Laa
            java.lang.String r6 = r13.cid     // Catch: java.lang.Exception -> Laa
            java.lang.String r7 = r13.category     // Catch: java.lang.Exception -> Laa
            boolean r8 = r13.isLocal     // Catch: java.lang.Exception -> Laa
            com.meituan.android.common.aidata.AIData.writeCustomEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Laa
            goto Lae
        L4f:
            java.lang.String r1 = r13.nm     // Catch: java.lang.Exception -> Laa
            r2 = -1
            int r3 = r1.hashCode()     // Catch: java.lang.Exception -> Laa
            r4 = 2454(0x996, float:3.439E-42)
            if (r3 == r4) goto L7f
            r4 = 2473(0x9a9, float:3.465E-42)
            if (r3 == r4) goto L76
            switch(r3) {
                case 2125: goto L6c;
                case 2126: goto L62;
                default: goto L61;
            }     // Catch: java.lang.Exception -> Laa
        L61:
            goto L89
        L62:
            java.lang.String r0 = "BP"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L89
            r0 = 3
            goto L8a
        L6c:
            java.lang.String r0 = "BO"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L89
            r0 = 2
            goto L8a
        L76:
            java.lang.String r3 = "MV"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto L89
            goto L8a
        L7f:
            java.lang.String r0 = "MC"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L89
            r0 = 0
            goto L8a
        L89:
            r0 = -1
        L8a:
            switch(r0) {
                case 0: goto L97;
                case 1: goto L94;
                case 2: goto L91;
                case 3: goto L8e;
                default: goto L8d;
            }     // Catch: java.lang.Exception -> Laa
        L8d:
            return
        L8e:
            com.meituan.android.common.statistics.entity.EventName r0 = com.meituan.android.common.statistics.entity.EventName.PAY     // Catch: java.lang.Exception -> Laa
            goto L99
        L91:
            com.meituan.android.common.statistics.entity.EventName r0 = com.meituan.android.common.statistics.entity.EventName.ORDER     // Catch: java.lang.Exception -> Laa
            goto L99
        L94:
            com.meituan.android.common.statistics.entity.EventName r0 = com.meituan.android.common.statistics.entity.EventName.MODEL_VIEW     // Catch: java.lang.Exception -> Laa
            goto L99
        L97:
            com.meituan.android.common.statistics.entity.EventName r0 = com.meituan.android.common.statistics.entity.EventName.CLICK     // Catch: java.lang.Exception -> Laa
        L99:
            r1 = r0
            java.lang.String r2 = r13.pageInfoKey     // Catch: java.lang.Exception -> Laa
            java.lang.String r3 = r13.bid     // Catch: java.lang.Exception -> Laa
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.val_lab     // Catch: java.lang.Exception -> Laa
            java.lang.String r5 = r13.cid     // Catch: java.lang.Exception -> Laa
            java.lang.String r6 = r13.category     // Catch: java.lang.Exception -> Laa
            boolean r7 = r13.isLocal     // Catch: java.lang.Exception -> Laa
            com.meituan.android.common.aidata.AIData.writeModuleEvent(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Laa
        La9:
            return
        Laa:
            r13 = move-exception
            r13.printStackTrace()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.mrn.RNNativeProxy.writeLXEvent(com.facebook.react.bridge.ReadableMap):void");
    }

    public void executeJSBundle(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26efdae71aee214fbe2acf90ec6c2238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26efdae71aee214fbe2acf90ec6c2238");
            return;
        }
        JSBundleBean parseJSBundleBean = Protocol.parseJSBundleBean(readableMap);
        if (parseJSBundleBean == null || TextUtils.isEmpty(parseJSBundleBean.bundleID)) {
            return;
        }
        AIData.executeJSBundle(parseJSBundleBean.bundleID, parseJSBundleBean.param, new AbsJSExecuteObserver() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver
            public void onSuccess(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ae3606e8d0aa3b1a9a7012a449b35f87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ae3606e8d0aa3b1a9a7012a449b35f87");
                } else if (obj == null) {
                    promise.reject(new Exception("executeJSBundle result is null"));
                } else {
                    try {
                        promise.resolve(RNNativeProxy.this.getRNSupportArg(obj));
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            }

            @Override // com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver
            public void onFail(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "16febdf68ee615d3f08f425c00819128", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "16febdf68ee615d3f08f425c00819128");
                } else {
                    promise.reject(exc);
                }
            }
        });
    }

    public void autoRunnerInterceptCallback(ReadableMap readableMap) {
        IAutoJSRunController iAutoJSRunController;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e878ebee5d6d95cc20dd891579ed73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e878ebee5d6d95cc20dd891579ed73e");
            return;
        }
        AutoRunnerObserverBean parseAutoRunnerObserver = Protocol.parseAutoRunnerObserver(readableMap);
        if (parseAutoRunnerObserver == null || TextUtils.isEmpty(parseAutoRunnerObserver.containerID) || TextUtils.isEmpty(parseAutoRunnerObserver.subscriberID) || TextUtils.isEmpty(parseAutoRunnerObserver.interceptID) || parseAutoRunnerObserver.shouldIntercept || (iAutoJSRunController = mAutoJSRunnerControllerMap.get(parseAutoRunnerObserver.interceptID)) == null) {
            return;
        }
        ControllerInfo controllerInfo = new ControllerInfo();
        controllerInfo.setCustomParam(parseAutoRunnerObserver.customParam);
        iAutoJSRunController.runJS(controllerInfo);
    }

    public void addAutoRunnerObserver(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ad44fa3a8abc90bde53c6cf117aee30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ad44fa3a8abc90bde53c6cf117aee30");
            return;
        }
        final AutoRunnerObserverBean parseAutoRunnerObserver = Protocol.parseAutoRunnerObserver(readableMap);
        if (parseAutoRunnerObserver == null || TextUtils.isEmpty(parseAutoRunnerObserver.containerID) || TextUtils.isEmpty(parseAutoRunnerObserver.subscriberID) || TextUtils.isEmpty(parseAutoRunnerObserver.resourceID)) {
            return;
        }
        switch (parseAutoRunnerObserver.type) {
            case 0:
                mAutoRunSubscribeMap.put(parseAutoRunnerObserver, AIData.addAutoRunJSObserver(parseAutoRunnerObserver.resourceID, new AbsJSExecuteObserver() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.7
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver
                    public void onSuccess(Object obj) {
                        Object[] objArr2 = {obj};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4251e7a55eb21283a71f8df40772e6bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4251e7a55eb21283a71f8df40772e6bc");
                            return;
                        }
                        new StringBuilder("AutoRunJS result  = ").append(obj.toString());
                        RNNativeProxy.this.dispatchAutoRunEvent(parseAutoRunnerObserver, obj, null);
                    }

                    @Override // com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver
                    public void onFail(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4224c9e71b3338f339a1b31f90b8d648", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4224c9e71b3338f339a1b31f90b8d648");
                            return;
                        }
                        new StringBuilder("AutoRunJS error  = ").append(exc.getMessage());
                        RNNativeProxy.this.dispatchAutoRunEvent(parseAutoRunnerObserver, null, exc);
                    }
                }));
                return;
            case 1:
                IAutoJSRunInterceptor iAutoJSRunInterceptor = new IAutoJSRunInterceptor() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.9
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.jsengine.IAutoJSRunInterceptor
                    public void onIntercept(InterceptorContext interceptorContext, IAutoJSRunController iAutoJSRunController) {
                        Object[] objArr2 = {interceptorContext, iAutoJSRunController};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "15a3169257f423f560fed8b8a9b90c9f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "15a3169257f423f560fed8b8a9b90c9f");
                            return;
                        }
                        String str = parseAutoRunnerObserver.resourceID + AppUtil.getUniqueId();
                        RNNativeProxy.mAutoJSRunnerControllerMap.put(str, iAutoJSRunController);
                        parseAutoRunnerObserver.interceptID = str;
                        RNNativeProxy.this.dispatchAutoRunEvent(parseAutoRunnerObserver, null, null);
                    }
                };
                AIData.setAutoRunJSInterceptor(parseAutoRunnerObserver.resourceID, iAutoJSRunInterceptor);
                mAutoRunSubscribeMap.put(parseAutoRunnerObserver, iAutoJSRunInterceptor);
                return;
            case 2:
                mAutoRunSubscribeMap.put(parseAutoRunnerObserver, AIData.addAutoPredictObserver(parseAutoRunnerObserver.resourceID, new IPredictionJsonListener() { // from class: com.meituan.android.common.aidata.mrn.RNNativeProxy.8
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener
                    public void onSuccess(@Nullable JSONObject jSONObject) {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28bc7a23b5195ee43cbad4efe7309276", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28bc7a23b5195ee43cbad4efe7309276");
                            return;
                        }
                        new StringBuilder("AutoPredict predictor complete result  = ").append(jSONObject.toString());
                        RNNativeProxy.this.dispatchAutoRunEvent(parseAutoRunnerObserver, jSONObject, null);
                    }

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener
                    public void onFailed(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92bce94438857498670f8bf0174c88d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92bce94438857498670f8bf0174c88d1");
                            return;
                        }
                        new StringBuilder("AutoPredict errMsg = ").append(AiFeatureUtil.exceptionToString(exc, "MLModel predict failed"));
                        RNNativeProxy.this.dispatchAutoRunEvent(parseAutoRunnerObserver, null, exc);
                    }
                }));
                return;
            default:
                return;
        }
    }

    public void removeAutoRunnerObserver(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bba1310635dccb3cf80f9cdbf76dd257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bba1310635dccb3cf80f9cdbf76dd257");
            return;
        }
        AutoRunnerObserverBean parseAutoRunnerObserver = Protocol.parseAutoRunnerObserver(readableMap);
        switch (parseAutoRunnerObserver.type) {
            case 0:
                if (!TextUtils.isEmpty(parseAutoRunnerObserver.resourceID)) {
                    AIData.removeAutoRunJSObserver(parseAutoRunnerObserver.resourceID);
                    removeObserverByResourceId(parseAutoRunnerObserver.resourceID);
                    return;
                } else if (isValidAutoRunnerObserverBean(parseAutoRunnerObserver)) {
                    AIData.removeAutoRunJSObserver(mAutoRunSubscribeMap.remove(parseAutoRunnerObserver));
                    return;
                } else {
                    return;
                }
            case 1:
                if (!TextUtils.isEmpty(parseAutoRunnerObserver.resourceID)) {
                    AIData.removeAutoRunJSInterceptor(parseAutoRunnerObserver.resourceID);
                    removeObserverByResourceId(parseAutoRunnerObserver.resourceID);
                    return;
                } else if (isValidAutoRunnerObserverBean(parseAutoRunnerObserver)) {
                    Iterator<Map.Entry<AutoRunnerObserverBean, Object>> it = mAutoRunSubscribeMap.entrySet().iterator();
                    while (it.hasNext()) {
                        AutoRunnerObserverBean key = it.next().getKey();
                        if (key.equals(parseAutoRunnerObserver)) {
                            AIData.removeAutoRunJSInterceptor(key.resourceID);
                            it.remove();
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (!TextUtils.isEmpty(parseAutoRunnerObserver.resourceID)) {
                    AIData.removeAutoPredictObserver(parseAutoRunnerObserver.resourceID);
                    removeObserverByResourceId(parseAutoRunnerObserver.resourceID);
                    return;
                } else if (isValidAutoRunnerObserverBean(parseAutoRunnerObserver)) {
                    AIData.removeAutoPredictObserver(mAutoRunSubscribeMap.remove(parseAutoRunnerObserver));
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public void removeObserverByResourceId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2d938dd0b1e0f27a97c3db1dd8c9d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2d938dd0b1e0f27a97c3db1dd8c9d61");
            return;
        }
        AIData.removeAutoRunJSInterceptor(str);
        Iterator<Map.Entry<AutoRunnerObserverBean, Object>> it = mAutoRunSubscribeMap.entrySet().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getKey().resourceID, str)) {
                it.remove();
            }
        }
    }

    public void removeObserverByContainerId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b541d56e48cbad7bb81fbe2982ef6f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b541d56e48cbad7bb81fbe2982ef6f3");
            return;
        }
        Iterator<Map.Entry<AutoRunnerObserverBean, Object>> it = mAutoRunSubscribeMap.entrySet().iterator();
        while (it.hasNext()) {
            AutoRunnerObserverBean key = it.next().getKey();
            if (TextUtils.equals(key.containerID, str)) {
                switch (key.type) {
                    case 0:
                        AIData.removeAutoRunJSObserver(key.resourceID);
                        break;
                    case 1:
                        AIData.removeAutoRunJSInterceptor(key.resourceID);
                        break;
                    case 2:
                        AIData.removeAutoPredictObserver(key.resourceID);
                        break;
                }
                it.remove();
            }
        }
    }

    public boolean isValidAutoRunnerObserverBean(AutoRunnerObserverBean autoRunnerObserverBean) {
        Object[] objArr = {autoRunnerObserverBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b043623d82823371efa175115ced0c5f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b043623d82823371efa175115ced0c5f")).booleanValue() : (TextUtils.isEmpty(autoRunnerObserverBean.containerID) || TextUtils.isEmpty(autoRunnerObserverBean.subscriberID)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAutoRunEvent(AutoRunnerObserverBean autoRunnerObserverBean, Object obj, Exception exc) {
        WritableMap generateAutoRunJSContentMap;
        Object[] objArr = {autoRunnerObserverBean, obj, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b00d42bf31bc1de279e79e8e74a6f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b00d42bf31bc1de279e79e8e74a6f6");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("eventType", EventType.AUTO_RUNNER);
            WritableMap createMap2 = Arguments.createMap();
            if (autoRunnerObserverBean != null) {
                createMap2.putString("containerID", autoRunnerObserverBean.containerID);
                createMap2.putString("subscriberID", autoRunnerObserverBean.subscriberID);
                createMap2.putInt("type", autoRunnerObserverBean.type);
                switch (autoRunnerObserverBean.type) {
                    case 0:
                        generateAutoRunJSContentMap = generateAutoRunJSContentMap(obj, exc);
                        break;
                    case 1:
                        generateAutoRunJSContentMap = generateAutoRunInterceptMap(autoRunnerObserverBean.resourceID, autoRunnerObserverBean.interceptID);
                        break;
                    case 2:
                        generateAutoRunJSContentMap = generateAutoPredictMap(obj, exc);
                        break;
                    default:
                        return;
                }
                createMap2.putMap("content", generateAutoRunJSContentMap);
            }
            createMap.putMap("eventData", createMap2);
            sendEvent(this.mReactContext, "kBlueMRNEvent", createMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private WritableMap generateAutoPredictMap(Object obj, Exception exc) {
        Object[] objArr = {obj, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eae076258045bc06c8721df3b8bf3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eae076258045bc06c8721df3b8bf3e0");
        }
        WritableMap createMap = Arguments.createMap();
        if (obj != null) {
            try {
                createMap.putMap("data", obj instanceof JSONObject ? g.a((JSONObject) obj) : null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (exc != null) {
            createMap.putMap("error", generateAutoRunError(exc, BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED));
        }
        return createMap;
    }

    private WritableMap generateAutoRunJSContentMap(Object obj, Exception exc) {
        Object[] objArr = {obj, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "790983cc54a762b1267187a6d8fa1b71", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "790983cc54a762b1267187a6d8fa1b71");
        }
        WritableMap createMap = Arguments.createMap();
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    createMap.putBoolean("data", ((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    createMap.putInt("data", ((Integer) obj).intValue());
                } else if (cls == Double.class) {
                    createMap.putDouble("data", ((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    createMap.putDouble("data", ((Float) obj).floatValue());
                } else if (cls == String.class) {
                    createMap.putString("data", obj.toString());
                } else if (cls == JSONObject.class) {
                    createMap.putMap("data", g.a((JSONObject) obj));
                } else if (cls == JSONArray.class) {
                    createMap.putArray("data", g.a((JSONArray) obj));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            createMap.putNull("data");
        }
        if (exc != null) {
            createMap.putMap("error", generateAutoRunError(exc, BaseRaptorUploader.ERROR_FAILED_AUTO_RUN_JS));
        }
        return createMap;
    }

    private WritableMap generateAutoRunInterceptMap(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "917fc4cef60c17372b47c812a5746e99", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "917fc4cef60c17372b47c812a5746e99");
        }
        WritableMap createMap = Arguments.createMap();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString(Constants.AutoRunnerConstants.KEY_RESOURCE_ID, str);
            createMap2.putString(Constants.AutoRunnerConstants.KEY_INTERCEPT_ID, str2);
            createMap.putMap("data", createMap2);
        }
        return createMap;
    }

    public WritableMap generateAutoRunError(Exception exc, String str) {
        Object[] objArr = {exc, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4792d19f34f0a6f1e632d8079fb40b83", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4792d19f34f0a6f1e632d8079fb40b83");
        }
        WritableMap createMap = Arguments.createMap();
        if (exc != null) {
            if (exc instanceof BlueException) {
                BlueException blueException = (BlueException) exc;
                createMap.putString("code", blueException.getErrorCode());
                createMap.putString("message", blueException.getErrorMsg());
            } else {
                createMap.putString("code", str);
                createMap.putString("message", exc.getMessage());
            }
        }
        return createMap;
    }

    public Object getRNSupportArg(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "256e16d09340cce20fb7f6b17061004d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "256e16d09340cce20fb7f6b17061004d");
        }
        Class<?> cls = obj.getClass();
        try {
            if (cls == Boolean.class) {
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            }
            if (cls == Integer.class) {
                return Double.valueOf(((Integer) obj).doubleValue());
            }
            if (cls == Double.class) {
                return Double.valueOf(((Double) obj).doubleValue());
            }
            if (cls == Float.class) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (cls == String.class) {
                return obj.toString();
            }
            if (cls == JSONObject.class) {
                return g.a((JSONObject) obj);
            }
            if (cls == JSONArray.class) {
                return g.a((JSONArray) obj);
            }
            throw new RuntimeException("Cannot convert argument of type " + cls);
        } catch (Exception unused) {
            throw new RuntimeException("convert argument fail, type=" + cls);
        }
    }
}
