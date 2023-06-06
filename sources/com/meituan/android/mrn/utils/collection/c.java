package com.meituan.android.mrn.utils.collection;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c<K, V> extends d implements Map<K, V> {
    public static ChangeQuickRedirect a;
    protected WeakReference<Context> b;
    protected q c;
    protected String d;
    protected Map<K, V> e;
    protected b<K> f;
    protected b<V> g;

    public c(Context context, q qVar, String str, b<K> bVar, b<V> bVar2) {
        Object[] objArr = {context, qVar, str, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aae15fcc55a260ff2de137b9c4d0142", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aae15fcc55a260ff2de137b9c4d0142");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = d.h;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "400f4f321c0f082868cf8765b0cf05e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "400f4f321c0f082868cf8765b0cf05e5");
        } else if (!d.i && context != null && (context.getApplicationContext() instanceof Application)) {
            synchronized (d.class) {
                if (!d.i) {
                    d.i = true;
                    d.j = new HashSet();
                    d.l = new WeakReference<>((Application) context.getApplicationContext());
                    d.k = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.mrn.utils.collection.d.1
                        public static ChangeQuickRedirect a;

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                            Object[] objArr3 = {activity, bundle};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f00d6ea00105bab5e6a3a1616110a8bd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f00d6ea00105bab5e6a3a1616110a8bd");
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                            Object[] objArr3 = {activity};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e218085e47880e84e8008dbbc40e1626", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e218085e47880e84e8008dbbc40e1626");
                                return;
                            }
                            try {
                                ((Application) d.l.get()).unregisterActivityLifecycleCallbacks(this);
                                if (d.j.size() <= 0) {
                                    return;
                                }
                                for (d dVar : d.j) {
                                    dVar.a(true);
                                }
                                d.j.clear();
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    };
                }
            }
        }
        this.b = new WeakReference<>(context);
        this.c = qVar;
        this.d = str;
        this.f = bVar;
        this.g = bVar2;
    }

    public c(Map<K, V> map, Context context, q qVar, String str, b<K> bVar, b<V> bVar2) {
        this(context, qVar, str, bVar, bVar2);
        Object[] objArr = {map, context, qVar, str, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf25800901c0155b4b7c718256e2ef06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf25800901c0155b4b7c718256e2ef06");
        } else if (map == 0 || map.size() <= 0) {
        } else {
            putAll(map);
        }
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8db226983666e50affd844ccb939c56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8db226983666e50affd844ccb939c56")).intValue();
        }
        c();
        return this.e.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11379beebba4791d88fd1638a957142b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11379beebba4791d88fd1638a957142b")).booleanValue();
        }
        c();
        return this.e.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067eb1df54e9cbc6900ddf8d4593f337", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067eb1df54e9cbc6900ddf8d4593f337")).booleanValue();
        }
        c();
        return this.e.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc518df636f78144e712edeaf9ea090", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc518df636f78144e712edeaf9ea090")).booleanValue();
        }
        c();
        return this.e.containsValue(obj);
    }

    @Override // java.util.Map
    @Nullable
    public final V get(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b062cc8f859e0bf99f3c5f21237e3af7", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b062cc8f859e0bf99f3c5f21237e3af7");
        }
        c();
        return this.e.get(obj);
    }

    @Override // java.util.Map
    @Nullable
    public final V put(@NonNull K k, @NonNull V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2053568078c536c2fd470dfe77daa78", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2053568078c536c2fd470dfe77daa78");
        }
        c();
        V put = this.e.put(k, v);
        d();
        return put;
    }

    @Override // java.util.Map
    @Nullable
    public final V remove(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f330595ae7b3bdca634a18c55b9745e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f330595ae7b3bdca634a18c55b9745e5");
        }
        c();
        V remove = this.e.remove(obj);
        d();
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(@NonNull Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709d85d1bbdaba58081707a3b83b307a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709d85d1bbdaba58081707a3b83b307a");
            return;
        }
        c();
        this.e.putAll(map);
        d();
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1611ba3564d656d93ae15ed48fa312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1611ba3564d656d93ae15ed48fa312");
            return;
        }
        c();
        this.e.clear();
        d();
    }

    @Override // java.util.Map
    @NonNull
    public final Set<K> keySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df423f112e47f1e35ac03a7ed26ceb5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df423f112e47f1e35ac03a7ed26ceb5a");
        }
        c();
        return this.e.keySet();
    }

    @Override // java.util.Map
    @NonNull
    public final Collection<V> values() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d408ad0d2eef0261f460b51d661018", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d408ad0d2eef0261f460b51d661018");
        }
        c();
        return this.e.values();
    }

    @Override // java.util.Map
    @NonNull
    public final Set<Map.Entry<K, V>> entrySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9fe51bad47bea10e90f4c806dde2c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9fe51bad47bea10e90f4c806dde2c6");
        }
        c();
        return this.e.entrySet();
    }

    @Override // com.meituan.android.mrn.utils.collection.d
    public final void a() {
        K k;
        V v;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f916f35affcfbb5720b0bec6ed5b47fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f916f35affcfbb5720b0bec6ed5b47fe");
            return;
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap();
        }
        try {
            String b = this.c.b(this.d, (String) null);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            JSONObject a2 = g.a(b);
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = JSONObject.NULL.equals(a2.opt(next)) ? null : a2.optString(next, null);
                if (this.f != null) {
                    k = this.f.a(next);
                } else {
                    k = next != null ? next : null;
                }
                if (this.g != null) {
                    v = this.g.a(optString);
                } else {
                    v = next != null ? optString : null;
                }
                if (k != null && v != null) {
                    this.e.put(k, v);
                }
            }
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("[LocalCacheMap@readFromLocal]", th);
            th.printStackTrace();
        }
    }

    @Override // com.meituan.android.mrn.utils.collection.d
    public final void b() {
        String obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e4b2d05bbb1259a2f9d9a7c89254cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e4b2d05bbb1259a2f9d9a7c89254cc");
        } else if (this.e != null && !this.e.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<K, V> entry : this.e.entrySet()) {
                    K key = entry.getKey();
                    V value = entry.getValue();
                    String str = null;
                    if (this.f != null) {
                        obj = this.f.a((b<K>) key);
                    } else {
                        obj = key != null ? key.toString() : null;
                    }
                    if (this.g != null) {
                        str = this.g.a((b<V>) value);
                    } else if (value != null) {
                        str = value.toString();
                    }
                    if (str == null) {
                        str = JSONObject.NULL;
                    }
                    jSONObject.put(obj, str);
                }
                this.c.a(this.d, jSONObject.toString());
            } catch (Throwable th) {
                com.meituan.android.mrn.utils.c.a("[LocalCacheMap@saveToLocal]", th);
                th.printStackTrace();
            }
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9333a9ca0ce5b125afa6475d507e2c48", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9333a9ca0ce5b125afa6475d507e2c48");
        }
        c();
        StringBuilder sb = new StringBuilder("LocalCacheMap{mStore=");
        sb.append(this.e == null ? StringUtil.NULL : this.e.toString());
        sb.append('}');
        return sb.toString();
    }
}
