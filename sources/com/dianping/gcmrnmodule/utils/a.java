package com.dianping.gcmrnmodule.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<K, V> implements Map<K, V> {
    public static ChangeQuickRedirect a;
    private HashMap<K, V> b;
    private HashMap<V, K> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f0db00b6a18c629ca702af1607e929", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f0db00b6a18c629ca702af1607e929");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f8c2dc5e31dfc0bbb9fd98bdde2beb", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f8c2dc5e31dfc0bbb9fd98bdde2beb") : this.b.entrySet();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae696c007d82f92b3b8ef98856caee3", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae696c007d82f92b3b8ef98856caee3") : this.b.keySet();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0b92a026845bcb7825b077b3d5721f", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0b92a026845bcb7825b077b3d5721f") : this.b.values();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db548937693c24f309bafdb2e9973100", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db548937693c24f309bafdb2e9973100");
        }
        K remove = this.c.remove(v);
        if (remove != null) {
            this.b.remove(remove);
        }
        this.c.put(v, k);
        return this.b.put(k, v);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae97d78eac05a764daccdd2e1cddd88", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae97d78eac05a764daccdd2e1cddd88");
        }
        V remove = this.b.remove(obj);
        this.c.remove(remove);
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c601e4ede57fcad803228e363c1f72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c601e4ede57fcad803228e363c1f72b");
        } else if (map != null) {
            for (K k : map.keySet()) {
                put(k, map.get(k));
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d9a5a662a6fb3b82deb0d49c47e2c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d9a5a662a6fb3b82deb0d49c47e2c6f");
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d27d65eac2d0849631d7dbe2b0e1f95b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d27d65eac2d0849631d7dbe2b0e1f95b")).intValue() : this.b.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a0f5c671566b4bea860a83a8156b16", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a0f5c671566b4bea860a83a8156b16")).booleanValue() : this.b.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df9c64bd9b3e0128df189bf5c93b985", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df9c64bd9b3e0128df189bf5c93b985")).booleanValue() : this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f068efd6d84c0c78cc0b001add54c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f068efd6d84c0c78cc0b001add54c7")).booleanValue() : this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db76382d32507d7a97aecbc2664ea882", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db76382d32507d7a97aecbc2664ea882") : this.b.get(obj);
    }
}
