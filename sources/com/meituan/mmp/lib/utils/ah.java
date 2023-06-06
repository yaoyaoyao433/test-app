package com.meituan.mmp.lib.utils;

import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ah<K, V> extends ConcurrentHashMap<K, V> {
    public static ChangeQuickRedirect a;

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        String str;
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bba0f2d05bd6e17e96258b9d32a4a95", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bba0f2d05bd6e17e96258b9d32a4a95");
        }
        if (k == null || v == null) {
            com.meituan.mmp.main.aa sniffer = MMPEnvHelper.getSniffer();
            if (k == null) {
                str = "key is null; value: " + v;
            } else {
                str = "value is null; key : " + k;
            }
            sniffer.a("MPConcurrentHashMap", "put null", str, "");
            return null;
        }
        return (V) super.put(k, v);
    }
}
