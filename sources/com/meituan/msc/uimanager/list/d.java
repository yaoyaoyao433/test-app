package com.meituan.msc.uimanager.list;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.jse.common.LifecycleState;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends ReactApplicationContext {
    public static ChangeQuickRedirect a;
    private ReactApplicationContext b;
    private e c;

    public d(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext.getBaseContext(), reactApplicationContext.getRuntimeDelegate());
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e5d1d5fdccd2c6d4061f879d8bc72c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e5d1d5fdccd2c6d4061f879d8bc72c");
        } else {
            this.b = reactApplicationContext;
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactApplicationContext, com.meituan.msc.jse.bridge.ReactContext
    public final IRuntimeDelegate getRuntimeDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b7800e8cc920703ab6bcd2254e32c5", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b7800e8cc920703ab6bcd2254e32c5") : this.b.getRuntimeDelegate();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final ReactQueueConfiguration getConfiguration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f93f0408677915b3b8977d276cdaed", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f93f0408677915b3b8977d276cdaed") : this.b.getConfiguration();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final ReactQueueConfiguration getLastQueueConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa043a603b80db9e2ef65a2a34ccef4e", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa043a603b80db9e2ef65a2a34ccef4e") : this.b.getLastQueueConfig();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14035b9f23369b59d1c2fe126aebda8", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14035b9f23369b59d1c2fe126aebda8") : this.b.getSystemService(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf60ac11f0a490925ee9b18423326846", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf60ac11f0a490925ee9b18423326846") : (T) this.b.getJSModule(cls);
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final UIManagerModule getUIManagerModule() {
        return this.c;
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void setUIManagerModule(UIManagerModule uIManagerModule) {
        this.c = (e) uIManagerModule;
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final boolean hasActiveCatalystInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62cb6d3bd493a35ec25de7541162425d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62cb6d3bd493a35ec25de7541162425d")).booleanValue() : this.b.hasActiveCatalystInstance();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final LifecycleState getLifecycleState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc40957f0cec6eeefa2e8263c71b134", RobustBitConfig.DEFAULT_VALUE) ? (LifecycleState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc40957f0cec6eeefa2e8263c71b134") : this.b.getLifecycleState();
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    @Nullable
    public final Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d19236f06c9f1ce5be144de936f003", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d19236f06c9f1ce5be144de936f003") : this.b.getCurrentActivity();
    }

    @Override // android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Object[] objArr = {componentCallbacks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a971bd4b36c789b738ad8ff2283370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a971bd4b36c789b738ad8ff2283370");
        } else {
            this.b.registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Object[] objArr = {componentCallbacks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47aeb7ebdd0287c5b6e189f3d2883351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47aeb7ebdd0287c5b6e189f3d2883351");
        } else {
            this.b.unregisterComponentCallbacks(componentCallbacks);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777b06fdeb9613ff1b027d05b30fea56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777b06fdeb9613ff1b027d05b30fea56");
        } else {
            this.b.addLifecycleEventListener(lifecycleEventListener);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public final void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        Object[] objArr = {lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129c604aae2caa5c129489dce22610ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129c604aae2caa5c129489dce22610ab");
        } else {
            this.b.removeLifecycleEventListener(lifecycleEventListener);
        }
    }
}
