package com.meituan.msc.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class an {
    public static ChangeQuickRedirect a;
    private static final Map<Class<?>, Class<?>> b = new HashMap();
    private static final Map<Class<?>, Object> c = new HashMap();

    static {
        b.put(Boolean.class, Boolean.TYPE);
        b.put(Character.class, Character.TYPE);
        b.put(Byte.class, Byte.TYPE);
        b.put(Short.class, Short.TYPE);
        b.put(Integer.class, Integer.TYPE);
        b.put(Long.class, Long.TYPE);
        b.put(Float.class, Float.TYPE);
        b.put(Double.class, Double.TYPE);
        c.put(Boolean.class, Boolean.FALSE);
        c.put(Character.class, (char) 0);
        c.put(Byte.class, (byte) 0);
        c.put(Short.class, (short) 0);
        c.put(Integer.class, 0);
        c.put(Long.class, 0L);
        c.put(Float.class, Float.valueOf(0.0f));
        c.put(Double.class, Double.valueOf(0.0d));
        c.put(Boolean.TYPE, Boolean.FALSE);
        c.put(Character.TYPE, (char) 0);
        c.put(Byte.TYPE, (byte) 0);
        c.put(Short.TYPE, (short) 0);
        c.put(Integer.TYPE, 0);
        c.put(Long.TYPE, 0L);
        c.put(Float.TYPE, Float.valueOf(0.0f));
        c.put(Double.TYPE, Double.valueOf(0.0d));
    }

    public static Object a(Method method) {
        Object[] objArr = {method};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3aecc23f55bd844e32c8ad976f4b622f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3aecc23f55bd844e32c8ad976f4b622f");
        }
        Class<?> returnType = method.getReturnType();
        if (returnType.isPrimitive()) {
            Object[] objArr2 = {returnType};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8ba3d9f377e73f62264ac47064b8f21d", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8ba3d9f377e73f62264ac47064b8f21d");
            }
            Object[] objArr3 = {returnType};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "56527abb3291a91da28fc4996ea82d59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "56527abb3291a91da28fc4996ea82d59")).booleanValue() : c.containsKey(returnType)) {
                Object[] objArr4 = {returnType};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "10ed6997c28d1a1621e0b972cbae6663", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "10ed6997c28d1a1621e0b972cbae6663") : c.get(returnType);
            }
            return null;
        }
        return null;
    }
}
