package com.sankuai.waimai.foundation.utils;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddc5f8b92f0fa987214de2a0c819ac8d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddc5f8b92f0fa987214de2a0c819ac8d")).booleanValue() : !b(collection);
    }

    public static boolean a(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static boolean b(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9efa228339e1e962239383507635ed56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9efa228339e1e962239383507635ed56")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static int c(@Nullable Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c1638504a2f7f6d4af106fe68810b74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c1638504a2f7f6d4af106fe68810b74")).intValue();
        }
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int b(@Nullable Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Nullable
    public static <T> T a(@Nullable List<T> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f81c3cc60a6f6402947a90f9bfd0342", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f81c3cc60a6f6402947a90f9bfd0342");
        }
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    @Nullable
    public static <T> T a(@Nullable T[] tArr, int i) {
        Object[] objArr = {tArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab678b45d4c21ec2be40d63a461dbfec", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab678b45d4c21ec2be40d63a461dbfec");
        }
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }
}
