package com.sankuai.waimai.machpro.base;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.util.a;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ValueType {
    public static final String ARRAY_TYPE = "a";
    public static final String BOOLEAN_TYPE = "Z";
    public static final String DOUBLE_TYPE = "D";
    public static final String FLOAT_TYPE = "F";
    public static final String INI_TYPE = "I";
    public static final String LONG_TYPE = "L";
    public static final String MAP_TYPE = "m";
    public static final String STRING_TYPE = "s";
    public static final String VOID_TYPE = "V";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getType(Object[] objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bfd8e7c1d4114631bca13b52c5a451d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bfd8e7c1d4114631bca13b52c5a451d4");
        }
        if (objArr != null) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(getType(obj));
            }
            return sb.toString();
        }
        return "";
    }

    public static String getType(Object obj) {
        Class<?> cls;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61eac44cd28245fcf02b09c75a25dfc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61eac44cd28245fcf02b09c75a25dfc8");
        }
        if (obj == null) {
            return "V";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        if (cls == Integer.class) {
            return "I";
        }
        if (cls == Double.class) {
            return "D";
        }
        if (cls == Boolean.class) {
            return "Z";
        }
        if (cls == String.class) {
            return "s";
        }
        if (cls == Float.class) {
            return "F";
        }
        if (cls == Long.class) {
            return "L";
        }
        if (cls == MachMap.class) {
            return "m";
        }
        if (cls == MachArray.class) {
            return "a";
        }
        if (f.a().i.i) {
            a.a("ValueType.getType failed! 不支持数据类型:" + obj.getClass());
            throw new IllegalStateException("ValueType.getType failed! 不支持数据类型:" + obj.getClass());
        }
        return "V";
    }
}
