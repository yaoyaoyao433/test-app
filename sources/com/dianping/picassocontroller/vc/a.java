package com.dianping.picassocontroller.vc;

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
    HashMap<V, K> b;
    private HashMap<K, V> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637b750e9c65a4088c42333af90c9a46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637b750e9c65a4088c42333af90c9a46");
            return;
        }
        this.c = new HashMap<>();
        this.b = new HashMap<>();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f9f1d458569b6c0cc44267dbed189e", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f9f1d458569b6c0cc44267dbed189e") : this.c.entrySet();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e6a52eac92a9667c4e36db3e06848d", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e6a52eac92a9667c4e36db3e06848d") : this.c.keySet();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2288aab5cae65d450c2de2f74fe867be", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2288aab5cae65d450c2de2f74fe867be") : this.c.values();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a442200d6218db9c8e437e113f618d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a442200d6218db9c8e437e113f618d0");
        }
        K remove = this.b.remove(v);
        if (remove != null) {
            this.c.remove(remove);
        }
        this.b.put(v, k);
        return this.c.put(k, v);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f1294d028fb633c59ac61d70916b3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f1294d028fb633c59ac61d70916b3b");
        }
        V remove = this.c.remove(obj);
        this.b.remove(remove);
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6101ea7690139997d8d09c2d7b3864ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6101ea7690139997d8d09c2d7b3864ea");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650684ac7085ce6006b1ca71156b938d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650684ac7085ce6006b1ca71156b938d");
            return;
        }
        this.c.clear();
        this.b.clear();
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3589214527d56c7051dc40909d82e11e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3589214527d56c7051dc40909d82e11e")).intValue() : this.c.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e839e87bb666d8822ee255ec4bae852e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e839e87bb666d8822ee255ec4bae852e")).booleanValue() : this.c.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "902729aa854e767fd54a944c8d6a76b6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "902729aa854e767fd54a944c8d6a76b6")).booleanValue() : this.c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d03e5458b5a12d519d5bc018594969", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d03e5458b5a12d519d5bc018594969")).booleanValue() : this.c.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27690fd88e0426cdac421e62d03e272b", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27690fd88e0426cdac421e62d03e272b") : this.c.get(obj);
    }
}
