package com.meituan.msc.uimanager;

import android.content.Context;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThemedReactContext extends ReactContext {
    public static ChangeQuickRedirect a;
    private final ReactApplicationContext b;

    public ThemedReactContext(ReactApplicationContext reactApplicationContext, ReactQueueConfiguration reactQueueConfiguration, Context context) {
        super(context, reactApplicationContext.getRuntimeDelegate());
        Object[] objArr = {reactApplicationContext, reactQueueConfiguration, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5948d5f899f592185d6e22fefcf95af3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5948d5f899f592185d6e22fefcf95af3");
            return;
        }
        initializeMessageQueueThreads(reactQueueConfiguration);
        this.b = reactApplicationContext;
    }

    public ReactApplicationContext a() {
        return this.b;
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public UIManagerModule getUIManagerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360d6296000f2c66de478a28cf3ecf2b", RobustBitConfig.DEFAULT_VALUE) ? (UIManagerModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360d6296000f2c66de478a28cf3ecf2b") : this.b.getUIManagerModule();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public IRuntimeDelegate getRuntimeDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "963d004f320df277c7842ec877231316", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "963d004f320df277c7842ec877231316") : this.b.getRuntimeDelegate();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public UIImplementation getUIImplementation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c94210565040c7439d1897b87c8eee", RobustBitConfig.DEFAULT_VALUE) ? (UIImplementation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c94210565040c7439d1897b87c8eee") : this.b.getUIImplementation();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b22ffff23166b13d68b3d92d6bbd3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b22ffff23166b13d68b3d92d6bbd3c");
        } else {
            this.b.addLifecycleEventListener(lifecycleEventListener);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26cc9099e250e24b8a0cc7d30f01e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26cc9099e250e24b8a0cc7d30f01e1c");
        } else {
            this.b.removeLifecycleEventListener(lifecycleEventListener);
        }
    }
}
