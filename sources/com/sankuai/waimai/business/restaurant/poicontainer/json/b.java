package com.sankuai.waimai.business.restaurant.poicontainer.json;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static double a(double d) throws JSONException {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d8c37ac63655c84fecdd6539415cff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d8c37ac63655c84fecdd6539415cff")).doubleValue();
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new JSONException("Forbidden numeric value: " + d);
        }
        return d;
    }

    public static Boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "864c58b66b5b72804e13ccd4e72b9ac5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "864c58b66b5b72804e13ccd4e72b9ac5");
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if ("true".equalsIgnoreCase(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str)) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static Double b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b512e9e82aa4ad8a02425eec75703d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b512e9e82aa4ad8a02425eec75703d3");
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static Integer c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a07eadafa2c6147c866181244c01be1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a07eadafa2c6147c866181244c01be1");
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((int) Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static Long d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d66a5f75159cc7c29a8a40719aeb7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d66a5f75159cc7c29a8a40719aeb7b");
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf((long) Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String e(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e024d08ce57ff97dbb1824054f9ab96c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e024d08ce57ff97dbb1824054f9ab96c");
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static JSONException a(Object obj, Object obj2, String str) throws JSONException {
        Object[] objArr = {obj, obj2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "534d6f0e7fd28145e7616b45aba394c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "534d6f0e7fd28145e7616b45aba394c1");
        }
        if (obj2 == null) {
            throw new JSONException("Value at " + obj + " is null.");
        }
        throw new JSONException("Value " + obj2 + " at " + obj + " of type " + obj2.getClass().getName() + " cannot be converted to " + str);
    }
}
