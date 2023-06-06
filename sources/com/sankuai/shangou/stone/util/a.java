package com.sankuai.shangou.stone.util;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.shangou.stone.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0661a<T> {
        boolean a(T t);
    }

    public static boolean a(Object[] objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e46e51964339ab332809f0035e596462", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e46e51964339ab332809f0035e596462")).booleanValue() : !b(objArr);
    }

    public static boolean a(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5064ca5b333e3e85f5b562e9bd0a51b2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5064ca5b333e3e85f5b562e9bd0a51b2")).booleanValue() : !b(collection);
    }

    public static boolean b(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbab1570af90d7641ec23d0aa06b2fa7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbab1570af90d7641ec23d0aa06b2fa7")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean b(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static int c(@Nullable Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f615c55f2b71730a973f6d35a692f637", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f615c55f2b71730a973f6d35a692f637")).intValue();
        }
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int c(@Nullable Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Nullable
    public static <T> T a(@Nullable List<T> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96b8370d9689a067f78aaca6bb138082", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96b8370d9689a067f78aaca6bb138082");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "336124e4d483ea3a1328dd0a1e47eb84", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "336124e4d483ea3a1328dd0a1e47eb84");
        }
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static <T> void a(@Nullable Collection<T> collection, @Nullable Collection<? extends T> collection2) {
        Object[] objArr = {collection, collection2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1c745ec7d1017165a76faf1eea34e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1c745ec7d1017165a76faf1eea34e8e");
        } else if (collection == null || !a(collection2)) {
        } else {
            collection.addAll(collection2);
        }
    }

    public static <T> List<T> a(@Nullable List<T> list, int i, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91c4b00d73147112a3d9bd0c0b38f405", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91c4b00d73147112a3d9bd0c0b38f405");
        }
        if (b(list)) {
            return list;
        }
        int size = list.size();
        int b = n.b(i, 0, size);
        int b2 = n.b(i2, 0, size);
        if (b > b2) {
            b2 = b;
            b = b2;
        }
        return list.subList(b, b2);
    }

    public static <T> List<T> d(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "278b7c4d1bde1ac9650b95b8a63d34d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "278b7c4d1bde1ac9650b95b8a63d34d9");
        }
        if (tArr == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(tArr));
    }

    public static <T> boolean a(T t, List<T> list) {
        Object[] objArr = {t, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d0105c2738cf163c5284bc8c9c97096", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d0105c2738cf163c5284bc8c9c97096")).booleanValue();
        }
        if (t == null || b(list)) {
            return false;
        }
        return list.contains(t);
    }

    public static boolean a(Collection collection, int i) {
        Object[] objArr = {collection, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "871568a6c5885cf2ca8183394d110865", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "871568a6c5885cf2ca8183394d110865")).booleanValue() : !b(collection) && collection.size() > 0;
    }

    public static <T> int a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca05441eae2ab77ec9179c5f91d0c6d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca05441eae2ab77ec9179c5f91d0c6d1")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static boolean a(Collection... collectionArr) {
        Object[] objArr = {collectionArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2207b24d8fe265287505f45ada4eb9b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2207b24d8fe265287505f45ada4eb9b3")).booleanValue();
        }
        for (Collection collection : collectionArr) {
            if (collection != null && !collection.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
