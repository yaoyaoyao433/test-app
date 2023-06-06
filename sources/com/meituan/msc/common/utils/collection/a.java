package com.meituan.msc.common.utils.collection;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a<K, V> extends b implements Map<K, V> {
    public static ChangeQuickRedirect a;
    protected Map<K, V> b;
    private final q l;
    private final String m;
    private final Type n;
    private Gson o;
    private final ag<Map<K, V>> p;

    public static /* synthetic */ Gson b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b0f982cbee2a7b083e01ee8c0176d065", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b0f982cbee2a7b083e01ee8c0176d065");
        }
        if (aVar.o == null) {
            aVar.o = new GsonBuilder().create();
        }
        return aVar.o;
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a70527c377810d3ef0189187fc138752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a70527c377810d3ef0189187fc138752");
        } else if (aVar.b == null || aVar.b.isEmpty()) {
        } else {
            try {
                aVar.l.a(aVar.m, (String) aVar.b, (ag<String>) aVar.p);
            } catch (Throwable th) {
                g.a("LocalCacheMap", th);
            }
        }
    }

    public a(Context context, q qVar, String str, Type type) {
        Object[] objArr = {context, qVar, str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7b87e84a17f5338e767782b290782f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7b87e84a17f5338e767782b290782f");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = b.c;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "293765309501b3faf2debb8cf063b287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "293765309501b3faf2debb8cf063b287");
        } else if (!b.d && context != null && (context.getApplicationContext() instanceof Application)) {
            synchronized (b.class) {
                if (!b.d) {
                    b.d = true;
                    b.e = new HashSet();
                    b.g = new WeakReference<>((Application) context.getApplicationContext());
                    b.f = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.msc.common.utils.collection.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                            Object[] objArr3 = {activity, bundle};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8432e38219593e28be93cb390a555980", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8432e38219593e28be93cb390a555980");
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
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "54991b3a31c53d4563f1dc6b7945e0bb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "54991b3a31c53d4563f1dc6b7945e0bb");
                                return;
                            }
                            try {
                                ((Application) b.g.get()).unregisterActivityLifecycleCallbacks(this);
                                if (b.e.size() <= 0) {
                                    return;
                                }
                                for (b bVar : b.e) {
                                    bVar.a(true);
                                }
                                b.e.clear();
                            } catch (Throwable th) {
                                g.a("LocalCacheObject", th);
                            }
                        }
                    };
                }
            }
        }
        this.l = qVar;
        this.m = str;
        this.n = type;
        this.p = new ag<Map<K, V>>() { // from class: com.meituan.msc.common.utils.collection.a.1
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cipstorage.ag
            /* renamed from: a */
            public Map<K, V> deserializeFromString(String str2) {
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8447c9b054201caae7b3468dd5c0451f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8447c9b054201caae7b3468dd5c0451f");
                }
                try {
                    return (Map) a.b(a.this).fromJson(str2, a.this.n);
                } catch (Throwable th) {
                    g.a("LocalCacheMap", th);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cipstorage.ag
            /* renamed from: a */
            public String serializeAsString(Map<K, V> map) {
                Object[] objArr3 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e13f465ee7f3c00fa9c60713a6123010", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e13f465ee7f3c00fa9c60713a6123010");
                }
                try {
                    return a.b(a.this).toJson(a.this.b, a.this.n);
                } catch (Throwable th) {
                    g.a("LocalCacheMap", th);
                    return null;
                }
            }
        };
    }

    @Override // java.util.Map
    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e259c0532356fb2ef33a87259d0f894f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e259c0532356fb2ef33a87259d0f894f")).intValue();
        }
        c();
        return this.b.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a90217d8fd8a24ebe3ce2d0fe68fb55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a90217d8fd8a24ebe3ce2d0fe68fb55")).booleanValue();
        }
        c();
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99c1f2e7c91a64bd15166e92072d397", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99c1f2e7c91a64bd15166e92072d397")).booleanValue();
        }
        c();
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c384ecd4aa3d8ae5e7ee2296349d784d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c384ecd4aa3d8ae5e7ee2296349d784d")).booleanValue();
        }
        c();
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26801746da49843775989106cbf91ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26801746da49843775989106cbf91ec9");
        }
        c();
        return this.b.get(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V put(@NonNull K k, @NonNull V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d4684d1d418b24b49422c88cc56ea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d4684d1d418b24b49422c88cc56ea7");
        }
        c();
        V put = this.b.put(k, v);
        d();
        return put;
    }

    @Override // java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e940ec34c953784fe4f63bb7d150a155", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e940ec34c953784fe4f63bb7d150a155");
        }
        c();
        V remove = this.b.remove(obj);
        d();
        return remove;
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c68fbe8f96a161d7cca2522a0a4127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c68fbe8f96a161d7cca2522a0a4127");
            return;
        }
        c();
        this.b.putAll(map);
        d();
    }

    @Override // java.util.Map
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70da49e49a08cf783f69139ece22aaf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70da49e49a08cf783f69139ece22aaf7");
            return;
        }
        c();
        this.b.clear();
        d();
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ac5ae168e604f3e1794292688e8b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ac5ae168e604f3e1794292688e8b0e");
        }
        c();
        return Collections.unmodifiableSet(this.b.keySet());
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a586be263bccad6b4c3f33be499831", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a586be263bccad6b4c3f33be499831");
        }
        c();
        return Collections.unmodifiableCollection(this.b.values());
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5649393df948fcf718f34843fb96451", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5649393df948fcf718f34843fb96451");
        }
        c();
        return Collections.unmodifiableSet(this.b.entrySet());
    }

    @Override // com.meituan.msc.common.utils.collection.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992e39a8861214687e200bd1de4c16d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992e39a8861214687e200bd1de4c16d6");
            return;
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        try {
            Map<? extends K, ? extends V> map = (Map) this.l.a(this.m, this.p);
            if (map != null) {
                this.b.putAll(map);
            }
        } catch (Throwable th) {
            g.a("LocalCacheMap", th);
        }
    }

    @Override // com.meituan.msc.common.utils.collection.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72cf8bee970204271d25512e7ccabb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72cf8bee970204271d25512e7ccabb4a");
        } else {
            com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.common.utils.collection.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73834823ae4aaf659ceff13ad6b57a03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73834823ae4aaf659ceff13ad6b57a03");
                    } else {
                        a.d(a.this);
                    }
                }
            });
        }
    }
}
