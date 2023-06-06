package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactContext extends ContextWrapper {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
    private static final String TAG = "ReactContext";
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners;
    @Nullable
    private CatalystInstance mCatalystInstance;
    @Nullable
    private WeakReference<Activity> mCurrentActivity;
    private volatile boolean mDestroyed;
    @Nullable
    private NativeModuleCallExceptionHandler mExceptionHandlerWrapper;
    @Nullable
    private LayoutInflater mInflater;
    @Nullable
    private MessageQueueThread mJSMessageQueueThread;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners;
    private LifecycleState mLifecycleState;
    @Nullable
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    @Nullable
    private MessageQueueThread mNativeModulesMessageQueueThread;
    @Nullable
    private MessageQueueThread mUiMessageQueueThread;
    private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners;

    public boolean isBridgeless() {
        return false;
    }

    public ReactContext(Context context) {
        super(context);
        this.mLifecycleEventListeners = new CopyOnWriteArraySet<>();
        this.mActivityEventListeners = new CopyOnWriteArraySet<>();
        this.mWindowFocusEventListeners = new CopyOnWriteArraySet<>();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        this.mDestroyed = false;
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        }
        if (this.mCatalystInstance != null) {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        if (this.mDestroyed) {
            ReactSoftException.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
        }
        this.mCatalystInstance = catalystInstance;
        initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
    }

    public void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        if (this.mUiMessageQueueThread != null || this.mNativeModulesMessageQueueThread != null || this.mJSMessageQueueThread != null) {
            throw new IllegalStateException("Message queue threads already initialized");
        }
        this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
        this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
        this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
    }

    public void resetPerfStats() {
        if (this.mNativeModulesMessageQueueThread != null) {
            this.mNativeModulesMessageQueueThread.resetPerfStats();
        }
        if (this.mJSMessageQueueThread != null) {
            this.mJSMessageQueueThread.resetPerfStats();
        }
    }

    public void setNativeModuleCallExceptionHandler(@Nullable NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }

    private void raiseCatalystInstanceMissingException() {
        throw new IllegalStateException(this.mDestroyed ? LATE_NATIVE_MODULE_EXCEPTION_MESSAGE : EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.mInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            if (this.mDestroyed) {
                throw new IllegalStateException(LATE_JS_ACCESS_EXCEPTION_MESSAGE);
            }
            throw new IllegalStateException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
        }
        return (T) this.mCatalystInstance.getJSModule(cls);
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    public CatalystInstance getCatalystInstance() {
        return (CatalystInstance) a.a(this.mCatalystInstance);
    }

    public boolean hasActiveCatalystInstance() {
        return (this.mCatalystInstance == null || this.mCatalystInstance.isDestroyed()) ? false : true;
    }

    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance()) {
            switch (this.mLifecycleState) {
                case BEFORE_CREATE:
                case BEFORE_RESUME:
                    return;
                case RESUMED:
                    runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.bridge.ReactContext.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                                try {
                                    lifecycleEventListener.onHostResume();
                                } catch (RuntimeException e) {
                                    ReactContext.this.handleException(e);
                                }
                            }
                        }
                    });
                    return;
                default:
                    throw new IllegalStateException("Unhandled lifecycle state.");
            }
        }
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void addWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.add(windowFocusChangeListener);
    }

    public void removeWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.remove(windowFocusChangeListener);
    }

    public void onHostResume(@Nullable Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onNewIntent(@Nullable Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = new WeakReference<>(null);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        if (this.mCatalystInstance != null) {
            this.mCatalystInstance.destroy();
            if (com.facebook.react.config.a.e) {
                this.mCatalystInstance = null;
            }
        }
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void onWindowFocusChange(boolean z) {
        UiThreadUtil.assertOnUiThread();
        Iterator<WindowFocusChangeListener> it = this.mWindowFocusEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onWindowFocusChange(z);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void assertOnUiQueueThread() {
        ((MessageQueueThread) a.a(this.mUiMessageQueueThread)).assertIsOnThread();
    }

    public boolean isOnUiQueueThread() {
        return ((MessageQueueThread) a.a(this.mUiMessageQueueThread)).isOnThread();
    }

    public void runOnUiQueueThread(Runnable runnable) {
        ((MessageQueueThread) a.a(this.mUiMessageQueueThread)).runOnQueue(runnable);
    }

    public void assertOnNativeModulesQueueThread() {
        ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread(String str) {
        ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).assertIsOnThread(str);
    }

    public boolean isOnNativeModulesQueueThread() {
        return ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).isOnThread();
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
    }

    public void assertOnJSQueueThread() {
        ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).assertIsOnThread();
    }

    public boolean isOnJSQueueThread() {
        return ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).isOnThread();
    }

    public void runOnJSQueueThread(Runnable runnable) {
        ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).runOnQueue(runnable);
    }

    public <T> Future<T> callOnJSQueueThread(Callable<T> callable) {
        return ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).callOnQueue(callable);
    }

    public void handleException(Exception exc) {
        boolean z = this.mCatalystInstance != null;
        boolean z2 = z && !this.mCatalystInstance.isDestroyed();
        boolean z3 = this.mNativeModuleCallExceptionHandler != null;
        if (z2 && z3) {
            this.mNativeModuleCallExceptionHandler.handleException(exc);
            return;
        }
        StringBuilder sb = new StringBuilder("Unable to handle Exception - catalystInstanceVariableExists: ");
        sb.append(z);
        sb.append(" - isCatalystInstanceAlive: ");
        sb.append(!z2);
        sb.append(" - hasExceptionHandler: ");
        sb.append(z3);
        com.facebook.common.logging.a.d("ReactNative", sb.toString(), exc);
        throw new IllegalStateException(exc);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ExceptionHandlerWrapper implements NativeModuleCallExceptionHandler {
        public ExceptionHandlerWrapper() {
        }

        @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
        public void handleException(Exception exc) {
            ReactContext.this.handleException(exc);
        }
    }

    public NativeModuleCallExceptionHandler getExceptionHandler() {
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    public boolean hasCurrentActivity() {
        return (this.mCurrentActivity == null || this.mCurrentActivity.get() == null) ? false : true;
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        a.a(currentActivity);
        currentActivity.startActivityForResult(intent, i, bundle);
        return true;
    }

    @Nullable
    public Activity getCurrentActivity() {
        if (this.mCurrentActivity == null) {
            return null;
        }
        return this.mCurrentActivity.get();
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mCatalystInstance.getJavaScriptContextHolder();
    }

    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        if (!hasActiveCatalystInstance()) {
            throw new IllegalStateException("Unable to retrieve a JSIModule if CatalystInstance is not active.");
        }
        return this.mCatalystInstance.getJSIModule(jSIModuleType);
    }

    @Nullable
    public String getSourceURL() {
        return this.mCatalystInstance.getSourceURL(null);
    }

    public void setCurrentActivity(Activity activity) {
        this.mCurrentActivity = new WeakReference<>(activity);
    }
}
