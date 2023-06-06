package com.dianping.shield.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShieldObjectsUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean equals(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4111b7d08ae648d3e97fb48d6c2dc829", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4111b7d08ae648d3e97fb48d6c2dc829")).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "857b2d75ce01d96698c32d9431180ab9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "857b2d75ce01d96698c32d9431180ab9")).intValue() : Arrays.hashCode(objArr);
    }
}
