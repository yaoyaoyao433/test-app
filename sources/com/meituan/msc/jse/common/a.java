package com.meituan.msc.jse.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static <K, V> HashMap<K, V> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d6848a6ab3065768fa8442a1c678e6d", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d6848a6ab3065768fa8442a1c678e6d") : new HashMap<>();
    }

    public static <K, V> Map<K, V> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc1d48a36fa3cd6476a30e10a19f6d57", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc1d48a36fa3cd6476a30e10a19f6d57") : a();
    }

    public static <K, V> Map<K, V> a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c1a0f2de463d7d4a2bea663f6196ad5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c1a0f2de463d7d4a2bea663f6196ad5");
        }
        Map<K, V> b = b();
        b.put(k, v);
        return b;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2) {
        Object[] objArr = {k, v, k2, v2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "234b7d6bb69aed75a8e34cc9298cc70d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "234b7d6bb69aed75a8e34cc9298cc70d");
        }
        Map<K, V> b = b();
        b.put(k, v);
        b.put(k2, v2);
        return b;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Object[] objArr = {k, v, k2, v2, k3, v3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b690d72faffd2c037778a724f0026b9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b690d72faffd2c037778a724f0026b9d");
        }
        Map<K, V> b = b();
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return b;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Object[] objArr = {k, v, k2, v2, k3, v3, k4, v4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "995e437d31de2020af664fa5db2c5112", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "995e437d31de2020af664fa5db2c5112");
        }
        Map<K, V> b = b();
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        return b;
    }

    public static <K, V> C0444a<K, V> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "425973b4549b62a9e12e5e0ddef64fd6", RobustBitConfig.DEFAULT_VALUE) ? (C0444a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "425973b4549b62a9e12e5e0ddef64fd6") : new C0444a<>();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.jse.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0444a<K, V> {
        public static ChangeQuickRedirect a;
        private Map b;
        private boolean c;

        public C0444a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5fde3ccafed492f6c6adbc5e5eccd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5fde3ccafed492f6c6adbc5e5eccd5");
                return;
            }
            this.b = a.a();
            this.c = true;
        }

        public final C0444a<K, V> a(K k, V v) {
            Object[] objArr = {k, v};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea8c65f45f6083c5a92096878487bfe", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0444a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea8c65f45f6083c5a92096878487bfe");
            }
            if (!this.c) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.b.put(k, v);
            return this;
        }

        public final Map<K, V> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1864c747fdd8addf42479229bed4ab4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1864c747fdd8addf42479229bed4ab4");
            }
            if (!this.c) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.c = false;
            return this.b;
        }
    }
}
