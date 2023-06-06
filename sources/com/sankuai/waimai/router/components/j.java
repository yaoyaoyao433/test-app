package com.sankuai.waimai.router.components;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Modifier;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static com.sankuai.waimai.router.core.h a(Object obj, boolean z, com.sankuai.waimai.router.core.i... iVarArr) {
        Object[] objArr = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), iVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85c77f09d7d37b1edec541edbcc703c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.router.core.h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85c77f09d7d37b1edec541edbcc703c1");
        }
        com.sankuai.waimai.router.core.h a2 = a(obj);
        if (a2 != null) {
            if (!z) {
                a2.a(com.sankuai.waimai.router.common.c.b);
            }
            a2.a(iVarArr);
        }
        return a2;
    }

    private static com.sankuai.waimai.router.core.h a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52a9d08624fac86d5dd87198e79880df", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.router.core.h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52a9d08624fac86d5dd87198e79880df");
        }
        if (obj instanceof com.sankuai.waimai.router.core.h) {
            return (com.sankuai.waimai.router.core.h) obj;
        }
        if (obj instanceof String) {
            return new com.sankuai.waimai.router.activity.b((String) obj);
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (a(cls)) {
                return new com.sankuai.waimai.router.activity.c(cls);
            }
        }
        return null;
    }

    private static boolean a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31930ab71cb18e5d6a1d9e86ff31468f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31930ab71cb18e5d6a1d9e86ff31468f")).booleanValue() : (cls == null || !Activity.class.isAssignableFrom(cls) || Modifier.isAbstract(cls.getModifiers())) ? false : true;
    }
}
