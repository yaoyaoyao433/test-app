package com.meituan.msc.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ad<K, V> extends ConcurrentHashMap<K, V> {
    public static ChangeQuickRedirect a;

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb05001a018750e0201d0744d0c1387", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb05001a018750e0201d0744d0c1387");
        }
        if (k == null || v == null) {
            return null;
        }
        return (V) super.put(k, v);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bc68340f355027f88438e6f2f0f1d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bc68340f355027f88438e6f2f0f1d6");
        } else if (map == null) {
            com.meituan.msc.modules.reporter.g.a("MPConcurrentHashMap", "putAll m is null");
        } else {
            HashMap hashMap = new HashMap();
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            super.putAll(hashMap);
        }
    }
}
