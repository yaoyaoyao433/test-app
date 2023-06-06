package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.common.logging.a;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.systrace.TraceListener;
import com.meituan.robust.common.CommonConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace;
    private volatile boolean mAcceptCalls;
    private final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    private final HybridData mHybridData;
    private boolean mInitialized;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    private volatile boolean mJSThreadDestructionComplete;
    private JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final List<String> mLoadedJSList;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    private volatile boolean mNativeModulesThreadDestructionComplete;
    private final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    @Nullable
    private String mSourceURL;
    private final TraceListener mTraceListener;
    @Nullable
    private JSIModule mTurboModuleManagerJSIModule;
    @Nullable
    private volatile TurboModuleRegistry mTurboModuleRegistry;

    private native long getJavaScriptContext();

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native String jniEvaluateJavaScript(String str, String str2);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native long jniGetJSIMemoryUsage();

    private native void jniHandleMemoryPressure(int i);

    private native void jniJSIGarbageCollect();

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDioFile(String str, String str2, String str3, boolean z);

    private native void jniLoadScriptFromDioFileWithCodeCache(String str, String str2, String str3, String str4, LoadJSCodeCacheCallbackJNIWrapper loadJSCodeCacheCallbackJNIWrapper, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniLoadScriptFromString(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetGlobalVariableSync(String str, String str2);

    private native void jniSetSourceURL(String str);

    @Override // com.facebook.react.bridge.CatalystInstance
    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    public native CallInvokerHolderImpl getNativeCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    static {
        ReactBridge.staticInit();
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class PendingJSCall {
        @Nullable
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, @Nullable NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        void call(CatalystInstanceImpl catalystInstanceImpl) {
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, this.mArguments != null ? this.mArguments : new WritableNativeArray());
        }

        public String toString() {
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

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mNativeModulesThreadDestructionComplete = false;
        this.mJSThreadDestructionComplete = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        this.mLoadedJSList = new CopyOnWriteArrayList();
        this.mTurboModuleRegistry = null;
        this.mTurboModuleManagerJSIModule = null;
        a.a("ReactNative", "Initializing React Xplat Bridge.");
        com.facebook.systrace.a.a(0L, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        com.facebook.systrace.a.a(0L);
        a.a("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        com.facebook.systrace.a.a(0L, "initializeCxxBridge");
        try {
            initializeBridge(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules());
        } catch (Throwable th) {
            a.d("CatalystInstanceImpl@initializeBridge", null, th);
        }
        a.a("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
        com.facebook.systrace.a.a(0L);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class BridgeCallback implements ReactCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(final NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                nativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromString(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromString(str, str2, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public String evaluateJavaScript(String str, String str2) {
        return jniEvaluateJavaScript(str, str2);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setGlobalVariableSync(String str, String str2) {
        jniSetGlobalVariableSync(str, str2);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle(JSBundleLoader jSBundleLoader) {
        if (jSBundleLoader == null || TextUtils.isEmpty(jSBundleLoader.getBundleSourceURL())) {
            return;
        }
        a.a("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        synchronized (this.mLoadedJSList) {
            if (hasRunJSBundle(jSBundleLoader)) {
                return;
            }
            this.mLoadedJSList.add(jSBundleLoader.getBundleSourceURL());
            jSBundleLoader.loadScript(this);
            synchronized (this.mJSCallsPendingInitLock) {
                this.mAcceptCalls = true;
                Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
                while (it.hasNext()) {
                    it.next().call(this);
                }
                this.mJSCallsPendingInit.clear();
            }
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle(JSBundleLoader jSBundleLoader) {
        if (jSBundleLoader == null) {
            return false;
        }
        synchronized (this.mLoadedJSList) {
            for (String str : this.mLoadedJSList) {
                if (TextUtils.equals(str, jSBundleLoader.getBundleSourceURL())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @Nullable
    public String getSourceURL(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.mSourceURL;
        }
        synchronized (this.mLoadedJSList) {
            for (String str2 : this.mLoadedJSList) {
                String format = String.format("%s.js", str);
                String format2 = String.format("%s.android.bundle", str);
                if (!TextUtils.isEmpty(str2) && (str2.endsWith(format2) || format2.endsWith(format))) {
                    return str2;
                }
            }
            return this.mSourceURL;
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            String pendingJSCall2 = pendingJSCall.toString();
            a.c("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall2);
            return;
        }
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

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            a.c("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @ThreadConfined(ThreadConfined.UI)
    public void destroy() {
        a.a("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (com.facebook.react.config.a.d) {
            destroyV2();
        } else {
            destroyV1();
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void destroyV1() {
        a.a("ReactNative", "CatalystInstanceImpl.destroyV1() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        synchronized (this.mLoadedJSList) {
            this.mLoadedJSList.clear();
        }
        this.mNativeModulesQueueThread.runOnQueue(new AnonymousClass2());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
            CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
            boolean z = CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0;
            if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = (NotThreadSafeBridgeIdleDebugListener) it.next();
                    if (!z) {
                        notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                    }
                    notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                }
            }
            CatalystInstanceImpl.this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new AnonymousClass1());
        }

        /* compiled from: ProGuard */
        /* renamed from: com.facebook.react.bridge.CatalystInstanceImpl$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CatalystInstanceImpl.this.mTurboModuleManagerJSIModule != null) {
                    CatalystInstanceImpl.this.mTurboModuleManagerJSIModule.onCatalystInstanceDestroy();
                }
                CatalystInstanceImpl.this.mHybridData.resetNative();
                CatalystInstanceImpl.this.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.2.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncTask.execute(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.2.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                                CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                                a.a("ReactNative", "CatalystInstanceImpl.destroy() end");
                                ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                            }
                        });
                    }
                });
            }
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void destroyV2() {
        a.a("ReactNative", "CatalystInstanceImpl.destroyV2() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesThreadDestructionComplete = false;
        this.mJSThreadDestructionComplete = false;
        synchronized (this.mLoadedJSList) {
            this.mLoadedJSList.clear();
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                a.a("CatalystInstanceImpl", ".destroy on native modules thread");
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
                CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
                boolean z = CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0;
                if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = (NotThreadSafeBridgeIdleDebugListener) it.next();
                        if (!z) {
                            notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                        }
                        notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                    }
                }
                CatalystInstanceImpl.this.mNativeModulesThreadDestructionComplete = true;
                a.a("CatalystInstanceImpl", ".destroy on native modules thread finished");
            }
        });
        getReactQueueConfiguration().getJSQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                a.a("CatalystInstanceImpl", ".destroy on JS thread");
                if (CatalystInstanceImpl.this.mTurboModuleManagerJSIModule != null) {
                    CatalystInstanceImpl.this.mTurboModuleManagerJSIModule.onCatalystInstanceDestroy();
                }
                CatalystInstanceImpl.this.mJSThreadDestructionComplete = true;
                a.a("CatalystInstanceImpl", ".destroy on JS thread finished");
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (!this.mNativeModulesThreadDestructionComplete || !this.mJSThreadDestructionComplete) {
                if (System.currentTimeMillis() - currentTimeMillis > 100) {
                    a.c("ReactNative", "CatalystInstanceImpl.destroy() timed out waiting for Native Modules and JS thread teardown");
                    break;
                }
            } else {
                break;
            }
        }
        this.mJavaScriptContextHolder.clear();
        this.mHybridData.resetNative();
        getReactQueueConfiguration().destroy();
        a.a("ReactNative", "CatalystInstanceImpl.destroy() end");
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @VisibleForTesting
    public void initialize() {
        a.a("ReactNative", "CatalystInstanceImpl.initialize()");
        com.facebook.infer.annotation.a.a(!this.mInitialized, "This catalyst instance has already been initialized");
        com.facebook.infer.annotation.a.a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.5
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        String nameFromAnnotation = getNameFromAnnotation(cls);
        if (getTurboModuleRegistry() == null || !getTurboModuleRegistry().b(nameFromAnnotation)) {
            return this.mNativeModuleRegistry.hasModule(nameFromAnnotation);
        }
        return true;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) getNativeModule(getNameFromAnnotation(cls));
    }

    private TurboModuleRegistry getTurboModuleRegistry() {
        if (com.facebook.react.config.a.a) {
            return (TurboModuleRegistry) com.facebook.infer.annotation.a.a(this.mTurboModuleRegistry, "TurboModules are enabled, but mTurboModuleRegistry hasn't been set.");
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        if (getTurboModuleRegistry() != null) {
            com.facebook.react.turbomodule.core.interfaces.a a = getTurboModuleRegistry().a(str);
            StringBuilder sb = new StringBuilder("CatalystInstanceImpl.getNativeModule: TurboModule ");
            sb.append(str);
            sb.append(a == null ? " not" : "");
            sb.append(" found");
            a.d("ReactNative", sb.toString());
            if (a != null) {
                return (NativeModule) a;
            }
        }
        return this.mNativeModuleRegistry.getModule(str);
    }

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule == null) {
            throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
        }
        return reactModule.name();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mNativeModuleRegistry.getAllModules());
        if (getTurboModuleRegistry() != null) {
            Iterator<com.facebook.react.turbomodule.core.interfaces.a> it = getTurboModuleRegistry().b().iterator();
            while (it.hasNext()) {
                arrayList.add((NativeModule) it.next());
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        if (this.mDestroyed) {
            return;
        }
        jniHandleMemoryPressure(i);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addJSIModules(List<JSIModuleSpec> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        return this.mJSIModuleRegistry.getModule(jSIModuleType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        if (!(this.mPendingJSCalls.getAndIncrement() == 0) || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.6
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
                }
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleManager(JSIModule jSIModule) {
        this.mTurboModuleRegistry = (TurboModuleRegistry) jSIModule;
        this.mTurboModuleManagerJSIModule = jSIModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        if (!(this.mPendingJSCalls.decrementAndGet() == 0) || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.7
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        a.d("ReactNative", "CatalystInstanceImpl caught native exception", exc);
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.8
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Builder {
        @Nullable
        private JSBundleLoader mJSBundleLoader;
        @Nullable
        private JavaScriptExecutor mJSExecutor;
        @Nullable
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        @Nullable
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        @Nullable
        private NativeModuleRegistry mRegistry;

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
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

        public CatalystInstanceImpl build() {
            return new CatalystInstanceImpl((ReactQueueConfigurationSpec) com.facebook.infer.annotation.a.a(this.mReactQueueConfigurationSpec), (JavaScriptExecutor) com.facebook.infer.annotation.a.a(this.mJSExecutor), (NativeModuleRegistry) com.facebook.infer.annotation.a.a(this.mRegistry), (NativeModuleCallExceptionHandler) com.facebook.infer.annotation.a.a(this.mNativeModuleCallExceptionHandler));
        }
    }

    @Override // com.facebook.react.bridge.JSInstance
    public void garbageCollect() {
        jniJSIGarbageCollect();
    }

    @Override // com.facebook.react.bridge.JSInstance
    public long getMemoryUsage() {
        return jniGetJSIMemoryUsage();
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDioFile(String str, String str2, String str3, boolean z) {
        this.mSourceURL = str3;
        jniLoadScriptFromDioFile(str, str2, str3, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDioFile(String str, String str2, String str3, String str4, LoadJSCodeCacheCallback loadJSCodeCacheCallback, boolean z) {
        this.mSourceURL = str3;
        jniLoadScriptFromDioFileWithCodeCache(str, str2, str3, str4, new LoadJSCodeCacheCallbackJNIWrapper(loadJSCodeCacheCallback), z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSBundleLoaderDelegate
    public List<String> getLoadedJSList() {
        return this.mLoadedJSList;
    }
}
