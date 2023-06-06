package com.facebook.react.modules.core;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
/* compiled from: ProGuard */
@ReactModule(name = TimingModule.NAME)
/* loaded from: classes.dex */
public final class TimingModule extends ReactContextBaseJavaModule implements LifecycleEventListener, com.facebook.react.jstasks.c {
    public static final String NAME = "Timing";
    private boolean mEnableBackgroundTimer;
    private final d mJavaTimerManager;

    @Override // com.facebook.react.bridge.NativeModule
    public final String getName() {
        return NAME;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements c {
        public a() {
        }

        @Override // com.facebook.react.modules.core.c
        public final void a(WritableArray writableArray) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public final void a(double d) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d);
            }
        }
    }

    public TimingModule(ReactApplicationContext reactApplicationContext, com.facebook.react.devsupport.interfaces.b bVar) {
        super(reactApplicationContext);
        this.mEnableBackgroundTimer = false;
        this.mJavaTimerManager = new d(reactApplicationContext, new a(), g.b(), bVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        com.facebook.react.jstasks.b.a(getReactApplicationContext()).a.add(this);
    }

    @ReactMethod
    public final void createTimer(double d, double d2, double d3, boolean z) {
        int i = (int) d;
        int i2 = (int) d2;
        d dVar = this.mJavaTimerManager;
        long max = Math.max(0L, (((long) d3) - System.currentTimeMillis()) + i2);
        if (i2 == 0 && !z) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(i);
            dVar.b.a(createArray);
            return;
        }
        dVar.createTimer(i, max, i2, z);
    }

    @ReactMethod
    public final void deleteTimer(double d) {
        this.mJavaTimerManager.deleteTimer((int) d);
    }

    @ReactMethod
    public final void setSendIdleEvents(boolean z) {
        this.mJavaTimerManager.setSendIdleEvents(z);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        d dVar = this.mJavaTimerManager;
        dVar.h.set(false);
        dVar.c();
        dVar.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        if (this.mEnableBackgroundTimer) {
            return;
        }
        d dVar = this.mJavaTimerManager;
        dVar.h.set(true);
        dVar.d();
        dVar.b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        d dVar = this.mJavaTimerManager;
        dVar.d();
        dVar.b();
    }

    @Override // com.facebook.react.jstasks.c
    public final void onHeadlessJsTaskStart(int i) {
        d dVar = this.mJavaTimerManager;
        if (dVar.i.getAndSet(true)) {
            return;
        }
        dVar.c();
        dVar.a();
    }

    @Override // com.facebook.react.jstasks.c
    public final void onHeadlessJsTaskFinish(int i) {
        d dVar = this.mJavaTimerManager;
        if (com.facebook.react.jstasks.b.a(dVar.a).a()) {
            return;
        }
        dVar.i.set(false);
        dVar.d();
        dVar.b();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void onCatalystInstanceDestroy() {
        com.facebook.react.jstasks.b.a(getReactApplicationContext()).a.remove(this);
        d dVar = this.mJavaTimerManager;
        dVar.d();
        dVar.f();
    }

    @VisibleForTesting
    public final boolean hasActiveTimersInRange(long j) {
        return this.mJavaTimerManager.a(j);
    }

    @ReactMethod
    public final void enableBackgroundTimer(boolean z, Promise promise) {
        this.mEnableBackgroundTimer = z;
        promise.resolve(Boolean.TRUE);
    }
}
