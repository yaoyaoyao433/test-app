package com.meituan.android.mrn.utils.collection;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f<K, V> {
    public static ChangeQuickRedirect a;
    protected Map<K, Collection<V>> b;
    protected final a<K, V> c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a<K, V> {
        public static ChangeQuickRedirect c;

        public boolean a() {
            return false;
        }

        public Map<K, Collection<V>> c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c1f5522f6441c9e8a437828a96ca79", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c1f5522f6441c9e8a437828a96ca79") : new HashMap();
        }

        public Collection<V> b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea08fcb8a1cf8b3d22e80a9b64d678de", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea08fcb8a1cf8b3d22e80a9b64d678de") : new ArrayList();
        }
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e855b803361779ae1e87810f92737c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e855b803361779ae1e87810f92737c");
        } else {
            this.c = new a<>();
        }
    }

    public f(a<K, V> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8acbf467ed4f9e350ffd5f09d105699", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8acbf467ed4f9e350ffd5f09d105699");
        } else {
            this.c = aVar;
        }
    }

    @Nullable
    public final Collection<V> a(@Nullable K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f58b34613d2d756979359d8d7d7044b", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f58b34613d2d756979359d8d7d7044b") : b(k);
    }

    private Collection<V> b(@Nullable K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1987fb477822e0eaf741c640e081f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1987fb477822e0eaf741c640e081f6");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get(k);
    }

    @Nullable
    public final V a(@Nullable K k, @Nullable V v) {
        Collection<V> collection;
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9d7ebf525a2c977ca78ae4fb6dfe07", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9d7ebf525a2c977ca78ae4fb6dfe07");
        }
        Object[] objArr2 = {k};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85f8c3be616200d882743c6c89c92c8f", RobustBitConfig.DEFAULT_VALUE)) {
            collection = (Collection) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85f8c3be616200d882743c6c89c92c8f");
        } else {
            if (this.b == null) {
                this.b = this.c.c();
            }
            Collection<V> collection2 = this.b.get(k);
            if (collection2 == null) {
                collection2 = this.c.b();
                this.b.put(k, collection2);
            }
            collection = collection2;
        }
        if (this.c.a()) {
            collection.add(v);
        } else if (!collection.contains(v)) {
            collection.add(v);
        }
        return v;
    }

    @Nullable
    public final V b(@Nullable K k, V v) {
        V v2 = v;
        Object[] objArr = {k, v2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e49eb7f233bd7bb1c9bbfcf8f136a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e49eb7f233bd7bb1c9bbfcf8f136a0");
        }
        Collection<V> b = b(k);
        if (b == null) {
            return null;
        }
        if (!b.remove(v2)) {
            v2 = null;
        }
        if (b.size() <= 0) {
            Object[] objArr2 = {k};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "017dc0679e7b70f779b10ccd84eb55ac", RobustBitConfig.DEFAULT_VALUE)) {
                Collection collection = (Collection) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "017dc0679e7b70f779b10ccd84eb55ac");
            } else if (this.b != null) {
                this.b.remove(k);
            }
        }
        return v2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca825fc22be925711c388aa54d91e4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca825fc22be925711c388aa54d91e4b4");
        } else if (this.b != null) {
            this.b.clear();
        }
    }
}
