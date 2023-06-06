package com.meituan.msc.jse.modules.core;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.modules.core.a;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    @Nullable
    private volatile com.meituan.msc.jse.modules.core.a c;
    private final b d;
    private final Object e;
    @GuardedBy("mCallbackQueuesLock")
    private final ArrayDeque<a.AbstractC0445a>[] f;
    private int g;
    private boolean h;

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.h = false;
        return false;
    }

    public static /* synthetic */ int e(c cVar) {
        int i = cVar.g;
        cVar.g = i - 1;
        return i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        public static ChangeQuickRedirect a;
        final int g;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b0f16db4b572ba5c2678f7fe093a92c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b0f16db4b572ba5c2678f7fe093a92c") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49f252297955f173e109a4b772c00004", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49f252297955f173e109a4b772c00004") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b8e0375bd5ab113d28f20866bb08ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b8e0375bd5ab113d28f20866bb08ed");
            } else {
                this.g = i;
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ce9617d3c43cc93de6424b0bcb3a8e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ce9617d3c43cc93de6424b0bcb3a8e4");
        } else if (b == null) {
            b = new c();
        }
    }

    public static c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "318b5b75b401279d5a4b7fa7de32ba4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "318b5b75b401279d5a4b7fa7de32ba4f");
        }
        com.facebook.infer.annotation.a.a(b, "ReactChoreographer needs to be initialized.");
        return b;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e3a2065553deb1dd0edf888d102c36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e3a2065553deb1dd0edf888d102c36");
            return;
        }
        this.e = new Object();
        this.g = 0;
        this.h = false;
        this.d = new b();
        this.f = new ArrayDeque[a.valuesCustom().length];
        for (int i = 0; i < this.f.length; i++) {
            this.f[i] = new ArrayDeque<>();
        }
        a((Runnable) null);
    }

    public final void a(a aVar, a.AbstractC0445a abstractC0445a) {
        Object[] objArr = {aVar, abstractC0445a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96b696dcfacb35f21cb50e0e3a6dc0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96b696dcfacb35f21cb50e0e3a6dc0d");
            return;
        }
        synchronized (this.e) {
            this.f[aVar.g].addLast(abstractC0445a);
            this.g++;
            com.facebook.infer.annotation.a.a(this.g > 0);
            if (!this.h) {
                if (this.c == null) {
                    a(new Runnable() { // from class: com.meituan.msc.jse.modules.core.c.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4395cf4d66a2f3d431b37ace2b92566a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4395cf4d66a2f3d431b37ace2b92566a");
                            } else {
                                c.this.c();
                            }
                        }
                    });
                } else {
                    c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67df8689cc50a5a90d4f61be18f46c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67df8689cc50a5a90d4f61be18f46c9");
            return;
        }
        this.c.a(this.d);
        this.h = true;
    }

    private void a(@Nullable final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ea3736426d6745014079d513b1359a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ea3736426d6745014079d513b1359a");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.jse.modules.core.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    com.meituan.msc.jse.modules.core.a aVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a25874a4ea40f7cc35bb26af35597f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a25874a4ea40f7cc35bb26af35597f9");
                        return;
                    }
                    synchronized (c.class) {
                        if (c.this.c == null) {
                            c cVar = c.this;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.jse.modules.core.a.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "56854ff9cd10b087ca586c4566398e80", RobustBitConfig.DEFAULT_VALUE)) {
                                aVar = (com.meituan.msc.jse.modules.core.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "56854ff9cd10b087ca586c4566398e80");
                            } else {
                                UiThreadUtil.assertOnUiThread();
                                if (com.meituan.msc.jse.modules.core.a.b == null) {
                                    com.meituan.msc.jse.modules.core.a.b = new com.meituan.msc.jse.modules.core.a();
                                }
                                aVar = com.meituan.msc.jse.modules.core.a.b;
                            }
                            cVar.c = aVar;
                        }
                    }
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
        }
    }

    public final void b(a aVar, a.AbstractC0445a abstractC0445a) {
        Object[] objArr = {aVar, abstractC0445a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b98bbc79402d4fd28de9e8e300d5b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b98bbc79402d4fd28de9e8e300d5b41");
            return;
        }
        synchronized (this.e) {
            if (this.f[aVar.g].removeFirstOccurrence(abstractC0445a)) {
                this.g--;
                d();
            } else {
                g.a("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844f4df37342af3f300f58454a0de445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844f4df37342af3f300f58454a0de445");
            return;
        }
        com.facebook.infer.annotation.a.a(this.g >= 0);
        if (this.g == 0 && this.h) {
            if (this.c != null) {
                this.c.b(this.d);
            }
            this.h = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends a.AbstractC0445a {
        public static ChangeQuickRedirect b;

        private b() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbf3439a06580643ec9d49f2c3c2b10", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbf3439a06580643ec9d49f2c3c2b10");
            }
        }

        @Override // com.meituan.msc.jse.modules.core.a.AbstractC0445a
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d60b7a1cb214d8092460fcf3c31631c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d60b7a1cb214d8092460fcf3c31631c");
                return;
            }
            synchronized (c.this.e) {
                c.a(c.this, false);
                for (int i = 0; i < c.this.f.length; i++) {
                    ArrayDeque arrayDeque = c.this.f[i];
                    int size = arrayDeque.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a.AbstractC0445a abstractC0445a = (a.AbstractC0445a) arrayDeque.pollFirst();
                        if (abstractC0445a != null) {
                            abstractC0445a.a(j);
                            c.e(c.this);
                        } else {
                            g.a("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                c.this.d();
            }
        }
    }
}
