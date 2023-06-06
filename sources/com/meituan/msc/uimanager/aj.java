package com.meituan.msc.uimanager;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.queue.MessageQueueThreadSpec;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.jse.common.LifecycleState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aj extends ThemedReactContext {
    public static ChangeQuickRedirect b;
    public ThemedReactContext c;

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
    }

    public aj(ReactApplicationContext reactApplicationContext, ReactQueueConfiguration reactQueueConfiguration, Context context) {
        super(reactApplicationContext, null, context);
        Object[] objArr = {reactApplicationContext, null, context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f637b417382bc008df6d06fc7fd3b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f637b417382bc008df6d06fc7fd3b0");
        }
    }

    @Override // com.meituan.msc.uimanager.ThemedReactContext
    public final ReactApplicationContext a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ecf73f76d9c2d075b8fe22f9a4fc881", RobustBitConfig.DEFAULT_VALUE) ? (ReactApplicationContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ecf73f76d9c2d075b8fe22f9a4fc881") : this.c.a();
    }

    @Override // com.meituan.msc.uimanager.ThemedReactContext, com.meituan.msc.jse.bridge.ReactContext
    public final UIManagerModule getUIManagerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6606c2a612de19b870f34b8cb153d7", RobustBitConfig.DEFAULT_VALUE) ? (UIManagerModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6606c2a612de19b870f34b8cb153d7") : this.c.getUIManagerModule();
    }

    @Override // com.meituan.msc.uimanager.ThemedReactContext, com.meituan.msc.jse.bridge.ReactContext
    public final IRuntimeDelegate getRuntimeDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f1290a5f2fccc48dcf1c7eb9208790", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f1290a5f2fccc48dcf1c7eb9208790") : this.c.getRuntimeDelegate();
    }

    @Override // com.meituan.msc.uimanager.ThemedReactContext, com.meituan.msc.jse.bridge.ReactContext
    public final UIImplementation getUIImplementation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a19da6aab7cb32074698632b34b3ec35", RobustBitConfig.DEFAULT_VALUE) ? (UIImplementation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a19da6aab7cb32074698632b34b3ec35") : this.c.getUIImplementation();
    }

    @Override // com.meituan.msc.uimanager.ThemedReactContext, com.meituan.msc.jse.bridge.ReactContext
    public final void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e840693b7b1d91e99bc1bf3220f5f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e840693b7b1d91e99bc1bf3220f5f9e");
        } else {
            this.c.addLifecycleEventListener(lifecycleEventListener);
        }
    }

    @Override // com.meituan.msc.uimanager.ThemedReactContext, com.meituan.msc.jse.bridge.ReactContext
    public final void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb334cb674dd25506b31539923b7aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb334cb674dd25506b31539923b7aeb");
        } else {
            this.c.removeLifecycleEventListener(lifecycleEventListener);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final ReactQueueConfiguration getConfiguration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76f2bb6ee8df6ad17719e4300128413", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76f2bb6ee8df6ad17719e4300128413") : this.c.getConfiguration();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final ReactQueueConfiguration generateConfiguration(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        Object[] objArr = {messageQueueThreadSpec, messageQueueThreadSpec2};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a3156067de49a1dadde0c835167a3b", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a3156067de49a1dadde0c835167a3b") : this.c.generateConfiguration(messageQueueThreadSpec, messageQueueThreadSpec2);
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final ReactQueueConfiguration getLastQueueConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0bcb7abc314ded1e1ea765f535ea03", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0bcb7abc314ded1e1ea765f535ea03") : this.c.getLastQueueConfig();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c685b2044b2d4cd5a5fb29e15a7e5a0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c685b2044b2d4cd5a5fb29e15a7e5a0") : getBaseContext().getSystemService(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551de6dc4ef6596df8fd418a14b4216c", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551de6dc4ef6596df8fd418a14b4216c") : (T) this.c.getJSModule(cls);
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void setUIManagerModule(UIManagerModule uIManagerModule) {
        Object[] objArr = {uIManagerModule};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01fd92c8d8d96f6b01fd0e8c28ee2d84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01fd92c8d8d96f6b01fd0e8c28ee2d84");
        } else {
            this.c.setUIManagerModule(uIManagerModule);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void setUIImplementation(UIImplementation uIImplementation) {
        Object[] objArr = {uIImplementation};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba74fcd27e441e31d9bc0cb37fe67d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba74fcd27e441e31d9bc0cb37fe67d1");
        } else {
            this.c.setUIImplementation(uIImplementation);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final boolean hasActiveCatalystInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cfc45c5c4be766745e0086007bc4a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cfc45c5c4be766745e0086007bc4a1")).booleanValue() : this.c.hasActiveCatalystInstance();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final LifecycleState getLifecycleState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f249bb8711fd0a5672473ce21630eb", RobustBitConfig.DEFAULT_VALUE) ? (LifecycleState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f249bb8711fd0a5672473ce21630eb") : this.c.getLifecycleState();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf2440d08184fb2b5570d5d82d79b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf2440d08184fb2b5570d5d82d79b68");
        } else {
            this.c.onHostResume();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd841b55bb02dd35bdba79d6d0f1785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd841b55bb02dd35bdba79d6d0f1785");
        } else {
            this.c.onHostPause();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b493a87fa844e372d0b0ccdceab2397d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b493a87fa844e372d0b0ccdceab2397d");
        } else {
            this.c.onHostDestroy();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f918147bdf62d9893fe17d7dfd28b059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f918147bdf62d9893fe17d7dfd28b059");
        } else {
            this.c.destroy();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void assertOnUiQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f779def38adb2511e6f9b9d06be409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f779def38adb2511e6f9b9d06be409");
        } else {
            this.c.assertOnUiQueueThread();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final boolean isOnUiQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd7d2a6a0e4bbc37b6b73e5449c13bf0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd7d2a6a0e4bbc37b6b73e5449c13bf0")).booleanValue() : this.c.isOnUiQueueThread();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void runOnUiQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb5e077364ffc24632c44040cbadd89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb5e077364ffc24632c44040cbadd89");
        } else {
            this.c.runOnUiQueueThread(runnable);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void assertOnNativeModulesQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a10831f407df0c54d0c7c41b156ef54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a10831f407df0c54d0c7c41b156ef54");
        } else {
            this.c.assertOnNativeModulesQueueThread();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void assertOnNativeModulesQueueThread(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b3155a91ace408fb1befc6abc0c2a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b3155a91ace408fb1befc6abc0c2a4");
        } else {
            this.c.assertOnNativeModulesQueueThread(str);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final boolean isOnNativeModulesQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c81d50e535d0f0a191f87852c1dc63", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c81d50e535d0f0a191f87852c1dc63")).booleanValue() : this.c.isOnNativeModulesQueueThread();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void runOnNativeModulesQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322b0e5a843005e19482235bf5d92d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322b0e5a843005e19482235bf5d92d49");
        } else {
            this.c.runOnNativeModulesQueueThread(runnable);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void removeCallbacks(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9963e0fa55f7fdc66668230a3e391d31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9963e0fa55f7fdc66668230a3e391d31");
        } else {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void runOnNativeModulesQueueThreadDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce26f1b1b2520d34fa87cc8093e1263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce26f1b1b2520d34fa87cc8093e1263");
        } else {
            this.c.runOnNativeModulesQueueThreadDelay(runnable, j);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void assertOnJSQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f40eb88814a08391deb65297dfe3c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f40eb88814a08391deb65297dfe3c99");
        } else {
            this.c.assertOnJSQueueThread();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final boolean isOnJSQueueThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bb0a93abdeaf73180818d9cd88ad63", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bb0a93abdeaf73180818d9cd88ad63")).booleanValue() : this.c.isOnJSQueueThread();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void runOnJSQueueThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f77e8bdb7fdec78c165f4e27efb473d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f77e8bdb7fdec78c165f4e27efb473d");
        } else {
            this.c.runOnJSQueueThread(runnable);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void runOnJSQueueThreadDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4af68abe0df12e776c270d5f7b283a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4af68abe0df12e776c270d5f7b283a");
        } else {
            this.c.runOnJSQueueThreadDelay(runnable, j);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff70ae9dd6f680bed694569706e5ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff70ae9dd6f680bed694569706e5ad7");
        } else {
            this.c.handleException(exc);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final NativeModuleCallExceptionHandler getExceptionHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d88a806ccb2a508fcf5aadc83161280", RobustBitConfig.DEFAULT_VALUE) ? (NativeModuleCallExceptionHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d88a806ccb2a508fcf5aadc83161280") : this.c.getExceptionHandler();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    @Nullable
    public final Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97b631b81bad069dc4c469105624dcb", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97b631b81bad069dc4c469105624dcb") : this.c.getCurrentActivity();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37992452b65188fafc76dfd6dd42f50c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37992452b65188fafc76dfd6dd42f50c");
        } else {
            super.initialize();
        }
    }
}
