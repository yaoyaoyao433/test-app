package com.sankuai.waimai.store.platform.domain.manager.order.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b<K extends Serializable, V extends Serializable> implements Serializable {
    public static ChangeQuickRedirect a;
    public final a<K> b;
    private Map<K, V> c;

    public b(@NonNull a<K> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77a7009b64f1aa55225d0a5b318df8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77a7009b64f1aa55225d0a5b318df8d");
            return;
        }
        this.c = new HashMap();
        this.b = aVar;
    }

    @NonNull
    public final synchronized Set<Map.Entry<K, V>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b55d9fb6c82635ff60511fb2309d086", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b55d9fb6c82635ff60511fb2309d086");
        }
        return this.c.entrySet();
    }

    @Nullable
    public final synchronized V a(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d35e28693eac9df443198efe847fb161", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d35e28693eac9df443198efe847fb161");
        }
        for (Map.Entry<K, V> entry : a()) {
            if (entry != null) {
                K key = entry.getKey();
                V value = entry.getValue();
                if (key != null && this.b.a(key, k)) {
                    return value;
                }
            }
        }
        return null;
    }

    public final synchronized void a(@NonNull K k, @NonNull V v) {
        boolean z = false;
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99227cd2ac06e65fe93065f20ceb8b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99227cd2ac06e65fe93065f20ceb8b9e");
            return;
        }
        Iterator<Map.Entry<K, V>> it = this.c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<K, V> next = it.next();
            if (next != null) {
                K key = next.getKey();
                if (this.b.a(key, k)) {
                    if (!key.equals(k)) {
                        this.c.remove(key);
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            this.b.a(k);
        }
        this.c.put(b(k), v);
    }

    public final synchronized void b(@NonNull K k, @NonNull K k2) {
        Object[] objArr = {k, k2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c47c9631e9a5fa05fcd86b3659da491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c47c9631e9a5fa05fcd86b3659da491");
            return;
        }
        a<K> aVar = this.b;
        Object[] objArr2 = {k, k2};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (!PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "349f125a7f644b743af6c884c2aa0052", RobustBitConfig.DEFAULT_VALUE)) {
            if (k.equals(k2)) {
                aVar.a(k);
            } else {
                Iterator<List<K>> it = aVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(k2);
                        arrayList.add(k);
                        aVar.b.add(arrayList);
                        break;
                    }
                    List<K> next = it.next();
                    if (next != null) {
                        boolean contains = next.contains(k);
                        boolean contains2 = next.contains(k2);
                        if (contains && contains2) {
                            break;
                        } else if (contains) {
                            next.add(0, k2);
                            break;
                        } else if (contains2) {
                            next.add(k);
                            break;
                        }
                    }
                }
            }
        } else {
            ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "349f125a7f644b743af6c884c2aa0052")).booleanValue();
        }
    }

    public final synchronized boolean c(@NonNull K k, @NonNull K k2) {
        Object[] objArr = {k, k2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ebbea88edc52455cda04133d9a4797b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ebbea88edc52455cda04133d9a4797b")).booleanValue();
        }
        return this.b.a(k, k2);
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805b08543db740e06bcea968acd9b7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805b08543db740e06bcea968acd9b7ab");
        } else {
            this.c.clear();
        }
    }

    @NonNull
    public final synchronized K b(@NonNull K k) {
        K k2;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80debcc24f060e03ab4a2c67461dd415", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80debcc24f060e03ab4a2c67461dd415");
        }
        a<K> aVar = this.b;
        Object[] objArr2 = {k};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (!PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "721536639c68174e27a109ab6d04f379", RobustBitConfig.DEFAULT_VALUE)) {
            k2 = null;
            Iterator<List<K>> it = aVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<K> next = it.next();
                if (next != null && next.contains(k)) {
                    k2 = next.get(0);
                    break;
                }
            }
        } else {
            k2 = (K) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "721536639c68174e27a109ab6d04f379");
        }
        if (k2 != null) {
            k = k2;
        }
        return k;
    }

    @NonNull
    public final synchronized K c(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e53eab27f90d8718a2ebb88134eaa73b", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e53eab27f90d8718a2ebb88134eaa73b");
        }
        K b = this.b.b(k);
        if (b != null) {
            k = b;
        }
        return k;
    }
}
