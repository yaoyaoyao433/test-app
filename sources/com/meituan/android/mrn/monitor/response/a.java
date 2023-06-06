package com.meituan.android.mrn.monitor.response;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.log.b;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.f;
import com.meituan.android.mrn.engine.k;
import com.meituan.metrics.laggy.respond.RespondLaggyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements LifecycleEventListener, b {
    public static ChangeQuickRedirect a;
    public WeakReference<k> b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private String g;
    private WeakReference<ReactContext> h;
    private WeakReference<Activity> i;
    private final d j;

    public a(ReactRootView reactRootView, String str, String str2, String str3) {
        Object[] objArr = {reactRootView, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc10072378e070d405cc44f84f4b848e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc10072378e070d405cc44f84f4b848e");
            return;
        }
        this.j = new d() { // from class: com.meituan.android.mrn.monitor.response.a.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.events.d
            public final void a(com.facebook.react.uimanager.events.b bVar) {
                Activity b;
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16217b3ecbcc5e88936ba5571728046e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16217b3ecbcc5e88936ba5571728046e");
                } else if (bVar instanceof f) {
                    String a2 = bVar.a();
                    if (("topTouchCancel".equals(a2) || "topTouchEnd".equals(a2)) && (b = a.this.b()) != null) {
                        RespondLaggyManager.getInstance().putJSDelayRunnable(b.hashCode(), bVar.f);
                    }
                }
            }
        };
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = RespondLaggyManager.getInstance().isLaggySamplerEnable();
        if (!this.f || reactRootView == null) {
            return;
        }
        reactRootView.setJsTouchProcessedListener(this);
    }

    public final void a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1088157e12583eb9133f7acd28dd010a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1088157e12583eb9133f7acd28dd010a");
        } else if (reactContext == null || !this.f) {
        } else {
            this.h = new WeakReference<>(reactContext);
            this.i = new WeakReference<>(reactContext.getCurrentActivity());
            reactContext.addLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.log.b
    public final void a(ReactRootView reactRootView, long j) {
        Object[] objArr = {reactRootView, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1cf217f9a938f38e6e42e921a80acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1cf217f9a938f38e6e42e921a80acc");
            return;
        }
        Activity b = b();
        if (b != null) {
            RespondLaggyManager.getInstance().cancelJSDelayRunnable(b.hashCode(), j);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        ReactContext reactContext;
        k kVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daeb8dc258516d3459ffebbf147b63e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daeb8dc258516d3459ffebbf147b63e1");
        } else if (a()) {
            Activity b = b();
            if (b != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5923b3a0a00d240809e8de8af5c3888", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5923b3a0a00d240809e8de8af5c3888");
                } else if (TextUtils.isEmpty(this.g) && this.b != null && (kVar = this.b.get()) != null && kVar.i != null) {
                    this.g = kVar.i.f;
                }
                RespondLaggyManager.getInstance().initJSLaggyModel(b.hashCode(), b.getClass().getName(), this.c, this.d, this.e, TextUtils.isEmpty(this.g) ? "0" : this.g);
            }
            if (this.h == null || (reactContext = this.h.get()) == null) {
                return;
            }
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(this.j);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        ReactContext reactContext;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1433fe9c796c816220a17b5f056782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1433fe9c796c816220a17b5f056782");
        } else if (!a() || this.h == null || (reactContext = this.h.get()) == null) {
        } else {
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().b(this.j);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        ReactContext reactContext;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a289b3542de98ef14bb81773d088082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a289b3542de98ef14bb81773d088082");
        } else if (this.h == null || (reactContext = this.h.get()) == null) {
        } else {
            reactContext.removeLifecycleEventListener(this);
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0baf7eb1e4af427806934d2c0b467317", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0baf7eb1e4af427806934d2c0b467317")).booleanValue();
        }
        Activity b = b();
        return (b == null || this.h == null || this.h.get() == null || b != this.h.get().getCurrentActivity()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe357264d5f0eb8a9bf6c83b32cc100", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe357264d5f0eb8a9bf6c83b32cc100");
        }
        if (this.i != null) {
            return this.i.get();
        }
        return null;
    }
}
