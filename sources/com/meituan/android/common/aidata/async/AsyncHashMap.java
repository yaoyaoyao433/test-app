package com.meituan.android.common.aidata.async;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AsyncHashMap<K, V> extends ConcurrentHashMap<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(@Nullable K k, @Nullable V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04975964a99d1d5a35214349ad326ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04975964a99d1d5a35214349ad326ee6");
        }
        if (k == null || v == null) {
            return null;
        }
        return (V) super.put(k, v);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V remove(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e9ed6f1fa6842e685c488470827c3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e9ed6f1fa6842e685c488470827c3b");
        }
        if (obj == null) {
            return null;
        }
        return (V) super.remove(obj);
    }
}
