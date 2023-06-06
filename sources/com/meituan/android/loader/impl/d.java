package com.meituan.android.loader.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Map<String, Integer> b = new ConcurrentHashMap();
    private static Map<String, Integer> c = new ConcurrentHashMap();

    public static void a(String str, Integer num, int i) {
        Object[] objArr = {str, num, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "722c8182a7fedf10b57e44711eeb451e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "722c8182a7fedf10b57e44711eeb451e");
        } else if (a(str, i) > num.intValue()) {
        } else {
            if (i == 1) {
                b.put(str, num);
            } else if (i == 2) {
                c.put(str, num);
            }
            f.d("DynLoaderState setState " + str + CommonConstant.Symbol.COLON + num);
        }
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Integer num = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bf38f390a8ffba5f2798ff11be01d90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bf38f390a8ffba5f2798ff11be01d90")).intValue();
        }
        if (i == 1) {
            num = b.get(str);
        } else if (i == 2) {
            num = c.get(str);
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }
}
