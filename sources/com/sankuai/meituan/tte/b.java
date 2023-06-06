package com.sankuai.meituan.tte;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b<K, V> {
    public static ChangeQuickRedirect a;
    private final ConcurrentHashMap<K, V> b;
    private final Object c;

    public abstract V b(K k);

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d92eb38991e179aac996eaa66dd9ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d92eb38991e179aac996eaa66dd9ac");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = new Object();
    }

    public final V a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a576d6a78eeb316c2f99a6f07e3edf", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a576d6a78eeb316c2f99a6f07e3edf");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return this.b.computeIfAbsent(k, new Function<K, V>() { // from class: com.sankuai.meituan.tte.b.1
                public static ChangeQuickRedirect a;

                @Override // java.util.function.Function
                public final V apply(K k2) {
                    Object[] objArr2 = {k2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5746163ac8a008ee96ad7a6a24785ef", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5746163ac8a008ee96ad7a6a24785ef") : (V) b.this.b(k2);
                }
            });
        }
        V v = this.b.get(k);
        if (v == null) {
            synchronized (this.c) {
                v = this.b.get(k);
                if (v == null) {
                    v = b(k);
                    this.b.put(k, v);
                }
            }
        }
        return v;
    }
}
