package com.meituan.android.common.aidata.ai.mlmodel.operator.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorParamUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isParamValid(@Nullable Object obj, @Nullable Class cls, @Nullable List<Object> list, int i, @Nullable Class cls2) {
        Object[] objArr = {obj, cls, list, Integer.valueOf(i), cls2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9b6eba11f216c100465d3a48b13fb88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9b6eba11f216c100465d3a48b13fb88")).booleanValue();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(cls);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(cls2);
        return isParamValid(obj, hashSet, list, i, hashSet2);
    }

    public static boolean isParamValid(@Nullable Object obj, @Nullable Class cls, @Nullable List<Object> list, int i, @NonNull Set<Class> set) {
        Object[] objArr = {obj, cls, list, Integer.valueOf(i), set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43960076844b585c5d71ab1ddcaf8ba0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43960076844b585c5d71ab1ddcaf8ba0")).booleanValue();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(cls);
        return isParamValid(obj, hashSet, list, i, set);
    }

    public static boolean isParamValid(@Nullable Object obj, @NonNull Set<Class> set, @Nullable List<Object> list, int i, @NonNull Set<Class> set2) {
        boolean z;
        Object[] objArr = {obj, set, list, Integer.valueOf(i), set2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f5868b2dc87a927e8e494bbfb948d18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f5868b2dc87a927e8e494bbfb948d18")).booleanValue();
        }
        boolean isInstanceOf = isInstanceOf(obj, set);
        if (list != null) {
            if (i < 0) {
                z = list.isEmpty() ? true : isListTypeValid(list, List.class, set2);
            } else if (list.size() == i) {
                z = isListTypeValid(list, List.class, set2);
            }
            return isInstanceOf && z;
        }
        z = false;
        if (isInstanceOf) {
            return false;
        }
    }

    public static boolean isMapTypeValid(@Nullable Object obj, @Nullable Class cls, @Nullable Class cls2, @Nullable Class cls3) {
        boolean z = true;
        Object[] objArr = {obj, cls, cls2, cls3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fa77af608eef8beed21495d1897523a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fa77af608eef8beed21495d1897523a")).booleanValue();
        }
        if (!isInstanceOf(obj, cls) || obj == null) {
            return false;
        }
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (!isInstanceOf(obj2, cls2) || !isInstanceOf(map.get(obj2), cls3)) {
                z = false;
            }
        }
        return z;
    }

    public static boolean isListTypeValid(@Nullable Object obj, @Nullable Class cls, @Nullable Class cls2) {
        Object[] objArr = {obj, cls, cls2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4d9cf8664fe449165c7849c5b2d1f8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4d9cf8664fe449165c7849c5b2d1f8a")).booleanValue();
        }
        if (obj != null || cls != null) {
            if (!isInstanceOf(obj, cls)) {
                return false;
            }
            for (Object obj2 : (List) obj) {
                if (!isInstanceOf(obj2, cls2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isListTypeValid(@Nullable Object obj, @Nullable Class cls, @NonNull Set<Class> set) {
        Object[] objArr = {obj, cls, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b81d05f0335e6a3e94e2ce124ce5e0a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b81d05f0335e6a3e94e2ce124ce5e0a2")).booleanValue();
        }
        if (!isInstanceOf(obj, cls) || obj == null) {
            return false;
        }
        List list = (List) obj;
        for (int i = 0; i < list.size(); i++) {
            if (!isInstanceOf(list.get(i), set)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTowDimListValid(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec5d7c674efce82528408b27ea49480f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec5d7c674efce82528408b27ea49480f")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object opt = jSONArray.opt(i);
                if (!isInstanceOf(opt, Number.class) && !isInstanceOf(opt, JSONArray.class)) {
                    return false;
                }
                if (isInstanceOf(opt, JSONArray.class)) {
                    JSONArray jSONArray2 = (JSONArray) opt;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (!(jSONArray2.opt(i2) instanceof Number)) {
                            return false;
                        }
                    }
                    continue;
                }
            }
            return true;
        }
        return obj instanceof Number;
    }

    public static boolean isParamValid(@Nullable Object obj, @Nullable Class cls, @Nullable List<Object> list, @Nullable List<Class> list2) {
        boolean z;
        Object[] objArr = {obj, cls, list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a01b5ce5a3e65c4b025dd7a69a8d24bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a01b5ce5a3e65c4b025dd7a69a8d24bb")).booleanValue();
        }
        boolean isInstanceOf = isInstanceOf(obj, cls);
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            z = true;
            for (int i = 0; i < size; i++) {
                z = isInstanceOf(list.get(i), list2.get(i));
                if (!z) {
                    break;
                }
            }
        } else {
            z = (list == null || list.isEmpty()) && (list2 == null || list2.isEmpty());
        }
        return isInstanceOf && z;
    }

    public static boolean isInstanceOf(@Nullable Object obj, @NonNull Set<Class> set) {
        Object[] objArr = {obj, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a32cff562337383a6fae21109e41af5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a32cff562337383a6fae21109e41af5")).booleanValue();
        }
        for (Class cls : set) {
            if (isInstanceOf(obj, cls)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInstanceOf(@Nullable Object obj, @Nullable Class cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9db5c590cfd68f1f1e6bc39a308887b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9db5c590cfd68f1f1e6bc39a308887b")).booleanValue();
        }
        if (obj == null || cls == null) {
            return obj == null && cls == null;
        }
        return cls.isInstance(obj);
    }
}
