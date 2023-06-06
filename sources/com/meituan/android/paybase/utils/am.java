package com.meituan.android.paybase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class am<K, V> {
    public static ChangeQuickRedirect a;
    public final LinkedHashMap<WeakReference<K>, V> b;

    public am() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6058499eb63bc699267e3cdb4c48051f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6058499eb63bc699267e3cdb4c48051f");
        } else {
            this.b = new LinkedHashMap<>();
        }
    }

    public final void a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dfecfdd2a29bd741c5ecaf11545deb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dfecfdd2a29bd741c5ecaf11545deb2");
        } else if (k == null) {
        } else {
            a();
            WeakReference<K> weakReference = null;
            Iterator<WeakReference<K>> it = this.b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<K> next = it.next();
                if (next.get() == k) {
                    weakReference = next;
                    break;
                }
            }
            if (weakReference != null) {
                this.b.remove(weakReference);
            }
        }
    }

    public final V a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fce091130d209c0372775fed71e6b8a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fce091130d209c0372775fed71e6b8a4");
        }
        if (k == null) {
            return null;
        }
        a(k);
        return this.b.put(new WeakReference<>(k), v);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d6019ead5a9e4b1124d34027e1d865f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d6019ead5a9e4b1124d34027e1d865f");
            return;
        }
        Iterator<Map.Entry<WeakReference<K>, V>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().get() == null) {
                it.remove();
            }
        }
    }

    public final V b(K k) {
        WeakReference<K> weakReference;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b27bd067530375620107228a09a5dbaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b27bd067530375620107228a09a5dbaf");
        }
        a();
        Iterator<WeakReference<K>> it = this.b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            }
            weakReference = it.next();
            if (weakReference.get() == k) {
                break;
            }
        }
        if (weakReference != null) {
            return this.b.get(weakReference);
        }
        return null;
    }
}
