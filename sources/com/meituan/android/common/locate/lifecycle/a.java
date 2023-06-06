package com.meituan.android.common.locate.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.support.annotation.AnyThread;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.android.aurora.ActivitySwitchCallbacks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile String h = "";
    private static volatile boolean i = false;
    private ConcurrentLinkedQueue<InterfaceC0210a> a;
    private ConcurrentLinkedQueue<InterfaceC0210a> b;
    private ConcurrentLinkedQueue<c> c;
    private ConcurrentLinkedQueue<c> d;
    private int e;
    private AtomicBoolean f;
    private final Executor g;

    /* renamed from: com.meituan.android.common.locate.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0210a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b extends InterfaceC0210a {
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface d extends c {
    }

    /* loaded from: classes2.dex */
    static class e {
        public static a a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be918fcb16795f4d8c96ad73156c5b3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be918fcb16795f4d8c96ad73156c5b3d");
            return;
        }
        this.a = new ConcurrentLinkedQueue<>();
        this.b = new ConcurrentLinkedQueue<>();
        this.c = new ConcurrentLinkedQueue<>();
        this.d = new ConcurrentLinkedQueue<>();
        this.e = 0;
        this.f = new AtomicBoolean(false);
        this.g = com.sankuai.android.jarvis.c.a("Locate-AppBus");
    }

    public static a a() {
        return e.a;
    }

    private void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f927d0e43a76f94c51d9c78507d692b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f927d0e43a76f94c51d9c78507d692b8");
            return;
        }
        try {
            if ((obj instanceof InterfaceC0210a) && !i) {
                ((InterfaceC0210a) obj).a();
            }
            if ((obj instanceof c) && i) {
                ((c) obj).a();
            }
        } catch (Throwable th) {
            com.meituan.android.common.locate.platform.logs.c.a(th.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b59276bda15bdf1e4787e07fd4cca64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b59276bda15bdf1e4787e07fd4cca64");
            return;
        }
        i = false;
        Iterator<InterfaceC0210a> it = this.b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable th) {
                com.meituan.android.common.locate.platform.logs.c.a("notifyPostUIBg failed: " + th.getMessage());
            }
        }
        this.g.execute(new Runnable() { // from class: com.meituan.android.common.locate.lifecycle.a.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82367f44016f6048eac2c4d5fb5e765d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82367f44016f6048eac2c4d5fb5e765d");
                    return;
                }
                com.meituan.android.common.locate.platform.logs.c.a("notifyPostAsyncBg");
                Iterator it2 = a.this.a.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC0210a) it2.next()).a();
                    } catch (Throwable th2) {
                        com.meituan.android.common.locate.platform.logs.c.a("notifyPostAsyncBg failed: " + th2.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f552ebf5000c8527687d26c82b67692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f552ebf5000c8527687d26c82b67692");
            return;
        }
        i = true;
        Iterator<c> it = this.d.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable th) {
                com.meituan.android.common.locate.platform.logs.c.a("notifyUIForeground failed: " + th.getMessage());
            }
        }
        this.g.execute(new Runnable() { // from class: com.meituan.android.common.locate.lifecycle.a.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "216034c71e680668305a68b31fb25423", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "216034c71e680668305a68b31fb25423");
                    return;
                }
                com.meituan.android.common.locate.platform.logs.c.a("notifyAsyncForeground");
                Iterator it2 = a.this.c.iterator();
                while (it2.hasNext()) {
                    try {
                        ((c) it2.next()).a();
                    } catch (Throwable th2) {
                        com.meituan.android.common.locate.platform.logs.c.a("notifyAsyncForeground failed: " + th2.getMessage());
                    }
                }
            }
        });
    }

    @AnyThread
    public void a(@NonNull Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628afbb5fa4cc42e80163dae2739af54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628afbb5fa4cc42e80163dae2739af54");
        } else if (this.f.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(new ActivitySwitchCallbacks() { // from class: com.meituan.android.common.locate.lifecycle.a.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c5548d58ec6b79455fd60a260e4b7705", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c5548d58ec6b79455fd60a260e4b7705");
                        return;
                    }
                    a.this.e++;
                    if (a.this.e == 1) {
                        a.this.c();
                    }
                }

                @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc8cb22b169795fe68743e0167f1b275", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc8cb22b169795fe68743e0167f1b275");
                        return;
                    }
                    a.this.e--;
                    if (a.this.e <= 0) {
                        a.this.e = 0;
                        a.this.b();
                    }
                }
            });
        }
    }

    @AnyThread
    public void a(@NonNull InterfaceC0210a interfaceC0210a) {
        Object[] objArr = {interfaceC0210a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "187be03f15af091de35ab7e167f6ff0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "187be03f15af091de35ab7e167f6ff0e");
        } else {
            a(interfaceC0210a, true);
        }
    }

    @AnyThread
    public void a(@NonNull InterfaceC0210a interfaceC0210a, boolean z) {
        Object[] objArr = {interfaceC0210a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab4b2b52c7fe14700661586028d7af1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab4b2b52c7fe14700661586028d7af1c");
            return;
        }
        (interfaceC0210a instanceof b ? this.b : this.a).add(interfaceC0210a);
        if (z) {
            a((Object) interfaceC0210a);
        }
    }

    public void a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fafe76e0fb92ff39e9e3cf0bdd3f3e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fafe76e0fb92ff39e9e3cf0bdd3f3e9f");
        } else {
            a(cVar, true);
        }
    }

    public void a(@NonNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bada4a09b100b6d4d6c513e073b6ae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bada4a09b100b6d4d6c513e073b6ae7");
            return;
        }
        (cVar instanceof d ? this.d : this.c).add(cVar);
        if (z) {
            a((Object) cVar);
        }
    }

    public void b(@NonNull InterfaceC0210a interfaceC0210a) {
        Object[] objArr = {interfaceC0210a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8bb6c587adf7e4a322dc680d70d18f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8bb6c587adf7e4a322dc680d70d18f7");
        } else {
            (interfaceC0210a instanceof b ? this.b : this.a).remove(interfaceC0210a);
        }
    }

    public void b(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1169ee58786a19fb88bddc409df5a634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1169ee58786a19fb88bddc409df5a634");
        } else {
            (cVar instanceof d ? this.d : this.c).remove(cVar);
        }
    }
}
