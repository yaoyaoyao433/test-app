package com.facebook.react.turbomodule.core;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TurboModuleManager implements JSIModule, TurboModuleRegistry {
    private final List<String> a;
    private final b b;
    private final b c;
    private final Object d;
    @GuardedBy("mTurboModuleCleanupLock")
    private boolean e;
    @GuardedBy("mTurboModuleCleanupLock")
    private final Map<String, a> f;
    @DoNotStrip
    private final HybridData mHybridData;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        @Nullable
        com.facebook.react.turbomodule.core.interfaces.a a(String str);
    }

    private native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, CallInvokerHolderImpl callInvokerHolderImpl2, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings();

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.turbomodule.core.TurboModuleManager$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements b {
        final /* synthetic */ TurboModuleManagerDelegate a;

        @Override // com.facebook.react.turbomodule.core.TurboModuleManager.b
        @Nullable
        public final com.facebook.react.turbomodule.core.interfaces.a a(String str) {
            if (this.a == null) {
                return null;
            }
            return this.a.a(str);
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public final List<String> a() {
        return this.a;
    }

    @Nullable
    private a c(String str) {
        synchronized (this.d) {
            if (this.e) {
                return null;
            }
            if (!this.f.containsKey(str)) {
                this.f.put(str, new a(null));
            }
            return this.f.get(str);
        }
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    @Nullable
    public final com.facebook.react.turbomodule.core.interfaces.a a(String str) {
        boolean z;
        com.facebook.react.turbomodule.core.interfaces.a aVar;
        a c = c(str);
        if (c == null) {
            return null;
        }
        synchronized (c) {
            if (c.c) {
                return c.a;
            }
            boolean z2 = false;
            if (c.b) {
                z = false;
            } else {
                c.b = true;
                z = true;
            }
            if (z) {
                com.facebook.react.turbomodule.core.interfaces.a a2 = this.b.a(str);
                if (a2 == null) {
                    a2 = this.c.a(str);
                }
                if (a2 != null) {
                    synchronized (c) {
                        c.a = a2;
                    }
                    ((NativeModule) a2).initialize();
                }
                synchronized (c) {
                    c.b = false;
                    c.c = true;
                    c.notifyAll();
                }
                return a2;
            }
            synchronized (c) {
                while (c.b) {
                    try {
                        c.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                aVar = c.a;
            }
            return aVar;
        }
    }

    @DoNotStrip
    @Nullable
    private CxxModuleWrapper getLegacyCxxModule(String str) {
        com.facebook.react.turbomodule.core.interfaces.a a2 = a(str);
        if (a2 instanceof CxxModuleWrapper) {
            return (CxxModuleWrapper) a2;
        }
        return null;
    }

    @DoNotStrip
    @Nullable
    private com.facebook.react.turbomodule.core.interfaces.a getJavaModule(String str) {
        com.facebook.react.turbomodule.core.interfaces.a a2 = a(str);
        if (a2 instanceof CxxModuleWrapper) {
            return null;
        }
        return a2;
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public final Collection<com.facebook.react.turbomodule.core.interfaces.a> b() {
        ArrayList<a> arrayList = new ArrayList();
        synchronized (this.d) {
            arrayList.addAll(this.f.values());
        }
        ArrayList arrayList2 = new ArrayList();
        for (a aVar : arrayList) {
            synchronized (aVar) {
                if (aVar.a != null) {
                    arrayList2.add(aVar.a);
                }
            }
        }
        return arrayList2;
    }

    @Override // com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry
    public final boolean b(String str) {
        a aVar;
        synchronized (this.d) {
            aVar = this.f.get(str);
        }
        if (aVar != null) {
            synchronized (aVar) {
                return aVar.a != null;
            }
        }
        return false;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        synchronized (this.d) {
            this.e = true;
        }
        for (String str : new HashSet(this.f.keySet())) {
            com.facebook.react.turbomodule.core.interfaces.a a2 = a(str);
            if (a2 != null) {
                ((NativeModule) a2).onCatalystInstanceDestroy();
            }
        }
        this.f.clear();
        this.mHybridData.resetNative();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        volatile com.facebook.react.turbomodule.core.interfaces.a a;
        volatile boolean b;
        volatile boolean c;

        private a() {
            this.a = null;
            this.b = false;
            this.c = false;
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
