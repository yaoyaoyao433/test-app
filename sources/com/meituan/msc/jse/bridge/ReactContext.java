package com.meituan.msc.jse.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.a;
import com.meituan.msc.jse.bridge.queue.MessageQueueThread;
import com.meituan.msc.jse.bridge.queue.MessageQueueThreadSpec;
import com.meituan.msc.jse.bridge.queue.QueueThreadExceptionHandler;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationImpl;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfigurationSpec;
import com.meituan.msc.jse.common.LifecycleState;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactContext extends ContextWrapper {
    private static final String TAG = "ReactContext";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean mDestroyed;
    @Nullable
    private NativeModuleCallExceptionHandler mExceptionHandlerWrapper;
    @Nullable
    private LayoutInflater mInflater;
    @Nullable
    private MessageQueueThread mJSMessageQueueThread;
    private ReactQueueConfiguration mLastQueueConfig;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners;
    private LifecycleState mLifecycleState;
    private UIManagerModule mModules;
    @Nullable
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private final IRuntimeDelegate mRuntimeDelegate;
    private UIImplementation mUIImplementation;
    @Nullable
    private MessageQueueThread mUiMessageQueueThread;

    public ReactContext(Context context, IRuntimeDelegate iRuntimeDelegate) {
        super(context);
        Object[] objArr = {context, iRuntimeDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7d713f657d4ba25e3c31e90c2d57cb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7d713f657d4ba25e3c31e90c2d57cb3");
            return;
        }
        this.mLifecycleEventListeners = new CopyOnWriteArraySet<>();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        this.mDestroyed = false;
        this.mModules = null;
        this.mUIImplementation = null;
        this.mRuntimeDelegate = iRuntimeDelegate;
    }

    public void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e116263db239d12d8a78f0523da2784a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e116263db239d12d8a78f0523da2784a");
            return;
        }
        if (this.mDestroyed) {
            ReactSoftException.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
        }
        initializeMessageQueueThreads(getConfiguration());
    }

    public ReactQueueConfiguration getConfiguration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77ea02d4551646f7e9f43faca0224476", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77ea02d4551646f7e9f43faca0224476") : ReactQueueConfigurationImpl.create(ReactQueueConfigurationSpec.createDefault(), new QueueThreadExceptionHandler() { // from class: com.meituan.msc.jse.bridge.ReactContext.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.msc.jse.bridge.queue.QueueThreadExceptionHandler
            public void handleException(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "68356203d6104b9864dd8d72029ec8df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "68356203d6104b9864dd8d72029ec8df");
                } else {
                    ReactContext.this.mRuntimeDelegate.handleException(exc);
                }
            }
        });
    }

    public ReactQueueConfiguration generateConfiguration(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        Object[] objArr = {messageQueueThreadSpec, messageQueueThreadSpec2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3a05f87df165dc9966f492e20cd376f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3a05f87df165dc9966f492e20cd376f");
        }
        ReactQueueConfigurationSpec.Builder builder = new ReactQueueConfigurationSpec.Builder();
        builder.setJSQueueThreadSpec(messageQueueThreadSpec);
        builder.setNativeModulesQueueThreadSpec(messageQueueThreadSpec2);
        return ReactQueueConfigurationImpl.create(builder.build(), new QueueThreadExceptionHandler() { // from class: com.meituan.msc.jse.bridge.ReactContext.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.msc.jse.bridge.queue.QueueThreadExceptionHandler
            public void handleException(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "840297dc53c73aeee8509f4e4274610a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "840297dc53c73aeee8509f4e4274610a");
                } else {
                    ReactContext.this.mRuntimeDelegate.handleException(exc);
                }
            }
        });
    }

    public void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        Object[] objArr = {reactQueueConfiguration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6011a26de2110db12870ec365d46f308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6011a26de2110db12870ec365d46f308");
        } else if (this.mUiMessageQueueThread != null || this.mNativeModulesMessageQueueThread != null || this.mJSMessageQueueThread != null) {
            throw new IllegalStateException("Message queue threads already initialized");
        } else {
            if (reactQueueConfiguration == null) {
                reactQueueConfiguration = getConfiguration();
            }
            this.mLastQueueConfig = reactQueueConfiguration;
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
        }
    }

    public ReactQueueConfiguration getLastQueueConfig() {
        return this.mLastQueueConfig;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bf704b1b4177a2f8dee1a515cb891c", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bf704b1b4177a2f8dee1a515cb891c");
        }
        if ("layout_inflater".equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.mInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "740bf6dc0d3ff64085ef1ff044fabcfc", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "740bf6dc0d3ff64085ef1ff044fabcfc") : (T) this.mRuntimeDelegate.getJSModule(cls);
    }

    public UIManagerModule getUIManagerModule() {
        return this.mModules;
    }

    public void setUIManagerModule(UIManagerModule uIManagerModule) {
        Object[] objArr = {uIManagerModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9ad162a92b43e5099f96ba7d1082596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9ad162a92b43e5099f96ba7d1082596");
            return;
        }
        this.mModules = uIManagerModule;
        setUIImplementation(this.mModules.b());
    }

    public void setUIImplementation(UIImplementation uIImplementation) {
        this.mUIImplementation = uIImplementation;
    }

    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    public boolean hasActiveCatalystInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f0884a30e4f93c6497ce62b11cda3c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f0884a30e4f93c6497ce62b11cda3c7")).booleanValue() : this.mRuntimeDelegate.hasActiveCatalystInstance();
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f39e25304de0eaa3a47e21e17c2d59a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f39e25304de0eaa3a47e21e17c2d59a1");
            return;
        }
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance()) {
            switch (this.mLifecycleState) {
                case BEFORE_CREATE:
                case BEFORE_RESUME:
                    return;
                case RESUMED:
                    runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.jse.bridge.ReactContext.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "569044872a3009d3c7af8e9c596a1ba6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "569044872a3009d3c7af8e9c596a1ba6");
                            } else if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
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
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac1089a154f7b4db7ff08da567b88b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac1089a154f7b4db7ff08da567b88b83");
        } else {
            this.mLifecycleEventListeners.remove(lifecycleEventListener);
        }
    }

    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1852e8e391a13c955af861f97aa90659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1852e8e391a13c955af861f97aa90659");
            return;
        }
        this.mLifecycleState = LifecycleState.RESUMED;
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

    public void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa0e1553a5d2ed2f6f8c19e5ccdf48bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa0e1553a5d2ed2f6f8c19e5ccdf48bd");
            return;
        }
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abd238a94c53f675ea1d557df981f766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abd238a94c53f675ea1d557df981f766");
            return;
        }
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
    }

    @ThreadConfined(ThreadConfined.UI)
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2909d422b4e7113d52c424df01034ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2909d422b4e7113d52c424df01034ed");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        onHostDestroy();
    }

    public void assertOnUiQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "950173dcb4f6902d1ba00bb913781303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "950173dcb4f6902d1ba00bb913781303");
        } else {
            ((MessageQueueThread) a.a(this.mUiMessageQueueThread)).assertIsOnThread();
        }
    }

    public boolean isOnUiQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27a0b69fa310e55b3b61618666b044b9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27a0b69fa310e55b3b61618666b044b9")).booleanValue() : ((MessageQueueThread) a.a(this.mUiMessageQueueThread)).isOnThread();
    }

    public void runOnUiQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5e7a3b03455f763aa7714d4b0ffc0f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5e7a3b03455f763aa7714d4b0ffc0f3");
        } else {
            ((MessageQueueThread) a.a(this.mUiMessageQueueThread)).runOnQueue(runnable);
        }
    }

    public void assertOnNativeModulesQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef277363e711300ca89e90a08d26d33c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef277363e711300ca89e90a08d26d33c");
        } else {
            ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
        }
    }

    public void assertOnNativeModulesQueueThread(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f650ac7061945636b4f39741f8b5a69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f650ac7061945636b4f39741f8b5a69");
        } else {
            ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).assertIsOnThread(str);
        }
    }

    public boolean isOnNativeModulesQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e27302a923a8489a5e47b62386af9b60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e27302a923a8489a5e47b62386af9b60")).booleanValue() : ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).isOnThread();
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78ba632442d3527778f335124861a73f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78ba632442d3527778f335124861a73f");
        } else {
            ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
        }
    }

    public void removeCallbacks(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56882c0a781987429be3f167873bfaf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56882c0a781987429be3f167873bfaf6");
        } else {
            ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).removeCallbacks(runnable);
        }
    }

    public void runOnNativeModulesQueueThreadDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d496b147a1c067ed3f79a194ac524a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d496b147a1c067ed3f79a194ac524a37");
        } else {
            ((MessageQueueThread) a.a(this.mNativeModulesMessageQueueThread)).runOnQueueDelay(runnable, j);
        }
    }

    public void assertOnJSQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d2f60ae229321b6cdde4127ae85ed8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d2f60ae229321b6cdde4127ae85ed8f");
        } else {
            ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).assertIsOnThread();
        }
    }

    public boolean isOnJSQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "161032248a8c48b78704852c298cda31", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "161032248a8c48b78704852c298cda31")).booleanValue() : ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).isOnThread();
    }

    public void runOnJSQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70f3c66f0cc07c36fed1a34b97a20ae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70f3c66f0cc07c36fed1a34b97a20ae0");
        } else {
            ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).runOnQueue(runnable);
        }
    }

    public void runOnJSQueueThreadDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45545f198761d3e89559cb25aad037c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45545f198761d3e89559cb25aad037c2");
        } else {
            ((MessageQueueThread) a.a(this.mJSMessageQueueThread)).runOnQueueDelay(runnable, j);
        }
    }

    public Looper getJSLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8b84f65bf6690b9664c969f5bae2c85", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8b84f65bf6690b9664c969f5bae2c85");
        }
        if (this.mJSMessageQueueThread != null) {
            return this.mJSMessageQueueThread.getLooper();
        }
        return null;
    }

    public Looper getNativeModulesLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5526b706c255a51f798e4c988e1b279", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5526b706c255a51f798e4c988e1b279");
        }
        if (this.mNativeModulesMessageQueueThread != null) {
            return this.mNativeModulesMessageQueueThread.getLooper();
        }
        return null;
    }

    public void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41698f0993a6ff62b49069cad04d21f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41698f0993a6ff62b49069cad04d21f8");
        } else {
            this.mRuntimeDelegate.handleException(exc);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class ExceptionHandlerWrapper implements NativeModuleCallExceptionHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ExceptionHandlerWrapper() {
        }

        @Override // com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler
        public void handleException(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "177e76a77276c7251120d44a9bb82034", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "177e76a77276c7251120d44a9bb82034");
            } else {
                ReactContext.this.handleException(exc);
            }
        }
    }

    public NativeModuleCallExceptionHandler getExceptionHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd080dd59db6d7476dd11755f95a11c", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeModuleCallExceptionHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd080dd59db6d7476dd11755f95a11c");
        }
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    @Nullable
    public Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac79362a01081e8bb2cab40c85d84f57", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac79362a01081e8bb2cab40c85d84f57") : this.mRuntimeDelegate.getCurrentActivity();
    }

    public IRuntimeDelegate getRuntimeDelegate() {
        return this.mRuntimeDelegate;
    }
}
