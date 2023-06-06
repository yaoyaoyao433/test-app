package com.meituan.msc.jse.bridge;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.jni.HybridData;
import com.meituan.msc.jse.bridge.queue.MessageQueueThread;
import com.meituan.msc.jse.bridge.queue.QueueThreadExceptionHandler;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationImpl;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationSpec;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.systrace.TraceListener;
import com.meituan.msc.systrace.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class CatalystInstanceImpl implements CatalystInstance {
    private static final String TAG = "contact";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean mAcceptCalls;
    private volatile boolean mDestroyed;
    private final HybridData mHybridData;
    private boolean mInitialized;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private JSFunctionCaller mJSFunctionCaller;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    private JavaScriptContextHolder mJavaScriptContextHolder;
    private final List<String> mLoadedJSList;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final MessageQueueThread mNativeModulesQueueThread;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private final TraceListener mTraceListener;
    private IMessageInterface messageInterface;
    public Map<String, JavaCallback> methodDescriptorMap;
    private Map<String, Map<String, JavaCallback>> objectDescriptorMap;

    private native long getJavaScriptContext();

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, String str);

    private native void jniCallJSCallback(int i, String str);

    private native void jniCallJSCallbackWithDynamic(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, String str3);

    private native void jniChangeV8InspectorName(String str);

    private native String jniEvaluateJavaScript(String str, String str2, String str3, LoadJSCodeCacheCallbackJNIWrapper loadJSCodeCacheCallbackJNIWrapper);

    private native String jniExecuteJSFunction(String str, String str2);

    private native String jniExecuteJSModule(String str, String str2, String str3);

    private native String jniExecuteListFunction(String str, String str2, String str3, String str4, String str5);

    private native long jniGetJSIMemoryUsage();

    private native void jniHandleMemoryPressure(int i);

    private native void jniJSIGarbageCollect();

    private native void jniJSIStartCPUProfiling(String str, int i);

    private native void jniJSIStopCPUProfiling(String str, String str2);

    @Deprecated
    private native void jniLoadScriptFromDioFile(String str, String str2, String str3, boolean z);

    @Deprecated
    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    @Deprecated
    private native void jniLoadScriptFromString(String str, String str2, boolean z);

    private native void jniSetGlobalVariableSync(String str, String str2);

    @Deprecated
    private native void jniSetSourceURL(String str);

    private native void registerJSObject(String str);

    private native void registerMethod(String str);

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public native void setGlobalVariableString(String str, String str2);

    public /* synthetic */ CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, JSFunctionCaller jSFunctionCaller, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, AnonymousClass1 anonymousClass1) {
        this(reactQueueConfigurationSpec, javaScriptExecutor, jSFunctionCaller, nativeModuleCallExceptionHandler);
    }

    static {
        ReactBridge.staticInit();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class PendingJSCall {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        public JSONArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, @Nullable JSONArray jSONArray) {
            Object[] objArr = {str, str2, jSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f85d9e65af2a26b146e76aa7f4aebf7a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f85d9e65af2a26b146e76aa7f4aebf7a");
                return;
            }
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = jSONArray;
        }

        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            Object[] objArr = {catalystInstanceImpl};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f98517d4a18bdb1fbad47a33bf65d303", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f98517d4a18bdb1fbad47a33bf65d303");
            } else {
                catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, this.mArguments != null ? this.mArguments.toString() : null);
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ff25d5b7621866ffc09eff46e3e8772", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ff25d5b7621866ffc09eff46e3e8772");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(CommonConstant.Symbol.DOT);
            sb.append(this.mMethod);
            sb.append(CommonConstant.Symbol.BRACKET_LEFT);
            sb.append(this.mArguments == null ? "" : this.mArguments.toString());
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
            return sb.toString();
        }
    }

    public CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, JSFunctionCaller jSFunctionCaller, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        int i;
        Object[] objArr = {reactQueueConfigurationSpec, javaScriptExecutor, jSFunctionCaller, nativeModuleCallExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124480c42b6ede815cfcd0e316fa3e1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124480c42b6ede815cfcd0e316fa3e1d");
            return;
        }
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        this.mLoadedJSList = new CopyOnWriteArrayList();
        this.methodDescriptorMap = new HashMap();
        this.objectDescriptorMap = new HashMap();
        g.b("ReactNative", "Initializing React Xplat Bridge.");
        a.a(0L, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler(this, null));
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSFunctionCaller = jSFunctionCaller;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        a.a(0L);
        g.b("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        a.a(0L, "initializeCxxBridge");
        try {
            initializeBridge(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), javaScriptExecutor.getName());
            i = 1;
        } catch (Throwable th) {
            i = 1;
            g.b("CatalystInstanceImpl@initializeBridge", null, th);
        }
        Object[] objArr2 = new Object[i];
        objArr2[0] = "Initializing React Xplat Bridge after initializeBridge";
        g.b("ReactNative", objArr2);
        a.a(0L);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    public void setMessageInterface(IMessageInterface iMessageInterface) {
        this.messageInterface = iMessageInterface;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class BridgeCallback implements ReactCallback {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<CatalystInstanceImpl> mOuter;

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public void decrementPendingJSCalls() {
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public void incrementPendingJSCalls() {
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public void onBatchComplete() {
        }

        public BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            Object[] objArr = {catalystInstanceImpl};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b40fdb72e7f8440d9bb524549a2baf27", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b40fdb72e7f8440d9bb524549a2baf27");
            } else {
                this.mOuter = new WeakReference<>(catalystInstanceImpl);
            }
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public String invokeMSCCallback(String str, ReadableNativeArray readableNativeArray) {
            Object[] objArr = {str, readableNativeArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "214c0631603197a5713a85e6dc64b584", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "214c0631603197a5713a85e6dc64b584") : this.mOuter.get().invokeMSCCallback(str, readableNativeArray);
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public String invokeMSCCallback(String str, String str2, ReadableNativeArray readableNativeArray) {
            Object[] objArr = {str, str2, readableNativeArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "629ee804d039e8c57439e41f72df011c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "629ee804d039e8c57439e41f72df011c") : this.mOuter.get().invokeMSCCallback(str, str2, readableNativeArray);
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public NativeArray getModuleConfig(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0884eef0ea4de712a84fc1c9af5fbb3e", RobustBitConfig.DEFAULT_VALUE) ? (NativeArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0884eef0ea4de712a84fc1c9af5fbb3e") : this.mOuter.get().getConfig(str);
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public void callNativeModules(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c1aea72a335b66302bf64eda20057ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c1aea72a335b66302bf64eda20057ba");
            } else {
                this.mOuter.get().callNativeModules(str);
            }
        }

        @Override // com.meituan.msc.jse.bridge.ReactCallback
        public NativeArray callSerializableNativeHook(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52be1c7d8f0aa366455b8b64931d44d3", RobustBitConfig.DEFAULT_VALUE) ? (NativeArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52be1c7d8f0aa366455b8b64931d44d3") : this.mOuter.get().callSerializableNativeHook(str, str2, str3);
        }
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public String evaluateJavaScript(String str, String str2, String str3, LoadJSCodeCacheCallback loadJSCodeCacheCallback) {
        Object[] objArr = {str, str2, str3, loadJSCodeCacheCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6adea6a9368d9cbfcad7926342a9319", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6adea6a9368d9cbfcad7926342a9319");
        }
        return jniEvaluateJavaScript(str, str2, str3, loadJSCodeCacheCallback != null ? new LoadJSCodeCacheCallbackJNIWrapper(loadJSCodeCacheCallback) : null);
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public void setGlobalVariableSync(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c754f00896943ed30c9f256858b46204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c754f00896943ed30c9f256858b46204");
        } else {
            jniSetGlobalVariableSync(str, str2);
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public void changeV8InspectorName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "762f5a0711a5bc8bb7d7afaf5e77feee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "762f5a0711a5bc8bb7d7afaf5e77feee");
        } else {
            jniChangeV8InspectorName(str);
        }
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public String executeJSFunction(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23c28ea9944f1fbaf88e98defd9ec0b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23c28ea9944f1fbaf88e98defd9ec0b9");
        }
        com.facebook.infer.annotation.a.a(isOnJSQueueThread());
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return jniExecuteJSModule(str, str2, str3);
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public String executeListFunction(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a14fba95fbffb5fffc251709929735a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a14fba95fbffb5fffc251709929735a8");
        }
        com.facebook.infer.annotation.a.a(isOnJSQueueThread());
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return null;
        }
        return jniExecuteListFunction(str, str2, str3, str4, str5);
    }

    public void notifyContextReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b34c21c03169909f82420d9eff2653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b34c21c03169909f82420d9eff2653");
            return;
        }
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                it.next().call(this);
            }
            this.mJSCallsPendingInit.clear();
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance, com.meituan.msc.jse.bridge.JSFunctionCaller
    public void callFunction(String str, String str2, JSONArray jSONArray) {
        Object[] objArr = {str, str2, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49a00665046290e1512b3f66adbd82e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49a00665046290e1512b3f66adbd82e6");
        } else {
            callFunction(new PendingJSCall(str, str2, jSONArray));
        }
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        Object[] objArr = {pendingJSCall};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a214aaee6b0ec422201a3aef329e2463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a214aaee6b0ec422201a3aef329e2463");
        } else if (this.mDestroyed) {
            String pendingJSCall2 = pendingJSCall.toString();
            g.e("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall2);
        } else {
            if (!this.mAcceptCalls) {
                synchronized (this.mJSCallsPendingInitLock) {
                    if (!this.mAcceptCalls) {
                        this.mJSCallsPendingInit.add(pendingJSCall);
                        return;
                    }
                }
            }
            pendingJSCall.call(this);
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance, com.meituan.msc.jse.bridge.JSInstance
    public void invokeCallback(int i, JSONArray jSONArray) {
        Object[] objArr = {Integer.valueOf(i), jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "668e2ac1f2643e2eec30a1b2f55b34ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "668e2ac1f2643e2eec30a1b2f55b34ce");
        } else if (this.mDestroyed) {
            g.e("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, jSONArray.toString());
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public void invokeCallback(int i, NativeArray nativeArray) {
        Object[] objArr = {Integer.valueOf(i), nativeArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b413db411814604fc526643b064a530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b413db411814604fc526643b064a530");
        } else if (this.mDestroyed) {
            g.e("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallbackWithDynamic(i, nativeArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    @ThreadConfined(ThreadConfined.UI)
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "291c52c83a174ea351251d3b4b0f7ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "291c52c83a174ea351251d3b4b0f7ee5");
            return;
        }
        g.b("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        destroyV1();
    }

    @ThreadConfined(ThreadConfined.UI)
    public void destroyV1() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a19f263ff2d6cf695a17fe446017b42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a19f263ff2d6cf695a17fe446017b42");
            return;
        }
        g.b("ReactNative", "CatalystInstanceImpl.destroyV1() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        synchronized (this.mLoadedJSList) {
            this.mLoadedJSList.clear();
        }
        this.mNativeModulesQueueThread.runOnQueue(new AnonymousClass1());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.jse.bridge.CatalystInstanceImpl$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f22d3a19bf041f75df4e0b5c71cd728e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f22d3a19bf041f75df4e0b5c71cd728e");
            } else {
                CatalystInstanceImpl.this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new RunnableC04411());
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.msc.jse.bridge.CatalystInstanceImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC04411 implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            public RunnableC04411() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b4a3d1f1795e734054a2667b7a015e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b4a3d1f1795e734054a2667b7a015e");
                    return;
                }
                CatalystInstanceImpl.this.mHybridData.resetNative();
                CatalystInstanceImpl.this.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new Runnable() { // from class: com.meituan.msc.jse.bridge.CatalystInstanceImpl.1.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82ebf529e127e9ec51d0e71ab939d132", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82ebf529e127e9ec51d0e71ab939d132");
                        } else {
                            AsyncTask.execute(new Runnable() { // from class: com.meituan.msc.jse.bridge.CatalystInstanceImpl.1.1.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "db2cd04fe576981e9dddfcda7aa59bf5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "db2cd04fe576981e9dddfcda7aa59bf5");
                                        return;
                                    }
                                    CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                                    CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                                    g.b("ReactNative", "CatalystInstanceImpl.destroy() end");
                                    ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85dd997763af372dd5edd5094cb98617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85dd997763af372dd5edd5094cb98617");
            return;
        }
        g.b("ReactNative", "CatalystInstanceImpl.initialize()");
        com.facebook.infer.annotation.a.a(!this.mInitialized, "This catalyst instance has already been initialized");
        com.facebook.infer.annotation.a.a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dd58f0525a4b483a8fb9b374332e0e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dd58f0525a4b483a8fb9b374332e0e3");
        }
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this.mJSFunctionCaller == null ? this : this.mJSFunctionCaller, cls);
    }

    @Override // com.meituan.msc.jse.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eca352baebb8a96666080f10022a3176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eca352baebb8a96666080f10022a3176");
        } else if (this.mDestroyed) {
        } else {
            jniHandleMemoryPressure(i);
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25594c414561eb68e59c5b969a341669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25594c414561eb68e59c5b969a341669");
            return;
        }
        g.b("ReactNative", exc, "CatalystInstanceImpl caught native exception");
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.meituan.msc.jse.bridge.CatalystInstanceImpl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class NativeExceptionHandler implements QueueThreadExceptionHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public NativeExceptionHandler() {
            Object[] objArr = {CatalystInstanceImpl.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a83bd1388aade6721a772c1c780834d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a83bd1388aade6721a772c1c780834d7");
            }
        }

        public /* synthetic */ NativeExceptionHandler(CatalystInstanceImpl catalystInstanceImpl, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.meituan.msc.jse.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5de8ea4f9df74838f42dc8f8aabcb4e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5de8ea4f9df74838f42dc8f8aabcb4e5");
            } else {
                CatalystInstanceImpl.this.onNativeException(exc);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class JSProfilerTraceListener implements TraceListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            Object[] objArr = {catalystInstanceImpl};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f33b327c521808dbd506bc2e4fbc4bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f33b327c521808dbd506bc2e4fbc4bc");
            } else {
                this.mOuter = new WeakReference<>(catalystInstanceImpl);
            }
        }

        public void onTraceStarted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b143059c4c237b2c631f682bcd85a99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b143059c4c237b2c631f682bcd85a99");
            } else {
                this.mOuter.get();
            }
        }

        public void onTraceStopped() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc1c69e33f5a5f795876bc4c104c44f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc1c69e33f5a5f795876bc4c104c44f5");
            } else {
                this.mOuter.get();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private JSFunctionCaller mCaller;
        @Nullable
        private JavaScriptExecutor mJSExecutor;
        @Nullable
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        @Nullable
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setJSFunctionCaller(JSFunctionCaller jSFunctionCaller) {
            this.mCaller = jSFunctionCaller;
            return this;
        }

        public CatalystInstanceImpl build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a12a1b87f7acadbfd90335384a162624", RobustBitConfig.DEFAULT_VALUE) ? (CatalystInstanceImpl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a12a1b87f7acadbfd90335384a162624") : new CatalystInstanceImpl((ReactQueueConfigurationSpec) com.facebook.infer.annotation.a.a(this.mReactQueueConfigurationSpec), (JavaScriptExecutor) com.facebook.infer.annotation.a.a(this.mJSExecutor), this.mCaller, (NativeModuleCallExceptionHandler) com.facebook.infer.annotation.a.a(this.mNativeModuleCallExceptionHandler), null);
        }
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public void garbageCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c1029b2e64917955398b83d3faca2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c1029b2e64917955398b83d3faca2d");
        } else {
            jniJSIGarbageCollect();
        }
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public long getMemoryUsage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e37c86f133b7678f88404a745d747519", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e37c86f133b7678f88404a745d747519")).longValue() : jniGetJSIMemoryUsage();
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public void startCPUProfiling(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71073cc2b9968c6ac0585cc909f2f1da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71073cc2b9968c6ac0585cc909f2f1da");
        } else {
            jniJSIStartCPUProfiling(str, i);
        }
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public void stopCPUProfiling(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ed01948315308a458c6500b5c20e184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ed01948315308a458c6500b5c20e184");
        } else {
            jniJSIStopCPUProfiling(str, str2);
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance, com.meituan.msc.jse.bridge.JSInstance
    public void registerJavaCallback(String str, JavaCallback javaCallback) {
        Object[] objArr = {str, javaCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06debc14c703bf228015d75bcfbd87d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06debc14c703bf228015d75bcfbd87d9");
        } else if (TextUtils.isEmpty(str) || javaCallback == null) {
        } else {
            if (this.methodDescriptorMap.containsKey(str)) {
                throw new RuntimeException("has register " + str + "!!!");
            }
            this.methodDescriptorMap.put(str, javaCallback);
            registerMethod(str);
        }
    }

    @Override // com.meituan.msc.jse.bridge.CatalystInstance, com.meituan.msc.jse.bridge.JSInstance
    public void registerJSObject(String str, JavaFunctionsInterface javaFunctionsInterface) {
        Object[] objArr = {str, javaFunctionsInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "251460ad9c2825e6c34c03c6ca7e933c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "251460ad9c2825e6c34c03c6ca7e933c");
        } else if (!TextUtils.isEmpty(str) && javaFunctionsInterface != null) {
            if (this.objectDescriptorMap.containsKey(str)) {
                throw new RuntimeException("has register " + str + "!!!");
            }
            HashMap hashMap = new HashMap();
            this.objectDescriptorMap.put(str, hashMap);
            String[] functionNames = javaFunctionsInterface.getFunctionNames();
            JavaCallback[] functions = javaFunctionsInterface.getFunctions();
            if (functionNames == null || functions == null || functionNames.length != functions.length) {
                return;
            }
            for (int i = 0; i < functionNames.length; i++) {
                hashMap.put(functionNames[i], functions[i]);
            }
            registerJSObject(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String invokeMSCCallback(String str, String str2, ReadableNativeArray readableNativeArray) {
        Object[] objArr = {str, str2, readableNativeArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e5602869a1fb49c7549d88c761504db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e5602869a1fb49c7549d88c761504db");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || readableNativeArray == null) {
            return null;
        }
        return this.objectDescriptorMap.get(str).get(str2).invoke(readableNativeArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String invokeMSCCallback(String str, ReadableNativeArray readableNativeArray) {
        Object[] objArr = {str, readableNativeArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e728b022e0e7d5ba920f2f0ee68fb93", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e728b022e0e7d5ba920f2f0ee68fb93") : this.methodDescriptorMap.get(str).invoke(readableNativeArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meituan.msc.jse.bridge.NativeArray callSerializableNativeHook(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.jse.bridge.CatalystInstanceImpl.changeQuickRedirect
            java.lang.String r11 = "19c4d08ca4d8ea612e0947bd9009788a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            com.meituan.msc.jse.bridge.NativeArray r13 = (com.meituan.msc.jse.bridge.NativeArray) r13
            return r13
        L24:
            com.meituan.msc.jse.bridge.IMessageInterface r0 = r12.messageInterface
            if (r0 == 0) goto L75
            com.meituan.msc.jse.bridge.IMessageInterface r0 = r12.messageInterface
            com.meituan.msc.jse.bridge.LazyParseJSONArray r1 = new com.meituan.msc.jse.bridge.LazyParseJSONArray
            r1.<init>(r15)
            java.lang.Object r13 = r0.invokeSync(r13, r14, r1)
            r14 = 0
            boolean r15 = r13 instanceof org.json.JSONObject     // Catch: org.json.JSONException -> L68
            if (r15 == 0) goto L49
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch: org.json.JSONException -> L68
            com.meituan.msc.jse.bridge.WritableMap r13 = com.meituan.msc.jse.bridge.ConversionUtil.jsonToReact(r13)     // Catch: org.json.JSONException -> L68
            if (r13 == 0) goto L6c
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> L68
            r15[r8] = r13     // Catch: org.json.JSONException -> L68
            com.meituan.msc.jse.bridge.WritableNativeArray r13 = com.meituan.msc.jse.bridge.RNArguments.fromJavaArgs(r15)     // Catch: org.json.JSONException -> L68
            goto L66
        L49:
            boolean r15 = r13 instanceof org.json.JSONArray     // Catch: org.json.JSONException -> L68
            if (r15 == 0) goto L5e
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch: org.json.JSONException -> L68
            com.meituan.msc.jse.bridge.WritableArray r13 = com.meituan.msc.jse.bridge.ConversionUtil.jsonToReact(r13)     // Catch: org.json.JSONException -> L68
            if (r13 == 0) goto L6c
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> L68
            r15[r8] = r13     // Catch: org.json.JSONException -> L68
            com.meituan.msc.jse.bridge.WritableNativeArray r13 = com.meituan.msc.jse.bridge.RNArguments.fromJavaArgs(r15)     // Catch: org.json.JSONException -> L68
            goto L66
        L5e:
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> L68
            r15[r8] = r13     // Catch: org.json.JSONException -> L68
            com.meituan.msc.jse.bridge.WritableNativeArray r13 = com.meituan.msc.jse.bridge.RNArguments.fromJavaArgs(r15)     // Catch: org.json.JSONException -> L68
        L66:
            r14 = r13
            goto L6c
        L68:
            r13 = move-exception
            r13.printStackTrace()
        L6c:
            if (r14 != 0) goto L74
            com.meituan.msc.jse.bridge.WritableNativeArray r13 = new com.meituan.msc.jse.bridge.WritableNativeArray
            r13.<init>()
            return r13
        L74:
            return r14
        L75:
            com.meituan.msc.jse.bridge.WritableNativeArray r13 = new com.meituan.msc.jse.bridge.WritableNativeArray
            r13.<init>()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.jse.bridge.CatalystInstanceImpl.callSerializableNativeHook(java.lang.String, java.lang.String, java.lang.String):com.meituan.msc.jse.bridge.NativeArray");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callNativeModules(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b026ad2c9f6d4ccc6671b1fd6817823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b026ad2c9f6d4ccc6671b1fd6817823");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONArray optJSONArray = jSONArray.optJSONArray(0);
            JSONArray optJSONArray2 = jSONArray.optJSONArray(1);
            JSONArray optJSONArray3 = jSONArray.optJSONArray(2);
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                String optString2 = optJSONArray2.optString(i);
                JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i);
                if (this.messageInterface != null) {
                    this.messageInterface.invoke(optString, optString2, optJSONArray4);
                }
            }
        } catch (JSONException e) {
            g.a("[CatalystInstanceImpl@callNativeModules]", e);
        }
    }

    public void runOnJSQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1a081adb91b82bfc7dd36355bd0fc1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1a081adb91b82bfc7dd36355bd0fc1e");
        } else {
            ((MessageQueueThread) com.facebook.infer.annotation.a.a(this.mReactQueueConfiguration.getJSQueueThread())).runOnQueue(runnable);
        }
    }

    public boolean isOnJSQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13d1a17b0754e1b8d293adf4c9fe36ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13d1a17b0754e1b8d293adf4c9fe36ec")).booleanValue() : ((MessageQueueThread) com.facebook.infer.annotation.a.a(this.mReactQueueConfiguration.getJSQueueThread())).isOnThread();
    }

    public void runOnJSQueueThreadDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0276c05edad0a7d908755b932c82b79e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0276c05edad0a7d908755b932c82b79e");
        } else {
            ((MessageQueueThread) com.facebook.infer.annotation.a.a(this.mReactQueueConfiguration.getJSQueueThread())).runOnQueueDelay(runnable, j);
        }
    }

    @Override // com.meituan.msc.jse.bridge.JSInstance
    public void runOnJSQueueThreadSafe(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11e66ec720c367efd0c47a1504e76271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11e66ec720c367efd0c47a1504e76271");
        } else if (isOnJSQueueThread()) {
            try {
                runnable.run();
            } catch (Exception e) {
                this.mNativeModuleCallExceptionHandler.handleException(e);
            }
        } else {
            runOnJSQueueThread(runnable);
        }
    }

    public void clearNativeModulesQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c08c4b4ba82f1aeb5b1aac1508e5568b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c08c4b4ba82f1aeb5b1aac1508e5568b");
        } else {
            ((MessageQueueThread) com.facebook.infer.annotation.a.a(this.mReactQueueConfiguration.getNativeModulesQueueThread())).removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meituan.msc.jse.bridge.NativeArray getConfig(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.jse.bridge.CatalystInstanceImpl.changeQuickRedirect
            java.lang.String r10 = "8cbf1747649fc6678fe2a5dce14a0497"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.meituan.msc.jse.bridge.NativeArray r12 = (com.meituan.msc.jse.bridge.NativeArray) r12
            return r12
        L1e:
            r0 = 0
            com.meituan.msc.jse.bridge.IMessageInterface r1 = r11.messageInterface
            if (r1 == 0) goto L2a
            com.meituan.msc.jse.bridge.IMessageInterface r1 = r11.messageInterface     // Catch: java.lang.Exception -> L2a
            org.json.JSONArray r12 = r1.getConfig(r12)     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r12 = r0
        L2b:
            if (r12 != 0) goto L33
            com.meituan.msc.jse.bridge.WritableNativeArray r12 = new com.meituan.msc.jse.bridge.WritableNativeArray
            r12.<init>()
            return r12
        L33:
            com.meituan.msc.jse.bridge.WritableArray r12 = com.meituan.msc.jse.bridge.ConversionUtil.jsonToReact(r12)     // Catch: org.json.JSONException -> L3a
            com.meituan.msc.jse.bridge.NativeArray r12 = (com.meituan.msc.jse.bridge.NativeArray) r12     // Catch: org.json.JSONException -> L3a
            return r12
        L3a:
            r12 = move-exception
            r12.printStackTrace()
            com.meituan.msc.jse.bridge.WritableNativeArray r12 = new com.meituan.msc.jse.bridge.WritableNativeArray
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.jse.bridge.CatalystInstanceImpl.getConfig(java.lang.String):com.meituan.msc.jse.bridge.NativeArray");
    }
}
