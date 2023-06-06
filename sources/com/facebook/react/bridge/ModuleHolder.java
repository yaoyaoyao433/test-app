package com.facebook.react.bridge;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.facebook.debug.holder.c;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.a;
import com.facebook.systrace.b;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    @GuardedBy("this")
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    @GuardedBy("this")
    private boolean mIsCreating;
    @GuardedBy("this")
    private boolean mIsInitializing;
    @GuardedBy("this")
    @Nullable
    private NativeModule mModule;
    private final String mName;
    @Nullable
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.a;
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.c) {
            this.mModule = create();
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), a.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.e;
        new Object[1][0] = this.mName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            if (this.mModule != null) {
                com.facebook.infer.annotation.a.a(!this.mIsInitializing);
                nativeModule = this.mModule;
            } else {
                z = false;
                nativeModule = null;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public synchronized void destroy() {
        if (this.mModule != null) {
            this.mModule.onCatalystInstanceDestroy();
        }
    }

    @DoNotStrip
    public String getName() {
        return this.mName;
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.b;
    }

    public boolean getHasConstants() {
        return this.mReactModuleInfo.d;
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.g;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.e;
    }

    public String getClassName() {
        return this.mReactModuleInfo.f;
    }

    @DoNotStrip
    public NativeModule getModule() {
        NativeModule nativeModule;
        synchronized (this) {
            if (this.mModule != null) {
                return this.mModule;
            }
            boolean z = true;
            if (this.mIsCreating) {
                z = false;
            } else {
                this.mIsCreating = true;
            }
            if (z) {
                NativeModule create = create();
                synchronized (this) {
                    this.mIsCreating = false;
                    notifyAll();
                }
                return create;
            }
            synchronized (this) {
                while (this.mModule == null && this.mIsCreating) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                nativeModule = (NativeModule) com.facebook.infer.annotation.a.a(this.mModule);
            }
            return nativeModule;
        }
    }

    private NativeModule create() {
        boolean z;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        b.a(0L, "ModuleHolder.createModule");
        c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.e;
        new Object[1][0] = this.mName;
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) com.facebook.infer.annotation.a.a(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                z = this.mInitializable && !this.mIsInitializing;
            }
            if (z) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        b.a(0L, "ModuleHolder.initialize");
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                z = true;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                } else {
                    this.mIsInitializing = true;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            b.a(0L);
        }
    }
}
