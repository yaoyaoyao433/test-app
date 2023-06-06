package com.dianping.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc74b44c7d78d0823f33a9a75629a694", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc74b44c7d78d0823f33a9a75629a694")).booleanValue() : (collection == null || collection.isEmpty()) ? false : true;
    }

    public static <T> boolean a(T[] tArr) {
        return tArr != null && tArr.length > 0;
    }
}
