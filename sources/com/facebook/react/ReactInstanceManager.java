package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ProxyJavaScriptExecutor;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ad;
import com.facebook.react.uimanager.at;
import com.facebook.react.uimanager.au;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@ThreadSafe
/* loaded from: classes.dex */
public class ReactInstanceManager {
    private static final String TAG = "ReactInstanceManager";
    private static ExecutorService executorService = com.sankuai.android.jarvis.c.a("MRN-CREATE-CONTEXT", 1);
    private final Context mApplicationContext;
    @Nullable
    private final NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    @Nullable
    private WeakReference<Activity> mCurrentActivityRef;
    @Nullable
    private volatile ReactContext mCurrentReactContext;
    @ThreadConfined(ThreadConfined.UI)
    @Nullable
    private com.facebook.react.modules.core.b mDefaultBackButtonImpl;
    private final com.facebook.react.devsupport.interfaces.b mDevSupportManager;
    private volatile boolean mIsCreatingReactContext;
    @Nullable
    private final List<JSBundleLoader> mJSBundleLoaders;
    @Nullable
    private final JSIModulePackage mJSIModulePackage;
    @Nullable
    private final String mJSMainModulePath;
    private final JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private volatile LifecycleState mLifecycleState;
    private final com.facebook.react.b mMemoryPressureRouter;
    @Nullable
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final List<i> mPackages;
    @ThreadConfined(ThreadConfined.UI)
    @Nullable
    private a mPendingReactContextInitParams;
    private final List<i> mRegistryPackages;
    private final boolean mUseDeveloperSupport;
    private final Set<ad> mAttachedReactRoots = Collections.synchronizedSet(new HashSet());
    private final LinkedList<JSBundleLoader> mPendingCommonJSBundleList = new LinkedList<>();
    private final LinkedList<JSBundleLoader> mPendingJSBundleList = new LinkedList<>();
    private final Object mReactContextLock = new Object();
    private final Collection<b> mReactInstanceEventListeners = Collections.synchronizedList(new ArrayList());
    private volatile boolean mHasStartedCreatingInitialContext = false;
    private AtomicBoolean mReactContextInitialized = new AtomicBoolean(false);
    private volatile Boolean mHasStartedDestroying = Boolean.FALSE;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void onReactContextInitialized(ReactContext reactContext);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        final JavaScriptExecutorFactory a;
        final List<JSBundleLoader> b;

        public a(JavaScriptExecutorFactory javaScriptExecutorFactory, List<JSBundleLoader> list) {
            this.a = (JavaScriptExecutorFactory) com.facebook.infer.annotation.a.a(javaScriptExecutorFactory);
            this.b = (List) com.facebook.infer.annotation.a.a(list);
        }
    }

    public static f builder() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactInstanceManager(Context context, @Nullable Activity activity, @Nullable com.facebook.react.modules.core.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, @Nullable List<JSBundleLoader> list, @Nullable String str, List<i> list2, boolean z, @Nullable NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, @Nullable at atVar, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, @Nullable com.facebook.react.devsupport.e eVar, boolean z2, @Nullable com.facebook.react.devsupport.interfaces.a aVar, int i, int i2, @Nullable JSIModulePackage jSIModulePackage, @Nullable Map<String, com.facebook.react.packagerconnection.a> map) {
        com.facebook.common.logging.a.a(TAG, "ReactInstanceManager.ctor()");
        initializeSoLoaderIfNecessary(context);
        com.facebook.react.uimanager.d.a(context);
        this.mApplicationContext = context;
        setCurrentActivity(activity);
        this.mDefaultBackButtonImpl = bVar;
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        this.mJSBundleLoaders = list;
        this.mJSMainModulePath = str;
        this.mPackages = new ArrayList();
        this.mRegistryPackages = new ArrayList();
        this.mUseDeveloperSupport = z;
        com.facebook.systrace.a.a(0L, "ReactInstanceManager.initDevSupportManager");
        this.mDevSupportManager = com.facebook.react.devsupport.a.a(context, createDevHelperInterface(), this.mJSMainModulePath, z, eVar, aVar, i, map);
        com.facebook.systrace.a.a(0L);
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        this.mLifecycleState = lifecycleState;
        this.mMemoryPressureRouter = new com.facebook.react.b(context);
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        synchronized (this.mPackages) {
            com.facebook.debug.holder.c.a();
            com.facebook.debug.debugoverlay.model.a aVar2 = com.facebook.debug.tags.a.c;
            this.mPackages.add(new CoreModulesPackage(this, new com.facebook.react.modules.core.b() { // from class: com.facebook.react.ReactInstanceManager.1
                @Override // com.facebook.react.modules.core.b
                public final void r_() {
                    ReactInstanceManager.this.invokeDefaultOnBackPressed();
                }
            }, atVar, z2, i2));
            this.mPackages.addAll(list2);
        }
        this.mJSIModulePackage = jSIModulePackage;
        if (UiThreadUtil.isOnUiThread()) {
            com.facebook.react.modules.core.g.a();
        }
    }

    private com.facebook.react.devsupport.d createDevHelperInterface() {
        return new com.facebook.react.devsupport.d() { // from class: com.facebook.react.ReactInstanceManager.2
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JavaScriptExecutorFactory getJSExecutorFactory() {
        return this.mJavaScriptExecutorFactory;
    }

    public boolean isUseDeveloperSupport() {
        return this.mUseDeveloperSupport;
    }

    public com.facebook.react.devsupport.interfaces.b getDevSupportManager() {
        return this.mDevSupportManager;
    }

    public com.facebook.react.b getMemoryPressureRouter() {
        return this.mMemoryPressureRouter;
    }

    public List<i> getPackages() {
        return new ArrayList(this.mPackages);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void initializeSoLoaderIfNecessary(Context context) {
        com.meituan.android.soloader.k.a(context, false);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void createReactContextInBackground() {
        com.facebook.common.logging.a.b(TAG, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.mHasStartedCreatingInitialContext) {
            return;
        }
        this.mHasStartedCreatingInitialContext = true;
        recreateReactContextInBackgroundInner();
    }

    @ThreadConfined(ThreadConfined.UI)
    public void recreateReactContextInBackground() {
        com.facebook.infer.annotation.a.a(this.mHasStartedCreatingInitialContext, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        recreateReactContextInBackgroundInner();
    }

    public ReactApplicationContext createReactContextSync() throws Exception {
        ReactApplicationContext createReactContext = createReactContext(this.mJavaScriptExecutorFactory.create(), this.mJSBundleLoaders);
        CatalystInstance catalystInstance = createReactContext.getCatalystInstance();
        if (catalystInstance != null) {
            Boolean bool = Boolean.TRUE;
            Object[] objArr = {catalystInstance, "mAcceptCalls", bool};
            ChangeQuickRedirect changeQuickRedirect = com.meituan.android.mrn.utils.ad.a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bd94df14436eac08467e5f6261bd7d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bd94df14436eac08467e5f6261bd7d7");
            } else {
                com.meituan.android.mrn.utils.ad.a((Class<?>) null, catalystInstance, "mAcceptCalls", bool);
            }
        }
        setupReactContext(createReactContext);
        return createReactContext;
    }

    @ThreadConfined(ThreadConfined.UI)
    private void recreateReactContextInBackgroundInner() {
        com.facebook.common.logging.a.b(TAG, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        com.facebook.debug.holder.c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.c;
        UiThreadUtil.assertOnUiThread();
        recreateReactContextInBackgroundFromBundleLoader();
    }

    @ThreadConfined(ThreadConfined.UI)
    public void registerAdditionalPackages(List<i> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : list) {
            if (!packageRegistered(iVar)) {
                arrayList.add(iVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!hasStartedCreatingInitialContext()) {
            synchronized (this.mPackages) {
                for (i iVar2 : list) {
                    if (!this.mPackages.contains(iVar2)) {
                        this.mPackages.add(iVar2);
                    }
                }
            }
            com.facebook.common.logging.a.c("[ReactInstanceManager@registerAdditionalPackages]", "CatalystInstance hasn't been created");
            return;
        }
        this.mRegistryPackages.addAll(arrayList);
        ReactContext currentReactContext = getCurrentReactContext();
        CatalystInstance catalystInstance = currentReactContext != null ? currentReactContext.getCatalystInstance() : null;
        if (catalystInstance != null) {
            catalystInstance.extendNativeModules(processPackages((ReactApplicationContext) currentReactContext, arrayList, true));
        }
    }

    private boolean packageRegistered(i iVar) {
        if (iVar == null) {
            return true;
        }
        ArrayList<i> arrayList = new ArrayList();
        arrayList.addAll(this.mRegistryPackages);
        synchronized (this.mPackages) {
            arrayList.addAll(this.mPackages);
        }
        for (i iVar2 : arrayList) {
            if (iVar2 != null && (iVar2 == iVar || iVar2.getClass() == iVar.getClass())) {
                return true;
            }
        }
        return false;
    }

    @ThreadConfined(ThreadConfined.UI)
    private void recreateReactContextInBackgroundFromBundleLoader() {
        com.facebook.common.logging.a.b(TAG, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        com.facebook.debug.holder.c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.c;
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, this.mJSBundleLoaders);
    }

    public boolean hasStartedCreatingInitialContext() {
        return this.mHasStartedCreatingInitialContext;
    }

    public void onBackPressed() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext == null) {
            com.facebook.common.logging.a.c(TAG, "Instance detached from instance manager");
            invokeDefaultOnBackPressed();
            return;
        }
        ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeDefaultOnBackPressed() {
        UiThreadUtil.assertOnUiThread();
        if (this.mDefaultBackButtonImpl != null) {
            this.mDefaultBackButtonImpl.r_();
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onNewIntent(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            com.facebook.common.logging.a.c(TAG, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
            ((DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(getCurrentActivity(), intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleElementInspector() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && currentReactContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
        } else {
            ReactSoftException.logSoftException(TAG, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = null;
        moveToBeforeResumeLifecycleState();
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostPause(Activity activity) {
        com.facebook.infer.annotation.a.a(getCurrentActivity());
        boolean z = activity == getCurrentActivity();
        com.facebook.infer.annotation.a.a(z, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + getCurrentActivity().getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        onHostPause();
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostResume(Activity activity, com.facebook.react.modules.core.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = bVar;
        onHostResume(activity);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostResume(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        setCurrentActivity(activity);
        if (this.mUseDeveloperSupport) {
            final View decorView = getCurrentActivity().getWindow().getDecorView();
            if (!ViewCompat.isAttachedToWindow(decorView)) {
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.facebook.react.ReactInstanceManager.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        com.facebook.react.devsupport.interfaces.b unused = ReactInstanceManager.this.mDevSupportManager;
                    }
                });
            }
        }
        moveToResumedLifecycleState(false);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        moveToBeforeCreateLifecycleState();
        this.mCurrentActivityRef = new WeakReference<>(null);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostDestroy(Activity activity) {
        if (activity == getCurrentActivity()) {
            onHostDestroy();
        }
    }

    private void logOnDestroy() {
        com.facebook.common.logging.a.d(TAG, "ReactInstanceManager.destroy called", new RuntimeException("ReactInstanceManager.destroy called"));
    }

    @ThreadConfined(ThreadConfined.UI)
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        com.facebook.debug.holder.c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.c;
        logOnDestroy();
        if (this.mHasStartedDestroying.booleanValue()) {
            com.facebook.common.logging.a.d("ReactNative", "ReactInstanceManager.destroy called: bail out, already destroying");
            return;
        }
        this.mHasStartedDestroying = Boolean.TRUE;
        moveToBeforeCreateLifecycleState();
        this.mIsCreatingReactContext = false;
        this.mApplicationContext.getApplicationContext().unregisterComponentCallbacks(this.mMemoryPressureRouter);
        synchronized (this.mReactContextLock) {
            if (this.mCurrentReactContext != null) {
                this.mCurrentReactContext.destroy();
                this.mCurrentReactContext = null;
            }
        }
        this.mHasStartedCreatingInitialContext = false;
        this.mCurrentActivityRef = new WeakReference<>(null);
        com.facebook.react.views.imagehelper.a.a().b();
        this.mHasStartedDestroying = Boolean.FALSE;
        synchronized (this.mHasStartedDestroying) {
            this.mHasStartedDestroying.notifyAll();
        }
    }

    private synchronized void moveToResumedLifecycleState(boolean z) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (z || this.mLifecycleState == LifecycleState.BEFORE_RESUME || this.mLifecycleState == LifecycleState.BEFORE_CREATE)) {
            currentReactContext.onHostResume(getCurrentActivity());
        }
        this.mLifecycleState = LifecycleState.RESUMED;
    }

    private synchronized void moveToBeforeResumeLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.BEFORE_CREATE) {
                currentReactContext.onHostResume(getCurrentActivity());
                currentReactContext.onHostPause();
            } else if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void moveToBeforeCreateLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
                this.mLifecycleState = LifecycleState.BEFORE_RESUME;
            }
            if (this.mLifecycleState == LifecycleState.BEFORE_RESUME) {
                currentReactContext.onHostDestroy();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void moveReactContextToCurrentLifecycleState() {
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            moveToResumedLifecycleState(true);
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, i, i2, intent);
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onWindowFocusChange(boolean z) {
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(z);
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onConfigurationChanged(Context context, @Nullable Configuration configuration) {
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            ((AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class)).onConfigurationChanged(context);
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void showDevOptionsDialog() {
        UiThreadUtil.assertOnUiThread();
    }

    private void clearReactRoot(ad adVar) {
        adVar.getRootViewGroup().removeAllViews();
        adVar.getRootViewGroup().setId(-1);
    }

    public void runCommonJSBundle(JSBundleLoader jSBundleLoader) {
        if (this.mCurrentReactContext != null) {
            this.mCurrentReactContext.getCatalystInstance().runJSBundle(jSBundleLoader);
            return;
        }
        synchronized (this.mPendingCommonJSBundleList) {
            this.mPendingCommonJSBundleList.add(jSBundleLoader);
        }
    }

    public void runJsBundle(JSBundleLoader jSBundleLoader) {
        if (this.mCurrentReactContext != null) {
            this.mCurrentReactContext.getCatalystInstance().runJSBundle(jSBundleLoader);
            return;
        }
        synchronized (this.mPendingJSBundleList) {
            this.mPendingJSBundleList.add(jSBundleLoader);
        }
    }

    private void runPendingJsBundle(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            return;
        }
        synchronized (this.mPendingCommonJSBundleList) {
            Iterator<JSBundleLoader> it = this.mPendingCommonJSBundleList.iterator();
            while (it.hasNext()) {
                JSBundleLoader next = it.next();
                if (next != null) {
                    catalystInstance.runJSBundle(next);
                }
            }
            this.mPendingCommonJSBundleList.clear();
        }
        synchronized (this.mPendingJSBundleList) {
            Iterator<JSBundleLoader> it2 = this.mPendingJSBundleList.iterator();
            while (it2.hasNext()) {
                JSBundleLoader next2 = it2.next();
                if (next2 != null) {
                    catalystInstance.runJSBundle(next2);
                }
            }
            this.mPendingJSBundleList.clear();
        }
    }

    public boolean hasAttachedRootView() {
        return !this.mAttachedReactRoots.isEmpty();
    }

    @ThreadConfined(ThreadConfined.UI)
    public void attachRootView(ad adVar) {
        UiThreadUtil.assertOnUiThread();
        this.mAttachedReactRoots.add(adVar);
        clearReactRoot(adVar);
        ReactContext currentReactContext = getCurrentReactContext();
        if (this.mIsCreatingReactContext || currentReactContext == null || !hasInitializeReactContext()) {
            return;
        }
        attachRootViewToInstance(adVar);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void detachRootView(ad adVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedReactRoots) {
            if (this.mAttachedReactRoots.contains(adVar)) {
                ReactContext currentReactContext = getCurrentReactContext();
                this.mAttachedReactRoots.remove(adVar);
                if (currentReactContext != null && currentReactContext.hasActiveCatalystInstance()) {
                    detachViewFromInstance(adVar, currentReactContext.getCatalystInstance());
                }
            }
        }
    }

    public List<ViewManager> getOrCreateViewManagers(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        com.facebook.systrace.a.a(0L, "createAllViewManagers");
        try {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            synchronized (this.mPackages) {
                for (i iVar : this.mPackages) {
                    List<ViewManager> createViewManagers = iVar.createViewManagers(reactApplicationContext);
                    for (ViewManager viewManager : createViewManagers) {
                        if (hashSet.contains(viewManager.getName())) {
                            throw new IllegalStateException("ViewManager has already contained for " + viewManager.getName() + " of " + iVar.getClass().toString());
                        }
                        hashSet.add(viewManager.getName());
                    }
                    arrayList.addAll(createViewManagers);
                }
            }
            return arrayList;
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    public boolean hasInitializeReactContext() {
        return this.mReactContextInitialized.get();
    }

    @Nullable
    public ViewManager createViewManager(String str) {
        ViewManager a2;
        synchronized (this.mReactContextLock) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) getCurrentReactContext();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.mPackages) {
                    for (i iVar : this.mPackages) {
                        if ((iVar instanceof p) && (a2 = ((p) iVar).a(reactApplicationContext, str)) != null) {
                            return a2;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    @Nullable
    public List<String> getViewManagerNames() {
        ArrayList arrayList;
        List<String> a2;
        com.facebook.systrace.a.a(0L, "ReactInstanceManager.getViewManagerNames");
        synchronized (this.mReactContextLock) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) getCurrentReactContext();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.mPackages) {
                    HashSet hashSet = new HashSet();
                    for (i iVar : this.mPackages) {
                        com.facebook.systrace.b.a(0L, "ReactInstanceManager.getViewManagerName");
                        iVar.getClass().getSimpleName();
                        if ((iVar instanceof p) && (a2 = ((p) iVar).a(reactApplicationContext)) != null) {
                            hashSet.addAll(a2);
                        }
                        com.facebook.systrace.b.a(0L);
                    }
                    com.facebook.systrace.a.a(0L);
                    arrayList = new ArrayList(hashSet);
                }
                return arrayList;
            }
            return null;
        }
    }

    public void addReactInstanceEventListener(b bVar) {
        if (this.mReactContextInitialized.get()) {
            bVar.onReactContextInitialized(this.mCurrentReactContext);
        } else {
            this.mReactInstanceEventListeners.add(bVar);
        }
    }

    public void addReactInstanceEventListenerForce(b bVar) {
        if (bVar == null || this.mReactInstanceEventListeners.contains(bVar)) {
            return;
        }
        this.mReactInstanceEventListeners.add(bVar);
    }

    public void removeReactInstanceEventListener(b bVar) {
        if (this.mReactInstanceEventListeners.contains(bVar)) {
            this.mReactInstanceEventListeners.remove(bVar);
        }
    }

    @Nullable
    @VisibleForTesting
    public ReactContext getCurrentReactContext() {
        ReactContext reactContext;
        synchronized (this.mReactContextLock) {
            reactContext = this.mCurrentReactContext;
        }
        return reactContext;
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public String getJsExecutorName() {
        return this.mJavaScriptExecutorFactory.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ThreadConfined(ThreadConfined.UI)
    public void onReloadWithJSDebugger(JavaJSExecutor.Factory factory) {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.onReloadWithJSDebugger()");
        ArrayList arrayList = new ArrayList();
        arrayList.add(JSBundleLoader.createRemoteDebuggerBundleLoader(null, null));
        recreateReactContextInBackground(new ProxyJavaScriptExecutor.Factory(factory), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ThreadConfined(ThreadConfined.UI)
    public void onJSBundleLoadedFromServer() {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        ArrayList arrayList = new ArrayList();
        arrayList.add(JSBundleLoader.createCachedBundleFromNetworkLoader(null, null));
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, arrayList);
    }

    @ThreadConfined(ThreadConfined.UI)
    private void recreateReactContextInBackground(JavaScriptExecutorFactory javaScriptExecutorFactory, List<JSBundleLoader> list) {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        a aVar = new a(javaScriptExecutorFactory, list);
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        com.facebook.common.logging.a.b("[ReactInstanceManager@recreateReactContextInBackground]", sb.toString());
        if (!this.mIsCreatingReactContext) {
            runCreateReactContextOnNewThread(aVar);
        } else {
            this.mPendingReactContextInitParams = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ThreadConfined(ThreadConfined.UI)
    public void runCreateReactContextOnNewThread(final a aVar) {
        com.facebook.common.logging.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedReactRoots) {
            synchronized (this.mReactContextLock) {
                if (this.mCurrentReactContext != null) {
                    tearDownReactContext(this.mCurrentReactContext);
                    this.mCurrentReactContext = null;
                }
            }
        }
        this.mIsCreatingReactContext = true;
        executorService.execute(new Runnable() { // from class: com.facebook.react.ReactInstanceManager.4
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                com.facebook.common.logging.a.b("[ReactInstanceManager@runCreateReactContextOnNewThread@run]", sb.toString());
                ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
                synchronized (ReactInstanceManager.this.mHasStartedDestroying) {
                    while (ReactInstanceManager.this.mHasStartedDestroying.booleanValue()) {
                        try {
                            ReactInstanceManager.this.mHasStartedDestroying.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                ReactInstanceManager.this.mHasStartedCreatingInitialContext = true;
                try {
                    Process.setThreadPriority(-4);
                    ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                    final ReactApplicationContext createReactContext = ReactInstanceManager.this.createReactContext(aVar.a.create(), aVar.b);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    com.facebook.common.logging.a.b("[ReactInstanceManager@runCreateReactContextOnNewThread@run]", sb2.toString());
                    ReactInstanceManager.this.mIsCreatingReactContext = false;
                    ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                    Runnable runnable = new Runnable() { // from class: com.facebook.react.ReactInstanceManager.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ReactInstanceManager.this.mPendingReactContextInitParams != null) {
                                ReactInstanceManager.this.runCreateReactContextOnNewThread(ReactInstanceManager.this.mPendingReactContextInitParams);
                                ReactInstanceManager.this.mPendingReactContextInitParams = null;
                            }
                        }
                    };
                    createReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.ReactInstanceManager.4.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this);
                                com.facebook.common.logging.a.b("[ReactInstanceManager@runCreateReactContextOnNewThread@run]", sb3.toString());
                                ReactInstanceManager.this.setupReactContext(createReactContext);
                            } catch (Exception e) {
                                com.facebook.common.logging.a.d("ReactNative", "ReactInstanceManager caught exception in setupReactContext", e);
                                ReactInstanceManager.this.handleException(e);
                            }
                        }
                    });
                    UiThreadUtil.runOnUiThread(runnable);
                } catch (Exception e) {
                    com.facebook.common.logging.a.d("ReactInstanceManager@runCreateReactContextOnNewThread@run", null, e);
                    ReactInstanceManager.this.handleException(e);
                }
            }
        });
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupReactContext(final ReactApplicationContext reactApplicationContext) {
        com.facebook.common.logging.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        com.facebook.systrace.a.a(0L, "setupReactContext");
        synchronized (this.mAttachedReactRoots) {
            synchronized (this.mReactContextLock) {
                this.mCurrentReactContext = (ReactContext) com.facebook.infer.annotation.a.a(reactApplicationContext);
            }
            CatalystInstance catalystInstance = (CatalystInstance) com.facebook.infer.annotation.a.a(reactApplicationContext.getCatalystInstance());
            runPendingJsBundle(catalystInstance);
            catalystInstance.initialize();
            catalystInstance.extendNativeModules(processPackages(reactApplicationContext, this.mRegistryPackages, true));
            this.mMemoryPressureRouter.a.add(catalystInstance);
            moveReactContextToCurrentLifecycleState();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (ad adVar : this.mAttachedReactRoots) {
                attachRootViewToInstance(adVar);
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        this.mReactContextInitialized.set(true);
        final b[] bVarArr = (b[]) this.mReactInstanceEventListeners.toArray(new b[this.mReactInstanceEventListeners.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.ReactInstanceManager.5
            @Override // java.lang.Runnable
            public final void run() {
                b[] bVarArr2;
                com.facebook.common.logging.a.b("[ReactInstanceManager@setupReactContext@run]", this + StringUtil.SPACE + bVarArr.length);
                for (b bVar : bVarArr) {
                    if (bVar != null) {
                        bVar.onReactContextInitialized(reactApplicationContext);
                    }
                }
            }
        });
        com.facebook.systrace.a.a(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.ReactInstanceManager.6
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
                ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.ReactInstanceManager.7
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
            }
        });
    }

    private void attachRootViewToInstance(final ad adVar) {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        com.facebook.systrace.a.a(0L, "attachRootViewToInstance");
        long uptimeMillis = SystemClock.uptimeMillis();
        UIManager a2 = au.a(this.mCurrentReactContext, adVar.getUIManagerType(), true);
        com.facebook.common.logging.a.a("[ReactInstanceManager@attachRootViewToInstance]", "UIManager create cost %s on Thread: %s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Thread.currentThread().getName());
        if (a2 == null) {
            throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
        }
        Bundle appProperties = adVar.getAppProperties();
        final int addRootView = a2.addRootView(adVar.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), adVar.getInitialUITemplate());
        adVar.setRootViewTag(addRootView);
        if (adVar.getUIManagerType() == 2) {
            a2.updateRootLayoutSpecs(addRootView, adVar.getWidthMeasureSpec(), adVar.getHeightMeasureSpec());
            adVar.setShouldLogContentAppeared(true);
        } else {
            adVar.runApplication();
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.ReactInstanceManager.8
            @Override // java.lang.Runnable
            public final void run() {
                adVar.onStage(101);
            }
        });
        com.facebook.systrace.a.a(0L);
    }

    private void detachViewFromInstance(ad adVar, CatalystInstance catalystInstance) {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (adVar.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(adVar.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(adVar.getRootViewTag());
        }
    }

    private void tearDownReactContext(ReactContext reactContext) {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.mAttachedReactRoots) {
            for (ad adVar : this.mAttachedReactRoots) {
                clearReactRoot(adVar);
            }
        }
        com.facebook.react.b bVar = this.mMemoryPressureRouter;
        bVar.a.remove(reactContext.getCatalystInstance());
        reactContext.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactApplicationContext createReactContext(JavaScriptExecutor javaScriptExecutor, List<JSBundleLoader> list) {
        com.facebook.common.logging.a.a("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.mApplicationContext);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler != null ? this.mNativeModuleCallExceptionHandler : this.mDevSupportManager;
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(processPackages(reactApplicationContext, this.mPackages, false)).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        com.facebook.systrace.a.a(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            StringBuilder sb = new StringBuilder("ReactInstanceManager.createReactContext: mJSIModulePackage ");
            sb.append(this.mJSIModulePackage != null ? "not null" : StringUtil.NULL);
            com.facebook.common.logging.a.d("ReactNative", sb.toString());
            if (this.mJSIModulePackage != null) {
                build.addJSIModules(this.mJSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
                StringBuilder sb2 = new StringBuilder("ReactInstanceManager.createReactContext: ReactFeatureFlags.useTurboModules == ");
                sb2.append(!com.facebook.react.config.a.a ? "false" : "true");
                com.facebook.common.logging.a.d("ReactNative", sb2.toString());
                if (com.facebook.react.config.a.a) {
                    JSIModule jSIModule = build.getJSIModule(JSIModuleType.TurboModuleManager);
                    StringBuilder sb3 = new StringBuilder("ReactInstanceManager.createReactContext: TurboModuleManager ");
                    sb3.append(jSIModule == null ? "not created" : "created");
                    com.facebook.common.logging.a.d("ReactNative", sb3.toString());
                    build.setTurboModuleManager(jSIModule);
                    TurboModuleRegistry turboModuleRegistry = (TurboModuleRegistry) jSIModule;
                    for (String str : turboModuleRegistry.a()) {
                        turboModuleRegistry.a(str);
                    }
                }
            }
            if (this.mBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(this.mBridgeIdleDebugListener);
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            if (list != null && !list.isEmpty()) {
                for (JSBundleLoader jSBundleLoader : list) {
                    build.runJSBundle(jSBundleLoader);
                }
            }
            runPendingJsBundle(build);
            return reactApplicationContext;
        } catch (Throwable th) {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    private NativeModuleRegistry processPackages(ReactApplicationContext reactApplicationContext, List<i> list, boolean z) {
        c cVar = new c(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.mPackages) {
            Iterator<i> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    i next = it.next();
                    if (!z || !this.mPackages.contains(next)) {
                        com.facebook.systrace.a.a(0L, "createAndProcessCustomReactPackage");
                        if (z) {
                            this.mPackages.add(next);
                        }
                        processPackage(next, cVar);
                        com.facebook.systrace.a.a(0L);
                    }
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        com.facebook.systrace.a.a(0L, "buildNativeModuleRegistry");
        try {
            return new NativeModuleRegistry(cVar.a, cVar.c);
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void processPackage(i iVar, c cVar) {
        Iterable<ModuleHolder> a2;
        com.facebook.systrace.b.a(0L, "processPackage");
        iVar.getClass().getSimpleName();
        boolean z = iVar instanceof k;
        if (z) {
            ((k) iVar).startProcessPackage();
        }
        if (iVar instanceof LazyReactPackage) {
            a2 = ((LazyReactPackage) iVar).getNativeModuleIterator(cVar.a);
        } else if (iVar instanceof n) {
            a2 = ((n) iVar).getNativeModuleIterator(cVar.a);
        } else {
            a2 = j.a(iVar, cVar.a, cVar.b);
        }
        for (ModuleHolder moduleHolder : a2) {
            String name = moduleHolder.getName();
            if (cVar.c.containsKey(name)) {
                ModuleHolder moduleHolder2 = cVar.c.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
                cVar.c.remove(moduleHolder2);
            }
            cVar.c.put(name, moduleHolder);
        }
        if (z) {
            ((k) iVar).endProcessPackage();
        }
        com.facebook.systrace.b.a(0L);
    }

    public void setCurrentActivity(Activity activity) {
        this.mCurrentActivityRef = new WeakReference<>(activity);
    }

    public Activity getCurrentActivity() {
        if (this.mCurrentActivityRef == null) {
            return null;
        }
        return this.mCurrentActivityRef.get();
    }

    public NativeModuleCallExceptionHandler getNativeModuleCallExceptionHandler() {
        return this.mNativeModuleCallExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleException(Exception exc) {
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler != null ? this.mNativeModuleCallExceptionHandler : this.mDevSupportManager;
        if (nativeModuleCallExceptionHandler != null) {
            nativeModuleCallExceptionHandler.handleException(exc);
        }
    }
}
