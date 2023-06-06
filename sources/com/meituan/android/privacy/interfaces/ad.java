package com.meituan.android.privacy.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ad {
    public static ChangeQuickRedirect a;

    public static Object a(Object obj, String str, Object... objArr) throws Exception {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ec556660457b30cab485f7124cd416b8", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ec556660457b30cab485f7124cd416b8");
        }
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, new Class[0]);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(obj, objArr);
    }
}
