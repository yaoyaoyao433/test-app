package com.meituan.android.mrn.utils.collection;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e<K, V> implements Map<K, V> {
    public static ChangeQuickRedirect d;
    protected Map<K, V> e;

    public e(Map<K, V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e6a005a4fb33bf1afb2122f5868bb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e6a005a4fb33bf1afb2122f5868bb4");
        } else {
            this.e = map;
        }
    }

    @Override // java.util.Map
    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0792e2c82e7ad140f663a8c52a9fa779", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0792e2c82e7ad140f663a8c52a9fa779")).intValue() : this.e.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ce68600a7ce6e48562792276a44717", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ce68600a7ce6e48562792276a44717")).booleanValue() : this.e.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f24bf8449df0a27c97aadd27c974d21f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f24bf8449df0a27c97aadd27c974d21f")).booleanValue() : this.e.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ba52955ee17f76c61a25fa5efc20e7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ba52955ee17f76c61a25fa5efc20e7")).booleanValue() : this.e.containsValue(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c8a54f425993286798de4ca4d8afde", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c8a54f425993286798de4ca4d8afde") : this.e.get(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V put(@NonNull K k, @NonNull V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcef8619f9a81eb5d06da64d0b092f34", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcef8619f9a81eb5d06da64d0b092f34") : this.e.put(k, v);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b83a451802959387450fa8e36f341b", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b83a451802959387450fa8e36f341b") : this.e.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf278a345425611143ed6ec774af699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf278a345425611143ed6ec774af699");
        } else {
            this.e.putAll(map);
        }
    }

    @Override // java.util.Map
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d240d1f79c0411469145e949d9cbd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d240d1f79c0411469145e949d9cbd2");
        } else {
            this.e.clear();
        }
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d11eb79c37fbb641ea52edabb136bd", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d11eb79c37fbb641ea52edabb136bd") : this.e.keySet();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0ee5d7a622b09c2f4d12ab6d8df9ab", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0ee5d7a622b09c2f4d12ab6d8df9ab") : this.e.values();
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "485045bc00efe6e99bcb80d2cc48af5a", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "485045bc00efe6e99bcb80d2cc48af5a") : this.e.entrySet();
    }
}
