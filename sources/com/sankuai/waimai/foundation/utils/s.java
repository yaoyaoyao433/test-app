package com.sankuai.waimai.foundation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s {
    public static ChangeQuickRedirect a;

    public static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42198c381de7fc440070a03e3af60be6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42198c381de7fc440070a03e3af60be6")).booleanValue();
        }
        if (obj == null) {
            return obj2 == null;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }
}
