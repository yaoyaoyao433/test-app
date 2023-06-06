package com.meituan.msc.modules.manager;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static <T> String a(Class<T> cls, boolean z) throws RuntimeException {
        Object[] objArr = {cls, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4a5573aea606e8042b76468dc33e4c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4a5573aea606e8042b76468dc33e4c6");
        }
        try {
            if (cls.isAnnotationPresent(ModuleName.class)) {
                str = ((ModuleName) cls.getAnnotation(ModuleName.class)).name();
            }
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a("MSCModule getName exp", e);
        }
        if (z && TextUtils.isEmpty(str)) {
            throw new RuntimeException("Must declare name in ModuleName annotation for class " + cls.toString());
        }
        return str;
    }
}
