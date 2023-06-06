package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements LifecycleEventListener, OnBatchCompleteListener, UIManager {
    private static final boolean DEBUG;
    public static final String NAME = "UIManager";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.c mEventDispatcher;
    private final List<ax> mListeners;
    private final b mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final as mUIImplementation;
    @Nullable
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final bd mViewManagerRegistry;
    private long prevTouchStartTime;
    private int prevTouchViewTag;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        @Nullable
        String a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        @Nullable
        ViewManager a(String str);

        List<String> a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    static {
        com.facebook.debug.holder.c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.f;
        DEBUG = false;
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, c cVar, int i) {
        this(reactApplicationContext, cVar, new at(), i);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new at(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, c cVar, at atVar, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new b();
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        this.prevTouchStartTime = -1L;
        this.prevTouchViewTag = -1;
        d.a(reactApplicationContext);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.c(reactApplicationContext);
        this.mModuleConstants = createConstants(cVar);
        this.mCustomDirectEvents = av.b();
        this.mViewManagerRegistry = new bd(cVar);
        this.mUIImplementation = at.a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, at atVar, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new b();
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        this.prevTouchStartTime = -1L;
        this.prevTouchViewTag = -1;
        d.a(reactApplicationContext);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.c(reactApplicationContext);
        this.mCustomDirectEvents = new HashMap();
        this.mModuleConstants = createConstants(list, null, this.mCustomDirectEvents);
        this.mViewManagerRegistry = new bd(list);
        this.mUIImplementation = at.a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public as getUIImplementation() {
        return this.mUIImplementation;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.a.register(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.j();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.k();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        final com.facebook.react.uimanager.events.c cVar = this.mEventDispatcher;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.c.2
            @Override // java.lang.Runnable
            public final void run() {
                cVar.c();
            }
        });
        this.mUIImplementation.m();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        bg.a().a();
        bc.a();
    }

    @Deprecated
    public bd getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public ViewManager getViewManagerByName(String str) {
        return this.mViewManagerRegistry.a(str);
    }

    private static Map<String, Object> createConstants(c cVar) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.facebook.systrace.b.a(0L, "CreateUIManagerConstants");
        Boolean bool = Boolean.TRUE;
        try {
            Map<String, Object> c2 = av.c();
            c2.put("ViewManagerNames", cVar.a());
            c2.put("LazyViewManagersEnabled", Boolean.TRUE);
            return c2;
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.facebook.systrace.b.a(0L, "CreateUIManagerConstants");
        Boolean bool = Boolean.FALSE;
        try {
            return aw.a(list, map, map2);
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                arrayMap.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(arrayMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @Nullable
    public WritableMap getConstantsForViewManager(@Nullable String str) {
        if (this.mViewManagerConstantsCache != null && this.mViewManagerConstantsCache.containsKey(str)) {
            WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
            int i = this.mViewManagerConstantsCacheSize - 1;
            this.mViewManagerConstantsCacheSize = i;
            if (i <= 0) {
                this.mViewManagerConstantsCache = null;
            }
            return writableMap;
        }
        return computeConstantsForViewManager(str);
    }

    @Nullable
    private WritableMap computeConstantsForViewManager(@Nullable String str) {
        ViewManager b2 = str != null ? this.mUIImplementation.b(str) : null;
        if (b2 == null) {
            return null;
        }
        com.facebook.systrace.b.a(0L, "UIManagerModule.getConstantsForViewManager");
        b2.getName();
        Boolean bool = Boolean.TRUE;
        try {
            Map<String, Object> a2 = aw.a(b2, null, null, null, this.mCustomDirectEvents);
            if (a2 != null) {
                return Arguments.makeNativeMap(a2);
            }
            return null;
        } finally {
            com.facebook.systrace.b.a(0L);
        }
    }

    public a getDirectEventNamesResolver() {
        return new a() { // from class: com.facebook.react.uimanager.UIManagerModule.1
            @Override // com.facebook.react.uimanager.UIManagerModule.a
            @Nullable
            public final String a(String str) {
                Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
                return map != null ? (String) map.get("registrationName") : str;
            }
        };
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.e();
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.f();
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        int a2 = com.facebook.react.uimanager.common.a.a(i);
        if (a2 != 2) {
            this.mUIImplementation.a(i, new ag(readableMap));
            return;
        }
        UIManager a3 = au.a(getReactApplicationContext(), a2, true);
        if (a3 != null) {
            a3.synchronouslyUpdateViewOnUIThread(i, readableMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, @Nullable String str) {
        com.facebook.systrace.a.a(0L, "UIManagerModule.addRootView");
        int a2 = ae.a();
        ad adVar = (ad) t;
        ao aoVar = new ao(getReactApplicationContext(), t.getContext(), adVar.getSurfaceID());
        if (t instanceof ad) {
            aoVar.a(adVar);
        }
        this.mUIImplementation.a((as) t, a2, aoVar);
        com.facebook.systrace.a.a(0L);
        return a2;
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.e(i);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.c(i, i2, i3);
    }

    public void setViewLocalData(final int i, final Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.2
            @Override // com.facebook.react.bridge.GuardedRunnable
            public final void runGuarded() {
                UIManagerModule.this.mUIImplementation.a(i, obj);
            }
        });
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            com.facebook.common.logging.a.a("ReactNative", "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap);
            com.facebook.debug.holder.c.a();
            com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.f;
        }
        this.mUIImplementation.b(i, str, i2, readableMap);
    }

    @ReactMethod
    public void onNativeEventProcessed(ReadableMap readableMap) {
        if (readableMap.hasKey("eventTime") && readableMap.hasKey("viewTag")) {
            long parseLong = Long.parseLong(readableMap.getString("eventTime"));
            int i = readableMap.getInt("viewTag");
            this.prevTouchStartTime = parseLong;
            this.prevTouchViewTag = i;
            return;
        }
        this.prevTouchViewTag = -1;
        this.prevTouchStartTime = -1L;
    }

    @ReactMethod
    public void updateView(final int i, String str, final ReadableMap readableMap) {
        final UIManager a2;
        if (DEBUG) {
            com.facebook.common.logging.a.a("ReactNative", "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap);
            com.facebook.debug.holder.c.a();
            com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.f;
        }
        int a3 = com.facebook.react.uimanager.common.a.a(i);
        if (a3 == 2) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (!reactApplicationContext.hasActiveCatalystInstance() || (a2 = au.a(reactApplicationContext, a3, true)) == null) {
                return;
            }
            reactApplicationContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.UIManagerModule.3
                @Override // java.lang.Runnable
                public final void run() {
                    a2.synchronouslyUpdateViewOnUIThread(i, readableMap);
                }
            });
            return;
        }
        this.mUIImplementation.a(i, str, readableMap);
    }

    @ReactMethod
    public void manageChildren(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        if (DEBUG) {
            com.facebook.common.logging.a.a("ReactNative", "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5);
            com.facebook.debug.holder.c.a();
            com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.f;
        }
        this.mUIImplementation.a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            com.facebook.common.logging.a.a("ReactNative", "(UIManager.setChildren) tag: " + i + ", children: " + readableArray);
            com.facebook.debug.holder.c.a();
            com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.f;
        }
        this.mUIImplementation.d(i, readableArray);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.b(i, i2);
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.g(i);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.a(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.b(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.a(i, i2, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.a(i, callback, callback2);
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.a(i, Math.round(w.a((float) readableArray.getDouble(0))), Math.round(w.a((float) readableArray.getDouble(1))), callback);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.a(i, i2, callback);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.a(i, z);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.h();
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, @Nullable ReadableArray readableArray) {
        UIManager a2 = au.a(getReactApplicationContext(), com.facebook.react.uimanager.common.a.a(i), true);
        if (a2 == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            a2.dispatchCommand(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            a2.dispatchCommand(i, dynamic.asString(), readableArray);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.a(i, i2, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.a(i, str, readableArray);
    }

    @ReactMethod
    @Deprecated
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.a(i, readableArray, callback, callback2);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.i();
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.a(z);
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.a(readableMap, callback);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId++;
        com.facebook.systrace.b.a(0L, "onBatchCompleteUI");
        for (ax axVar : this.mListeners) {
            axVar.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.a(i, this.prevTouchStartTime, this.prevTouchViewTag);
            this.prevTouchStartTime = -1L;
            this.prevTouchViewTag = -1;
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable com.facebook.react.uimanager.debug.a aVar) {
        this.mUIImplementation.a(aVar);
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.c getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int a2 = com.facebook.react.uimanager.common.a.a(i);
        if (a2 != 2) {
            this.mUIImplementation.c(i, i2);
            return;
        }
        UIManager a3 = au.a(getReactApplicationContext(), a2, true);
        if (a3 != null) {
            a3.sendAccessibilityEvent(i, i2);
        }
    }

    public void addUIBlock(ar arVar) {
        this.mUIImplementation.a(arVar);
    }

    public void prependUIBlock(ar arVar) {
        this.mUIImplementation.b(arVar);
    }

    public void addUIManagerListener(ax axVar) {
        this.mListeners.add(axVar);
    }

    public void removeUIManagerListener(ax axVar) {
        this.mListeners.remove(axVar);
    }

    public void invalidateNodeLayout(int i) {
        af d = this.mUIImplementation.d(i);
        if (d == null) {
            com.facebook.common.logging.a.c("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
            return;
        }
        d.dirty();
        this.mUIImplementation.h(-1);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(final int i, final int i2, final int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.4
            @Override // com.facebook.react.bridge.GuardedRunnable
            public final void runGuarded() {
                UIManagerModule.this.mUIImplementation.b(i, i2, i3);
                UIManagerModule.this.mUIImplementation.h(-1);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        private b() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            if (i >= 60) {
                bg.a().a();
            }
        }
    }

    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.d().a().d(i);
    }

    public void addViewManagers(List<ViewManager> list) {
        if (list == null) {
            return;
        }
        for (ViewManager viewManager : list) {
            Map<String, Object> a2 = aw.a(viewManager, null, null, null, this.mCustomDirectEvents);
            if (!a2.isEmpty()) {
                this.mModuleConstants.put(viewManager.getName(), a2);
            }
        }
        this.mUIImplementation.a(list);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(com.facebook.react.common.c.a("bubblingEventTypes", av.a(), "directEventTypes", av.b()));
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        return i % 10 == 1 ? i : this.mUIImplementation.i(i);
    }
}
