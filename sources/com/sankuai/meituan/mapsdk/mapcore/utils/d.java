package com.sankuai.meituan.mapsdk.mapcore.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static Object a(String str, Class[] clsArr, Object... objArr) {
        Object[] objArr2 = {str, clsArr, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "685fb65a53ec8a6d3fc32acac8e90301", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "685fb65a53ec8a6d3fc32acac8e90301");
        }
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Exception e) {
            e.printStackTrace();
            c.e(e.toString());
            return null;
        }
    }

    private static Class a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ac0694e8806e3ad0014a52b4e5b7963", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ac0694e8806e3ad0014a52b4e5b7963");
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Object a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "458a7e5428891d4a0eec5d03762e6a86", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "458a7e5428891d4a0eec5d03762e6a86");
        }
        try {
            if (a(str) != null) {
                Field declaredField = a(str).getDeclaredField(str2);
                declaredField.setAccessible(true);
                return declaredField.get(null);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
