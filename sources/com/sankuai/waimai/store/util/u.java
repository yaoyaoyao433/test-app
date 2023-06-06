package com.sankuai.waimai.store.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class u {
    public static ChangeQuickRedirect a;

    public static int a(Map<String, Object> map, String str, int i) {
        Object[] objArr = {map, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3835692d3675e82c41dd4c931b59e58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3835692d3675e82c41dd4c931b59e58")).intValue();
        }
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return i;
        }
        try {
            return Integer.parseInt(String.valueOf(map.get(str)));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return i;
        }
    }

    public static Double a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(0.0d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2ab1471c847cf9312d554d95e6b834f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2ab1471c847cf9312d554d95e6b834f");
        }
        Double valueOf = Double.valueOf(0.0d);
        if (!TextUtils.isEmpty(str)) {
            try {
                return Double.valueOf(str);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        return valueOf;
    }
}
