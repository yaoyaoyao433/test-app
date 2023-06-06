package com.meituan.android.neohybrid.util.bean;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.neohybrid.b;
import com.meituan.android.neohybrid.util.a;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseConfig implements Parcelable {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void parse(Bundle bundle) {
        Map<String, ?> hashMap;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c726913a2718847ca9d71c1869143bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c726913a2718847ca9d71c1869143bc6");
            return;
        }
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "5d60f767f92ae9353ab7bdeb8a9d336f", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "5d60f767f92ae9353ab7bdeb8a9d336f");
        } else {
            hashMap = new HashMap<>();
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    hashMap.put(str, bundle.get(str));
                }
            }
        }
        parse(hashMap);
    }

    public void parse(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfac2bcf9743edf68659307d9694ad4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfac2bcf9743edf68659307d9694ad4a");
        } else if (i.a(map)) {
        } else {
            bindMap(this, map);
            g.a(this, BaseConfig$$Lambda$1.lambdaFactory$(map));
        }
    }

    public static /* synthetic */ Field lambda$parse$0(Map map, Object obj, Field field) throws IllegalAccessException {
        Object[] objArr = {map, obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcde538241828ac8e63a7dfada1fe183", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcde538241828ac8e63a7dfada1fe183");
        }
        BaseConfig valOfBeanHandlerField = getValOfBeanHandlerField(obj, field);
        if (valOfBeanHandlerField != null) {
            valOfBeanHandlerField.parse(map);
        }
        return null;
    }

    public void save(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c68bb3dc7afe56771873fc43bacaeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c68bb3dc7afe56771873fc43bacaeb");
        } else if (map == null) {
        } else {
            saveMap(this, map);
            g.a(this, BaseConfig$$Lambda$4.lambdaFactory$(map));
        }
    }

    public static /* synthetic */ Field lambda$save$1(Map map, Object obj, Field field) throws IllegalAccessException {
        Object[] objArr = {map, obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41f546cf58681af1bda2c5cbaf124a0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41f546cf58681af1bda2c5cbaf124a0c");
        }
        BaseConfig valOfBeanHandlerField = getValOfBeanHandlerField(obj, field);
        if (valOfBeanHandlerField != null) {
            valOfBeanHandlerField.save(map);
        }
        return null;
    }

    private static void bindMap(Object obj, Map<String, ?> map) {
        Object[] objArr = {obj, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6006d22e5d2f1c6adb79bbc17a6d92ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6006d22e5d2f1c6adb79bbc17a6d92ea");
        } else if (obj == null || map == null) {
        } else {
            g.a(obj, BaseConfig$$Lambda$5.lambdaFactory$(map, obj));
        }
    }

    public static /* synthetic */ Field lambda$bindMap$2(Map map, Object obj, Object obj2, Field field) throws IllegalAccessException {
        Object obj3;
        Object[] objArr = {map, obj, obj2, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "deb9e0c9eced4bbc783e4a4d3122f8b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "deb9e0c9eced4bbc783e4a4d3122f8b1");
        }
        Bean bean = (Bean) field.getAnnotation(Bean.class);
        if (bean == null) {
            return null;
        }
        String value = bean.value();
        if (TextUtils.isEmpty(value) || (obj3 = map.get(value)) == null) {
            return null;
        }
        Class<?> type = field.getType();
        if (obj3 instanceof String) {
            if (b.a.contains(obj3)) {
                return null;
            }
            if (g.c(type)) {
                int defNumBool = bean.defNumBool();
                if (defNumBool == 0 || defNumBool == 1) {
                    obj3 = Boolean.valueOf(strictBool(String.valueOf(obj3), defNumBool == 1));
                }
            } else if (g.b(type)) {
                obj3 = g.a(type, String.valueOf(obj3), (Object) 0);
            }
        }
        field.set(obj, obj3);
        return null;
    }

    private static void saveMap(Object obj, Map<String, Object> map) {
        Object[] objArr = {obj, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05aa8e30f725a48ea52674d63f4c209e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05aa8e30f725a48ea52674d63f4c209e");
        } else {
            g.a(obj, BaseConfig$$Lambda$6.lambdaFactory$(map));
        }
    }

    public static /* synthetic */ Field lambda$saveMap$3(Map map, Object obj, Field field) throws IllegalAccessException {
        Object obj2;
        String valueOf;
        Object[] objArr = {map, obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c3f9cf9b08a5aca036dda5c76e7ac96", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c3f9cf9b08a5aca036dda5c76e7ac96");
        }
        Bean bean = (Bean) field.getAnnotation(Bean.class);
        if (bean == null || !bean.isSave()) {
            return null;
        }
        String value = bean.value();
        if (TextUtils.isEmpty(value) || (obj2 = field.get(obj)) == null) {
            return null;
        }
        if (g.c(field.getType())) {
            valueOf = ((Boolean) obj2).booleanValue() ? "1" : "0";
        } else {
            valueOf = String.valueOf(obj2);
        }
        map.put(value, valueOf);
        return null;
    }

    private static boolean strictBool(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f243fa823fb200e132aad9bc8429a7fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f243fa823fb200e132aad9bc8429a7fe")).booleanValue();
        }
        if ("1".equalsIgnoreCase(str)) {
            return true;
        }
        if ("0".equalsIgnoreCase(str)) {
            return false;
        }
        return z;
    }

    private static BaseConfig getValOfBeanHandlerField(Object obj, Field field) throws IllegalAccessException {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68bfda1131b6defbb91bed18592fb9c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68bfda1131b6defbb91bed18592fb9c3");
        }
        if (obj == null || field == null || !BaseConfig.class.isAssignableFrom(field.getType())) {
            return null;
        }
        field.setAccessible(true);
        return (BaseConfig) field.get(obj);
    }
}
