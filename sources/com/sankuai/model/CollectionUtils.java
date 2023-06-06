package com.sankuai.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CollectionUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> List<T> intersect(List<T> list, List<T> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2f3b2d64b3a016920abe063e2bc3df6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2f3b2d64b3a016920abe063e2bc3df6");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new Object[list.size()]));
        Collections.copy(arrayList, list);
        arrayList.retainAll(list2);
        return arrayList;
    }

    public static <T> List<T> asList(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "076f23d9ca964515140aadaeb13d376b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "076f23d9ca964515140aadaeb13d376b");
        }
        if (tArr == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(tArr));
    }

    public static <T> List<T> union(List<T> list, List<T> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f223dc77669c034c4739cef5dacc76f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f223dc77669c034c4739cef5dacc76f");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new Object[list.size()]));
        Collections.copy(arrayList, list);
        arrayList.removeAll(list2);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static <T> List<T> diff(List<T> list, List<T> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50c6a747cad34e215677a8634e100cbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50c6a747cad34e215677a8634e100cbc");
        }
        List<T> union = union(list, list2);
        union.removeAll(intersect(list, list2));
        return union;
    }

    public static <T> boolean isEmpty(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ad33ee44f05b6857db84a92aaacb166", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ad33ee44f05b6857db84a92aaacb166")).booleanValue() : list == null || list.isEmpty();
    }

    public static <T> boolean inArray(T t, List<T> list) {
        Object[] objArr = {t, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9540379614b1a20ef6df4bddbea2efc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9540379614b1a20ef6df4bddbea2efc")).booleanValue();
        }
        if (t == null || isEmpty(list)) {
            return false;
        }
        return list.contains(t);
    }

    public static <T> void addAll(List<T> list, T... tArr) {
        Object[] objArr = {list, tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd370a4a62df91aae60954489653653d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd370a4a62df91aae60954489653653d");
        } else {
            list.addAll(Arrays.asList(tArr));
        }
    }

    public static <T> int size(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e1e2b35ec49aa2e4584beced362f6f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e1e2b35ec49aa2e4584beced362f6f0")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
