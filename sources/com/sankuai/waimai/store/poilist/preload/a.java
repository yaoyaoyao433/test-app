package com.sankuai.waimai.store.poilist.preload;

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
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    private static final Object c = new Object();
    private final Object b;
    private android.arch.core.internal.b<l<T>, a<T>.C1286a> d;
    private int e;
    private volatile Object f;
    private volatile Object g;
    private int h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b741da3fae4fb702b4aa337a7d6ed427", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b741da3fae4fb702b4aa337a7d6ed427");
            return;
        }
        this.b = new Object();
        this.d = new android.arch.core.internal.b<>();
        this.e = 0;
        this.f = c;
        this.g = c;
        this.h = -1;
        this.k = new Runnable() { // from class: com.sankuai.waimai.store.poilist.preload.a.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f215bcadcdcb3244e3db01b0c699185", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f215bcadcdcb3244e3db01b0c699185");
                    return;
                }
                synchronized (a.this.b) {
                    obj = a.this.g;
                    a.this.g = a.c;
                }
                if (obj != null) {
                    a.this.b((a) obj);
                } else {
                    a.this.b((a) null);
                }
            }
        };
    }

    @MainThread
    public final void a(@NonNull l<T> lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3dd00c25b6116dfb5d4faabccdfee88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3dd00c25b6116dfb5d4faabccdfee88");
            return;
        }
        a("observe");
        a<T>.C1286a c1286a = new C1286a(lVar);
        if (this.d.a(lVar, c1286a) != null) {
            return;
        }
        c1286a.a(true);
    }

    public final void a(T t) {
        boolean z = true;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e996f3a7dc66b984551e66fb12b6883e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e996f3a7dc66b984551e66fb12b6883e");
            return;
        }
        synchronized (this.b) {
            if (this.g != c) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c85592d0c0719fa70f3f40e5918e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c85592d0c0719fa70f3f40e5918e74");
            return;
        }
        a("setValue");
        this.h++;
        this.f = t;
        b((C1286a) null);
    }

    @MainThread
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8841b010618fc686096404a9e6c42ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8841b010618fc686096404a9e6c42ede");
            return;
        }
        a("resetDataAndObservers");
        this.f = c;
        this.h = -1;
        Iterator<Map.Entry<l<T>, a<T>.C1286a>> it = this.d.iterator();
        while (it.hasNext()) {
            b((l) it.next().getKey());
        }
    }

    @MainThread
    public final void b(@NonNull l<T> lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f65db043071eeeeaad6bda298a793e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f65db043071eeeeaad6bda298a793e");
            return;
        }
        a("removeObserver");
        a<T>.C1286a b = this.d.b(lVar);
        if (b == null) {
            return;
        }
        b.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(a<T>.C1286a c1286a) {
        Object[] objArr = {c1286a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d68480cc20712c8527112e5b772c66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d68480cc20712c8527112e5b772c66");
        } else if (c1286a.c && c1286a.d < this.h) {
            c1286a.d = this.h;
            if (this.f != null && this.f != c) {
                c1286a.b.a(this.f);
            } else {
                c1286a.b.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@Nullable a<T>.C1286a c1286a) {
        Object[] objArr = {c1286a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a90ad64865d47355c00e48fafe2de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a90ad64865d47355c00e48fafe2de6");
        } else if (this.i) {
            this.j = true;
        } else {
            this.i = true;
            do {
                this.j = false;
                if (c1286a != null) {
                    a((C1286a) c1286a);
                    c1286a = null;
                } else {
                    android.arch.core.internal.b<l<T>, a<T>.C1286a>.d a2 = this.d.a();
                    while (a2.hasNext()) {
                        a((C1286a) ((C1286a) a2.next().getValue()));
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
    /* renamed from: com.sankuai.waimai.store.poilist.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1286a {
        public static ChangeQuickRedirect a;
        public final l<T> b;
        public boolean c;
        public int d;

        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00aed9bd83a44c0bfb88b870eba2b713", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00aed9bd83a44c0bfb88b870eba2b713");
            } else if (z == this.c) {
            } else {
                this.c = z;
                int unused = a.this.e;
                a.this.e += this.c ? 1 : -1;
                int unused2 = a.this.e;
                if (this.c) {
                    a.this.b(this);
                }
            }
        }

        public C1286a(l<T> lVar) {
            Object[] objArr = {a.this, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e53c93ac55f6115c99ed5a5a36886d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e53c93ac55f6115c99ed5a5a36886d0");
                return;
            }
            this.d = -1;
            this.b = lVar;
        }
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26e019f51ff7361e39057714fb1b7ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26e019f51ff7361e39057714fb1b7ae5");
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }
}
