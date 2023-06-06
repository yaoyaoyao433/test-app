package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static <K, V> HashMap<K, V> a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69274f0e71077db7a7d2f917d9173804", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69274f0e71077db7a7d2f917d9173804");
        }
        HashMap<K, V> hashMap = new HashMap<>();
        hashMap.put(k, v);
        return hashMap;
    }

    public static <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc231aa01a83a0cdeb6a750e31a72b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc231aa01a83a0cdeb6a750e31a72b2c");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (map2 != 0) {
            map.putAll(map2);
        }
        return map;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2) {
        Object[] objArr = {k, v, k2, v2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f955a67fb989bd9eeb242343ecc4218", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f955a67fb989bd9eeb242343ecc4218");
        }
        HashMap<K, V> a2 = a(k, v);
        a2.put(k2, v2);
        return a2;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Object[] objArr = {k, v, k2, v2, k3, v3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "901de98e452395017cedb24838b06282", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "901de98e452395017cedb24838b06282");
        }
        HashMap<K, V> a2 = a(k, v, k2, v2);
        a2.put(k3, v3);
        return a2;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Object[] objArr = {k, v, k2, v2, k3, v3, k4, v4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "074785bc22f4fcae2ba657695e832fc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "074785bc22f4fcae2ba657695e832fc4");
        }
        HashMap<K, V> a2 = a(k, v, k2, v2, k3, v3);
        a2.put(k4, v4);
        return a2;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Object[] objArr = {k, v, k2, v2, k3, v3, k4, v4, k5, v5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8534b193a3abf56f11bcfa90feb66e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8534b193a3abf56f11bcfa90feb66e8");
        }
        HashMap<K, V> a2 = a(k, v, k2, v2, k3, v3, k4, v4);
        a2.put(k5, v5);
        return a2;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Object[] objArr = {k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "959fec8ccd24f763340f4c4f08092477", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "959fec8ccd24f763340f4c4f08092477");
        }
        HashMap<K, V> a2 = a(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
        a2.put(k6, v6);
        return a2;
    }

    public static <K, V> HashMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Object[] objArr = {k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77b0e35ee033524a6ec0735da5b10f46", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77b0e35ee033524a6ec0735da5b10f46");
        }
        HashMap<K, V> a2 = a(k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6);
        a2.put(k7, v7);
        return a2;
    }
}
