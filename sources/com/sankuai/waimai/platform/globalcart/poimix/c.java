package com.sankuai.waimai.platform.globalcart.poimix;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c<K extends Serializable, V extends Serializable> implements Serializable {
    public static ChangeQuickRedirect a;
    @SuppressLint({" SerializableCheck"})
    public b<K> b;
    @SuppressLint({" SerializableCheck"})
    public ConcurrentHashMap<K, V> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "405c5dbc14f638a5a1e801bc64db8bb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "405c5dbc14f638a5a1e801bc64db8bb7");
        } else {
            this.c = new ConcurrentHashMap<>();
        }
    }

    public c(@Nullable b<K> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5a7216e98802cc481ef4c9a7b3ab8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5a7216e98802cc481ef4c9a7b3ab8b");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.b = bVar;
    }

    @NonNull
    public final Set<Map.Entry<K, V>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b97a5c34cb89e02d5918a434797370", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b97a5c34cb89e02d5918a434797370");
        }
        if (this.c == null) {
            this.c = new ConcurrentHashMap<>();
        }
        return this.c.entrySet();
    }

    public final boolean a(@NonNull K k) {
        Set<Map.Entry<K, V>> a2;
        K key;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48e94af341049bef016c12831466a51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48e94af341049bef016c12831466a51")).booleanValue();
        }
        if (this.b != null) {
            if (this.b.a(k) && (a2 = a()) != null && !a2.isEmpty()) {
                for (Map.Entry<K, V> entry : a2) {
                    if (entry != null && (key = entry.getKey()) != null && this.b.a(key, k)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return this.c.containsKey(k);
    }

    @Nullable
    public final V b(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1808fc5150516f010fc0073a0e03c78", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1808fc5150516f010fc0073a0e03c78");
        }
        if (this.b != null) {
            Set<Map.Entry<K, V>> a2 = a();
            if (a2 == null || a2.isEmpty()) {
                return null;
            }
            for (Map.Entry<K, V> entry : a2) {
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
        return this.c.get(k);
    }

    public final void a(@NonNull K k, @NonNull V v) {
        K key;
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dee444917b52450b1499783288507d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dee444917b52450b1499783288507d7");
            return;
        }
        if (this.b != null) {
            if (this.b.a(k)) {
                Set<Map.Entry<K, V>> a2 = a();
                if (a2 != null && !a2.isEmpty()) {
                    Iterator<Map.Entry<K, V>> it = a2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<K, V> next = it.next();
                        if (next != null && (key = next.getKey()) != null && this.b.a(key, k)) {
                            k = key;
                            break;
                        }
                    }
                }
            } else {
                this.b.b(k);
            }
        }
        this.c.put(k, v);
    }

    public final void c(@NonNull K k) {
        K key;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4916e8a264f64220feb3b0799882f83d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4916e8a264f64220feb3b0799882f83d");
        } else if (this.b != null) {
            Set<Map.Entry<K, V>> a2 = a();
            if (a2 == null || a2.isEmpty()) {
                return;
            }
            for (Map.Entry<K, V> entry : a2) {
                if (entry != null && (key = entry.getKey()) != null && this.b.a(key, k)) {
                    this.c.remove(key);
                    return;
                }
            }
        } else {
            this.c.remove(k);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febe87131592a18cfaa486641b16433e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febe87131592a18cfaa486641b16433e");
        } else {
            this.c.clear();
        }
    }
}
