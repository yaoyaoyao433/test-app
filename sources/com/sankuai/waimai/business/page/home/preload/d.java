package com.sankuai.waimai.business.page.home.preload;

import android.annotation.SuppressLint;
import android.arch.lifecycle.l;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class d<T> {
    public static ChangeQuickRedirect a;
    public static final Object b = new Object();
    public volatile Object c;
    private final Object d;
    private android.arch.core.internal.b<l<T>, d<T>.a> e;
    private int f;
    private volatile Object g;
    private int h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0314d70c099c6a40c65fff24153f9f43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0314d70c099c6a40c65fff24153f9f43");
            return;
        }
        this.d = new Object();
        this.e = new android.arch.core.internal.b<>();
        this.f = 0;
        this.c = b;
        this.g = b;
        this.h = -1;
        this.k = new Runnable() { // from class: com.sankuai.waimai.business.page.home.preload.d.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3a1d2499a4ab1d42c6a22db7bdf96a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3a1d2499a4ab1d42c6a22db7bdf96a6");
                    return;
                }
                synchronized (d.this.d) {
                    obj = d.this.g;
                    d.this.g = d.b;
                }
                if (obj != null) {
                    d.this.b((d) obj);
                } else {
                    d.this.b((d) null);
                }
            }
        };
    }

    @MainThread
    public final void a(@NonNull l<T> lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18326c1359ceb4c65731ed387c7a006e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18326c1359ceb4c65731ed387c7a006e");
            return;
        }
        a("observe");
        d<T>.a aVar = new a(lVar);
        if (this.e.a(lVar, aVar) != null) {
            return;
        }
        aVar.a(true);
    }

    public final void a(T t) {
        boolean z = true;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e950365d93285df2f054fd2f3e30f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e950365d93285df2f054fd2f3e30f4f");
            return;
        }
        synchronized (this.d) {
            if (this.g != b) {
                z = false;
            }
            this.g = t;
        }
        if (z) {
            ad.c(this.k);
        }
    }

    @MainThread
    public final void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c275e15a1c11a5242313c2df61c5c898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c275e15a1c11a5242313c2df61c5c898");
            return;
        }
        a("setValue");
        this.h++;
        this.c = t;
        b((a) null);
    }

    @Nullable
    public final T a() {
        T t = (T) this.c;
        if (t == null || t == b) {
            return null;
        }
        return t;
    }

    @MainThread
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558404b6c8b769ff047435a12d2a89d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558404b6c8b769ff047435a12d2a89d8");
            return;
        }
        a("resetDataAndObservers");
        this.c = b;
        this.h = -1;
        Iterator<Map.Entry<l<T>, d<T>.a>> it = this.e.iterator();
        while (it.hasNext()) {
            b((l) it.next().getKey());
        }
    }

    @MainThread
    public final void b(@NonNull l<T> lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8385147fb7f606b3b200619c38843d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8385147fb7f606b3b200619c38843d");
            return;
        }
        a("removeObserver");
        d<T>.a b2 = this.e.b(lVar);
        if (b2 == null) {
            return;
        }
        b2.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(d<T>.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb9b3a1ad1bc448f977a4788b1739166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb9b3a1ad1bc448f977a4788b1739166");
        } else if (aVar.c && aVar.d < this.h) {
            aVar.d = this.h;
            if (this.c != null && this.c != b) {
                aVar.b.a(this.c);
            } else {
                aVar.b.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@Nullable d<T>.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e60cd8982c2ab35d652f0fc1fb76298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e60cd8982c2ab35d652f0fc1fb76298");
        } else if (this.i) {
            this.j = true;
        } else {
            this.i = true;
            do {
                this.j = false;
                if (aVar != null) {
                    a((a) aVar);
                    aVar = null;
                } else {
                    android.arch.core.internal.b<l<T>, d<T>.a>.d a2 = this.e.a();
                    while (a2.hasNext()) {
                        a((a) ((a) a2.next().getValue()));
                        if (this.j) {
                            break;
                        }
                    }
                }
            } while (this.j);
            this.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public final l<T> b;
        public boolean c;
        public int d;

        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c492854afb37b6779d82a2251eeddf1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c492854afb37b6779d82a2251eeddf1");
            } else if (z == this.c) {
            } else {
                this.c = z;
                int unused = d.this.f;
                d.this.f += this.c ? 1 : -1;
                int unused2 = d.this.f;
                if (this.c) {
                    d.this.b(this);
                }
            }
        }

        public a(l<T> lVar) {
            Object[] objArr = {d.this, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e833d16d8f0bd0f3ccc70bf9a509c748", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e833d16d8f0bd0f3ccc70bf9a509c748");
                return;
            }
            this.d = -1;
            this.b = lVar;
        }
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aec4af98bc426e0b92095996b7b69d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aec4af98bc426e0b92095996b7b69d0");
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }
}
