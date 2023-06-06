package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a<T> {
        boolean a(T t);
    }

    public static boolean a(Object obj, Collection<?>... collectionArr) {
        boolean z;
        Object[] objArr = {obj, collectionArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c30790744978f9f85e501bdc4c3fca2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c30790744978f9f85e501bdc4c3fca2")).booleanValue();
        }
        if (obj != null) {
            Object[] objArr2 = {collectionArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34b8f19cfb4de25835d3d69a2c80131c", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34b8f19cfb4de25835d3d69a2c80131c")).booleanValue();
            } else if (b(collectionArr)) {
                z = true;
            } else {
                boolean z2 = true;
                for (Collection<?> collection : collectionArr) {
                    z2 = a(collection);
                    if (!z2) {
                        break;
                    }
                }
                z = z2;
            }
            if (!z) {
                for (int i = 0; i < 2; i++) {
                    Collection<?> collection2 = collectionArr[i];
                    if (!a(collection2) && collection2.contains(obj)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static List<Integer> a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "852db1a010c589d972547d8acdabaf7e", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "852db1a010c589d972547d8acdabaf7e");
        }
        ArrayList arrayList = new ArrayList(23);
        for (int i = 0; i < 23; i++) {
            arrayList.add(Integer.valueOf(iArr[i]));
        }
        return arrayList;
    }

    public static int[] a(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "555246895f09223daf27aa7178309792", 6917529027641081856L)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "555246895f09223daf27aa7178309792");
        }
        if (a((Collection<?>) list)) {
            return new int[0];
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static <T> List<T> a(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5c6f325e0448d0016b6f5c68045670b", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5c6f325e0448d0016b6f5c68045670b");
        }
        if (b(tArr)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static boolean a(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ee09caaf6dcdc32b3b6f7e5abacd9e3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ee09caaf6dcdc32b3b6f7e5abacd9e3")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean a(Collection<?>... collectionArr) {
        Object[] objArr = {collectionArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aa28b65b8ca5e2f8eb248fd3625dfd0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aa28b65b8ca5e2f8eb248fd3625dfd0")).booleanValue();
        }
        if (b(collectionArr)) {
            return true;
        }
        for (int i = 0; i < 2; i++) {
            if (a(collectionArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static int b(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bb096ba46551430ff90cb6ff3197cef", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bb096ba46551430ff90cb6ff3197cef")).intValue();
        }
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static <T> T c(Collection<T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d6bf5d743d2b7986398904e1cfe79e5", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d6bf5d743d2b7986398904e1cfe79e5");
        }
        if (a((Collection<?>) collection)) {
            return null;
        }
        return collection.iterator().next();
    }

    public static <T> boolean b(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> int c(T[] tArr) {
        if (tArr == null) {
            return 0;
        }
        return tArr.length;
    }

    public static <T> void a(Collection<T> collection, a<T> aVar) {
        Object[] objArr = {collection, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea54132bc55298b75256177352344efe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea54132bc55298b75256177352344efe");
        } else if (a((Collection<?>) collection) || aVar == null) {
        } else {
            Iterator<T> it = collection.iterator();
            while (it.hasNext() && !aVar.a(it.next())) {
            }
        }
    }

    public static <T> boolean a(a<T> aVar, T t) {
        Object[] objArr = {aVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4856d51c4becbfed63a34ff3393fb81a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4856d51c4becbfed63a34ff3393fb81a")).booleanValue();
        }
        try {
            return aVar.a(t);
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return false;
        }
    }
}
