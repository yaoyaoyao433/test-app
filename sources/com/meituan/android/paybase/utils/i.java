package com.meituan.android.paybase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static boolean a(Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "941cde433797cb9e1ed1390a0a5a78cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "941cde433797cb9e1ed1390a0a5a78cf")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static <K, V> boolean a(Map<K, V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9910c982551bc290fd188bc2d4eb90c6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9910c982551bc290fd188bc2d4eb90c6")).booleanValue() : map == null || map.isEmpty();
    }

    public static boolean a(List list) {
        int i;
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eb546d4d8ee5cc22763c99fdc07e044", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eb546d4d8ee5cc22763c99fdc07e044")).booleanValue();
        }
        if (list == null) {
            return true;
        }
        int i2 = 0;
        boolean z2 = false;
        while (i2 < list.size()) {
            if (list.get(i2) == null) {
                i = i2 - 1;
                list.remove(i2);
            } else if (list.get(i2) instanceof List) {
                List list2 = (List) list.get(i2);
                if (z2 || a(list2)) {
                    i = i2;
                } else {
                    i = i2;
                    z = false;
                    int i3 = i;
                    z2 = z;
                    i2 = i3;
                    i2++;
                }
            } else {
                i2++;
            }
            z = true;
            int i32 = i;
            z2 = z;
            i2 = i32;
            i2++;
        }
        return z2;
    }

    public static <T> T[] a(List<T> list, Class<T> cls) {
        Object[] objArr = {list, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b55a4548e0aa58fd6d17a140d3127614", RobustBitConfig.DEFAULT_VALUE)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b55a4548e0aa58fd6d17a140d3127614"));
        }
        if (a((Collection) list)) {
            return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, list.size()));
        for (int i = 0; i < tArr.length; i++) {
            if (cls.isAssignableFrom(list.get(i).getClass())) {
                tArr[i] = list.get(i);
            }
        }
        return tArr;
    }
}
