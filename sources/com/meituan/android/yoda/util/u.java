package com.meituan.android.yoda.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u {
    public static ChangeQuickRedirect a;

    public static <T> T a(Object obj, Class cls, String str) {
        Object[] objArr = {obj, cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1731e133e8e6bfee528c0c054d33ad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1731e133e8e6bfee528c0c054d33ad1");
        }
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return (T) declaredField.get(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
