package com.sankuai.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CollectionUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> List<T> intersect(List<T> list, List<T> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a2d868ba42f27cf8d72abf1b6c7f703", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a2d868ba42f27cf8d72abf1b6c7f703");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new Object[list.size()]));
        Collections.copy(arrayList, list);
        arrayList.retainAll(list2);
        return arrayList;
    }

    public static <T> List<T> asList(T... tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e83a21c72eaffc8c8f74c64b89d27f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e83a21c72eaffc8c8f74c64b89d27f1");
        }
        if (tArr == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(tArr));
    }

    public static <T> List<T> union(List<T> list, List<T> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80a7d601cef3462f7842701cb39b5ff5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80a7d601cef3462f7842701cb39b5ff5");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cec57e73cd78ed6df63a6b382765588e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cec57e73cd78ed6df63a6b382765588e");
        }
        List<T> union = union(list, list2);
        union.removeAll(intersect(list, list2));
        return union;
    }

    public static <T> boolean isEmpty(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d26d774099a056b51653b1e1302bb49a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d26d774099a056b51653b1e1302bb49a")).booleanValue() : list == null || list.isEmpty();
    }

    public static <T> boolean inArray(T t, List<T> list) {
        Object[] objArr = {t, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db99f1962e8130c53e1f90f70ae32582", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db99f1962e8130c53e1f90f70ae32582")).booleanValue();
        }
        if (t == null || isEmpty(list)) {
            return false;
        }
        return list.contains(t);
    }

    public static <T> void addAll(List<T> list, T... tArr) {
        Object[] objArr = {list, tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3091d5c0e629fb071e822a00dcb12b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3091d5c0e629fb071e822a00dcb12b80");
        } else {
            list.addAll(Arrays.asList(tArr));
        }
    }

    public static <T> int size(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d802dc68efa07ce64550586a424c479", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d802dc68efa07ce64550586a424c479")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static <T> T getValueFromMap(Map map, String str, T t) {
        Object[] objArr = {map, str, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18dff39f3051b774d28dea9859682862", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18dff39f3051b774d28dea9859682862") : (map == null || TextUtils.isEmpty(str) || !map.containsKey(str)) ? t : (T) map.get(str);
    }

    public static boolean listEqual(List<?> list, List<?> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1256e981876771b279445b347b028b45", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1256e981876771b279445b347b028b45")).booleanValue();
        }
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object obj2 = list2.get(i);
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof List) && (obj2 instanceof List)) {
                    if (!listEqual((List) obj, (List) obj2)) {
                        return false;
                    }
                } else if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
