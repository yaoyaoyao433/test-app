package com.sankuai.waimai.store.router;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static Map<String, Object> b = new HashMap();

    public static <T> T a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9c0a46fac23dc2a206aa6f6d5b0a19a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9c0a46fac23dc2a206aa6f6d5b0a19a") : (T) b.get(str);
    }

    public static <T> T b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5840e25b2d53c7b5f46e3dd62106dfab", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5840e25b2d53c7b5f46e3dd62106dfab");
        }
        T t = (T) b.get(str);
        b.remove(str);
        return t;
    }

    public static <T> void a(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27969864d5ebd6376c98751ea454a634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27969864d5ebd6376c98751ea454a634");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (t == null) {
                b.remove(str);
            } else {
                b.put(str, t);
            }
        }
    }
}
