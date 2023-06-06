package com.sankuai.waimai.irmo.canvas.util;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasArray;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.utils.d;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
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
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b604d705dafd2e15b25e348ab2e26fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b604d705dafd2e15b25e348ab2e26fc");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2060ffe989f2b5dc1f5007112aa4dead", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2060ffe989f2b5dc1f5007112aa4dead");
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
        if (cls == CanvasMap.class) {
            return "m";
        }
        if (cls == CanvasArray.class) {
            return "a";
        }
        if (com.sankuai.waimai.irmo.a.a().c.i) {
            d.a("Java inf_canvas_log: ValueType.getType failed! 不支持数据类型:" + obj.getClass(), new Object[0]);
            throw new IllegalStateException("ValueType.getType failed! 不支持数据类型:" + obj.getClass());
        }
        return "V";
    }
}
