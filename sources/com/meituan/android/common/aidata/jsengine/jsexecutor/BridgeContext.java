package com.meituan.android.common.aidata.jsengine.jsexecutor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.dianping.jscore.JSExecutor;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Unarchived;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.common.SoLoaderWrapper;
import com.meituan.android.common.aidata.jsengine.instance.InstanceContainer;
import com.meituan.android.common.aidata.jsengine.jsexecutor.JSTaskItem;
import com.meituan.android.common.aidata.jsengine.jsinterface.JSBridgeCallback;
import com.meituan.android.common.aidata.jsengine.jsinterface.JSCallbackJSInterface;
import com.meituan.android.common.aidata.jsengine.jsinterface.JSLogJSInterface;
import com.meituan.android.common.aidata.jsengine.jsinterface.NativeModuleJSInterface;
import com.meituan.android.common.aidata.jsengine.modules.IJSNativeMethod;
import com.meituan.android.common.aidata.jsengine.modules.IJSNativeModuleCallback;
import com.meituan.android.common.aidata.jsengine.modules.NativeModuleManager;
import com.meituan.android.common.aidata.jsengine.utils.IJSCallback;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BridgeContext extends AbstractBridgeContext implements JSBridgeCallback {
    private static final String TAG = "BridgeContext";
    public static ChangeQuickRedirect changeQuickRedirect;
    private float mBlueJsScriptDuration;
    protected volatile boolean mFrameworkLoadFinished;
    private JSExecutor mJSExecutor;
    private final String mJSFrameworkId;
    private final String mJSScript;

    public BridgeContext(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b31d0e0b4fa52eb67d7fca0624108b4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b31d0e0b4fa52eb67d7fca0624108b4c");
            return;
        }
        this.mFrameworkLoadFinished = false;
        this.mBlueJsScriptDuration = 0.0f;
        this.mJSFrameworkId = str;
        this.mJSScript = str2;
        initialize(context);
    }

    public String getJSFrameworkId() {
        return this.mJSFrameworkId;
    }

    public String getJSScript() {
        return this.mJSScript;
    }

    public void initialize(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc0def1d06c6c65f0372a5e5822f24e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc0def1d06c6c65f0372a5e5822f24e9");
        } else {
            runOnJSThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1965fbcf01ed80e4c582a1b003fcbabd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1965fbcf01ed80e4c582a1b003fcbabd");
                        return;
                    }
                    String unused = BridgeContext.TAG;
                    new StringBuilder("JSExecutor | initialize on framework: ").append(BridgeContext.this.mJSFrameworkId);
                    SoLoaderWrapper.init(context);
                    BridgeContext.this.initializeJSExecutor();
                }
            });
        }
    }

    public void initializeJSExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29238cc6cfbe5c3814403cbb574737c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29238cc6cfbe5c3814403cbb574737c3");
            return;
        }
        try {
            if (this.mJSExecutor == null) {
                this.mJSExecutor = JSExecutor.create();
                executeJSFrameworkWithScript(this.mJSScript, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.common.aidata.jsengine.jsexecutor.AbstractBridgeContext
    public JSExecutor getJSExecutor() {
        return this.mJSExecutor;
    }

    public synchronized void executeJSFrameworkWithScript(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b14065f1a508658782e410bacbcb41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b14065f1a508658782e410bacbcb41");
            return;
        }
        if (!this.mFrameworkLoadFinished && !TextUtils.isEmpty(str)) {
            if (!this.mFrameworkLoadFinished) {
                executeJS(str);
                registerGlobalFunctions();
                registerModuleConfig(NativeModuleManager.getInstance().getModuleConfigJSON());
                this.mFrameworkLoadFinished = true;
            }
        }
    }

    private synchronized void registerGlobalFunctions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c89828adf016cab614ad6e424014c523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c89828adf016cab614ad6e424014c523");
            return;
        }
        try {
            addJavaScriptInterface("jsLog", new JSLogJSInterface());
            addJavaScriptInterface("callNative", new JSCallbackJSInterface(this));
            addJavaScriptInterface("callNativeModule", new NativeModuleJSInterface(this));
        } catch (Exception e) {
            new StringBuilder("registerGlobalFunctions register function fail:").append(e.getMessage());
        }
    }

    public synchronized void registerModuleConfig(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "325b3ce3fd5bea87b375f54811a96d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "325b3ce3fd5bea87b375f54811a96d69");
            return;
        }
        if (jSONObject != null) {
            invokeMethod("registerModules", new Value[]{new Value(jSONObject)});
        }
    }

    public synchronized void createInstance(final String str, final String str2, final JSONObject jSONObject, final IJSCallback iJSCallback) {
        Object[] objArr = {str, str2, jSONObject, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48d8a38c6e940b5a2443beda1a88b3e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48d8a38c6e940b5a2443beda1a88b3e4");
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            final String generateTaskId = JSTaskQueue.getInstance().generateTaskId();
            JSTaskItem build = new JSTaskItem.Builder().setTaskId(generateTaskId).setTask(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79a6311960d5ede9a7f6aa0f6720ffae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79a6311960d5ede9a7f6aa0f6720ffae");
                        return;
                    }
                    String str3 = BridgeContext.this.mJSFrameworkId;
                    String unused = BridgeContext.TAG;
                    StringBuilder sb = new StringBuilder("createInstance: frameworkId: ");
                    sb.append(str3);
                    sb.append(" instanceId:");
                    sb.append(str);
                    sb.append(" threadId:");
                    sb.append(Thread.currentThread().getName());
                    if (BridgeContext.this.mFrameworkLoadFinished) {
                        try {
                            Pair parseInvokeResult = BridgeContext.this.parseInvokeResult(BridgeContext.this.invokeMethod("createInstance", new Value[]{str != null ? new Value(str) : new Value(), str2 != null ? new Value(str2) : new Value(), jSONObject != null ? new Value(jSONObject) : new Value()}));
                            if (parseInvokeResult != null) {
                                if (((Boolean) parseInvokeResult.first).booleanValue()) {
                                    BridgeContext.this.callbackSucceed(str3, generateTaskId, iJSCallback, str, null);
                                    return;
                                }
                                BridgeContext bridgeContext = BridgeContext.this;
                                String str4 = generateTaskId;
                                IJSCallback iJSCallback2 = iJSCallback;
                                bridgeContext.callbackFail(str3, str4, iJSCallback2, new BlueException("create fail:" + ((String) parseInvokeResult.second), BaseRaptorUploader.ERROR_LOAD_FAILED));
                                return;
                            }
                            BridgeContext.this.callbackFail(str3, generateTaskId, iJSCallback, new BlueException("create fail: invokeMethod return null", BaseRaptorUploader.ERROR_LOAD_FAILED));
                            return;
                        } catch (Exception e) {
                            BridgeContext bridgeContext2 = BridgeContext.this;
                            String str5 = generateTaskId;
                            IJSCallback iJSCallback3 = iJSCallback;
                            bridgeContext2.callbackFail(str3, str5, iJSCallback3, new BlueException("create fail:" + e.getMessage(), BaseRaptorUploader.ERROR_LOAD_FAILED));
                            return;
                        }
                    }
                    BridgeContext.this.callbackFail(str3, generateTaskId, iJSCallback, new BlueException("frameworkLoadFinished is not loaded", BaseRaptorUploader.ERROR_UNLOAD_FRAMEWORK));
                }
            }).setIJSCallback(iJSCallback).setTimeOut(MetricsAnrManager.ANR_THRESHOLD).setJSFrameworkId(this.mJSFrameworkId).build();
            JSTaskQueue.getInstance().enqueueTask(generateTaskId, build);
            runOnJSThread(build);
            return;
        }
        callbackFail(this.mJSFrameworkId, iJSCallback, new BlueException("param is null", BaseRaptorUploader.ERROR_INVALID_SOURCE_CODE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<Boolean, String> parseInvokeResult(byte[] bArr) throws ArchiveException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "746196f44b4198db0271573f23c5b621", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "746196f44b4198db0271573f23c5b621");
        }
        if (bArr == null) {
            return null;
        }
        Value value = new Value(bArr);
        String str = "";
        Unarchived unarchived = value.getUnarchived();
        if (value.isBool()) {
            r0 = value.bool();
        } else {
            unarchived.rewind();
            if (value.isObject()) {
                r0 = unarchived.readMemberHash16() > 0 ? unarchived.readBoolean() : true;
                if (unarchived.readMemberHash16() > 0) {
                    str = unarchived.readString();
                }
            }
        }
        return new Pair<>(Boolean.valueOf(r0), str);
    }

    public synchronized void executeJSInstance(String str, JSONArray jSONArray, IJSCallback iJSCallback) {
        Object[] objArr = {str, jSONArray, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46f3c245ad76686c123e6a69ec9514ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46f3c245ad76686c123e6a69ec9514ce");
        } else {
            executeJSInstance(str, jSONArray, iJSCallback);
        }
    }

    public synchronized void executeJSInstance(final String str, final JSONArray jSONArray, final JSONObject jSONObject, final IJSCallback iJSCallback) {
        Object[] objArr = {str, jSONArray, jSONObject, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1518939bd4d95b8d3d99f0e2b1c1364d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1518939bd4d95b8d3d99f0e2b1c1364d");
        } else if (TextUtils.isEmpty(str)) {
            callbackFail(this.mJSFrameworkId, iJSCallback, new BlueException("param is null", BaseRaptorUploader.ERROR_INVALID_SOURCE_CODE));
        } else {
            final String generateTaskId = JSTaskQueue.getInstance().generateTaskId();
            JSTaskItem build = new JSTaskItem.Builder().setTaskId(generateTaskId).setTask(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Pair parseInvokeResult;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d6ed7858dbbd14e2694bb78bb3833f9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d6ed7858dbbd14e2694bb78bb3833f9f");
                        return;
                    }
                    String str2 = BridgeContext.this.mJSFrameworkId;
                    String unused = BridgeContext.TAG;
                    StringBuilder sb = new StringBuilder("executeJSInstance: frameworkId: ");
                    sb.append(str2);
                    sb.append(" instanceId:");
                    sb.append(str);
                    sb.append(" taskId:");
                    sb.append(generateTaskId);
                    sb.append(" threadId:");
                    sb.append(Thread.currentThread().getName());
                    try {
                        long nanoTime = System.nanoTime();
                        if (jSONArray != null && jSONArray.length() != 0) {
                            parseInvokeResult = jSONObject == null ? BridgeContext.this.parseInvokeResult(BridgeContext.this.invokeMethod("startInstance", new Value[]{new Value(str), new Value(generateTaskId), new Value(jSONArray.length()), new Value(jSONArray)})) : BridgeContext.this.parseInvokeResult(BridgeContext.this.invokeMethod("startInstance", new Value[]{new Value(str), new Value(generateTaskId), new Value(jSONArray.length()), new Value(jSONArray), new Value(jSONObject)}));
                            BridgeContext.this.mBlueJsScriptDuration = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
                            if (parseInvokeResult != null || ((Boolean) parseInvokeResult.first).booleanValue()) {
                            }
                            BridgeContext bridgeContext = BridgeContext.this;
                            String str3 = generateTaskId;
                            IJSCallback iJSCallback2 = iJSCallback;
                            bridgeContext.callbackFail(str2, str3, iJSCallback2, new BlueException("startInstance fail with return false : " + ((String) parseInvokeResult.second), BaseRaptorUploader.ERROR_EXECUTE_COMMON_FAILED));
                            return;
                        }
                        parseInvokeResult = BridgeContext.this.parseInvokeResult(BridgeContext.this.invokeMethod("startInstance", new Value[]{new Value(str), new Value(generateTaskId), new Value(0.0d)}));
                        BridgeContext.this.mBlueJsScriptDuration = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
                        if (parseInvokeResult != null) {
                        }
                    } catch (Exception e) {
                        BridgeContext bridgeContext2 = BridgeContext.this;
                        String str4 = generateTaskId;
                        IJSCallback iJSCallback3 = iJSCallback;
                        bridgeContext2.callbackFail(str2, str4, iJSCallback3, new BlueException("start fail:" + e.getMessage(), BaseRaptorUploader.ERROR_LOAD_FAILED));
                    }
                }
            }).setIJSCallback(iJSCallback).setTimeOut(MetricsAnrManager.ANR_THRESHOLD).setJSFrameworkId(this.mJSFrameworkId).build();
            JSTaskQueue.getInstance().enqueueTask(generateTaskId, build);
            runOnJSThread(build);
        }
    }

    public synchronized void destroyInstance(final String str, final IJSCallback iJSCallback) {
        Object[] objArr = {str, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca2a7b08a6d1c57d0b30c553e9b788d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca2a7b08a6d1c57d0b30c553e9b788d2");
            return;
        }
        final String str2 = this.mJSFrameworkId;
        if (TextUtils.isEmpty(str)) {
            callbackFail(str2, iJSCallback, new BlueException("instanceid is null", BaseRaptorUploader.ERROR_INVALID_SOURCE_CODE));
        } else {
            runOnJSThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ac15edb41fe65cddb636794127e3fa3b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ac15edb41fe65cddb636794127e3fa3b");
                        return;
                    }
                    String unused = BridgeContext.TAG;
                    StringBuilder sb = new StringBuilder("destroyInstance: frameworkId: ");
                    sb.append(str2);
                    sb.append(" instanceId:");
                    sb.append(str);
                    sb.append(" threadId:");
                    sb.append(Thread.currentThread().getName());
                    try {
                        BridgeContext.this.mJSExecutor.invokeMethod(str, "destroyInstance", new Value[]{str != null ? new Value(str) : new Value()});
                    } catch (Exception e) {
                        String unused2 = BridgeContext.TAG;
                        StringBuilder sb2 = new StringBuilder("destroyInstance : frameworkId: ");
                        sb2.append(str2);
                        sb2.append(" instanceId: ");
                        sb2.append(str);
                        sb2.append(" error:");
                        sb2.append(e.getMessage());
                        BridgeContext bridgeContext = BridgeContext.this;
                        String str3 = str2;
                        IJSCallback iJSCallback2 = iJSCallback;
                        bridgeContext.callbackFail(str3, iJSCallback2, new BlueException("error:" + e.getMessage(), "-1"));
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.aidata.jsengine.jsinterface.JSBridgeCallback
    public synchronized void callNativeModule(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "432c802b426e778c9a1e298f7ab79612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "432c802b426e778c9a1e298f7ab79612");
        } else {
            submitOnJSThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a57cd0bb0d37b0158b20ea3613a173f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a57cd0bb0d37b0158b20ea3613a173f");
                    } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        String unused = BridgeContext.TAG;
                        StringBuilder sb = new StringBuilder("callNativeModule: instanceId:");
                        sb.append(str);
                        sb.append(" taskId:");
                        sb.append(str2);
                        sb.append(" threadId:");
                        sb.append(Thread.currentThread().getName());
                        try {
                            Map<String, IJSNativeMethod> nativeModule = NativeModuleManager.getInstance().getNativeModule(str3);
                            if (nativeModule != null && nativeModule.size() != 0) {
                                IJSNativeMethod iJSNativeMethod = nativeModule.get(str4);
                                if (iJSNativeMethod == null) {
                                    String unused2 = BridgeContext.TAG;
                                    new StringBuilder("callNativeBridge 无法找到到对应的method:").append(str4);
                                    BridgeContext.this.callbackJSMethod(str, str2, str3, str4, null, str6, null);
                                    return;
                                }
                                iJSNativeMethod.invoke(str, str5, str6, new IJSNativeModuleCallback() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.5.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeModuleCallback
                                    public void invoke(String str8, Object obj) {
                                        Object[] objArr3 = {str8, obj};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9773a2650579956c62eb22cebfcfbfd0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9773a2650579956c62eb22cebfcfbfd0");
                                        } else {
                                            BridgeContext.this.callbackJSMethod(str, str2, str3, str4, obj, str8, null);
                                        }
                                    }
                                });
                                return;
                            }
                            String unused3 = BridgeContext.TAG;
                            new StringBuilder("callNativeBridge 无法找到到对应的module: ").append(str3);
                            BridgeContext.this.callbackJSMethod(str, str2, str3, str4, null, str6, null);
                        } catch (Throwable unused4) {
                            BridgeContext.this.callbackJSMethod(str, str2, str3, str4, null, str6, null);
                        }
                    } else {
                        BridgeContext.this.callbackJSMethod(str, str2, str3, str4, null, str6, null);
                    }
                }
            });
        }
    }

    public synchronized void callbackJSMethod(final String str, final String str2, final String str3, final String str4, final Object obj, final String str5, final JSONObject jSONObject) {
        Object[] objArr = {str, str2, str3, str4, obj, str5, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba4a9e482377f38b4aabc6e241fef92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba4a9e482377f38b4aabc6e241fef92");
        } else {
            submitOnJSThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "666ca2f402741b78706c92dbcd030a65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "666ca2f402741b78706c92dbcd030a65");
                        return;
                    }
                    String unused = BridgeContext.TAG;
                    StringBuilder sb = new StringBuilder("callbackJSMethod: instanceId:");
                    sb.append(str);
                    sb.append(" callbackId:");
                    sb.append(str5);
                    sb.append(" threadId:");
                    sb.append(Thread.currentThread().getName());
                    try {
                        Value value = str != null ? new Value(str) : new Value();
                        Value value2 = str2 != null ? new Value(str2) : new Value();
                        Value value3 = str3 != null ? new Value(str3) : new Value();
                        Value value4 = str4 != null ? new Value(str4) : new Value();
                        Value value5 = str5 != null ? new Value(str5) : new Value();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("data", obj);
                        } catch (JSONException unused2) {
                        }
                        BridgeContext.this.invokeMethod("callJs", new Value[]{value, value2, value3, value4, value5, new Value(jSONObject2), jSONObject != null ? new Value(jSONObject) : new Value()});
                    } catch (Exception e) {
                        BridgeContext.this.onJSExecuteException(str, e, obj != null ? obj.toString() : "");
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.aidata.jsengine.jsinterface.JSBridgeCallback
    public synchronized void onJSCallBack(final String str, final String str2, String str3, final String str4, final String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be6ce5ec7e82772021f2c787d95f7f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be6ce5ec7e82772021f2c787d95f7f17");
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            StringBuilder sb = new StringBuilder("onJSCallBack, instanceId=");
            sb.append(str);
            sb.append(", taskId=");
            sb.append(str2);
            sb.append(",method=");
            sb.append(str3);
            sb.append(",args=");
            sb.append(str4);
            sb.append(",options=");
            sb.append(str5);
            if (str3.equals("executeCallback")) {
                runOnJSCallbackThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.7
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "675ddc2e2b14d7cb75b7fea8b5a2ac69", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "675ddc2e2b14d7cb75b7fea8b5a2ac69");
                        } else {
                            BridgeContext.this.executeCallback(str, str2, str4, str5);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeCallback(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3cc484f4fe08ec8767bf66511f74a15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3cc484f4fe08ec8767bf66511f74a15");
        } else if (InstanceContainer.getInstance().getInstance(str) != null) {
            JSTaskItem dequeueTask = JSTaskQueue.getInstance().dequeueTask(str2);
            if (dequeueTask != null) {
                onJSCallback(str, dequeueTask, str3, str4);
            } else {
                new StringBuilder("executeCallback: JSTask has been destroy taskid:").append(str2);
            }
        } else {
            new StringBuilder("executeCallback: JSInstace has been destroy taskid: ").append(str);
        }
    }

    public void onJSCallback(String str, JSTaskItem jSTaskItem, String str2, String str3) {
        IJSCallback jSCallback;
        Object[] objArr = {str, jSTaskItem, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31e9bac87e4ce2ab510b4695b8994bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31e9bac87e4ce2ab510b4695b8994bc");
        } else if (jSTaskItem == null || (jSCallback = jSTaskItem.getJSCallback()) == null) {
        } else {
            if (TextUtils.isEmpty(str2)) {
                jSTaskItem.getJSCallback().onFailed(this.mJSFrameworkId, new BlueException("result format is invalid", BaseRaptorUploader.ERROR_INVALID_TENSOR_OUTPUT));
                return;
            }
            JSValueWrapper jSValueWrapper = new JSValueWrapper(str2);
            if (jSValueWrapper.isSuccess()) {
                jSValueWrapper.setExecuteTime(this.mBlueJsScriptDuration);
                jSCallback.onSuccess(this.mJSFrameworkId, str, jSValueWrapper);
                return;
            }
            jSCallback.onFailed(this.mJSFrameworkId, new BlueException(jSValueWrapper.getErrorInfo(), BaseRaptorUploader.ERROR_INVALID_OPERATOR_RESULT));
        }
    }

    public synchronized void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c085c86849acaa2a350f07e3a8eed7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c085c86849acaa2a350f07e3a8eed7e9");
        } else {
            submitOnJSThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8c93229a44eae7cb18c7f11c334a4e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8c93229a44eae7cb18c7f11c334a4e6");
                        return;
                    }
                    try {
                        BridgeContext.this.destroyExecutor();
                    } catch (Exception e) {
                        String unused = BridgeContext.TAG;
                        new StringBuilder("BridgeContext destroy error:").append(e.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void destroyExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52aa6d416b2b085518ee085c30e4c177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52aa6d416b2b085518ee085c30e4c177");
            return;
        }
        if (this.mJSExecutor != null) {
            this.mJSExecutor.destroy();
            this.mJSExecutor = null;
        }
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d30cd47109f9729a905bf639212ae862", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d30cd47109f9729a905bf639212ae862");
        } else {
            super.finalize();
        }
    }

    private void onUncaughtThrowable(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d531136988e0a594d30cbaebf5c20ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d531136988e0a594d30cbaebf5c20ce");
        } else {
            new StringBuilder("onUncaughtThrowable error:").append(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onJSExecuteException(String str, Throwable th, String str2) {
        Object[] objArr = {str, th, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10fd2493e8fef573bd5e797b587003c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10fd2493e8fef573bd5e797b587003c5");
        } else {
            new StringBuilder("onUncaughtThrowable error:").append(th.getMessage());
        }
    }
}
