package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.at;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    @Nullable
    public String a;
    @Nullable
    public Application b;
    public boolean c;
    @Nullable
    public LifecycleState d;
    @Nullable
    at e;
    @Nullable
    public NativeModuleCallExceptionHandler f;
    @Nullable
    com.facebook.react.devsupport.e g;
    @Nullable
    JavaScriptExecutorFactory h;
    @Nullable
    JSIModulePackage i;
    @Nullable
    private NotThreadSafeBridgeIdleDebugListener l;
    @Nullable
    private Activity m;
    @Nullable
    private com.facebook.react.modules.core.b n;
    private boolean o;
    @Nullable
    private com.facebook.react.devsupport.interfaces.a p;
    @Nullable
    private Map<String, com.facebook.react.packagerconnection.a> s;
    private final List<i> j = new ArrayList();
    @Nullable
    private List<JSBundleLoader> k = new ArrayList();
    private int q = 1;
    private int r = -1;

    public final f a(JSBundleLoader jSBundleLoader) {
        if (jSBundleLoader != null) {
            this.k.add(jSBundleLoader);
        }
        return this;
    }

    public final f a(i iVar) {
        this.j.add(iVar);
        return this;
    }

    public final f a(List<i> list) {
        if (list == null) {
            return this;
        }
        this.j.addAll(list);
        return this;
    }

    public final ReactInstanceManager a() {
        com.facebook.infer.annotation.a.a(this.b, "Application property has not been set with this builder");
        if (this.d == LifecycleState.RESUMED) {
            com.facebook.infer.annotation.a.a(this.m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z = false;
        com.facebook.infer.annotation.a.a(this.c || !this.k.isEmpty(), "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        com.facebook.infer.annotation.a.a((this.a == null && this.k.isEmpty()) ? true : true, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.e == null) {
            this.e = new at();
        }
        return new ReactInstanceManager(this.b, this.m, this.n, this.h == null ? a(this.b.getPackageName(), com.facebook.react.modules.systeminfo.a.a(), this.b.getApplicationContext()) : this.h, this.k, this.a, this.j, this.c, this.l, (LifecycleState) com.facebook.infer.annotation.a.a(this.d, "Initial lifecycle state was not set"), this.e, this.f, this.g, this.o, this.p, this.q, this.r, this.i, this.s);
    }

    private static JavaScriptExecutorFactory a(String str, String str2, Context context) {
        try {
            ReactInstanceManager.initializeSoLoaderIfNecessary(context);
            com.meituan.android.soloader.k.b("jscexecutor");
            return new com.facebook.react.jscexecutor.a(str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw e;
        }
    }
}
