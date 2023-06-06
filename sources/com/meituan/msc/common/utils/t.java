package com.meituan.msc.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;

    public static <K, V> HashMap<K, V> a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54ae611123571e90175a065e8b97b1a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54ae611123571e90175a065e8b97b1a0");
        }
        HashMap<K, V> hashMap = new HashMap<>();
        hashMap.put(k, v);
        return hashMap;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2) {
        Object[] objArr = {k, v, k2, v2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "609ab35e9f6aafde9f323ced8438c4b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "609ab35e9f6aafde9f323ced8438c4b9");
        }
        HashMap<K, V> a2 = a(k, v);
        a2.put(k2, v2);
        return a2;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Object[] objArr = {k, v, k2, v2, k3, v3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b76f78fdb3908fc9757d98d5d0b41e0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b76f78fdb3908fc9757d98d5d0b41e0d");
        }
        HashMap<K, V> a2 = a(k, v, k2, v2);
        a2.put(k3, v3);
        return a2;
    }
}
