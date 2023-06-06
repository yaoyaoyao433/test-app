package com.meituan.android.privacy.impl.config;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o<K, V> {
    public static ChangeQuickRedirect a;
    @GuardedBy("this")
    final HashMap<K, WeakReference<V>> b;
    final ReferenceQueue<V> c;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5656904e795d3a559a6ea8b3b2035fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5656904e795d3a559a6ea8b3b2035fd");
            return;
        }
        this.b = new HashMap<>();
        this.c = new ReferenceQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends WeakReference<V> {
        public static ChangeQuickRedirect a;
        private final K c;

        public a(K k, V v, ReferenceQueue<? super V> referenceQueue) {
            super(v, referenceQueue);
            Object[] objArr = {o.this, k, v, referenceQueue};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d00ea8746c8c5d408755337dfd73358", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d00ea8746c8c5d408755337dfd73358");
            } else {
                this.c = k;
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8de3c0ab5fcc2b9cdf9a8a85c9893e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8de3c0ab5fcc2b9cdf9a8a85c9893e8");
            return;
        }
        while (true) {
            a aVar = (a) this.c.poll();
            if (aVar == null) {
                return;
            }
            synchronized (this) {
                this.b.remove(aVar.c);
            }
        }
    }

    @Nullable
    public final V a(K k) {
        V v;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89173e3ec0221c3ffbea642d373b3911", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89173e3ec0221c3ffbea642d373b3911");
        }
        a();
        synchronized (this) {
            WeakReference<V> weakReference = this.b.get(k);
            v = weakReference != null ? weakReference.get() : null;
        }
        return v;
    }
}
