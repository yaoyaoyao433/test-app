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
public final class a<K, V> extends e<K, V> implements Map<K, V> {
    public static ChangeQuickRedirect a;
    protected Map<V, K> b;
    protected a<V, K> c;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.utils.collection.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0295a<K, V> {
        public static ChangeQuickRedirect a;
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    public final /* bridge */ /* synthetic */ boolean containsKey(@Nullable Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    @NonNull
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    @Nullable
    public final /* bridge */ /* synthetic */ Object get(@Nullable Object obj) {
        return super.get(obj);
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    @NonNull
    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    @NonNull
    public final /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> a<K, V> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df656d0d077410c87ee3ef521b405cdb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df656d0d077410c87ee3ef521b405cdb") : new a<>();
    }

    public a() {
        this(new C0295a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b50a38d9af696d2777f47e96a974c51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b50a38d9af696d2777f47e96a974c51");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a(com.meituan.android.mrn.utils.collection.a.C0295a<K, V> r13) {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.mrn.utils.collection.a.C0295a.a
            java.lang.String r10 = "f55cf390f0ab069c1966316c797660cf"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r9, r0, r10)
            java.util.Map r1 = (java.util.Map) r1
            goto L20
        L1b:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L20:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.mrn.utils.collection.a.C0295a.a
            java.lang.String r11 = "21cfd960c7d38a0debe0379e0ea7672f"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r9
            r3 = r13
            r4 = r10
            r6 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L3a
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r9, r13, r10, r0, r11)
            java.util.Map r2 = (java.util.Map) r2
            goto L3f
        L3a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L3f:
            r3 = 0
            r12.<init>(r1, r2, r3)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r13
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.android.mrn.utils.collection.a.a
            java.lang.String r9 = "efb80680b6c052de48452e719fb8ef23"
            r5 = 0
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r1
            r3 = r12
            r4 = r13
            r6 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L5d
            com.meituan.robust.PatchProxy.accessDispatch(r1, r12, r13, r0, r9)
            return
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.utils.collection.a.<init>(com.meituan.android.mrn.utils.collection.a$a):void");
    }

    private a(Map<K, V> map, Map<V, K> map2, a<V, K> aVar) {
        super(map);
        Object[] objArr = {map, map2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1243f3d0fcac18ac26c26fccc44e356e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1243f3d0fcac18ac26c26fccc44e356e");
            return;
        }
        this.b = map2;
        this.c = null;
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95653e04e118818b84bda420585622dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95653e04e118818b84bda420585622dd")).booleanValue() : this.b.containsKey(obj);
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    @Nullable
    public final V put(@NonNull K k, @NonNull V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919da317ef02309e12b3b05747daf737", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919da317ef02309e12b3b05747daf737");
        }
        V put = this.e.put(k, v);
        if (put != null) {
            this.c.remove(put);
        }
        this.b.put(v, k);
        return put;
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    @Nullable
    public final V remove(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97eb73605c2b72c5f19d28bbf3ac348", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97eb73605c2b72c5f19d28bbf3ac348");
        }
        V remove = this.e.remove(obj);
        this.b.remove(remove);
        return remove;
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    public final void putAll(@NonNull Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "315ee67b086957d2ad7c85a803360b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "315ee67b086957d2ad7c85a803360b4c");
            return;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.meituan.android.mrn.utils.collection.e, java.util.Map
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19da1a216f17ff69488d37aa860704ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19da1a216f17ff69488d37aa860704ae");
            return;
        }
        this.e.clear();
        this.b.clear();
    }
}
